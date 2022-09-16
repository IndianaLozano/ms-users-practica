package com.redbee.msuserspractica.adapter.rest.exception;


import com.redbee.msuserspractica.config.ErrorCode;
import com.redbee.msuserspractica.config.GenericException;

public final class TimeoutRestClientException extends GenericException {

    public TimeoutRestClientException(ErrorCode errorCode) {
        super(errorCode);
    }

}
