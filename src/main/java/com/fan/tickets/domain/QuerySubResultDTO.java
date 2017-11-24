package com.fan.tickets.domain;

import java.util.List;
import java.util.Map;

/**
 * //TODO
 *
 * @author TZX
 * @Date 2017/9/17 17:48
 **/
public class QuerySubResultDTO {
    /** 车次列表 **/
    private List<String> result;
    private char flag;
    /**城市映射**/
    private Map<String,String> map;

    public List<String> getResult() {
        return result;
    }

    public void setResult(List<String> result) {
        this.result = result;
    }

    public char getFlag() {
        return flag;
    }

    public void setFlag(char flag) {
        this.flag = flag;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }
}
