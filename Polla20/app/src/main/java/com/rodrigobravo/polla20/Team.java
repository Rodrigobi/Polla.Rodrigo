package com.rodrigobravo.polla20;

public class Team {

    private String name, code , crest;


    public Team(String name, String code, String crest){
        this.name = name;
        this.code = code;
        this.crest = crest;

    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getCrest() {
        return crest;
    }
}
