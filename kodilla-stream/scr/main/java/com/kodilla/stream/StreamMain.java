package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();

        Map<Integer, ForumUser> theResultMapOfUsers = theForum.getUserList().stream()
                .filter(s -> s.getSex() == 'M')
                .filter(d -> d.getDateOfBirth().getYear() > 1997)
                .filter(p -> p.getQuantityOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, user -> user));


        System.out.println("# elements: " + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}