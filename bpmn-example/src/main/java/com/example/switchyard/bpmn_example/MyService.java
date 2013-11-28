package com.example.switchyard.bpmn_example;

public interface MyService {

	public String start(String data);

	public String signal(String data);

	public void abort(String data);
}
