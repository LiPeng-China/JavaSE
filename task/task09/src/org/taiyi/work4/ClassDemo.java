package org.taiyi.work4;

/**
 * @description:
 * @author: taiyi
 * @date: 2023-10-29 10:33
 */
public class ClassDemo {

    private int cn;
    private Student[] studentList;

    private int count;

    public ClassDemo(int cn) {
        this.cn = cn;
        this.studentList = new Student[35];
        this.count = 0;
    }

    /**
     * 添加学生
     *
     * @param stu 待插入的学生
     */
    public void input(Student stu) {
        if (count >= 35) {
            System.out.println("该班级人数已满员，无法添加学生");
            return;
        }
        this.studentList[count] = stu;
        count++;
    }

    public void printStudentList() {
        for (int i = 0; i < count; i++) {
            this.studentList[i].printStudent();
        }
    }

    /**
     * 根据学号查询学生
     *
     * @param sn 学号
     * @return 查找到返回该学生；找不到返回 null
     */
    public Student getStudentBySn(int sn) {
        for (int i = 0; i < count; i++) {
            if (this.studentList[i].getSn() == sn) {
                return this.studentList[i];
            }
        }
        return null;
    }

    public int getCn() {
        return cn;
    }

    public void setCn(int cn) {
        this.cn = cn;
    }

    public Student[] getStudentList() {
        return studentList;
    }

    public void setStudentList(Student[] studentList) {
        this.studentList = studentList;
    }
}
