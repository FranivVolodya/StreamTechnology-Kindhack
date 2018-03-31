package com.streamtechnology.controller;

import com.streamtechnology.entity.User;
import com.streamtechnology.service.UserServise;
import com.streamtechnology.wrapper.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    private final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    private UserServise userServise;

    public UserController(UserServise userServise) {
        this.userServise = userServise;
    }

    @GetMapping("article/{id}")
    public ResponseEntity getArticleById(@PathVariable("id") Integer id) {
        LOGGER.info("ID is :" + id);
        boolean iscreated = userServise.saveUser(null);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity getUser(@PathVariable("id") Integer id) {
        LOGGER.info("ID is :" + id);
        User usesr = userServise.getUser(id);
        UserInfo info = new UserInfo();
        return new ResponseEntity(info, HttpStatus.OK);
    }

    //    @GetMapping("articles")
    //    public ResponseEntity<List<Article>> getAllArticles() {
    //        List<Article> list = articleService.getAllArticles();
    //        return new ResponseEntity<List<Article>>(list, HttpStatus.OK);
    //    }
    //    @PostMapping("article")
    //    public ResponseEntity<Void> addArticle(@RequestBody Article article, UriComponentsBuilder builder) {
    //        boolean flag = articleService.addArticle(article);
    //        if (flag == false) {
    //            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
    //        }
    //        HttpHeaders headers = new HttpHeaders();
    //        headers.setLocation(builder.path("/article/{id}").buildAndExpand(article.getArticleId()).toUri());
    //        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    //    }
    //    @PutMapping("article")
    //    public ResponseEntity<Article> updateArticle(@RequestBody Article article) {
    //        articleService.updateArticle(article);
    //        return new ResponseEntity<Article>(article, HttpStatus.OK);
    //    }
    //    @DeleteMapping("article/{id}")
    //    public ResponseEntity<Void> deleteArticle(@PathVariable("id") Integer id) {
    //        articleService.deleteArticle(id);
    //        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    //    }
}
