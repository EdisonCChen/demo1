package com;


import com.xm.RP.web.service.impl.LayoutTemplateServiceImpl;
import com.xm.RP.web.vo.Userinfo;

import java.util.ArrayList;
import java.util.List;

public class refreshPlatemain {

    public static void main(String[] args) {
        List<Userinfo> list = new ArrayList<Userinfo>();
        Userinfo userinfo = new Userinfo();
        userinfo.setNodeIp("1");
        userinfo.setElementNo2("席媒科技");
        userinfo.setElementNo1("柯麦德");
        userinfo.setElementNo3("常委会主任");
        userinfo.setElementNo4("第四");
        userinfo.setElementNo5("第五");
        list.add(userinfo);
        try {
            String backmsg=LayoutTemplateServiceImpl.createLayoutImage(list,"D:\\Users\\CHENJH\\Desktop\\LayoutConfig.json");
            System.out.println(backmsg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
