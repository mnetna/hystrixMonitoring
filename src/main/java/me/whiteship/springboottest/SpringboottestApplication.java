package me.whiteship.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class SpringboottestApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringboottestApplication.class);
        app.run(args);
    }
}
