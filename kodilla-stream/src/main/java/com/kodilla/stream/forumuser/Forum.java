package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
       userList.add(new ForumUser(1,"aaa",'F', LocalDate.of(1984,1,1),33));
        userList.add(new ForumUser(2,"bbb",'M', LocalDate.of(1993, 1,1),6));
        userList.add(new ForumUser(3,"ccc",'M', LocalDate.of(1986, 1,1 ),0));
        userList.add(new ForumUser(4,"ddd",'F', LocalDate.of(1989, 1,1),17));
        userList.add(new ForumUser(5,"eee",'M', LocalDate.of(1998, 1,1 ),4));
        userList.add(new ForumUser(6,"fff",'F', LocalDate.of(2000, 1,1),5));
        userList.add(new ForumUser(7,"ggg",'F', LocalDate.of(2002, 1,1),36));
        userList.add(new ForumUser(8,"hhh",'M', LocalDate.of(1986,1,1),29));
        userList.add(new ForumUser(9,"iii",'M', LocalDate.of(1987, 1,1),7));
        userList.add(new ForumUser(10,"jjj",'F', LocalDate.of(1988,1,1),16));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
