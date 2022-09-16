package com.redbee.msuserspractica.adapter.rest.exception;


import com.redbee.msuserspractica.config.ErrorCode;
import com.redbee.msuserspractica.config.GenericException;

public final class EmptyOrNullBodyRestClientException extends GenericException {

    public EmptyOrNullBodyRestClientException(ErrorCode errorCode) {
        super(errorCode);
    }

}
