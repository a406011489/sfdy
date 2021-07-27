package com.ly.sfdy;

import com.ly.sfdy.util.HttpClientUtil;
import com.ly.sfdy.util.JavaBean;
import com.ly.sfdy.util.ResponseEntity;
import com.ly.sfdy.util.JsonUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SfdyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SfdyApplication.class, args);
    }

    public void check(){
        String url = "https://www.ly.com";
        System.out.println("请求url:" + url);
        try {
            String result = HttpClientUtil.doGet(url);
            System.out.println("请求结果：" + result);
            ResponseEntity responseEntity = JsonUtils.parse(result, ResponseEntity.class);
            JavaBean javaBean = JsonUtils.parse(result, "result", JavaBean.class);
            System.out.println(responseEntity);
            System.out.println(javaBean.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
