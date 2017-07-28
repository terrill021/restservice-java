package com.openintl.api.ois.config.impl.dependencies;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.openintl.repository.database.mongo.config.MongodbDriverConfig;

@Configuration
public class OisMongoDbDriverConfig extends MongodbDriverConfig{
	
	static final int CHUNK_SIZE = 358400;
	
	@Override
	@Bean
	public String getDatabaseName() {
		// TODO Auto-generated method stub
		return "ois-webservices";
	}

	@Override
	@Bean
	public int getPort() {
		// TODO Auto-generated method stub
		return 27017;
	}

	@Bean
	@Override	
	public String getHost() {
		// TODO Auto-generated method stub
		return "127.0.0.1";
	}

	 @Bean
	 @Scope("prototype")
	 public int getChunkSizes() {
	    return CHUNK_SIZE;
	 }
}
