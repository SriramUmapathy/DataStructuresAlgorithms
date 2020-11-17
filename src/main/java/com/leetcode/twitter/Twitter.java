package com.leetcode.twitter;

import java.util.*;

public class Twitter {

    class Tweet {
        int tweetId;
        int timeStamp;
        Tweet(int tweetId, int timeStamp) {
            this.tweetId = tweetId;
            this.timeStamp = timeStamp;
        }
    }

    static int timestamp;
    Map<Integer, List<Tweet>> userTweet;
    Map<Integer, List<Integer>> followers;

    /** Initialize your data structure here. */
    public Twitter() {
        userTweet = new HashMap<>();
        followers = new HashMap<>();
    }

    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
        if(!userTweet.containsKey(userId)) {
            userTweet.put(userId, new ArrayList<>());
        }
        List<Tweet> tweets = userTweet.get(userId);
        tweets.add(new Tweet(tweetId, timestamp++));
        userTweet.put(userId,tweets);
    }

    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {

        List<Integer> users = followers.get(userId);

        if(users == null) {
            users = new ArrayList<>();
            users.add(userId);
        }

        PriorityQueue<Tweet> q = new PriorityQueue<Tweet>(users.size(), (a, b)->(a.timeStamp-b.timeStamp));
        for(int user : users) {
            List<Tweet> tweets = userTweet.get(user);
            if(tweets == null)
                continue;
            for(Tweet t : tweets) {
                if(t == null)
                    continue;
                if(q.size() < 10) q.add(t);
                else {
                    if(t.timeStamp <= q.peek().timeStamp)
                        break;
                    else {
                        q.add(t);
                        q.poll(); //remove the oldest tweet
                    }
                }
            }
        }

        List<Integer> myFeed = new LinkedList<>();
        while(!q.isEmpty()) {
            myFeed.add(0,q.poll().tweetId);
        }
        return myFeed;
    }

    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {

        if(followerId == followeeId)
            return;

        if(!followers.containsKey(followerId)) {
            List<Integer> list = new ArrayList<>();
            list.add(followerId);
            followers.put(followerId, list);
        }
        List<Integer> users = followers.get(followerId);
        if(!users.contains(Integer.valueOf(followeeId)))
            users.add(followeeId);
        followers.put(followerId,users);
    }

    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
        if(followerId == followeeId)
            return;
        List<Integer> users = followers.get(followerId);

        if(users == null)
            return;

        users.remove(Integer.valueOf(followeeId));
        followers.put(followerId,users);
    }

    public static void main(String[] args) {
        //["Twitter","postTweet","getNewsFeed","follow","postTweet","getNewsFeed","unfollow","getNewsFeed"]
        //[[],[1,5],[1],[1,2],[2,6],[1],[1,2],[1]]
        //["Twitter","postTweet","getNewsFeed","follow","getNewsFeed","unfollow","getNewsFeed"]
        //[[],[1,1],[1],[2,1],[2],[2,1],[2]]
        //["Twitter","postTweet","follow","getNewsFeed"]
        //[[],[1,5],[1,1],[1]]
        //["Twitter","postTweet","postTweet","unfollow","getNewsFeed"]
        //[[],[1,4],[2,5],[1,2],[1]]
        //["Twitter","postTweet","postTweet","unfollow","follow","getNewsFeed"]
        //[[],[1,4],[2,5],[1,2],[1,2],[1]]
        //["Twitter","postTweet","follow","follow","getNewsFeed"]
        //[[],[2,5],[1,2],[1,2],[1]]

        //["Twitter","postTweet","postTweet","postTweet","postTweet","postTweet","postTweet","postTweet","postTweet","postTweet","postTweet","postTweet","postTweet","postTweet","postTweet","postTweet","postTweet","postTweet","postTweet","postTweet","postTweet","postTweet","postTweet","getNewsFeed","follow","getNewsFeed","unfollow","getNewsFeed"]
        //[[],[1,5],[2,3],[1,101],[2,13],[2,10],[1,2],[1,94],[2,505],[1,333],[2,22],[1,11],[1,205],[2,203],[1,201],[2,213],[1,200],[2,202],[1,204],[2,208],[2,233],[1,222],[2,211],[1],[1,2],[1],[1,2],[1]]

        Twitter twitter = new Twitter();
        twitter.postTweet(2,1);
        twitter.postTweet(2,2);
        twitter.postTweet(2,3);
        twitter.postTweet(2,4);
        twitter.postTweet(2,5);
        twitter.postTweet(2,6);
        twitter.postTweet(2,7);
        twitter.postTweet(2,8);
        twitter.postTweet(2,9);
        twitter.postTweet(2,10);
        twitter.postTweet(2,11);

        System.out.println(twitter.getNewsFeed(2));

//        System.out.println(twitter.getNewsFeed(2));
//        twitter.unfollow(2,1);
//        System.out.println(twitter.getNewsFeed(2));
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */
