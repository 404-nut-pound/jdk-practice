package io.khs.jdkpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.khs.jdkpractice.launch.Jdk9;

@SpringBootApplication
public class JdkPracticeApplication {

  public static void main(String[] args) {
    SpringApplication.run(JdkPracticeApplication.class, args);

    // launch jdk 8 to 9
    Jdk9 jdk9 = new Jdk9();
    jdk9.launch();
  }

}
