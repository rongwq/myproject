package com.rongwq.common.bean;

import com.rongwq.util.PropertiesUtils;

/**
 * Created with IntelliJ IDEA. Author: iver Date: 13-3-28
 */
public class MyConst {
    //用户管理
    public static final String USERSTATUS_DISABLE = "0";//禁用
    public static final String USERSTATUS_ENABLE  = "1";//正常

	// 系统配置
	public static final int RUNNING_MODE_LOCAL_SERVER = 0; // 本地开发服务器
	public static final int RUNNING_MODE_DEV_SERVER = 1; // 开发服务器
	public static final int RUNNING_MODE_TEST_SERVER = 2; // 测试服务器
	public static final int RUNNING_MODE_ONLINE_SERVER = 3; // 正式环境服务器
	public static int RUNNING_MODE = Integer.parseInt(PropertiesUtils.get("RUNNING_MODE", "1")); // 当前模式
	public static final long TOKEN_EXPIR_TIME = 2592000; // 超时时间 单位秒
	public static boolean devMode = false;
	public static String version = PropertiesUtils.get("version", "1.0.0.20160620_beta");
	public static String imgUrlHead;
	public static String upload; // FTP 上传目录
	public static String ueditorHead;
	public static final int thum_width = 400;

	// 极光推送配置
	public static String jpush_appkey;
	public static String jpush_masterSecret;
	public static boolean apnsProduction = false;// 极光推送是否开启生产环境

	// 高汇通支付配置
	public static String GHT_KEY;
	public static String GHT_HOST;
	public static String GHT_RETURN_URL;
	public static String GHT_MERCHANT_NO;
	public static String GHT_TERMINAL_NO;

	// ftp上传
	public static String ftp_host;
	public static Integer ftp_port;
	public static String ftp_username;
	public static String ftp_pwd;
	public static String ftp_uploads;
	public static String ftp_files;
	public static String ftp_ueditor;

	// 对密码格式的限制
	public static final String REGEX = "(?!^\\d+$)(?!^[a-zA-Z]+$)[0-9a-zA-Z]{6,12}";
	
	//短信及验证码
	public static final String GMALL_SMS_SEND = "user/sendmobilecode"; // 发送验证码短信
	public static final String GMALL_SMS_SEND_CUSTNOTE = "user/sendCustNote"; // 发送自定义短信
	public static final String GMALL_SMS_VERIFY = "user/checkSmsVerifyCode"; // 检查短信验证码是否正确
	
	// 商城api相关参数
	public static String GEMALL_URL;// 商城api地址
	public static String GEMALL_PASSWORD_KEYNAME; // 校验码字段名
	public static String GEMALL_PASSWORD_KEY; // 校验码
	public static String GEMALL_SIGN_KEYNAME;//签名字段名
	public static String GEMALL_SIGN_KEY;//签名值
	
	//系统管理-系统配置常量
	public static final String loginPwderrorCount = "loginPwderrorCount";
	public static final String payPwderrorCount = "payPwderrorCount";
	
	//默认服务费的价格编辑
	public static final String cost="cost";
	
	
	// 账户类型
	public static final String withdrawals = "提现";
	public static final String profit = "收益";
	public static final String storeOrder = "商城订单";
	public static final String shopOrder = "店铺订单";
	public static final String returnMoney = "返佣金奖励";
	public static final String income = "收入";
	public static final String expenditure = "支出";
	public static final String deduction = "扣除";


    //商品订单状态常量
    public static final Integer PRODUCT_ORDER_UN_PAY = 0;//待付款
    public static final Integer PRODUCT_ORDER_UN_SEND = 1;//待发货
    public static final Integer PRODUCT_ORDER_UN_RECEIVE = 2;//待收货(已发货，未收货)
    public static final Integer PRODUCT_ORDER_RECEIVE = 3;//(交易成功)已收货
    public static final Integer PRODUCT_ORDER_CLOSE = 4;//交易关闭
    //商品订单结算状态
    public static final Integer PRODUCT_ORDER_UN_ACCOUNT = 0;//未结算
    public static final Integer PRODUCT_ORDER_ACCOUNT = 1;//已结算
    public static final Integer PRODUCT_ORDER_NOT_ACCOUNT = 2;//不能结算，退货或者取消订单时


