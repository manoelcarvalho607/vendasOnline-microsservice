/**
 * 
 */
package br.com.carvalho.venda.online.config;

import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * @author manoel.carvalho
 *
 */
@Configuration
public class ValidatorConfig {
	
	//@Autowired
   //ResourceBundleMessageSource messageSource;

	//@Bean
  //  public Validator validatorFactory () {
	//	LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
//	    bean.setValidationMessageSource(messageSource);
	//    return  (Validator) bean;
  //  }
}
