package edu.kpi.testcourse;

/**
 * User class
 *
 * <p>Include all wich refers to user: id, email, password, token.
 */
public class User {
  private int id = 0;
  private String email;
  private String password;
  private String token;

  /**
   * Constructor User class
   *
   * <p>Assigns id, email and password for User object.
   */
  public User(int id, String email, String password) {
    this.id = id;
    this.email = email;
    this.password = password;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }
}
