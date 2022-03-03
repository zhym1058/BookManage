package com.demo.sell;

import com.demo.sell.service.BookSellService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.demo.sell")
@ComponentScan("com.demo.sell")
public class config {

//    @Bean
//    public BookSellService BookSellService() {
//        return new BookSellService();
//    }
}
