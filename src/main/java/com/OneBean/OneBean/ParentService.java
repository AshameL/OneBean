package com.OneBean.OneBean;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Lazy
@Service
public class ParentService<T> {
    public ParentService(){
        System.out.println("ParentService:   class"+this.getClass()+"   地址："+this);
    }
}
