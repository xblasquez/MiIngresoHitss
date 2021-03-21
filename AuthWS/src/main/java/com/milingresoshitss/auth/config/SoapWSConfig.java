package com.milingresoshitss.auth.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
@EnableWs
public class SoapWSConfig {
	
	@Bean
	public ServletRegistrationBean<MessageDispatcherServlet> messDispatServlet(ApplicationContext context){
		MessageDispatcherServlet mserv = new MessageDispatcherServlet();
		mserv.setApplicationContext(context);
		mserv.setTransformWsdlLocations(true);
		return new ServletRegistrationBean<MessageDispatcherServlet>(mserv,"/ws/*");
	}
	
	@Bean(name = "newUser")
	public DefaultWsdl11Definition defaultDefWS (XsdSchema schema) {
		DefaultWsdl11Definition defaultdefws = new DefaultWsdl11Definition();
		defaultdefws.setPortTypeName("NewUser");
		defaultdefws.setLocationUri("/ws");
		defaultdefws.setTargetNamespace("http://www.milingresos.org/User");
		defaultdefws.setSchema(schema);
		return defaultdefws;
	}
	
	@Bean
	public XsdSchema schemauser() {
		return new SimpleXsdSchema(new ClassPathResource("newuser.xsd"));
	}
	
}
