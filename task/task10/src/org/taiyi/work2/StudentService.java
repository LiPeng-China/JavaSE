package org.taiyi.work2;

/**
 * @description:
 * @author: taiyi
 * @date: 2023-10-29 21:31
 */
public class StudentService implements IStudentService {

    private Student[] stus;
    private int count;

    public StudentService() {
        this.stus = new Student[5];
        this.count = 0;
    }

    public void printStus() {
        for (int i = 0; i < count; i++) {
            this.stus[i].printStudent();
        }
    }

    @Override
    public void save(Student student) {
        if (this.count >= 5) {
            System.out.println("学生已满员，无法再添加。");
        }
        this.stus[this.count] = student;
        this.count++;
    }

    @Override
    public void delete(int sn) {
        for (int i = 0; i < this.count; i++) {
            if (sn == this.stus[i].getSn()) {
                for (int j = i + 1; j < this.count; j++) {
                    this.stus[j - 1] = this.stus[j];
                }
                this.count--;
                break;
            }
        }
    }

    @Override
    public void update(Student student) {
        for (int i = 0; i < this.count; i++) {
            if (student.getSn() == this.stus[i].getSn()) {
                this.stus[i] = student;
                break;
            }
        }
    }

    @Override
    public Student query(int sn) {
        for (int i = 0; i < this.count; i++) {
            if (sn == this.stus[i].getSn()) {
                return this.stus[i];
            }
        }
        return null;
    }
}
