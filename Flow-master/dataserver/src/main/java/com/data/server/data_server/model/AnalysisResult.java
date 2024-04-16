package com.data.server.data_server.model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class AnalysisResult {

    private ArrayList<ClassificationMetaDataEntity> classificationMetaDatas;
    private ArrayList<DetectionDataEntity> detectionDatas;

}
