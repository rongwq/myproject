package com.rongwq.controller;

import com.jfinal.core.Controller;
import com.rongwq.common.bean.BaseRenderJson;
import com.rongwq.common.bean.MyErrorCodeConfig;

public class SayHelloController extends Controller {
	
	public void say(){
		BaseRenderJson.returnObjectTmplate(this, MyErrorCodeConfig.REQUEST_SUCCESS, null,"hello world!");
	}
}
