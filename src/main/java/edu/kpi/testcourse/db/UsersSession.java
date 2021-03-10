package edu.kpi.testcourse.db;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

/**
 * UserSession record type.
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record UsersSession(Integer userId, String token) {
}
