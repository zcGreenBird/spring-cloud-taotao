package com.taotao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@EnableFeignClients
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
class ApiGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
        System.out.println(" ___  ____   __    ____  ____     __  __  ____    ___  __  __  ___  ___  ____  ___  ___  ____  __  __  __     /\\\n" +
                "/ __)(_  _) /__\\  (  _ \\(_  _)___(  )(  )(  _ \\  / __)(  )(  )/ __)/ __)( ___)/ __)/ __)( ___)(  )(  )(  )    )(\n" +
                "\\__ \\  )(  /(__)\\  )   /  )( (___))(__)(  )___/  \\__ \\ )(__)(( (__( (__  )__) \\__ \\\\__ \\ )__)  )(__)(  )(__   \\/\n" +
                "(___/ (__)(__)(__)(_)\\_) (__)    (______)(__)    (___/(______)\\___)\\___)(____)(___/(___/(__)  (______)(____)  ()");

    }
}