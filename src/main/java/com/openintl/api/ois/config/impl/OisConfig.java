package com.openintl.api.ois.config.impl;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.openintl.api.ois.config.IOisConfig;
import com.openintl.api.ois.config.impl.dependencies.OisCrudInterfaceConfig;
import com.openintl.api.ois.config.impl.dependencies.OisMongoDbDriverConfig;
import com.openintl.repository.crudinterface.ICrudRepository;
import com.openintl.repository.database.mongo.impl.MongoRepository;

@Configuration
@Import({OisCrudInterfaceConfig.class, OisMongoDbDriverConfig.class})
public class OisConfig implements IOisConfig{

}
