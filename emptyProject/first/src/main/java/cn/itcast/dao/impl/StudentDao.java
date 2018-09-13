package cn.itcast.dao.impl;

import cn.itcast.dao.Dao;
import cn.itcast.pojo.Student;

/**
 * Date:18/3/19
 * Author: Candy you will like it
 * Desc: for fun
 */
public class StudentDao implements Dao<Student> {

    @Override
    public void save(Student student) {
        System.out.println("save student");
    }

    @Override
    public void delete(Student student) {
        System.out.println("delete student");
    }

    public void update(Student t) {
        System.out.println("更新学生");
    }

    public void query(Long id) {
        System.out.println("查询学生");
    }
}
