package com.huihui.aligo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AligoTaxiEurekaApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger( AligoTaxiEurekaApplication.class );

    public static void main( String[] args ) {
        SpringApplication.run( AligoTaxiEurekaApplication.class, args );
        LOGGER.info( "aligo-taxi-eureka server started success..." );
    }

}
