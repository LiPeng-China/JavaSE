package org.taiyi.work2;

import java.util.Arrays;

/**
 * @description:
 * @author: taiyi
 * @date: 2023-10-29 21:41
 */
public class Test {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        // 使用 save 添加学生
        studentService.save(new Student(1, "张三", 23));
        studentService.save(new Student(2, "李四", 27));
        studentService.save(new Student(3, "王二", 19));
        studentService.save(new Student(4, "赵五", 25));
        studentService.save(new Student(5, "上云", 18));
        studentService.printStus();
        System.out.println("==================================================");

        // 删除编号为 5 的学生数据
        studentService.delete(5);
        studentService.printStus();
        System.out.println("==================================================");

        // 将编号为 2 的学生年龄改为 18
        Student student = studentService.query(2);
        student.setAge(18);
        studentService.update(student);
        studentService.printStus();
        System.out.println("==================================================");

        // 查询编号为 1 的学生信息
        Student student1 = studentService.query(1);
        student1.printStudent();

    }
}
