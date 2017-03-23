package hu.jonci.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

@Configuration
@EnableMongoRepositories(basePackages = "hu.jonci.dal.repository")
public class MongoConfiguration {

    @Bean
    public MongoClient mongo(){
        MongoClientURI uri = new MongoClientURI("mongodb://localhost:27017");
        return new MongoClient(uri);
    }
    
    @Bean
    public MongoTemplate mongoTemplate(){
        return new MongoTemplate(mongo(), "webshop");
    }
    
}
