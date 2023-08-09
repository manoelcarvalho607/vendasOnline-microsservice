/**
 * 
 */
package br.com.carvalho.venda.online.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author manoel.carvalho
 *
 */
@Configuration
@EnableMongoRepositories(basePackages = "br.com.carvalho.venda.online.repository")
public class MongoConfig {

}
