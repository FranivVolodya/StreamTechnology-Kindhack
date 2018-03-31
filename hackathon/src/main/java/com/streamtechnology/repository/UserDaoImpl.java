package com.streamtechnology.repository;

import com.streamtechnology.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;
//    @Override
//    public Article getArticleById(int articleId) {
//        return entityManager.find(Article.class, articleId);
//    }
//    @SuppressWarnings("unchecked")
//    @Override
//    public List<Article> getAllArticles() {
//        String hql = "FROM Article as atcl ORDER BY atcl.articleId";
//        return (List<Article>) entityManager.createQuery(hql).getResultList();
//    }

@Transactional
@Override
    public void addUser(User user) {
        entityManager.persist(user);
    }
//    @Override
//    public void updateArticle(Article article) {
//        Article artcl = getArticleById(article.getArticleId());
//        artcl.setTitle(article.getTitle());
//        artcl.setCategory(article.getCategory());
//        entityManager.flush();
//    }
//    @Override
//    public void deleteArticle(int articleId) {
//        entityManager.remove(getArticleById(articleId));
//    }
//    @Override
//    public boolean articleExists(String title, String category) {
//        String hql = "FROM Article as atcl WHERE atcl.title = ? and atcl.category = ?";
//        int count = entityManager.createQuery(hql).setParameter(1, title)
//                .setParameter(2, category).getResultList().size();
//        return count > 0 ? true : false;
//    }
}