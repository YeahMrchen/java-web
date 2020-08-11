package java7;

import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            arr.add(1);
            arr.add(57);
            arr.add(23);
            arr.add(24);

            Collections.sort(arr);
            for (int i = 0; i < arr.size(); i++) {
                System.out.println(arr.get(i));
            }

            ArrayList<User> users = new ArrayList<>();
            User user1 = new User("chen", 13);
            User user2 = new User("xu", 14);
            User user3 = new User("chen", 45);
            users.add(user1);
            users.add(user2);
            users.add(user3);
            System.out.println(users.size());
//        //返回ArrayList的实际大小
//        public int size()
            System.out.println(users.isEmpty());
//        //判断ArrayList是否为空
//        public boolean isEmpty()
            System.out.println(users.contains(user1));
//        //判断ArrayList是否包含元素o
//        public boolean contains(Object o)


//        //正向查找，返回元素的索引值
//        public int indexOf(Object o)
            System.out.println(users.indexOf(user2));
//        //反向查找，返回元素的索引值
//        public int lastIndexOf(Object o)

//        //获取index位置的元素
//        public E get(int index)
            User user = users.get(2);
            System.out.println(user);
//        //将e添加到ArrayList末尾
//        public boolean add(E e)
//        //删除ArrayList指定位置的元素
//        public E remove(int index)
           // users.remove(0);
//        //删除ArrayList中指定的元素
//        public boolean remove(Object o)
//        //清空ArrayList，将全部元素置为null
//        public void clear()
//        //将集合C中的所有元素添加到ArrayList中
//        public boolean addAll(Collection<? extends E> c)

            for(User l:users){
                System.out.println(l);
            }

        }

    }

    public static class User {
        private String name;
        private int age;

        public User() {
            super();
        }

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
