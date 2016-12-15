package cn.acheng1314.controller;

import java.util.*;

/**
 * Created by zqchen on 16/12/14.
 */
public class ListQuChong {

    public static void main(String[] args) {
        List<User> userList = new ArrayList<User>();
        User user1 = new User("duqi", "123");
        userList.add(user1);
        User user2 = new User("temp", "456");
        userList.add(user2);
        User user3 = new User("ddd", "456");
        userList.add(user3);
        for (User u : userList) {
            System.out.println(u.getName()+" || ");
        }
        List<User> users = removeDuplicateUser(userList);
        for (User user : users) {
            System.out.println(user.getName());
        }
    }

    private static ArrayList<User> removeDuplicateUser(List<User> users) {
        Set<User> set = new TreeSet<User>(new Comparator<User>() {
            public int compare(User o1, User o2) {
                return o1.getUserId().compareTo(o2.getUserId());
            }
        });
        set.addAll(users);
        return new ArrayList<User>(set);
    }
}


