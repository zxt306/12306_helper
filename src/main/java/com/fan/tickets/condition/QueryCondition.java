package com.fan.tickets.condition;

/**
 * //TODO
 *
 * @author TZX
 * @Date 2017/9/17 19:48
 **/
public class QueryCondition {
    /**起始站点**/
    private String from_station;
    /**目标站点**/
    private String to_station;
    /**火车时间**/
    private String train_date;
    /**码**/
    private String purpose_codes = "ADULT";

    public String getFrom_station() {
        return from_station;
    }

    public void setFrom_station(String from_station) {
        this.from_station = from_station;
    }

    public String getTo_station() {
        return to_station;
    }

    public void setTo_station(String to_station) {
        this.to_station = to_station;
    }

    public String getTrain_date() {
        return train_date;
    }

    public void setTrain_date(String train_date) {
        this.train_date = train_date;
    }

    public String getPurpose_codes() {
        return purpose_codes;
    }

    public void setPurpose_codes(String purpose_codes) {
        this.purpose_codes = purpose_codes;
    }
}
