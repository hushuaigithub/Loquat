package com.luna.domain;

import java.util.List;
import java.util.UUID;

/**
 * Created by xuhao on 2017/5/29.
 */

public class User {

    private UUID userId;
    private String nickName;
    private String sex;
    private int age;
    private int height;
    private String headPortrait;//头像
    private String email;

    private List<UUID> friends;
    private List<String> lifePhotos;//生活照
    private UserInfo userInfo;

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getHeadPortrait() {
        return headPortrait;
    }

    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<UUID> getFriends() {
        return friends;
    }

    public void setFriends(List<UUID> friends) {
        this.friends = friends;
    }

    public List<String> getLifePhotos() {
        return lifePhotos;
    }

    public void setLifePhotos(List<String> lifePhotos) {
        this.lifePhotos = lifePhotos;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
