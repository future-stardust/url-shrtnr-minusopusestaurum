package edu.kpi.testcourse.testUrlsRepository;

import edu.kpi.testcourse.UrlsRepository;
import edu.kpi.testcourse.User;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TestCreate {

  User user = new User("/ffffff", "https://example1.com", 0, 0);
  User userTest = new User("/fffsss", "https://example2.com", 1, 0);
  UrlsRepository urlsRepository = new UrlsRepository(new User[]{user});

  /**
   * We create the new user and compare if we don't have any the same short link
   */
  @Test
  void lengthShortLink() {
    urlsRepository.create(userTest);
    assertThat(urlsRepository.getUsers().size()).isEqualTo(2);
  }
}
