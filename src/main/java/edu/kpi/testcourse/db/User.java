package edu.kpi.testcourse.db;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

/**
 * User record type.
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record User(Integer id, String email, String password) {
}
