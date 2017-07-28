package com.openintl.api.ois.entities;

import java.util.Map;

public class Method {

  private String methodName;
  private Map<String, Map<String, String>> methodParams;
  private String methodType;
  private String methodReturnType;

  public String getMethodName() {
    return methodName;
  }
  
  public void setMethodName(String methodName) {
    this.methodName = methodName;
  }
  
  public Map<String, Map<String, String>> getMethodParams() {
    return methodParams;
  }
  
public void setMethodParams(Map<String, Map<String, String>> methodParams) {
	this.methodParams = methodParams;
}
public String getMethodType() {
	return methodType;
}
public void setMethodType(String methodType) {
	this.methodType = methodType;
}

public String getMethodReturnType() {
	return methodReturnType;
}

public void setMethodReturnType(String methodReturnType) {
	this.methodReturnType = methodReturnType;
}
  
}
