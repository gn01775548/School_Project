/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_8.analytics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import lab_8.entities.Comment;
import lab_8.entities.Post;
import lab_8.entities.User;


public class AnalysisHelper {
    public void averageLikesPerComment(){
        Map<Integer, Integer> commentLikecount = new HashMap<Integer, Integer>();
        Map<Integer, Comment> commentMap = DataStore.getInstance().getComments(); 
        
        List<Comment> commentList = new ArrayList<>(commentMap.values());
      
        for(Comment c : commentList ){  
            commentLikecount.put(c.getId(), c.getLikes());
        }
                
        int totalLikes = 0;
        for(int v: commentLikecount.values()){
            totalLikes += v;
        }
        
        double averageLikesPerComment = totalLikes/commentList.size();

        System.out.println("Average Number of Likes Per Comment : " + averageLikesPerComment);

    }
    
    public void postwithMostLikedComments(){
        
        Map<Integer, Post> postMap = DataStore.getInstance().getPosts(); 
        Map<Integer, Comment> commentMap = DataStore.getInstance().getComments(); 
            List<Comment> commentList = new ArrayList<>(commentMap.values());
            Collections.sort(commentList, new Comparator<Comment>(){            
                @Override
                public int compare(Comment o1, Comment o2){
                    return o2.getLikes() - o1.getLikes();
                }
            });
            
            Comment mostLikedComment = commentList.get(0);
            int postID = mostLikedComment.getPostId();
                    
        System.out.println("Post with Most Liked comment : Post ID is " + mostLikedComment.getPostId());
        
    }
    
    public void postWithMostComments(){
        
        Map<Integer, Post> postMap = DataStore.getInstance().getPosts(); 
        Map<Integer, Comment> commentMap = DataStore.getInstance().getComments(); 
        Map<Integer, Integer> postCommentCountMap = new HashMap<Integer, Integer>();
        
            for (Post p: postMap.values()){
                int commentCount = p.getComments().size();//這一個post的comment加進Commontcount
                postCommentCountMap.put(p.getPostId(), commentCount);//把這個commont和post結合。
            }
            
            int max =0;
            List<Integer> maxId = new ArrayList<Integer>();//max 的list
            
            for (int v: postCommentCountMap.values()){
                if (v > max){
                    max = v;
                }
            }
            
            for (int id: postCommentCountMap.keySet()){
                if (postCommentCountMap.get(id) == max){
                    maxId.add(id);
                }
            }
        System.out.println("Post With Most Comments : Post ID is " + maxId + " with " + max + " Comments");
        
    }
                 
 

	public void top5InactiveUsersBasedPosts(){  
	    Map<Integer, User> userMap = DataStore.getInstance().getUsers();
	    Map<Integer, Post> postMap = DataStore.getInstance().getPosts();
	    Map<Integer, Integer> userPostCount = new HashMap<Integer, Integer>();
	    
	    int postCount=0;
	    for (User u: userMap.values()){
	        int userId = u.getId();
	     
	        for (Post p: postMap.values()){
	            int postUserId =p.getUserId(); 
	            if (userId == postUserId){
	                postCount ++;
	            }
	            userPostCount.put(userId, postCount);
	        }          
	    }
	      
	    System.out.println("Top 5 Inactive Users Based on Posts:");
	    
	    int x = 1;
	    while( x < 6 ) {
	        int maxId = 0;
	        int max = 0;
	        for (int id : userPostCount.keySet()){        
	            if(userPostCount.get(id) > max){
	                max = userPostCount.get(id);
	                maxId = id;
	            }        
	        }
	        userPostCount.remove(maxId);
	        System.out.println("Top "+x+" : "+max+"\n"+userMap.get(maxId));
	        x++;
	    }    
	}
	
	
	
	public void top5InactiveUsersBasedComments(){        
	    Map<Integer, User> userMap = DataStore.getInstance().getUsers();
	    Map<Integer, Integer> userCommentCount = new HashMap<Integer, Integer>();
	       
	
	    
	    for(User user : userMap.values()){
	        for(Comment c : user.getComments()){
	            int comment = 0; 
	            if(userCommentCount.containsKey(user.getId()))
	            comment = userCommentCount.get(user.getId()); 
	            comment++;  
	            userCommentCount.put(user.getId(), comment);
	        }   
	    }
	    
	    
	    
	    
	    
	    System.out.println("\n"+"Top 5 Inactive Users Based on Comments:");
	    
	    int x = 1;
	    while( x < 6 ) {
	        int maxId = 0;
	        int max = 0;
	        for (int id : userCommentCount.keySet()){        
	            if(userCommentCount.get(id) > max){
	                max = userCommentCount.get(id);
	                maxId = id;
	            }        
	        }
	        userCommentCount.remove(maxId);
	        System.out.println("Top "+x+" : "+max+"\n"+userMap.get(maxId));
	        x++;
	    }    
	}
	
