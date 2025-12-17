package ru.fedorenko.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class FirstBean {
    @Autowired
    private SecondBean secondBean;

    public void setSecondBean(SecondBean secondBean) {
        this.secondBean = secondBean;
    }
}
