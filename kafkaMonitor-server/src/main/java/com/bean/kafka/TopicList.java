package com.bean.kafka;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: huxuhui
 * @Date: 2019/4/1 17:24
 * @Description: 所有的topic
 */
public class TopicList {

    /**
     * 返回编码
     */
    private int code = 200;

    private List<String> topicList = new ArrayList<>();

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<String> getTopicList() {
        return topicList;
    }

    public void setTopicList(List<String> topicList) {
        this.topicList = topicList;
    }

    @Override
    public String toString() {
        return "TopicList{" +
                "code=" + code +
                ", topicList=" + topicList +
                '}';
    }
}
