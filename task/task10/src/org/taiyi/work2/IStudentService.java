package org.taiyi.work2;


/**
 * @description:
 * @author: taiyi
 * @date: 2023-10-29 21:28
 */
public interface IStudentService {

    void save(Student student);

    void delete(int sn);

    void update(Student student);

    Student query(int sn);
}
