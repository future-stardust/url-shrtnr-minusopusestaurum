package edu.kpi.testcourse;

import com.google.gson.Gson;
import edu.kpi.testcourse.rest.ApiController;
import edu.kpi.testcourse.rest.AuthenticationProviderUserPassword;
import edu.umd.cs.findbugs.annotations.NonNull;
import io.micronaut.core.convert.value.MutableConvertibleValues;
import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpMethod;
import io.micronaut.http.HttpParameters;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.cookie.Cookies;
import io.micronaut.runtime.Micronaut;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
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

    Database databaseUsers = new Database();
    Database databaseLinks = new Database();

    User user1 = new User(0, "admin@gmail.com", "password");
    Link link1 = new Link(0, 0, "https://google.com");

    databaseUsers.addArraylistUser(user1);
    databaseLinks.addArraylistLink(link1);

    AuthenticationProviderUserPassword authentication = new AuthenticationProviderUserPassword();
    ApiController apiController = new ApiController();

    URL urlLocal = new URL("http://localhost:8080");
    URL urlGoogle = new URL(databaseLinks.getArraylistLink().get(0).getLink());

    HttpURLConnection connectionLocal = (HttpURLConnection) urlLocal.openConnection();
    HttpURLConnection connectionGoogle = (HttpURLConnection) urlGoogle.openConnection();

    connectionLocal.setRequestProperty("Content-type", "https://google.com");
    connectionLocal.setDoInput(true);

    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(
                                                connectionLocal.getOutputStream());
    outputStreamWriter.close();
  }

  public static Gson getGson() {
    return gson;
  }
}
