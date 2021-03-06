/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 * Copyright (c) 2012-2019. haiyi Inc.
 * pawo-power All rights reserved.
 */

package com.gm.error;

/**
 * <p> 错误码信息 </p>
 *
 * <pre> Created: 2019-01-17 16:58  </pre>
 * <pre> Project: pawo-power  </pre>
 *
 * @author gmzhao
 * @version 1.0
 * @since JDK 1.7
 */
public enum PawoError {

    /**
     * 登录错误 10001~19999
     */
    AUTH_FAILURE(10001),


    /**
     * 下单错误 20001~29999
     */
    SUBMIT_FAILURE(20001);


    private final int code;

    PawoError(int code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
