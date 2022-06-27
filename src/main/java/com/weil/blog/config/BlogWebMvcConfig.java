package com.weil.blog.config;

import com.weil.blog.common.BlogConstants;
import com.weil.blog.utils.BlogUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName BlogWebMvcConfig
 * @Author weil
 * @Description //mvc配置
 * @Date 2022/6/26 11:29
 * @Version 1.0.0
 **/
@Configuration
public class BlogWebMvcConfig implements WebMvcConfigurer {
    /**
     * 添加资源处理器，映射本地资源
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 本地映射路径
        String path = BlogUtil.isWindow()? BlogConstants.FILE_UPLOAD_DIR_WINDOW: BlogConstants.FILE_UPLOAD_DIR_LINUX;
        registry.addResourceHandler(BlogConstants.PATH_PATTERN).addResourceLocations("file:" + path);
    }
}
