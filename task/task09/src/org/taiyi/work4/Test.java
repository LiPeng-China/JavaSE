package org.taiyi.work4;

/**
 * @description: 测试类
 * @author: taiyi
 * @date: 2023-10-29 10:44
 */
public class Test {
    public static void main(String[] args) {
        ClassDemo classDemo = new ClassDemo(1);

        // 录入学生信息
        classDemo.input(new Student(1, "张三", 23));
        classDemo.input(new Student(2, "李四", 27));
        classDemo.input(new Student(3, "王二", 19));
        classDemo.input(new Student(4, "赵五", 25));
        classDemo.input(new Student(5, "上云", 18));

        // 根据学号查找学生信息
        Student studentBySn = classDemo.getStudentBySn(1);
        if (null != studentBySn) {
            studentBySn.printStudent();
        } else {
            System.out.println("查无此生");
        }

        // 打印所有学生信息
        System.out.println("====================================");
        classDemo.printStudentList();

    }
}
