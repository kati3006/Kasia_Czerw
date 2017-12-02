package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
       userList.add(new ForumUser(1,"aaa",'F',1973,33));
        userList.add(new ForumUser(2,"bbb",'M',1993,6));
        userList.add(new ForumUser(3,"ccc",'M',1986,0));
        userList.add(new ForumUser(4,"ddd",'F',1989,17));
        userList.add(new ForumUser(5,"eee",'M',1998,4));
        userList.add(new ForumUser(6,"fff",'F',2000,5));
        userList.add(new ForumUser(7,"ggg",'F',2002,36));
        userList.add(new ForumUser(8,"hhh",'M',1986,29));
        userList.add(new ForumUser(9,"iii",'M',1987,7));
        userList.add(new ForumUser(10,"jjj",'F',1988,16));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
