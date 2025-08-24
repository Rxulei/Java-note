package comparae.comparable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xulei
 * Created on 2025-08-21 15:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Comparable<Student> {

    private String name;
    private int age;

    /*
       比较大小的规则：先按照name升序排序，如果name相同，再按照年龄降序
     */

    /**
     * 1. 实现Comparable接口
     * 2. 实现compareTo方法
     */
    @Override
    public int compareTo(Student stu) {
        int flag = this.name.compareTo(stu.name);
        // 如果name相同，按照年龄降序
        if (flag == 0) {
            // 按照年龄升序(默认的：当前对象的属性-目标对象的属性)
            // return this.age - o.age;
            // 按照年龄降序
            return -(this.age - stu.age);
        }

        return flag;
    }
}
