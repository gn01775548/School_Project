/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.InformationQueue.EventPost;
import Business.Member.Member;
import Business.Role.Role;
import Business.InformationQueue.InformationQueue;
import java.util.ArrayList;

//import com.sun.corba.se.spi.orbutil.threadpool.WorkQueue;
/**
 *
 * @author raunak
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Member member;
    private Role role;
    private InformationQueue infoQueue;

    private ArrayList<UserAccount> followingList;
    private ArrayList<UserAccount> followerList;
    
    // Collect
    private ArrayList<EventPost> favoriteEventPosts;
    // Like
    private ArrayList<EventPost> likeEventPosts;

    public UserAccount() {
        infoQueue = new InformationQueue();
        followingList = new ArrayList<UserAccount>();
        followerList = new ArrayList<UserAccount>();
        member = new Member();
        favoriteEventPosts = new ArrayList<EventPost>();
        likeEventPosts = new ArrayList<EventPost>();

    }
       
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Member getMember() {
        return member;
    }

    public InformationQueue getInfoQueue() {
        return infoQueue;
    }

    public void setInfoQueue(InformationQueue infoQueue) {
        this.infoQueue = infoQueue;
    }
    
    public void follow(UserAccount user){
        this.followingList.add(user);
        user.followerList.add(this);
    }
    
    public void unfollow(UserAccount user){
        this.followingList.remove(user);
        user.followerList.remove(this);
    }

    public ArrayList<UserAccount> getFollowingList() {
        return followingList;
    }

    public void setFollowingList(ArrayList<UserAccount> followingList) {
        this.followingList = followingList;
    }

    public ArrayList<UserAccount> getFollowerList() {
        return followerList;
    }

    public void setFollowerList(ArrayList<UserAccount> followerList) {
        this.followerList = followerList;
    }
    
    public boolean addFavoriteEventPost(EventPost post){
        if (favoriteEventPostContains(post)){
            return false;
        }
        this.favoriteEventPosts.add(post);
        return true;
    }
    
    public boolean removeFavoriteEventPost(EventPost post){
        if (!favoriteEventPostContains(post)){
            return false;
        }
        this.favoriteEventPosts.remove(post);
        return true;
    }
   
    //Determine if the activity has been collected
    public boolean favoriteEventPostContains(EventPost post){
        return this.favoriteEventPosts.contains(post);
    }
    
    public boolean addLikeEventPost(EventPost post){
        if (likeEventPostContains(post)){
            return false;
        }
        likeEventPosts.add(post);
        return true;
    }
    public boolean removeLikeEventPost(EventPost post){
        if (!likeEventPostContains(post)){
            return false;
        }
        likeEventPosts.remove(post);
        return true;
    }
    // Determine if the activity has been liked
    public boolean likeEventPostContains(EventPost post){
        return this.likeEventPosts.contains(post);
    }
   
    @Override
    public String toString() {
        return member.getName(); // return userName;
    }
    
    
    
}