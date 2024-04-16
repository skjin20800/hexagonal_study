package com.data.server.data_server.model;

import com.google.protobuf.ByteString;
import lombok.Data;

import java.util.ArrayList;

@Data
public class AnalysisData {

    private ArrayList<ByteString> images;
    private String inspectionJob ;
    private String recipe;
    private AnalysisResult analysisResult;
}
