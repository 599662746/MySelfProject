package com.lx.springbootmyself.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class MyLocaleResolver implements LocaleResolver {
    //resolve request
    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        //get request language parameter
        String language=httpServletRequest.getParameter("l");
        Locale locale=null;
        if (!StringUtils.isEmpty(language)){
            String[] split = language.split("_");
            locale=new Locale(split[0],split[1]);
        }else{
            language="en_US";
            String[] split = language.split("_");
            locale=new Locale(split[0],split[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
