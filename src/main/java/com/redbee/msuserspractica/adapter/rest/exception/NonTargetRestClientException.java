package com.redbee.msuserspractica.adapter.rest.exception;


import com.redbee.msuserspractica.config.ErrorCode;
import com.redbee.msuserspractica.config.GenericException;

public final class NonTargetRestClientException extends GenericException {

    public NonTargetRestClientException(ErrorCode errorCode) {
        super(errorCode);
    }

}
