// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: analysis.proto

package haivis.data.lib;

public interface AnalysisResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AnalysisResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .ClassificationMetaData classification_metadatas = 1;</code>
   */
  java.util.List<haivis.data.lib.ClassificationMetaData> 
      getClassificationMetadatasList();
  /**
   * <code>repeated .ClassificationMetaData classification_metadatas = 1;</code>
   */
  haivis.data.lib.ClassificationMetaData getClassificationMetadatas(int index);
  /**
   * <code>repeated .ClassificationMetaData classification_metadatas = 1;</code>
   */
  int getClassificationMetadatasCount();
  /**
   * <code>repeated .ClassificationMetaData classification_metadatas = 1;</code>
   */
  java.util.List<? extends haivis.data.lib.ClassificationMetaDataOrBuilder> 
      getClassificationMetadatasOrBuilderList();
  /**
   * <code>repeated .ClassificationMetaData classification_metadatas = 1;</code>
   */
  haivis.data.lib.ClassificationMetaDataOrBuilder getClassificationMetadatasOrBuilder(
      int index);

  /**
   * <code>repeated .DetectionData detection_datas = 2;</code>
   */
  java.util.List<haivis.data.lib.DetectionData> 
      getDetectionDatasList();
  /**
   * <code>repeated .DetectionData detection_datas = 2;</code>
   */
  haivis.data.lib.DetectionData getDetectionDatas(int index);
  /**
   * <code>repeated .DetectionData detection_datas = 2;</code>
   */
  int getDetectionDatasCount();
  /**
   * <code>repeated .DetectionData detection_datas = 2;</code>
   */
  java.util.List<? extends haivis.data.lib.DetectionDataOrBuilder> 
      getDetectionDatasOrBuilderList();
  /**
   * <code>repeated .DetectionData detection_datas = 2;</code>
   */
  haivis.data.lib.DetectionDataOrBuilder getDetectionDatasOrBuilder(
      int index);
}
