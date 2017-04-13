package com.zingfon.socket.present;

import com.zingfon.socket.model.event.DataSynEvent;
import com.zingfon.socket.present.infc.Model2UIPresentInfc;

import org.greenrobot.eventbus.EventBus;

/*
 *  @项目名：  TakeAlong 
 *  @包名：    com.zingfon.socket.present
 *  @文件名:   Model2UIPresent
 *  @创建者:   cjf
 *  @创建时间:  2017/4/13 15:53
 *  @描述：    TODO 1.转换net2bean；2.发布EventBus事件
 */
public class Model2UIPresent implements Model2UIPresentInfc {

    public Model2UIPresent() { //注入到ISUSocketClient

        EventBus.getDefault().post(new DataSynEvent());
//        EventBus.getDefault().postSticky(new DataSynEvent());
//        EventBus.getDefault().removeStickyEvent(new DataSynEvent());
//        EventBus.getDefault().removeAllStickyEvents();
    }
}
