package org.apodhrad.switchyard.example.bean_file_simple;

import java.io.File;

import org.switchyard.component.bean.Service;

@Service(Info.class)
public class InfoBean implements Info {

	@Override
	public void printInfo(File file) {
		System.out.println(file.getAbsolutePath());
	}

}
