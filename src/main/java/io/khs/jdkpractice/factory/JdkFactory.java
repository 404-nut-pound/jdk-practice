package io.khs.jdkpractice.factory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Component;

@Component
public class JdkFactory {

  private final Map<JdkEnum, JdkIterface> jdkMap = new ConcurrentHashMap<>();

  public JdkFactory() {

  }

  public JdkIterface getJdkClass(JdkEnum version) {
    if (version == null) {
      return null;
    } else {
      return null;
    }
  }
}
