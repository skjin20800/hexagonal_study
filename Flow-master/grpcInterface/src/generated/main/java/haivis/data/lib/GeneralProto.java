// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: analysis.proto

package haivis.data.lib;

public final class GeneralProto {
  private GeneralProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AnalysisRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AnalysisRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AnalysisResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AnalysisResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AnalysisResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AnalysisResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClassificationMetaData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClassificationMetaData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DetectionData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DetectionData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DetectionMetaData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DetectionMetaData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016analysis.proto\"s\n\017AnalysisRequest\022\016\n\006i" +
      "mages\030\001 \003(\014\022\026\n\016inspection_job\030\002 \001(\t\022\016\n\006r" +
      "ecipe\030\003 \001(\t\022(\n\017analysis_result\030\004 \001(\0132\017.A" +
      "nalysisResult\"\"\n\020AnalysisResponse\022\016\n\006res" +
      "ult\030\001 \001(\t\"t\n\016AnalysisResult\0229\n\030classific" +
      "ation_metadatas\030\001 \003(\0132\027.ClassificationMe" +
      "taData\022\'\n\017detection_datas\030\002 \003(\0132\016.Detect" +
      "ionData\"S\n\026ClassificationMetaData\022\023\n\013ima" +
      "ge_index\030\001 \001(\005\022\016\n\006scores\030\002 \003(\002\022\024\n\014result" +
      "_class\030\003 \001(\t\"c\n\rDetectionData\022\023\n\013image_i" +
      "ndex\030\001 \001(\005\022\014\n\004task\030\002 \001(\t\022/\n\023detection_me" +
      "tadatas\030\003 \003(\0132\022.DetectionMetaData\"\204\001\n\021De" +
      "tectionMetaData\022\020\n\010top_left\030\001 \001(\t\022\024\n\014bot" +
      "tom_right\030\002 \001(\t\022\024\n\014result_class\030\003 \001(\t\022\027\n" +
      "\017bbox_confidence\030\004 \001(\001\022\030\n\020class_confiden" +
      "ce\030\005 \001(\0012L\n\017AnalysisService\0229\n\020SendAnaly" +
      "sisData\022\020.AnalysisRequest\032\021.AnalysisResp" +
      "onse(\001B!\n\017haivis.data.libB\014GeneralProtoP" +
      "\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AnalysisRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AnalysisRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AnalysisRequest_descriptor,
        new java.lang.String[] { "Images", "InspectionJob", "Recipe", "AnalysisResult", });
    internal_static_AnalysisResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_AnalysisResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AnalysisResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_AnalysisResult_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_AnalysisResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AnalysisResult_descriptor,
        new java.lang.String[] { "ClassificationMetadatas", "DetectionDatas", });
    internal_static_ClassificationMetaData_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ClassificationMetaData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClassificationMetaData_descriptor,
        new java.lang.String[] { "ImageIndex", "Scores", "ResultClass", });
    internal_static_DetectionData_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_DetectionData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DetectionData_descriptor,
        new java.lang.String[] { "ImageIndex", "Task", "DetectionMetadatas", });
    internal_static_DetectionMetaData_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_DetectionMetaData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DetectionMetaData_descriptor,
        new java.lang.String[] { "TopLeft", "BottomRight", "ResultClass", "BboxConfidence", "ClassConfidence", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
