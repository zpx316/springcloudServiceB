package cn.zp.springcloud.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zp
 * @Description: 对serviceA的远程调用
 * @date 2020/6/26 下午2:26
 */
@FeignClient("serviceA")
public interface ServiceAFeignClient {
    @RequestMapping("/test/getName")
    public String getName(long id);

}
