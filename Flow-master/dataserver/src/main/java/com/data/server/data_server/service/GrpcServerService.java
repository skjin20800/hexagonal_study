package com.data.server.data_server.service;


import com.data.server.data_server.model.ClassificationMetaDataEntity;
import com.data.server.data_server.model.DetectionDataEntity;
import com.data.server.data_server.model.DetectionMetaDataEntity;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.ByteString;
import haivis.data.lib.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;


@GrpcService
public class GrpcServerService extends AnalysisServiceGrpc.AnalysisServiceImplBase {
    //public class LiquidAnalysisService extends LiquidAnalysisCommunicationGrpc.LiquidAnalysisCommunicationImplBase {
    // 클라이언트에서 이미지를 스트림으로 전송하면, 해당 스트림을 처리하는 메서드

    @Override
    public StreamObserver<AnalysisRequest> sendAnalysisData(StreamObserver<AnalysisResponse> responseObserver) {
        System.out.println("받았음" +  System.currentTimeMillis());
        startTime = System.currentTimeMillis();


        return new StreamObserver<AnalysisRequest>() {
            @Override
            public void onNext(AnalysisRequest request) { // 클라이언트로부터의 요청을 받아 처리하는 로직을 구현합니다.

                ObjectMapper objectMapper = new ObjectMapper();
                //이미지 저장 로직
                for (ByteString image : request.getImagesList()) {
                    // 이미지 데이터를 사용하여 작업 수행

                    // 이미지 저장 로직을 구현합니다.
                    saveImage(image.toByteArray(), "image" + i + ".png");
                    i++;
                }

                //객체 저장 로직

                    var inspectionJob = request.getInspectionJob();
                    var recipe = request.getRecipe();


                //classification 저장
                var classificationDatas = new ArrayList<ClassificationMetaDataEntity>();
                for (ClassificationMetaData data: request.getAnalysisResult().getClassificationMetadatasList()) {
                    var entity = new ClassificationMetaDataEntity();

                    //Imageindex,ResultClass 삽입
                    entity.setImageIndex(data.getImageIndex());
                    entity.setResultClass(data.getResultClass());

                    //score 삽입
                    var scores = new ArrayList<Double>();
                    for (double score: data.getScoresList()) {scores.add(score);}
                    entity.setScores(scores);
                    classificationDatas.add(entity);
                }

                //detection 저장
                var detectionDatas = new ArrayList<DetectionDataEntity>();
                for (DetectionData data: request.getAnalysisResult().getDetectionDatasList()) {
                    var entity = new DetectionDataEntity();
                    entity.setImageIndex(data.getImageIndex());
                    entity.setTask(data.getTask());

                    //metaData 삽입
                    var metas = new ArrayList<DetectionMetaDataEntity>();
                    for (DetectionMetaData meta: data.getDetectionMetadatasList()) {
                        var metaEntity = new DetectionMetaDataEntity();
                        metaEntity.setTopLeft(meta.getTopLeft());
                        metaEntity.setBottomRight(meta.getBottomRight());
                        metaEntity.setResultClass(meta.getResultClass());
                        metaEntity.setBboxConfidence(meta.getBboxConfidence());
                        metaEntity.setClassConfidence(meta.getClassConfidence());

                        metas.add(metaEntity);
                    }

                    detectionDatas.add(entity);
                }

                // 작업 완료 시 응답 전송
                AnalysisResponse response = AnalysisResponse.newBuilder()
                        .setResult("Analysis completed successfully")
                        .build();


                // 객체를 JSON 문자열로 변환
                // ObjectMapper 생성
                try {
                    String job = objectMapper.writeValueAsString(inspectionJob);
                    String rec = objectMapper.writeValueAsString(recipe);
                    String classi = objectMapper.writeValueAsString(classificationDatas);
                    String detecti = objectMapper.writeValueAsString(detectionDatas);
                    System.out.println(job);
                    System.out.println(rec);
                    System.out.println(classi);
                    System.out.println(detecti);
                    //System.out.println(request);

                }catch (Exception e){}
                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable throwable) {
                // 에러 처리 로직을 구현합니다.
                // 클라이언트에서 오류가 발생한 경우에 대한 처리를 수행합니다.
            }

            @Override
            public void onCompleted() {
                // 마무리 작업을 수행하고 응답을 완료합니다.
                // 클라이언트가 이미지를 모두 전송했을 때 호출됩니다.
                // 이때 서버는 추가적인 마무리 작업을 수행하고, 응답을 완료합니다.
                responseObserver.onCompleted();
            }
        };
    }

    private void saveImage(byte[] imageData, String fileName) {
        endTime= System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("이미지를 받았습니다. : " + fileName + " 소요시간 " + executionTime);

        String uploadDir = "upload-dir"; // 이미지를 저장할 디렉토리 설정
        File directory = new File(uploadDir);

        if (!directory.exists()) {
            directory.mkdir(); // 디렉토리가 없으면 생성
        }

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(uploadDir + File.separator + fileName);
            fileOutputStream.write(imageData);
            fileOutputStream.close();






        } catch (IOException e) {
            System.out.println("이미지 저장 중 오류 발생: " + e.getMessage());
        }
    }

    static long startTime = 0;
    static long endTime = 0;
    int i = 1;
}