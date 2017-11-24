package com.fan.tickets.domain;

/**
 * //TODO
 *
 * @author TZX
 * @Date 2017/9/17 18:03
 **/
public class QueryRowResultDTO {
    /**车次**/
    private String trans;
    /**起始城市**/
    private String startCity;
    /**目标城市**/
    private String targetCity;
    /**查询日期**/
    private String queryDate;
    /**开始时间**/
    private String startTime;
    /**到达时间**/
    private String endTime;
    /**时间间隔**/
    private String interval;
    /**特等座**/
    private String specialSeat;
    /**一等座**/
    private String firstSeat;
    /**二等座**/
    private String secondSeat;
    /**高级软卧**/
    private String advancedSoftSleeper;
    /**软卧**/
    private String softSleeper;
    /**动卧**/
    private String moveSleeper;
    /**硬卧**/
    private String hardSleeper;
    /**软座**/
    private String softSeat;
    /**硬座**/
    private String hardSeat;
    /**无座**/
    private String nullSeat;
    /**其他**/
    private String otherDesc;
    /**备注**/
    private String descText;
    /**车次码**/
    private String transCode;

    private String unknowCode1;

    private String unknowCode2;

    private String unkonwCode3;

    private String unkonwCode4;



    private QueryRowResultDTO (String rowTxt){
        String[] rows = rowTxt.split("\\|");
        this.unknowCode1 = rows[0];
        this.descText = rows[1];
        this.transCode = rows[2];
        this.trans = rows[3];
        this.startCity = rows[4];
        this.targetCity  = rows[5];
        //TODO 5-7
        this.startTime = rows[8];
        this.endTime = rows[9];
        this.interval = rows[10];
        this.unknowCode2 = rows[12];
        this.queryDate = rows[13];
        //TODO 14-22
        this.softSleeper = rows[23];
        //TODO 24-25
        this.moveSleeper = rows[24];
        this.hardSleeper = rows[26];
        this.softSeat = rows[27];
        this.hardSeat = rows[28];
        this.secondSeat = rows[30];
        this.firstSeat = rows[31];
        this.specialSeat = rows[32];
        this.unkonwCode3 = rows[34];
        this.unkonwCode4 = rows[35];
    }

    public String getTrans() {
        return trans;
    }

    public void setTrans(String trans) {
        this.trans = trans;
    }

    public String getStartCity() {
        return startCity;
    }

    public void setStartCity(String startCity) {
        this.startCity = startCity;
    }

    public String getTargetCity() {
        return targetCity;
    }

    public void setTargetCity(String targetCity) {
        this.targetCity = targetCity;
    }

    public String getQueryDate() {
        return queryDate;
    }

    public void setQueryDate(String queryDate) {
        this.queryDate = queryDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public String getSpecialSeat() {
        return specialSeat;
    }

    public void setSpecialSeat(String specialSeat) {
        this.specialSeat = specialSeat;
    }

    public String getFirstSeat() {
        return firstSeat;
    }

    public void setFirstSeat(String firstSeat) {
        this.firstSeat = firstSeat;
    }

    public String getSecondSeat() {
        return secondSeat;
    }

    public void setSecondSeat(String secondSeat) {
        this.secondSeat = secondSeat;
    }

    public String getTransCode() {
        return transCode;
    }

    public void setTransCode(String transCode) {
        this.transCode = transCode;
    }

    public String getUnknowCode1() {
        return unknowCode1;
    }

    public void setUnknowCode1(String unknowCode1) {
        this.unknowCode1 = unknowCode1;
    }

    public String getUnknowCode2() {
        return unknowCode2;
    }

    public void setUnknowCode2(String unknowCode2) {
        this.unknowCode2 = unknowCode2;
    }

    public String getAdvancedSoftSleeper() {
        return advancedSoftSleeper;
    }

    public void setAdvancedSoftSleeper(String advancedSoftSleeper) {
        this.advancedSoftSleeper = advancedSoftSleeper;
    }

    public String getSoftSleeper() {
        return softSleeper;
    }

    public void setSoftSleeper(String softSleeper) {
        this.softSleeper = softSleeper;
    }

    public String getMoveSleeper() {
        return moveSleeper;
    }

    public void setMoveSleeper(String moveSleeper) {
        this.moveSleeper = moveSleeper;
    }

    public String getHardSleeper() {
        return hardSleeper;
    }

    public void setHardSleeper(String hardSleeper) {
        this.hardSleeper = hardSleeper;
    }

    public String getSoftSeat() {
        return softSeat;
    }

    public void setSoftSeat(String softSeat) {
        this.softSeat = softSeat;
    }

    public String getHardSeat() {
        return hardSeat;
    }

    public void setHardSeat(String hardSeat) {
        this.hardSeat = hardSeat;
    }

    public String getNullSeat() {
        return nullSeat;
    }

    public void setNullSeat(String nullSeat) {
        this.nullSeat = nullSeat;
    }

    public String getOtherDesc() {
        return otherDesc;
    }

    public void setOtherDesc(String otherDesc) {
        this.otherDesc = otherDesc;
    }

    public String getDescText() {
        return descText;
    }

    public void setDescText(String descText) {
        this.descText = descText;
    }
}
