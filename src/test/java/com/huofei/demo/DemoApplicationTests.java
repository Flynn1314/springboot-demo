package com.huofei.demo;

import com.huofei.demo.service.impl.UcenterMemberServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    UcenterMemberServiceImpl ucenterMemberService;
    @Test
    void contextLoads() {
    }
    @Test
    void f(){
      ucenterMemberService.f();
    }
}
