package bsu.rfct.orazlyeva.LAB_9.servlet;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class UpdateAd extends SimpleTagSupport {

    private Ad ad;

    public void setAd(Ad ad) {
        this.ad = ad;
    }
}
