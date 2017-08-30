package com.rongwq.config;
/****
 * @Project_Name:	xk_api_user
 * @Copyright:		Copyright © 2012-2017 G-emall Technology Co.,Ltd
 * @Version:		    1.0.0.1
 * @File_Name:		MyAccessConfig.java
 * @CreateDate:		2017年7月3日 下午2:26:04
 * @Designer:		    zhenghongbin
 * @Desc:			权限配置文件
 * @ModifyHistory:	
 ****/
public class MyAccessConfig {

	//公共操作   用逗号(,)分隔  不作token登陆验证
	public static final String PUBLIC_ACTIONS = "carbrand/getCarBrandList,msg/sendCode,msg/sendMsg,msg/verifyCode,user/regUser,user/thirdPartyLogin,user/login,user/logout,user/autoLogin,user/sendSmsReg,"
			+ "user/sendSmsForgetPwd,user/sendSms,user/setLoginPassword,user/uploadHead,aiche/add,aiche/setState,aiche/getList,aiche/delete,service/getCategory,store/storeInfo,store/stroeEvaluate,"
			+ "store/storeService,file/uploadMoreFile,ad/homeAd,ad/getRegion,ad/appAd,red/list,jsrsa/encrypt,jsrsa/getEncryptParam";
}
