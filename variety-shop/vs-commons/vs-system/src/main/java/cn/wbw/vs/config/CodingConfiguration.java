package cn.wbw.vs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * 编码大一统过滤
 *
 * @author wbw
 * @date 2019/8/13 11:11
 */
@Configuration
public class CodingConfiguration implements WebMvcConfigurer {
    /**
     * 响应主体转换器
     *
     * @return HttpMessageConverter 响应信息
     * @author 王保卫
     * @date 14:28 2018/12/20
     */
    @Bean
    public HttpMessageConverter<String> responseBodyConverter() {
        return new StringHttpMessageConverter(StandardCharsets.UTF_8);
    }

    /**
     * 配置消息转换器
     *
     * @author 王保卫
     * @date 14:28 2018/12/20
     */
    @Override
    public void configureMessageConverters(
            List<HttpMessageConverter<?>> converters) {
        converters.add(responseBodyConverter());
    }


    /**
     * 配置编码内容协议
     *
     * @author 王保卫
     * @date 14:28 2018/12/20
     */
    @Override
    public void configureContentNegotiation(
            ContentNegotiationConfigurer configurer) {
        configurer.favorPathExtension(false);
    }
}