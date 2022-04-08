package io.khs.jdkpractice.factory;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Component;

@Component
public class JdkFactory {

  private final Map<JdkEnum, JdkInterface> jdkMap = new ConcurrentHashMap<>();

  public JdkFactory(List<JdkInterface> jdkLauncherList) {
    jdkLauncherList.forEach(launcher -> jdkMap.put(launcher.getJdkVersion(), launcher));
  }

  public JdkInterface getJdkLauncher(JdkEnum version) {
    return jdkMap.get(version);
  }
}
