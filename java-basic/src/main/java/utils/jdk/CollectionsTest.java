package utils.jdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.google.common.collect.Lists;

/**
 * @author xulei
 * Created on 2025-08-22 09:04
 */
public class CollectionsTest {

    @Test
    @DisplayName("判断两个集合是否有交集")
    public void testHasDisJoint() {
        List<Integer> list1 = Lists.newArrayList(1, 2, 3);
        List<Integer> list2 = Lists.newArrayList(4, 5, 6, 7);
        List<Integer> list3 = Lists.newArrayList(8, 1, 11);

        // true表示两个列表没有交集，是不相交的
        System.out.println(Collections.disjoint(list1, list2)); // true

        // false表示两个列表有交集，有相交的元素
        System.out.println(Collections.disjoint(list1, list3)); // false
    }

    @Test
    @DisplayName("List集合排序")
    public void test() {
        List<Integer> list = Lists.newArrayList(3, 1, 8, -3, -9, 4);
        System.out.println(list); // [3, 1, 8, -3, -9, 4]

        // 默认升序排序
        Collections.sort(list);
        System.out.println(list); // [-9, -3, 1, 3, 4, 8]

        // 指定降序排序，使用lambda表达式代替匿名内部类，重写Comparator中的compare方法
        Collections.sort(list, (o1, o2) -> o2 - o1);
        System.out.println(list); // [8, 4, 3, 1, -3, -9]
    }

    @Test
    @DisplayName("反转集合元素")
    public void testReverse() {
        ArrayList<Integer> list = Lists.newArrayList(1, 2, 3);
        System.out.println(list); // [1, 2, 3]
        Collections.reverse(list);
        System.out.println(list); // [3, 2, 1]
    }

    @Test
    @DisplayName("空集合")
    public void testEmptyCollection() {
        List<Integer> emptyList = Collections.emptyList();
        System.out.println(emptyList); // []

        Set<Integer> emptySet = Collections.emptySet();
        System.out.println(emptySet); // []

        Map<Integer, String> emptyMap = Collections.emptyMap();
        System.out.println(emptyMap); // {}
    }

    @Test
    @DisplayName("互换List中两个元素的位置")
    public void test2() {
        List<Integer> list = Lists.newArrayList(1, 2, 3);
        System.out.println(list); // [1, 2, 3]

        // 使用Collections中的swap方法，互换两个元素的位置
        Collections.swap(list, 1, 2);
        System.out.println(list); // [1, 3, 2]
    }


}
