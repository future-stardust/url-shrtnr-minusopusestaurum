package edu.kpi.testcourse;

import java.util.Random;

/**
 * Link class
 *
 * <p>Include all wich refers to links: userID, link, short link.
 */
public class Link {
  private int idLink;
  private int userId;
  private String link;
  private String shortLink;

  /**
   * Constructor Link class
   *
   * <p>Assigns userId, link and generate short link.
   */
  public Link(int idLink, int userId, String link) {
    this.idLink = idLink;
    this.userId = userId;
    this.link = link;
    setShortlink();
  }

  public int getIdLink() {
    return idLink;
  }

  public void setIdLink(int idLink) {
    this.idLink = idLink;
  }

  public int getUserid() {
    return userId;
  }

  public void setUserid(int userId) {
    this.userId = userId;
  }

  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public String getShortlink() {
    return shortLink;
  }

  /**
   * Method Link class
   *
   * <p>Generate short link.
   */
  public void setShortlink() {
    Random random = new Random();
    shortLink = "/";
    char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
    for (int i = 0; i < 6; i++) {
      shortLink += chars[random.nextInt(62)];
    }
  }
}
