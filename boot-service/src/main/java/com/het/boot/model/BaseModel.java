package com.het.boot.model;

import java.io.Serializable;
import java.util.Date;

public class BaseModel implements Serializable {

    private Long id;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private String domain;

}
