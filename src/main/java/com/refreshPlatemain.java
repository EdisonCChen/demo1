package com;


import com.xm.RP.web.service.impl.LayoutTemplateServiceImpl;
import com.xm.RP.web.vo.Userinfo;

import java.util.ArrayList;
import java.util.List;

public class refreshPlatemain {

    public static void main(String[] args) {
        List<Userinfo> list = new ArrayList<Userinfo>();
        Userinfo userinfo = new Userinfo();
        userinfo.setNodeIp("192.168.60.117");
        userinfo.setCompany("茜莓科技");
        userinfo.setUserName("张三啊啊啊啊");
        userinfo.setUserRank("主任");
        list.add(userinfo);
        Userinfo userinfo1 = new Userinfo();
        userinfo1.setNodeIp("192.168.60.1");
        userinfo1.setCompany("茜莓科技");
        userinfo1.setUserName("李四");
        userinfo1.setUserRank("主任");
        list.add(userinfo1);
        Userinfo userinfo2 = new Userinfo();
        userinfo2.setNodeIp("192.168.60.2");
        userinfo2.setCompany("茜莓科技");
//        userinfo2.setUserName("");
        userinfo2.setUserRank("主任");
        list.add(userinfo2);
        try {
            String backmsg=LayoutTemplateServiceImpl.createLayoutImage(list);
            System.out.println(backmsg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
