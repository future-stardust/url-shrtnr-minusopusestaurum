package edu.kpi.testcourse;

import com.google.gson.Gson;
import io.micronaut.runtime.Micronaut;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * This is a main entry point to the URL shortener.
 *
 * <p>It creates, connects and starts all system parts.
 */
public class Main {
  private static final Gson gson = new Gson();
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  /**
   * Starting program
   *
   * <p>Start all components of program.
   */
  public static void main(String[] args) throws IOException {
    Micronaut.run(Main.class, args);
  }

  public static Gson getGson() {
    return gson;
  }
}
