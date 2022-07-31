package org.example.data.algorithm;

import java.util.*;


/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */
public class Twitter {

    // 看作Node
    private static class User {
        public int id;
        public Set<Integer> tweets;
        public Set<Integer> followers;

        public User(int id) {
            this.id = id;
            this.tweets = new HashSet<>();
            this.followers = new HashSet<>();
        }
    }

    private Map<Integer, User> userMap = new HashMap<>();

    public Twitter() {

    }

    public void postTweet(int userId, int tweetId) {
        if (!userMap.containsKey(userId)) {
            userMap.put(userId, new User(userId));
        }
        userMap.get(userId).tweets.add(tweetId);
    }

    public List<Integer> getNewsFeed(int userId) {
        return null;
    }

    // ID 为 followerId 的用户开始关注 ID 为 followeeId 的用户。
    public void follow(int followerId, int followeeId) {
        if (!userMap.containsKey(followerId)){
            userMap.put(followerId, new User(followerId));
        }
        if (!userMap.containsKey(followeeId)){
            userMap.put(followeeId, new User(followeeId));
        }
        userMap.get(followerId).followers.add(followeeId);
    }

    // ID 为 followerId 的用户不再关注 ID 为 followeeId 的用户。
    public void unfollow(int followerId, int followeeId) {
        if (!userMap.containsKey(followerId)){
            userMap.put(followerId, new User(followerId));
        }
        if (!userMap.containsKey(followeeId)){
            userMap.put(followeeId, new User(followeeId));
        }
        userMap.get(followeeId).followers.remove(followerId);
    }
}