	public void top5InactiveUsers(){
    	System.out.println("\n" + "Top 5 inactive users overall:");
    	Map<Integer, User> userMap = DataStore.getInstance().getUsers();
    	Map<Integer, Post> postMap = DataStore.getInstance().getPosts();
    	Map<Integer, Comment> commentMap = DataStore.getInstance().getComments();
    	List<Post> postList = new ArrayList<>(postMap.values());
    	List<Comment> commentList = new ArrayList<>(commentMap.values());
    	int[][] numOfUser = new int[userMap.size()][1];
    	for (Post p : postList) {
			int userId = p.getUserId();
			numOfUser[userId][0]++;
		}
    	for (Comment c : commentList){
    		int userId = c.getUserId();
    		numOfUser[userId][0]++;
    	}
    	List<Integer> topList = new ArrayList<>();
    	for (int i = 0; i < numOfUser.length; i++){
    		topList.add(numOfUser[i][0]);
    	}
    	Collections.sort(topList, new Comparator<Integer>(){            
            @Override
            public int compare(Integer o1, Integer o2) {
            	return o1-o2;
            }
        });
    	int[] top5 = new int[5];
    	for (int i = 0; i < 5; i++){
    		for (int j = 0; j < numOfUser.length; j++){
    			if (topList.get(i) == numOfUser[j][0]){
    				top5[i] = j;
    				numOfUser[j][0] = 0;
    				break;
    			}
    		}
    	}
    	System.out.println("Top " + 1 + " : " + topList.get(0));
    	System.out.println(userMap.get(top5[0]));
    	System.out.println("Top " + 2 + " : " + topList.get(1));
    	System.out.println(userMap.get(top5[1]));
    	System.out.println("Top " + 3 + " : " + topList.get(2));
    	System.out.println(userMap.get(top5[2]));
    	System.out.println("Top " + 4 + " : " + topList.get(3));
    	System.out.println(userMap.get(top5[3]));
    	System.out.println("Top " + 5 + " : " + topList.get(4));
    	System.out.println(userMap.get(top5[4]));
    }

    public void top5ProactiveUsers(){
    	System.out.println("\n" + "Top 5 proactive users overall:");
    	Map<Integer, User> userMap = DataStore.getInstance().getUsers();
    	Map<Integer, Post> postMap = DataStore.getInstance().getPosts();
    	Map<Integer, Comment> commentMap = DataStore.getInstance().getComments();
    	List<Post> postList = new ArrayList<>(postMap.values());
    	List<Comment> commentList = new ArrayList<>(commentMap.values());
    	int[][] numOfUser = new int[userMap.size()][1];
    	for (Post p : postList) {
			int userId = p.getUserId();
			numOfUser[userId][0]++;
		}
    	for (Comment c : commentList){
    		int userId = c.getUserId();
    		numOfUser[userId][0]++;
    	}
    	List<Integer> topList = new ArrayList<>();
    	for (int i = 0; i < numOfUser.length; i++){
    		topList.add(numOfUser[i][0]);
    	}
    	Collections.sort(topList, new Comparator<Integer>(){            
            @Override
            public int compare(Integer o1, Integer o2) {
            	return o2-o1;
            }
        });
    	int[] top5 = new int[5];
    	for (int i = 0; i < 5; i++){
    		for (int j = 0; j < numOfUser.length; j++){
    			if (topList.get(i) == numOfUser[j][0]){
    				top5[i] = j;
    				numOfUser[j][0] = 0;
    				break;
    			}
    		}
    	}
    	System.out.println("Top " + 1 + " : " + topList.get(0));
    	System.out.println(userMap.get(top5[0]));
    	System.out.println("Top " + 2 + " : " + topList.get(1));
    	System.out.println(userMap.get(top5[1]));
    	System.out.println("Top " + 3 + " : " + topList.get(2));
    	System.out.println(userMap.get(top5[2]));
    	System.out.println("Top " + 4 + " : " + topList.get(3));
    	System.out.println(userMap.get(top5[3]));
    	System.out.println("Top " + 5 + " : " + topList.get(4));
    	System.out.println(userMap.get(top5[4]));
    }

}
                 




