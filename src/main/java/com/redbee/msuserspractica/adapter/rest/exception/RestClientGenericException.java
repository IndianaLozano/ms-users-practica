package com.redbee.msuserspractica.adapter.rest.exception;


import com.redbee.msuserspractica.config.ErrorCode;
import com.redbee.msuserspractica.config.GenericException;

public final class RestClientGenericException extends GenericException {

    public RestClientGenericException(ErrorCode errorCode) {
        super(errorCode);
    }

}
