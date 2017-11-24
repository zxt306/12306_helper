package com.tzx.test.text;

import com.fan.tickets.common.ConditionConvert;
import com.fan.tickets.condition.QueryCondition;
import junit.framework.TestCase;

/**
 * //TODO
 *
 * @author TZX
 * @Date 2017/9/17 20:10
 **/
public class ConvertTest extends TestCase{

    public void testUrl(){
        QueryCondition condition = new QueryCondition();
        condition.setFrom_station("BJ");
        condition.setTo_station("CNN");
        condition.setTrain_date("2017-10-10");
        System.out.println(ConditionConvert.generatQueryUrl(condition));
    }
}
