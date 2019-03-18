package me.whiteship.hystrixmonitoring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class HystrixMonitoringApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(HystrixMonitoringApplication.class);
        app.run(args);
    }
}
