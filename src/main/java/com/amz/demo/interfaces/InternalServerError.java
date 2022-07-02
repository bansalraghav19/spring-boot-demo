package com.amz.demo.interfaces;

public class InternalServerError {
  private String errorMessage;
  private String status;

  public InternalServerError(String message) {
    this.errorMessage = message;
    this.status = "FAILED";
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public String getStatus() {
    return status;
  }
}
