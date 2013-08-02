package org.apodhrad.switchyard.example.bean_cron_simple;

import org.switchyard.component.bean.Service;

@Service(Cron.class)
public class CronBean implements Cron {

	@Override
	public void execute() {
		System.out.println("CronBean");
	}

}
