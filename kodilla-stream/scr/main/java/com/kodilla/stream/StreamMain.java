package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();

       theForum.getUserList().stream()
                .filter(s -> s.getSex() == 'M')
                .forEach(s -> System.out.println(s.getSex()));

       theForum.getUserList().stream()
               .filter(d -> d.getDateOfBirth().getYear() > 1997)
               .forEach(d -> System.out.println(d.getDateOfBirth()));

       theForum.getUserList().stream()
               .filter(p -> p.getQuantityOfPosts() >= 1)
               .forEach(p -> System.out.println(p.getQuantityOfPosts()));

        Map<Integer, Forum> theResultMapOfUsers = theForum.getUserList().stream()
                .filter(user -> user.getUserID())
                .collect(Collectors.toMap(ForumUser::getUserID, user -> user));

        System.out.println("# elements: " + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}

