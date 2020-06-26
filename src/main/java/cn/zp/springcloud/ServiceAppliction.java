package cn.zp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zp
 * @Description:
 * @date 2020/6/26 下午2:10
 */

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceAppliction {

    public static void main(String[] args) {
        SpringApplication.run(ServiceAppliction.class, args);
    }

}