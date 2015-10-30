package edu.javacourse.live.entity;

public class LivePost
{
    private long postId;
    private LiveUser liveUser;
    private String postTitle;
    private String postBody;

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public LiveUser getLiveUser() {
        return liveUser;
    }

    public void setLiveUser(LiveUser liveUser) {
        this.liveUser = liveUser;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostBody() {
        return postBody;
    }

    public void setPostBody(String postBody) {
        this.postBody = postBody;
    }

}
