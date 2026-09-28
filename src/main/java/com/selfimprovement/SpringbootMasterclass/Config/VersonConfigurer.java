package com.selfimprovement.SpringbootMasterclass.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ApiVersionConfigurer;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class VersonConfigurer implements WebMvcConfigurer {
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        //add prefix path
      configurer.addPathPrefix("api/users",clazz->clazz.getPackageName().startsWith("com.selfimprovement.SpringbootMasterclass.PrefixpathusingWebMVCconfigurer"));
    }

    @Override
    public void configureApiVersioning(ApiVersionConfigurer configurer) {
        //for path variable
      //configurer.usePathSegment(2).addSupportedVersions("v1","v2").setDefaultVersion("v1");

      //for query param

      //  configurer.useQueryParam("version").addSupportedVersions("v1","v2").setDefaultVersion("v2");

        // for headers

        configurer.useRequestHeader("version").addSupportedVersions("v1","v2").setDefaultVersion("v2");
    }
}
