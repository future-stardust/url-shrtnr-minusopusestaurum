package edu.kpi.testcourse;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

/**
 * User record type.
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record User(String shortLink,
                    String url,
                    Integer userId,
                    Integer usages) {
}
