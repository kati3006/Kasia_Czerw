package com.kodilla.testing.forum.statistics;
public class ForumStatistics {

    private Statistics stat;
    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double averagePostsPerUser;
    private double averageComentsPerUser;
    private double averageCommentsPerPost;

    public ForumStatistics(Statistics stat) {
        this.stat = stat;
    }

    public void calculateAdvStatistics(){
        usersCount = stat.usersNames().size();
        postsCount = stat.postsCount();
        commentsCount = stat.commentsCount();
        if (usersCount != 0) {
            averagePostsPerUser = postsCount / usersCount;
            averageComentsPerUser = commentsCount / usersCount;
        }
        else {
            averagePostsPerUser = 0;
            averageComentsPerUser = 0;

        }
        if (postsCount != 0) {
            averageCommentsPerPost = commentsCount / postsCount;
        }
        else {
           averageCommentsPerPost = 0;
        }
    }

    public void showStatistics() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "ForumStatistics{" +
                "usersCount=" + usersCount +
                ", postsCount=" + postsCount +
                ", commentsCount=" + commentsCount +
                ", averagePostsPerUser=" + averagePostsPerUser +
                ", averageComentsPerUser=" + averageComentsPerUser +
                ", averageCommentsPerPost=" + averageCommentsPerPost +
                '}';
    }

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageComentsPerUser() {
        return averageComentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }
}