    //商品售后状态
    public static final Integer PRODUCT_CS_APPLY = 0;//申请退货
    public static final Integer PRODUCT_CS_RETURN = 1;//商家同意售后申请
    public static final Integer PRODUCT_CS_REFUSE = 2;//商家拒绝申请
    public static final Integer PRODUCT_CS_COMFIRM = 3;//已发货，等待商家确认收货
    public static final Integer PRODUCT_CS_SUCCESS = 4;//退货成功
    public static final Integer PRODUCT_CS_FAIL = 5;//退货失败
    public static final Integer PRODUCT_CS_CANCEL = 6;//取消，也叫售后关闭
    public static final Integer PRODUCT_CS_SEND = 7;//商家已重新发货

    //商品售后 时间状态
    public static final String autoUnPayClose = "autoUnPayClose";//自动取消未付款订单
    public static final String autoReceive = "autoReceive";//自动收货时间配置
    public static final String autoFinish = "autoFinish";//自动完成订单，自动关闭售后
    public static final String autoAgree = "autoAgree";//自动通过售后申请
    public static final String autoClose = "autoClose";//售后结束后，自动关闭售后
    public static final String autoReturn = "autoReturn";//售后退货寄回时间
    public static final String autoRefund = "autoRefund";//自动退款
    
    //订单池订单类型
    public static final Integer ORDER_TYPE_WASH = 0;//预约洗车，不使用套餐
    public static final Integer ORDER_TYPE_SETMEAL = 1;//使用套餐预约洗车
    public static final Integer ORDER_TYPE_SERVICE = 2;//门店服务
    
    //订单池订单状态常量
    public static final Integer ORDER_UN_PAY = 0;//未付款
    public static final Integer ORDER_PAY = 1;//已付款（预约中、待消费）
    public static final Integer ORDER_RESERVE = 2;//预约成功
    public static final Integer ORDER_GO = 3;//上门中
    public static final Integer ORDER_WASHING = 4;//洗车中
    public static final Integer ORDER_WASH_FINISH = 5;//洗车完成
    public static final Integer ORDER_FINISH = 6;//交易完成
    public static final Integer ORDER_CLOSE = 7;//交易关闭

	//activemq 常量
	public static final String MQ_IMAGE = "xk_image";//删除无效图片
	public static final String MQ_REFUND = "xk_product_cs";//售后退款
	//广告启动页编码
	public static final String USERAPP = "user-app-start";//用户端app启动页
	public static final String WASHERAPP = "washer-app-start";//洗车员端app启动页
	public static final String SELLERAPP = "seller-app-start";//商城端app启动页

    //商品售后状态操作描述
    public static final String[] OPERATION_DES = {
            "您发起退款申请，通常需要1-5个工作日，请耐心等待商家处理。",
            "卖家已拒绝了您的申请",
            "请修改退款申请",
            "您已修改退款申请",
            "申请已受理，请在14天内寄回商品并提交物流信息，过期将自动取消申请",
            "物流信息已提交，卖家会在收到商品后进行退款",
            "退款商品已收到，退款处理中",
            "平台客服正在处理",
            "您已申请平台客服介入，请保持通话畅通，平台将于48小时之内与您进行联系",
            "退款处理中，请耐心等待",
            "卖家已同意了您的申请",
            "退款处理中，请耐心等待",
			"退款成功：总额()，退款将按原支付方式返回，预计1-5个工作日到账。如有问题，请致电400-800-800",
			"您已撤销售后申请"
	};

}
