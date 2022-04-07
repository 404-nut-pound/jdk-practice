package io.khs.jdkpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdkPracticeApplication {

  public static void main(String[] args) {
    SpringApplication.run(JdkPracticeApplication.class, args);

    // launch jdk 8 to 9
    Jdk9 jdk9 = new Jdk9();
    jdk9.launchJdk9();
  }

}
