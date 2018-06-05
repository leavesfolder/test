package com.basic.day01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/3/25 0025.
 */
public class Demo01 {
    public static void main(String[] args){
        List<NewItem> list = new ArrayList<NewItem>();

        list.add(new NewItem("中国也作出了略显无力的对抗",new Date(System.currentTimeMillis()-1000*60*60),100));
        list.add(new NewItem("整个世界都在看一场好戏",new Date(),80));
        list.add(new NewItem("特普朗对中国发起了贸易战",new Date(),50));
        System.out.println("排序前："+list);

        Collections.sort(list);
        System.out.println("排序后："+list);

    }

}
