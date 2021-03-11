package edu.kpi.testcourse.testUrlsRepository;

import edu.kpi.testcourse.UrlsRepository;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TestGetShortLink {

  UrlsRepository urlsRepository = new UrlsRepository();

  @Test
  void lengthShortLink() {
    assertThat(urlsRepository.getShortlink().length()).isEqualTo(6);
  }

  @Test
  void firstSymbolShortLink() {
    assertThat(urlsRepository.getShortlink().toCharArray()[0]).isEqualTo('/');
  }
}
