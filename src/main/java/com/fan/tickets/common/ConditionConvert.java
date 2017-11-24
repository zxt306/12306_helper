package com.fan.tickets.common;

import com.fan.tickets.condition.CaptchaCheckCondition;
import com.fan.tickets.condition.QueryCondition;

/**
 * //TODO
 *
 * @author TZX
 * @Date 2017/9/17 19:58
 **/
public class ConditionConvert {

    /**
     * 生成查询的URL
     * @param condition
     * @return
     */
    public static String generatQueryUrl(QueryCondition condition){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(URL_Constants.QUERY_TRANS_URL);
        stringBuffer.append("?leftTicketDTO.train_date=").append(condition.getTrain_date());
        stringBuffer.append("&leftTicketDTO.from_station=").append(condition.getFrom_station());
        stringBuffer.append("&leftTicketDTO.to_station=").append(condition.getTo_station());
        stringBuffer.append("&purpose_codes=").append(condition.getPurpose_codes());
        return stringBuffer.toString();
    }

    /**
     * 验证码校验
     * @param condition
     * @return
     */
    public static String generateCaptchaCheckUrl(CaptchaCheckCondition condition){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(URL_Constants.CHECKCODE_IMAGE_URL);
        return stringBuffer.toString();
    }
}
