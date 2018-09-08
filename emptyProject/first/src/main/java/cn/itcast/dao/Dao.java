package cn.itcast.dao;

import cn.itcast.dao.impl.StudentDao;

/**
 * Date:18/3/19
 * Author: Candy you will like it
 * Desc: for fun
 */
public interface Dao<T> {

    void save(T t);
    void delete(T t);
    void update(T t);
    void query(Long id);
}
