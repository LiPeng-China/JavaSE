package org.taiyi.work2;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: taiyi
 * @date: 2023-11-01 22:51
 */
public class Test {
    public static void main(String[] args) {
        // 1、存储学生信息并打印
        System.out.println("=================================");
        List<Student> students = new ArrayList<>();
        students.add(new Student("sy", 18, 59.0));
        students.add(new Student("zs", 23, 90.0));
        students.add(new Student("lisi", 19, 90.0));
        students.add(new Student("wangwu", 20, 99.0));
        students.add(new Student("sunliu", 22, 100.0));

        System.out.println(students);

        // 2、年龄大于19的学生 和 年龄小于等于19的学生
        System.out.println("=================================");
        List<Student> more19Students = new ArrayList<>();
        List<Student> less19Students = new ArrayList<>();
        for (Student student : students) {
            if (student.getAge() > 19) {
                more19Students.add(student);
            } else {
                less19Students.add(student);
            }
        }

        System.out.println(more19Students);
        System.out.println(less19Students);

        // 3、打印 95 分以上的学生姓名和分数
        System.out.println("=================================");
        for (Student student : students) {
            if (student.getScore() > 95.0) {
                System.out.println(student.getName() + "：" + student.getScore());
            }
        }

    }
}
