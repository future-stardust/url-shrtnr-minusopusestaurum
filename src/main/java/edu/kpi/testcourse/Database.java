package edu.kpi.testcourse;

import java.util.ArrayList;

/**
 * Database class
 *
 * <p>Include array with all objects for talbe.
 */
public class Database {
  private ArrayList<Object> arrayList = new ArrayList<Object>();

  public Database() {
  }

  public ArrayList<Object> getObjects() {
    return arrayList;
  }

  public void addObject(Object object) {
    getObjects().add(object);
  }
}
