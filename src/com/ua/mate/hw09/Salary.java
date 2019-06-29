package com.ua.mate.hw09;

public class Salary extends Sendable<Integer>{
    private String team;
    private String player;
    private Integer sum;

    public Salary(String team, String player, Integer sum) {
        this.team = team;
        this.player = player;
        this.sum = sum;
    }

    @Override
    public String getTo() {
        return player;
    }

    @Override
    public Integer getContent() {
        return sum;
    }

    public String getFrom(){
        return team;
    }
}
