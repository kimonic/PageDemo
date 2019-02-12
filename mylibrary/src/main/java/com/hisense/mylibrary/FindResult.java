package com.hisense.mylibrary;

/**
 * * ================================================
 * name:            FindResult
 * guide:
 * author：          kimonik
 * version：          1.0
 * date：           2018/12/27
 * description：
 * introduce:
 * history：
 * ===================================================
 */
public class FindResult {
    private String result;
    private int position;
    private String piPeiCi;

    public String getPiPeiCi() {
        return piPeiCi;
    }

    public void setPiPeiCi(String piPeiCi) {
        this.piPeiCi = piPeiCi;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
