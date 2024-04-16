package com.data.server.data_server.model;

import lombok.Data;

@Data
public class DetectionMetaDataEntity {

    public String topLeft;
    public String bottomRight;
    public String resultClass;
    public double bboxConfidence;
    public double classConfidence;

}
