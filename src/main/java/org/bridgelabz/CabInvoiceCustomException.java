package org.bridgelabz;

public class CabInvoiceCustomException extends Exception{
    enum ExceptionType {
        INVALID_USER
    }

    ExceptionType type;

    public CabInvoiceCustomException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }

    public CabInvoiceCustomException(String message, ExceptionType type, Throwable cause) {
        super(message, cause);
        this.type = type;
    }
}
