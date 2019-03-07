
package com.chemwater.hwweek4day3.model.user;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GitResponse implements Parcelable
{

    @SerializedName("current_user_url")
    @Expose
    private String currentUserUrl;
    @SerializedName("current_user_authorizations_html_url")
    @Expose
    private String currentUserAuthorizationsHtmlUrl;
    @SerializedName("authorizations_url")
    @Expose
    private String authorizationsUrl;
    @SerializedName("code_search_url")
    @Expose
    private String codeSearchUrl;
    @SerializedName("commit_search_url")
    @Expose
    private String commitSearchUrl;
    @SerializedName("emails_url")
    @Expose
    private String emailsUrl;
    @SerializedName("emojis_url")
    @Expose
    private String emojisUrl;
    @SerializedName("events_url")
    @Expose
    private String eventsUrl;
    @SerializedName("feeds_url")
    @Expose
    private String feedsUrl;
    @SerializedName("followers_url")
    @Expose
    private String followersUrl;
    @SerializedName("following_url")
    @Expose
    private String followingUrl;
    @SerializedName("gists_url")
    @Expose
    private String gistsUrl;
    @SerializedName("hub_url")
    @Expose
    private String hubUrl;
    @SerializedName("issue_search_url")
    @Expose
    private String issueSearchUrl;
    @SerializedName("issues_url")
    @Expose
    private String issuesUrl;
    @SerializedName("keys_url")
    @Expose
    private String keysUrl;
    @SerializedName("notifications_url")
    @Expose
    private String notificationsUrl;
    @SerializedName("organization_repositories_url")
    @Expose
    private String organizationRepositoriesUrl;
    @SerializedName("organization_url")
    @Expose
    private String organizationUrl;
    @SerializedName("public_gists_url")
    @Expose
    private String publicGistsUrl;
    @SerializedName("rate_limit_url")
    @Expose
    private String rateLimitUrl;
    @SerializedName("repository_url")
    @Expose
    private String repositoryUrl;
    @SerializedName("repository_search_url")
    @Expose
    private String repositorySearchUrl;
    @SerializedName("current_user_repositories_url")
    @Expose
    private String currentUserRepositoriesUrl;
    @SerializedName("starred_url")
    @Expose
    private String starredUrl;
    @SerializedName("starred_gists_url")
    @Expose
    private String starredGistsUrl;
    @SerializedName("team_url")
    @Expose
    private String teamUrl;
    @SerializedName("user_url")
    @Expose
    private String userUrl;
    @SerializedName("user_organizations_url")
    @Expose
    private String userOrganizationsUrl;
    @SerializedName("user_repositories_url")
    @Expose
    private String userRepositoriesUrl;
    @SerializedName("user_search_url")
    @Expose
    private String userSearchUrl;
    public final static Creator<GitResponse> CREATOR = new Creator<GitResponse>() {


        @SuppressWarnings({
            "unchecked"
        })
        public GitResponse createFromParcel(Parcel in) {
            return new GitResponse(in);
        }

        public GitResponse[] newArray(int size) {
            return (new GitResponse[size]);
        }

    }
    ;

    protected GitResponse(Parcel in) {
        this.currentUserUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.currentUserAuthorizationsHtmlUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.authorizationsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.codeSearchUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.commitSearchUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.emailsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.emojisUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.eventsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.feedsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.followersUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.followingUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.gistsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.hubUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.issueSearchUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.issuesUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.keysUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.notificationsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.organizationRepositoriesUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.organizationUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.publicGistsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.rateLimitUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.repositoryUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.repositorySearchUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.currentUserRepositoriesUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.starredUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.starredGistsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.teamUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.userUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.userOrganizationsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.userRepositoriesUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.userSearchUrl = ((String) in.readValue((String.class.getClassLoader())));
    }

    public GitResponse() {
    }

    public String getCurrentUserUrl() {
        return currentUserUrl;
    }

    public void setCurrentUserUrl(String currentUserUrl) {
        this.currentUserUrl = currentUserUrl;
    }

    public String getCurrentUserAuthorizationsHtmlUrl() {
        return currentUserAuthorizationsHtmlUrl;
    }

    public void setCurrentUserAuthorizationsHtmlUrl(String currentUserAuthorizationsHtmlUrl) {
        this.currentUserAuthorizationsHtmlUrl = currentUserAuthorizationsHtmlUrl;
    }

    public String getAuthorizationsUrl() {
        return authorizationsUrl;
    }

    public void setAuthorizationsUrl(String authorizationsUrl) {
        this.authorizationsUrl = authorizationsUrl;
    }

    public String getCodeSearchUrl() {
        return codeSearchUrl;
    }

    public void setCodeSearchUrl(String codeSearchUrl) {
        this.codeSearchUrl = codeSearchUrl;
    }

    public String getCommitSearchUrl() {
        return commitSearchUrl;
    }

    public void setCommitSearchUrl(String commitSearchUrl) {
        this.commitSearchUrl = commitSearchUrl;
    }

    public String getEmailsUrl() {
        return emailsUrl;
    }

    public void setEmailsUrl(String emailsUrl) {
        this.emailsUrl = emailsUrl;
    }

    public String getEmojisUrl() {
        return emojisUrl;
    }

    public void setEmojisUrl(String emojisUrl) {
        this.emojisUrl = emojisUrl;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public String getFeedsUrl() {
        return feedsUrl;
    }

    public void setFeedsUrl(String feedsUrl) {
        this.feedsUrl = feedsUrl;
    }

    public String getFollowersUrl() {
        return followersUrl;
    }

    public void setFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
    }

    public String getFollowingUrl() {
        return followingUrl;
    }

    public void setFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
    }

    public String getGistsUrl() {
        return gistsUrl;
    }

    public void setGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
    }

    public String getHubUrl() {
        return hubUrl;
    }

    public void setHubUrl(String hubUrl) {
        this.hubUrl = hubUrl;
    }

    public String getIssueSearchUrl() {
        return issueSearchUrl;
    }

    public void setIssueSearchUrl(String issueSearchUrl) {
        this.issueSearchUrl = issueSearchUrl;
    }

    public String getIssuesUrl() {
        return issuesUrl;
    }

    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    public String getKeysUrl() {
        return keysUrl;
    }

    public void setKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
    }

    public String getNotificationsUrl() {
        return notificationsUrl;
    }

    public void setNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
    }

    public String getOrganizationRepositoriesUrl() {
        return organizationRepositoriesUrl;
    }

    public void setOrganizationRepositoriesUrl(String organizationRepositoriesUrl) {
        this.organizationRepositoriesUrl = organizationRepositoriesUrl;
    }

    public String getOrganizationUrl() {
        return organizationUrl;
    }

    public void setOrganizationUrl(String organizationUrl) {
        this.organizationUrl = organizationUrl;
    }

    public String getPublicGistsUrl() {
        return publicGistsUrl;
    }

    public void setPublicGistsUrl(String publicGistsUrl) {
        this.publicGistsUrl = publicGistsUrl;
    }

    public String getRateLimitUrl() {
        return rateLimitUrl;
    }

    public void setRateLimitUrl(String rateLimitUrl) {
        this.rateLimitUrl = rateLimitUrl;
    }

    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    public void setRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    public String getRepositorySearchUrl() {
        return repositorySearchUrl;
    }

    public void setRepositorySearchUrl(String repositorySearchUrl) {
        this.repositorySearchUrl = repositorySearchUrl;
    }

    public String getCurrentUserRepositoriesUrl() {
        return currentUserRepositoriesUrl;
    }

    public void setCurrentUserRepositoriesUrl(String currentUserRepositoriesUrl) {
        this.currentUserRepositoriesUrl = currentUserRepositoriesUrl;
    }

    public String getStarredUrl() {
        return starredUrl;
    }

    public void setStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
    }

    public String getStarredGistsUrl() {
        return starredGistsUrl;
    }

    public void setStarredGistsUrl(String starredGistsUrl) {
        this.starredGistsUrl = starredGistsUrl;
    }

    public String getTeamUrl() {
        return teamUrl;
    }

    public void setTeamUrl(String teamUrl) {
        this.teamUrl = teamUrl;
    }

    public String getUserUrl() {
        return userUrl;
    }

    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

    public String getUserOrganizationsUrl() {
        return userOrganizationsUrl;
    }

    public void setUserOrganizationsUrl(String userOrganizationsUrl) {
        this.userOrganizationsUrl = userOrganizationsUrl;
    }

    public String getUserRepositoriesUrl() {
        return userRepositoriesUrl;
    }

    public void setUserRepositoriesUrl(String userRepositoriesUrl) {
        this.userRepositoriesUrl = userRepositoriesUrl;
    }

    public String getUserSearchUrl() {
        return userSearchUrl;
    }

    public void setUserSearchUrl(String userSearchUrl) {
        this.userSearchUrl = userSearchUrl;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(currentUserUrl);
        dest.writeValue(currentUserAuthorizationsHtmlUrl);
        dest.writeValue(authorizationsUrl);
        dest.writeValue(codeSearchUrl);
        dest.writeValue(commitSearchUrl);
        dest.writeValue(emailsUrl);
        dest.writeValue(emojisUrl);
        dest.writeValue(eventsUrl);
        dest.writeValue(feedsUrl);
        dest.writeValue(followersUrl);
        dest.writeValue(followingUrl);
        dest.writeValue(gistsUrl);
        dest.writeValue(hubUrl);
        dest.writeValue(issueSearchUrl);
        dest.writeValue(issuesUrl);
        dest.writeValue(keysUrl);
        dest.writeValue(notificationsUrl);
        dest.writeValue(organizationRepositoriesUrl);
        dest.writeValue(organizationUrl);
        dest.writeValue(publicGistsUrl);
        dest.writeValue(rateLimitUrl);
        dest.writeValue(repositoryUrl);
        dest.writeValue(repositorySearchUrl);
        dest.writeValue(currentUserRepositoriesUrl);
        dest.writeValue(starredUrl);
        dest.writeValue(starredGistsUrl);
        dest.writeValue(teamUrl);
        dest.writeValue(userUrl);
        dest.writeValue(userOrganizationsUrl);
        dest.writeValue(userRepositoriesUrl);
        dest.writeValue(userSearchUrl);
    }

    public int describeContents() {
        return  0;
    }

}
