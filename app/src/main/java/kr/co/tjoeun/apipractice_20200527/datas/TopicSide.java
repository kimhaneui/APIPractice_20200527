package kr.co.tjoeun.apipractice_20200527.datas;

import org.json.JSONException;
import org.json.JSONObject;

public class TopicSide {
    private int id;
    private int topicId;
    private String title;

    public  static TopicSide getTopicSideJson(JSONObject json){
        TopicSide ts = new TopicSide();

        try {
            ts.id = json.getInt("id");
            ts.topicId = json.getInt("topicId");
            ts.title = json.getString("title");

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return  ts;
    }
    public TopicSide() {
        this.id = id;
        this.topicId = topicId;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
