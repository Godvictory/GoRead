package com.yjy.read.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yjy.read.entity.Author;

public interface AuthorService extends IService<Author> {
     void insertIfNotExists(Author author);

}
