package no.ciber.mongo.configuration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.WriteConcern;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

@Configuration
public class MongoConfiguration extends AbstractMongoConfiguration{

    @Override
    protected String getDatabaseName() {
        return "mystore";
    }

    @Override
    public Mongo mongo() throws Exception {
        Mongo mongo = new MongoClient("localhost", 27017);
        mongo.setWriteConcern(WriteConcern.SAFE); // Objects with unique indexes should not be overwritten by new objects
        return mongo;
    }
}
