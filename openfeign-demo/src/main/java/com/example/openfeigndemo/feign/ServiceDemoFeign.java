package com.example.openfeigndemo.feign;

import com.example.openfeigndemo.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @FeignClient():定义feign客户端
 * service-demo客户端
 * @author qzz
 */
@FeignClient(name = "service-demo")
public interface ServiceDemoFeign {

    /**
     * 方法要求：
     *    返回值：要对应
     *    方法名：随意
     *    参数：要对应
     *  方法上添加SpringMvc注解
     * @return
     */
    @RequestMapping("/demo")
    String suiyi();

    /**
     * 如果Feign接口方法参数名和调用控制器参数名相同可以省略@RequestParam的参数
     * @return
     */
    @RequestMapping("/demo2")
    String demo2(@RequestParam("name")String name123, @RequestParam Integer age);

    /**
     * 请求体传参
     * @param user
     * @return
     */
    @PostMapping("/demo3")
    String demo3(@RequestBody User user);

    /**
     * 数组类型传参
     * @param ids
     * @return
     */
    @RequestMapping("/demo4")
    String demo4(@RequestParam("ids") String[] ids);

    /**
     * 有参请求---请求体数据、普通表单数据
     * @return
     */
    @PostMapping("/demo5")
    String demo5(@RequestBody User user, @RequestParam("address") String address);
}

/**
 * FeignClient注解参数
 *   name：指定FeignClient的名称，如果项目使用了Ribbon，name属性会作为微服务的名称，用于服务发现
 *   url: url一般用于调试，可以手动指定@FeignClient调用的地址
 *   decode404:当发生http 404错误时，如果该字段位true，会调用decoder进行解码，否则抛出FeignException
 *   configuration: Feign配置类，可以自定义Feign的Encoder、Decoder、LogLevel、Contract
 *   fallback: 定义容错的处理类，当调用远程接口失败或超时时，会调用对应接口的容错逻辑，fallback指定的类必须实现@FeignClient标记的接口
 *   fallbackFactory: 工厂类，用于生成fallback类示例，通过这个属性我们可以实现每个接口通用的容错逻辑，减少重复的代码
 *   path: 定义当前FeignClient的统一前缀
 */