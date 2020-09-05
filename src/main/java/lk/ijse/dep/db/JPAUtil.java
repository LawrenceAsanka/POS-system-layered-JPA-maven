package lk.ijse.dep.db;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

  private static final EntityManagerFactory emf = buildEntityManagerFactory();

  private static EntityManagerFactory buildEntityManagerFactory() {

    Properties properties = new Properties();
    try {
      properties.load(JPAUtil.class.getResourceAsStream("/application.properties"));
    } catch (IOException e) {
      throw new RuntimeException();
    }
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("DEP", properties);
    return emf;
  }


  public static EntityManagerFactory getEm() {
    return emf;
  }

}
