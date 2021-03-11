package edu.kpi.testcourse.testUrlsRepository;

import edu.kpi.testcourse.UrlsRepository;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class TestSearch {

  UrlsRepository urlsRepository = new UrlsRepository();

  /**
   * Default we have 2 elements of User. If we converter its to string we will have 136 symbols
   */
  @Test
  void lengthShortLink() {
    assertThat(Arrays.toString(urlsRepository.search()).length()).isEqualTo(136);
  }
}
