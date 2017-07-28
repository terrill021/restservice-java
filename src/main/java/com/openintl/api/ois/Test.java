package com.openintl.api.ois;

import java.io.File;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.openintl.api.ois.config.impl.OisConfig;
import com.openintl.api.ois.entities.Method;
import com.openintl.api.ois.entities.WebService;
import com.openintl.repository.crudinterface.ICrudRepository;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(OisConfig.class);
		ICrudRepository bean = applicationContext.getBean(ICrudRepository.class);
		ICrudRepository<WebService, String> repository = bean;
				
		/**
		 * Mock para pruebas en mongodb
		 */
		InputStream file = null;
		
		Map<String, String> param = new HashMap<>();
		param.put("String", "nombre");
		
		Map<String, Map<String, String>> mapType = new HashMap<>();
		mapType.put("java-lang-String", param);
		
		
		Method method = new Method();
		method.setMethodName("obtenerContactos");
		method.setMethodReturnType("String");
		method.setMethodType("SOAP");	
		method.setMethodParams(mapType);		
		
		Map<String, Method> methods = new HashMap<>();
		methods.put("obtenerContactos", method);
				
		WebService webService = new WebService();
		webService.setNombre("Contactos");
		webService.setCreationDate(new Date());
		webService.setContract("[contrato del servicio]");
		webService.setServiceTipe("SOAP");
		webService.setCompressed(file);
		webService.setModificationDate(new Date());
		webService.setMethods(methods);
				
		repository.save(webService);
	}
}
