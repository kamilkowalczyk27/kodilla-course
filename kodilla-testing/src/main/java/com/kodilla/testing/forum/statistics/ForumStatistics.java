package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double postsAveragePerUser;
    private double commentsAveragePerUser;
    private double commentsAveragePerPost;

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getPostsAveragePerUser() {
        return postsAveragePerUser;
    }

    public double getCommentsAveragePerUser() {
        return commentsAveragePerUser;
    }

    public double getCommentsAveragePerPost() {
        return commentsAveragePerPost;
    }

    public void calculateAverageStatistics(Statistics statistics){
        usersQuantity = statistics.usersNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();
        postsAveragePerUser = calculatePostsAveragePerUser();
        commentsAveragePerUser = calculateCommentsAveragePerUser();
        commentsAveragePerPost = calculateCommentsAveragePerPost();
    }

    private double calculatePostsAveragePerUser() {

        if(usersQuantity>0){
            return (double)postsQuantity/usersQuantity;
        } else {
            return 0;
        }
    }

    private double calculateCommentsAveragePerUser() {
        if(usersQuantity>0){
            return (double) commentsQuantity/usersQuantity;
        } else {
            return 0;
        }
    }

    private double calculateCommentsAveragePerPost() {
        if(postsQuantity>0){
            return (double)commentsQuantity/postsQuantity;
        } else {
            return 0;
        }
    }

    public void showStatistics(){
        System.out.println("Users quantity: " + usersQuantity);
        System.out.println("Posts quantity: " + postsQuantity);
        System.out.println("Comments quantity: " + commentsQuantity);
        System.out.println("Posts average per user" + postsAveragePerUser);
        System.out.println("Comments average per user" + commentsAveragePerUser);
        System.out.println("Comments average per post" + commentsAveragePerPost);
    }
}







