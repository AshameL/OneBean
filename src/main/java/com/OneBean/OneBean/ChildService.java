package com.OneBean.OneBean;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Lazy
@Service
public class ChildService extends ParentService<String> {
    public ChildService(){
        System.out.println("ChildService:   class"+this.getClass()+"   地址："+this);
    }
}
