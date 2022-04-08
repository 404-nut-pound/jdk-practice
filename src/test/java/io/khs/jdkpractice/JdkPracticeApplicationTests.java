package io.khs.jdkpractice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import io.khs.jdkpractice.factory.JdkFactory;

@SpringBootTest
class JdkPracticeApplicationTests {

  @Autowired
  private JdkFactory jdkFactory;

  @Test
  void contextLoads() {
    System.out.println("start tests!!!");
  }

}
