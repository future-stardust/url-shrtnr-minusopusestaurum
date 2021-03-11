package edu.kpi.testcourse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Random;
import javax.inject.Singleton;

/**
 * A database repository for Urls module.
 *
 * <p>TODO: Replace mocked data with actual db interaction.
 */
@Singleton
public class UrlsRepository implements Repository<User, String> {

  private final ArrayList<User> users;

  /**
   * Method Link class
   *
   * <p>Generate short link.
   */
  public String getShortlink() {
    String shortLink;
    Random random = new Random();
    shortLink = "/";
    char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
    for (int i = 0; i < 5; i++) {
      shortLink += chars[random.nextInt(62)];
    }
    return shortLink;
  }

  /**
   * Creates UrlsRepository.
   */
  public UrlsRepository() {
    users = new ArrayList<>(Arrays.asList(
      new User(getShortlink(), "https://google.com", 0, 0),
      new User(getShortlink(), "https://github.com", 1, 0)
    ));
  }

  /**
   * Creates UrlsRepository with predefined mocked data.
   *
   * <p>Do not use it as it is a subject to remove!
   *
   * <p>TODO: Remove this constructor once db is implemented.
   *
   * @param defaultInnerValues Array of mocked data.
   */
  public UrlsRepository(User[] defaultInnerValues) {
    users = new ArrayList<>(Arrays.asList(defaultInnerValues));
  }

  public ArrayList<User> getUsers() {
    return users;
  }

  @Override
  public User[] search() {
    return users.toArray(new User[0]);
  }

  @Override
  public User get(String pk) {
    for (User user : users) {
      if (user.shortLink().equals(pk)) {
        return user;
      }
    }

    throw new NoSuchElementException();
  }

  @Override
  public User create(User entity) {
    for (User user : users) {
      if (user.shortLink().equals(entity.shortLink())) {
        throw new IllegalArgumentException();
      }
    }

    users.add(entity);

    return entity;
  }

  @Override
  public User delete(String pk) {
    for (User user : users) {
      if (user.shortLink().equals(pk)) {
        users.remove(user);
        return user;
      }
    }

    throw new NoSuchElementException();
  }
}
