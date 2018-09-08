package cn.itcast.dao.impl;

import cn.itcast.dao.Dao;
import cn.itcast.pojo.Student;

/**
 * Date:18/3/19
 * Author: Candy you will like it
 * Desc: for fun
 */
public class StudentDao implements Dao<Student> {

    public void save(Student t) {
        System.out.println("保存同学");
    }

    public void delete(Student t) {
        System.out.println("删除一个学生");
    }

    public void update(Student t) {

        System.out.println("更新学生");
    }

    public void query(Long id) {
        System.out.println("查询学生");
    }
}
