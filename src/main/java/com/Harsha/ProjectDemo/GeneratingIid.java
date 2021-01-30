package com.Harsha.ProjectDemo;

import java.util.Random;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("GenerateId")
public class GeneratingIid implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		Random random =new Random();
		long Gid=random.nextLong();
		//System.out.println(Gid);
		execution.setVariable("GID",Gid);
	}

}
