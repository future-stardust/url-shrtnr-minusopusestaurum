package edu.kpi.testcourse;

import java.util.ArrayList;

/**
 * Database class
 *
 * <p>Include array with all objects for talbe.
 */
public class Database {
  private final ArrayList<User> arraylistUser = new ArrayList<User>();
  private final ArrayList<Link> arraylistLink = new ArrayList<Link>();

  public Database() {
  }

  public ArrayList<User> getArraylistUser() {
    return arraylistUser;
  }

  public void addArraylistUser(User user) {
    arraylistUser.add(user);
  }

  public ArrayList<Link> getArraylistLink() {
    return arraylistLink;
  }

  public void addArraylistLink(Link link) {
    arraylistLink.add(link);
  }
}
