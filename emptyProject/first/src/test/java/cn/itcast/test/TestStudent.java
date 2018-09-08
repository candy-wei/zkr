package cn.itcast.test;


import cn.itcast.dao.Dao;
import cn.itcast.dao.impl.StudentDao;
import cn.itcast.pojo.Student;
import sun.jvm.hotspot.runtime.VM;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import static java.lang.reflect.Proxy.*;

/**
 * Date:18/3/19
 * Author: Candy you will like it
 * Desc: for fun
 */
public class TestStudent {
    public static void main(String[] args){
        StudentDao studentDao = new StudentDao();

       /* studentDao.delete(null);
        studentDao.query(null);
        studentDao.save(null);
        studentDao.update(null);
        */
       test02();
    }

    public static void test02(){
        Student student = new Student();
        final StudentDao stuDao = new StudentDao();

        Dao proxy = (Dao)Proxy.newProxyInstance(stuDao.getClass().getClassLoader(),
                stuDao.getClass().getInterfaces(),
                new InvocationHandler() {

            //检查权限
                   public boolean check(Method method){
                       if (method.getName().equals("query")){
                           System.out.println("有权限");
                           return true;
                       }
                       return false;
                   }

                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                       if(check(method)) {
                           Object obj = method.invoke(stuDao, args);
                           System.out.println("记录日志");
                           return obj;
                       }

                        return null;
                    }
                });
        proxy.delete(student);
        proxy.query(1L);
        proxy.save(student);
        proxy.update(student);
    }
}
