package edu.kpi.testcourse.testUrlsRepository;

import edu.kpi.testcourse.UrlsRepository;
import edu.kpi.testcourse.User;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestDelete {

  User user1 = new User("/ffffff", "https://example1.com", 0, 0);
  User user2 = new User("/fffsss", "https://example2.com", 1, 0);
  User user3 = new User("/fffvvv", "https://example3.com", 2, 0);
  User user4 = new User("/fffzzz", "https://example4.com", 3, 0);
  UrlsRepository urlsRepository = new UrlsRepository(new User[]{user1, user2, user3, user4});

  /**
   * We delete user for a short link
   */
  @Test
  void lengthShortLink() {
    urlsRepository.delete("/ffffff");
    assertThat(urlsRepository.getUsers().size()).isEqualTo(3);
  }
}
