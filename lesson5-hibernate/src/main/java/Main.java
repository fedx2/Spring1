import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.cfg.Configuration;

public static void main(String[] args) {
//    EntityManagerFactory entityManagerFactory = new Configuration()
//            .configure("hibernate.cfg.xml")
//            .buildSessionFactory();
//
//            EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//        // INSERT
////            entityManager.getTransaction().begin();
////
////            entityManager.persist(new User("User1", "1@a.com", "pass1"));
////            entityManager.persist(new User("User2", "2@a.com", "pass2"));
////            entityManager.persist(new User("User3", "3@a.com", "pass3"));
////            entityManager.getTransaction().commit();

        // SELECT
/*
        User user = entityManager.find(User.class, 1L);
        System.out.println();*/

        // JPQL , HQL
/*

        List<User> users = entityManager.createQuery("select u from User u where u.id in(1,2)", User.class).getResultList();

        for(User userFromDb : users) {
                System.out.println(userFromDb);
        }
*/

    // UPDATE
//
//    entityManager.getTransaction().begin();
//
//    User user = entityManager.find(User.class, 1L);
//    user.setUsername("new Usernname");
//
//    entityManager.getTransaction().commit();

    // UPDATE 2
//    entityManager.getTransaction().begin();
//    User user = new User("User2new", "2@a.com", "pass2");
//    user.setId(2L);
//    entityManager.merge(user);
//    entityManager.getTransaction().commit();

    // DELETE
//    entityManager.getTransaction().begin();
//    User user = entityManager.find(User.class, 3L);
//    entityManager.remove(user);
//    entityManager.getTransaction().commit();
//
//entityManager.createNativeQuery("select u.id\n" +
//        "from users u\n" +
//        "where u.username like '%brain'", String.class).getSingleResult();
//    entityManager.close();
//    entityManagerFactory.close();
}