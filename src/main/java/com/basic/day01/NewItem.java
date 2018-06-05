package com.basic.day01;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by Administrator on 2018/3/25 0025.
 */
public class NewItem implements Comparable<NewItem>{
    private String title;
    private Date pubTime;
    private Integer hits;

    public NewItem(String title, Date pubTime, Integer hits) {
        this.title = title;
        this.pubTime = pubTime;
        this.hits = hits;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPubTime() {
        return pubTime;
    }

    public void setPubTime(Date pubTime) {
        this.pubTime = pubTime;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("新闻主题").append(this.title);
        sb.append("发布时间 ").append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.pubTime));
        sb.append("点击量").append(this.hits);
        return sb.toString();
    }

    public int compareTo(NewItem o) {
        int result=0;
        //先根据时间进行排序，然后是点击率，最后是主题
        result=-this.pubTime.compareTo(o.getPubTime());
        if(result==0){
            result=this.hits-o.getHits();
            if(result==0){
               result=-this.title.compareTo(o.getTitle());
            }
        }
        return result;
    }
}
