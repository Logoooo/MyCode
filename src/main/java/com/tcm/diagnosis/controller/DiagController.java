package com.tcm.diagnosis.controller;


import com.alibaba.fastjson.JSONObject;
import com.tcm.diagnosis.model.Diagnosis;
import com.tcm.diagnosis.service.DiagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "/diag")
public class DiagController {
    @Autowired
    private DiagService diagService;
    private Diagnosis diagnosis;
    @ResponseBody
    @PostMapping(value = "/insert",produces = "application/json;charset=UTF-8")
//    public int addDiag(Diagnosis diag){
//        return diagService.addDiag(diag);
//    }
    public int addDiag(@RequestBody String parms){
        Diagnosis diagnosis = null;
        JSONObject jsonObject = JSONObject.parseObject(parms);


        diagnosis = new Diagnosis();
        String str1 = jsonObject.getString("小腿酸吗？");
        diagnosis.setAnswer1(str1);
        String str2 = jsonObject.getString("手脚怕冷？跟身边的人比起来穿的多吗？");
        diagnosis.setAnswer2(str2);
        String str3 = jsonObject.getString("双下肢有没有水肿啊");
        diagnosis.setAnswer3(str3);
        String str4 = jsonObject.getString("口干喜饮水吗？");
        diagnosis.setAnswer4(str4);
        String str5 = jsonObject.getString("觉得咽喉疼痛红肿吗？");
        diagnosis.setAnswer5(str5);
        String str6 = jsonObject.getString("有没有头部沉重有如被包裹感？");
        diagnosis.setAnswer6(str6);
        String str7 = jsonObject.getString("面色萎黄");
        diagnosis.setAnswer7(str7);
        String str8 = jsonObject.getString("腰痛吗？");
        diagnosis.setAnswer8(str8);
        String str9 = jsonObject.getString("平常稍微干点活儿就感觉累吗，休息的时候觉不觉累，愿不愿多说话？");
        diagnosis.setAnswer9(str9);
        String str10 = jsonObject.getString("觉得口中黏腻难受口干吗？");
        diagnosis.setAnswer10(str10);
        String str11 = jsonObject.getString("觉得渴不渴，爱不爱喝水？喝水后口干能好点吗？");
        diagnosis.setAnswer11(str11);
        String str12 = jsonObject.getString("有咽喉肿胀疼痛吗？");
        diagnosis.setAnswer12(str12);
        String str13 = jsonObject.getString("有没有觉得身上发热啊，出汗吗？");
        diagnosis.setAnswer13(str13);
        String str14 = jsonObject.getString("大便成形吗？一天几次/几天1次？");
        diagnosis.setAnswer14(str14);
        String str15 = jsonObject.getString("一年能感冒几次？");
        diagnosis.setAnswer15(str15);
        String str16 = jsonObject.getString("夜间尿量多少呢？和日间尿量相比？");
        diagnosis.setAnswer16(str16);
        String str17 = jsonObject.getString("有没有发热怕冷？");
        diagnosis.setAnswer17(str17);
        String str18 = jsonObject.getString("四肢感觉疲乏吗？");
        diagnosis.setAnswer18(str18);
        String str19 = jsonObject.getString("身上有瘀点或瘀斑吗？");
        diagnosis.setAnswer19(str19);
        String str20 = jsonObject.getString("月经规律吗？");
        diagnosis.setAnswer20(str20);
        String str21 = jsonObject.getString("小便颜色深不深？一晚上起夜几次？");
        diagnosis.setAnswer21(str21);
        String str22 = jsonObject.getString("有咽喉痒、痛吗？");
        diagnosis.setAnswer22(str22);
        String str23 = jsonObject.getString("有没有腰膝酸软？");
        diagnosis.setAnswer23(str23);
        String str24 = jsonObject.getString("有没有咳嗽胸闷啊？");
        diagnosis.setAnswer24(str24);
        String str25 = jsonObject.getString("经常头晕耳鸣吗？");
        diagnosis.setAnswer25(str25);
        String str26 = jsonObject.getString("午后觉得低热吗？");
        diagnosis.setAnswer26(str26);
        String str27 = jsonObject.getString("比别人容易出汗吗？睡着了出汗，醒来汗止吗？");
        diagnosis.setAnswer27(str27);
        String str28 = jsonObject.getString("眼睛干涩吗？");
        diagnosis.setAnswer28(str28);
        String str29 = jsonObject.getString("有四肢关节疼痛吗？");
        diagnosis.setAnswer29(str29);
        String str30 = jsonObject.getString("身上痒不痒？");
        diagnosis.setAnswer30(str30);
        String str31 = jsonObject.getString("心里烦躁睡觉不好吗");
        diagnosis.setAnswer31(str31);
        String str32 = jsonObject.getString("平常有没有觉得恶心、想吐？觉得恶心一天能有几次？吐了吗，吐了几次？");
        diagnosis.setAnswer32(str32);
        String str33 = jsonObject.getString("皮肤干不干燥啊？");
        diagnosis.setAnswer33(str33);
        String str34 = jsonObject.getString("胳膊腿都麻不麻，身上还有其他地方麻吗？");
        diagnosis.setAnswer34(str34);
        String str35 = jsonObject.getString("身上有没有红肿或者化脓性包块？范围，数目？");
        diagnosis.setAnswer35(str35);
        String str36 = jsonObject.getString("后腰部灼热感？");
        diagnosis.setAnswer36(str36);
        String str37 = jsonObject.getString("心慌或自觉心脏跳动不适吗？");
        diagnosis.setAnswer37(str37);
        String str38 = jsonObject.getString("口干想不想喝水？");
        diagnosis.setAnswer38(str38);
        String str39 = jsonObject.getString("觉得口渴吗？");
        diagnosis.setAnswer39(str39);
        String str40 = jsonObject.getString("觉得手脚心发热吗？经常会感觉心烦吗？");
        diagnosis.setAnswer40(str40);
        String str41 = jsonObject.getString("小便黄吗？");
        diagnosis.setAnswer41(str41);
        String str42 = jsonObject.getString("食欲怎么样？大便成形吗？一天几次/几天1次？");
        diagnosis.setAnswer42(str42);
        String str43 = jsonObject.getString("有颜面、下肢浮肿吗？");
        diagnosis.setAnswer43(str43);
        String str44 = jsonObject.getString("胃口怎么样？饭后肚子胀吗？");
        diagnosis.setAnswer44(str44);

        return diagService.addDiag(diagnosis);
    }
}
