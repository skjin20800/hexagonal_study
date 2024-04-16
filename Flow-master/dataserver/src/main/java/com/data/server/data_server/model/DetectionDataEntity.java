package com.data.server.data_server.model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class DetectionDataEntity {

    private int imageIndex;
    private String task;
    private ArrayList<DetectionMetaDataEntity> detectionMetaDatas;

}
