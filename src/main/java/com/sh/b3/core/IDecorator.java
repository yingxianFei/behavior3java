package com.sh.b3.core;

/**
 * 装饰节点
 * @author SilenceSu
 * @Email Silence.Sx@Gmail.com
 * Created by Silence on 2019/3/2.
 */
public interface IDecorator {

    void  setChild(BaseNode child);

    BaseNode getChild();


}
