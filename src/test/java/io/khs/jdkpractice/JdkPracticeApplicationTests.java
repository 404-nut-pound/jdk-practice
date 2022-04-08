package io.khs.jdkpractice;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import io.khs.jdkpractice.factory.JdkEnum;
import io.khs.jdkpractice.factory.JdkFactory;
import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class JdkPracticeApplicationTests {

  @Autowired
  private JdkFactory jdkFactory;

  @Test
  void contextLoads() {
    System.out.println("start tests!!!");

    Optional.ofNullable(jdkFactory.getJdkLauncher(JdkEnum.JDK9)).ifPresentOrElse(lancher -> lancher.launch(),
        () -> {
          System.out.println("%s is not defined!!!".formatted(JdkEnum.JDK9));
        });
  }

}
