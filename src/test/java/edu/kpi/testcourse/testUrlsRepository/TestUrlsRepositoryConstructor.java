package edu.kpi.testcourse.testUrlsRepository;

import edu.kpi.testcourse.UrlsRepository;
import edu.kpi.testcourse.User;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TestUrlsRepositoryConstructor {

  User user = new User("/ffffff", "https://example.com", 0, 0);
  UrlsRepository urlsRepository = new UrlsRepository(new User[]{user});

  @Test
  void lengthShortLink() {
    assertThat(urlsRepository.getUsers().size()).isEqualTo(1);
  }
}
