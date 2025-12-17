package ru.fedorenko.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class SecondBean {

    private FirstBean firstBean;

    @PostConstruct
    public void init() {
        firstBean.setSecondBean(this);
    }
}
