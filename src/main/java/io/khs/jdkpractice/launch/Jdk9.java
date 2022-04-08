package io.khs.jdkpractice.launch;

import io.khs.jdkpractice.factory.JdkEnum;
import io.khs.jdkpractice.factory.JdkInterface;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Jdk9 implements JdkInterface {

  @Override
  public void launch() {
    log.info("========== Launch JDK 9 ==========");
  }

  @Override
  public JdkEnum getJdkVersion() {
    return JdkEnum.JDK9;
  }

}
