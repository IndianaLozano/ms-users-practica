package com.redbee.msuserspractica.adapter.rest.exception;


import com.redbee.msuserspractica.config.ErrorCode;
import com.redbee.msuserspractica.config.GenericException;

public final class NotFoundRestClientException extends GenericException {

    public NotFoundRestClientException(ErrorCode errorCode) {
        super(errorCode);
    }
}
