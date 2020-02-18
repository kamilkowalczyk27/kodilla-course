package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private int postsAveragePerUser;
    private int commentsAveragePerUser;
    private int commentsAveragePerPost;

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public int getPostsAveragePerUser() {
        return postsAveragePerUser;
    }

    public int getCommentsAveragePerUser() {
        return commentsAveragePerUser;
    }

    public int getCommentsAveragePerPost() {
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

    private int calculatePostsAveragePerUser() {

        if(usersQuantity>0){
            return (int)postsQuantity/usersQuantity;
        } else {
            return 0;
        }
    }

    private int calculateCommentsAveragePerUser() {
        if(usersQuantity>0){
            return (int) commentsQuantity/usersQuantity;
        } else {
            return 0;
        }
    }

    private int calculateCommentsAveragePerPost() {
        if(postsQuantity>0){
            return (int)commentsQuantity/postsQuantity;
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







