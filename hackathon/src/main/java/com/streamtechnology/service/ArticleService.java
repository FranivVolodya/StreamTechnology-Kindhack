package com.streamtechnology.service;

import com.streamtechnology.entity.Article;

import java.util.List;
public interface ArticleService {
    List<Article> getAllArticles();
    Article getArticleById(int articleId);
    boolean addArticle(Article article);
    void updateArticle(Article article);
    void deleteArticle(int articleId);
}