package com.haitian.mattress.app;

/**
 * @Author Trimble
 * @Time 2018/8/1 下午 5:33.
 * @Description This is Constants.
 */
public interface Constants {
    //海康id
    String HAIKANGID = "haikangid";
    //id
    String PATIENT_ID = "PatientId";
    //医院id
    String HOSPITAL_ID = "Hospital_Id";
    //科室
    String KESHI = "departmentId";
    //名字
    String NAME = "NAME";
    //登录账户
    String LOGINNAME = "LoginName";
    //性别
    String SEX = "SEX";
    //年龄
    String AGE = "AGE";
    //民族
    String MinZu = "national";
    //生日
    String BRITHDAY = "brithday";
    //手机号
    String MOBILE = "MOBILE";
    //学历
    String XUELI = "degree";
    //身份证
    String IDCARD = "IDCARD";
    //头像
    String PHOTOURL = "photoUrl";
    //省份
    String SHENGFEN = "provinceId";
    //市区
    String SHIQU = "cityId";
    //区县
    String QUXIAN = "regionId";
    //详细地址
    String ADDRESS = "ADDRESS";
    //创建时间
    String CREATTIME = "createTime";
    //极光账号
    String JIGUANG = "JIGUANG";
    //普通注册
    String ISFROM = "ISFROM";
    //备注
    String BEIZHU = "remark";
    //微信openid
    String WEIXINOPENID = "WEIXINOPENID";
    //QQopenid
    String QQOPENID = "QQOPENID";
    //邀请码
    String YAOQING_CODE = "YAOQING_CODE";
    //首次登陆
    String isFirst = "true";

    String TOKEN = "TOKEN";

    String EVENTBUS_TYEPE = "type";
    String App_TYPE = "1";   //  版本更新     appType:1代表患者端,2代表医生端
//    String BASE_URL = "http://111.17.215.37:8081/";  //测试
    String BASE_URL = "http://111.17.215.37:801/";  //正式

    String Host = BASE_URL + "doctorOnlineApp/Api/PatientAppServlet?";

    //获取验证码
    String GETVERIFICATIONCODE = Host + "act=registerSendSMSCode&data=";
    //手机号注册
    String MOBILEREGISTER = Host +"act=registerByMobile&data=";
    //账户密码
    String MOBILELOGIN = Host + "act=login&data=";
    //首页医生列表
    String HOMEDOCTORLIST = Host +"act=getDoctorList&data=";
    //首页科室选择
    String KESHISELECT = Host + "act=getDepartmentList&data=";
    //忘记密码获取验证码
    String ForGetMessage = Host + "act=editPassWordSendSMSCode&data=";
    //忘记密码
    String ForGetPassWord = Host + "act=editPassWord&data=";
    //康复计划
    String KangFuJiHua = Host +"act=getPlanByIdAndPlanStatus&data=";

    //患者给医生评价
    String DOCTOR_COMMENT = Host + "act=setDoctorEvaluate&data=";
    //轮播图
    String BANNER = Host + "act=getRotationList&data=";
    //健康速递列表  ——0图文   1健康速递
    String HEALTH_LIST = Host + "act=getInformationList&data=";
    //健康速递详情
    String HEALTH_INFO = Host + "act=getInformationListById&data=";
    //用药
    String YONGYAO_LIST = Host + "act=getMedicationDiaryListByPatientId&data=";
    //删除用药
    String YONGYAO_DEL = Host + "act=delMedicationDiaryByDiaryId&data=";
    //医生详情
    String DOCTORINFO = Host + "act=getUserInfo&data=";
    //患者投票
    String PATIENTTOUPIAO = Host +"act=getDoctorEvaluateByDoctorIdOrPatientIdOrId&data=";

    //优惠券数量
    String YOUHUIQUAN_COUNT = Host + "act=getLuckyDrawStatusListCount&data=";
    //优惠券返回数据
    String YOUHUIQUAN = Host + "act=getLuckyDrawList&data=";
    //Mall优惠卷
    String GOODS_JUAN = Host + "act=getGoodsCouponList&data=";

    String getUserByJiguang = Host + "act=getUserByJiguang&data=" ;

    //邀请有礼
    String YAOQING = BASE_URL + "doctorOnlineApp/app/news/invitation_code.jsp?";
    //大转盘
    String DAZHUANPAN = BASE_URL + "doctorOnlineApp/Api/LuckyDrawServlet?act=getLuckyDraw&data=";
    //获取资讯类型
    String NEWS_TYPE = Host + "act=getDictionariesType&data=" ;
    //关于我们
    String ABOUTUS = Host + "act=aboutUs&data=";
    //帮助中心
    String HELPCENTER = Host + "act=getHelpCenterList&data=";
    //帮助中心详情
    String HELPCENTERINFO = Host + "act=getHelpCenterById&data=";
    //意见反馈
    String YIJIANFANKUI = Host + "act=insertOpinion&data=";
    //论坛列表
    String FORUM_LIST = Host + "act=getBBSList&data=";

    // 列表 列表 列表 列表 健康速递的收藏 ： collectionType = 0;  论坛收藏： collectionType = 1; 视频收藏： collectionType = 2;
    String COLLECT_FORUM_LIST = Host + "act=getCollectionList&data=";

    String SHANGCHUANG_PIC = "http://111.17.215.37:8081/doctorOnlineApp/Api/UploadServlet";

    String JIANQUAN = "https://www.tsingruitech.com/m/ducg/p/yyy/oauth/token?grant_type=client_credentials&client_id=taianyiyangyun&client_secret=taianyiyangyun";

    //微信登录
    String WECHATLOGIN = Host + "act=loginByWeChat&data=";
    //批量取消收藏 (所有收藏列表取消收藏都用这个)
    String DEL_COLLECT = Host + "act=batchCancellationCollection&data=";
    //我的帖子 批量删除
    String DUOXUAN_DEL_MINE_FORUM = Host + "act=delMyBBsById&data=";
    //添加论坛
    String ADD_FORUM = Host + "act=insert_bbs&data=";

    //手机型号
    int MOBILE_TYPE = 1;
    //计在线时间
    String Time = "0";
    //医生出诊地点
    String DOCTORADDRESS = Host + "act=getPracPlaceListByDoctorId&data=";
    //日志
    String RIZHI = Host + "act=insert_operatelog&data=";
    //删除我发布的论坛
    String DEL_MINE_FORUM = Host + "act=deleteMyBBS&data=";
    //点赞
    String DIANZAN = Host + "act=spotBBSZan&data=";
    //取消点赞
    String CANCELDIANZAN = Host + "act=cancelBBSZan&data=";
    //论坛删除评论
    String DELETE_PINGLUN = Host +"act=deleteMyBBSComment&data=";
    //论坛追评
    String FORUM_REPLY_PINGLUN = Host +"act=replyBBSComment&data=";
    //论坛添加评论
    String FORUM_PINGLUN = Host +"act=commentBBS&data=";
    //删除视频评论
    String DELETE_VIDEO_PINGLUN = Host +"act=deleteMyVideoComment&data=";
    //论坛的评论列表
    String COMMENTLIST = Host + "act=getBBSCommentList&data=";
    //视频的评论列表
    String VIDEOCOMMENTLIST = Host + "act=getVideoCommentList&data=";
    //视频添加评论
    String ADD_COMMENT = Host + "act=commentVideo&data=";
    //视频添加追评
    String ADD_REPLY_COMMENT = Host + "act=replyVideoComment&data=";
    //健康速递的评论列表
    String EX_COMMENTLIST = Host + "act=getCommentList&data=";
    //insertCollection  collectionType 1 是添加收藏 collectionType  2是取消收藏
    String ADDSHOUCANG = Host + "act=insertCollection&data=";
    //视频点赞
    String ZAN_VIDEO = Host + "act=spotVideoZan&data=";
    //取消视频点赞
    String ZAN_CANCLE = Host + "act=cancelVideoZan&data=";
    //微信qq完善信息
    String WXQQWANSHANMESSAGE =  Host + "act=perfect_Information&data=";
    //手机号注册完善信息
    String MOBILEMESSAGE = Host + "act=update_Information&data=";
    //签到
    String QIANDAO = Host + "act=rewardHaikang&data=";
    //判断今天有没有签到
    String TODAYQIANDAO = Host + "act=getUserSignList&data=";
    //连续签到
    String LIANXUQIANDAO = Host + "act=getUserbills&data=";

    //健康速递的评论
    String EX_ADDPINGLUN = Host + "act=commentInformation&data=";
    //健康速递的追评
    String EX_ADD_ZHUIPING = Host + "act=replyComment&data=";
    //删除健康速递的评论
    String EX_DEL_ZHUIPING = Host + "act=deleteMyComment&data=";
    //修改密码
    String UPDATEPASSWORD = Host + "act=update_PassWord&data=";
    //支出明细
    String ZHICHUMINGXI = Host + "act=getHaiKangBillList&data=";
    //患者详情
    String PATIENTINFO = Host + "act=updateUserInfo&data=";
    //视频列表
    String VIDEO_LIST = Host + "act=getInformationVideoList&data=";
    //我发布的论坛列表
    String Mine_Add_Forum_LIST = Host + "act=myBBSList&data=";

    //银行卡列表
    String BANKCARDLIST = Host + "act=getUserBankList&data=";
    //发送验证码
    String SENDPUTONGMESSAGE = Host + "act=sendSMSCode&data=";
    //绑定银行卡
    String BINGDINGBANKCARD = Host + "act=insertUserBank&data=";
    //海康币数量
    String HAIKANGBICOUNT = Host + "act=getHaikangNum&data=";
    //修改银行卡默认
    String UPDATEDAFALUTBANK = Host + "act=updateUserBank&data=";
    //删除银行卡
    String DELETEBANKCARD = Host + "act=deleteUserBank&data=";
    //微信登录绑定已有账号
    String WXBINGDINGYIYOUZHANGHAO = Host + "act=bindingAccountNumber&data=";
    //提现提示用户绑定微信
    String MOBILEBINGDINGWEIXIN = Host + "act=bindingWeChat&data=";
    //提现操作
    String PATIENTTIXIAN = Host + "act=cashWithDrawalToWechat&data=";
    //消息未读
    String XIAOXI_COUNT = Host + "act=getMsgReadCount&data=";
    //修改用药日记
    String UPDATE_YONGYAOLIST = Host + "act=updateMedicationDiaryByDiaryId&data=";
    //添加用药日记
    String ADD_YONGYAOLIST = Host + "act=insertMedicationDiary&data=";
    //点赞健康速递
    String ZAN_EX = Host + "act=spotInformationZan&data=";
    //取消点赞
    String CANCLE_ZAN_EX = Host + "act=cancelInformationZan&data=";
    //意见反馈列表
    String YIJIANFANKUILIST = Host + "act=getOpinionListByUserId&data=";
    //修改康复计划
    String UPDATEKANGFUJIHUA = Host + "act=updatePlanStatusById&data=";
    //我的订单
    String MINEORDER = Host + "act=getOrderListByPatientId&data=";
    //订单详情
    String ORDERINFO = Host + "act=getOrderByOrderId&data=";

    //关注医生
    String GUANZHUDOCTOR = Host + "act=insertConcern&data=";
    //关注医生列表
    String GUANZHUDOCTORLIST = Host + "act=getConcernListByPatientId&data=";
    //取消关注
    String QUXIAOGUANZHUDOCTOR = Host + "act=delConcernById&data=";
    //量表列表
    String LIANGBIAOLIST = Host + "act=getGaugeList&data=";
    //视频分享
    String SHARE_VIDEO = BASE_URL + "doctorOnlineApp/app/news/shareInformationVideo.jsp?";
    //健康速递
    String SHARE_SUDI = BASE_URL + "doctorOnlineApp/app/news/shareInformation.jsp?";
    //商品分享
    String GOODS_SHARE = BASE_URL + "doctorOnlineApp/app/news/goodsInfo.jsp?";
    //论坛分享
    String SHARE_FORUM = BASE_URL + "doctorOnlineApp/app/news/shareBBS.jsp?";
    //随访列表
    String SUIFANGLIST = Host + "act=selectFollowPatientList&data=";
    //剩余回复次数
    String MessageCount = Host + "act=getJiGuangCount&data=";
    //获取医生ID
    String DOCTOR_ID = Host + "act=getDoctorInfo&data=";
    //第一次免费
    String FreeCommuCount = Host + "act=setFreeCommuCount&data=";
    //软件更新操作
    String UPDATE_APP = Host + "act=appVesionCompare&data=";
    //搜索病种获取医生列表
    String BINGZHONGDOCTORLIST = Host + "act=getDoctorClassList&data=";
    //验证手机号与验证码是否正确（更改手机号用）
    String YUANYOUMOBILE = Host + "act=verificationMobileById&data=";
    //换绑定手机号
    String UPDATEMOBILE = Host + "act=updateMobileByUserId&data=";
    //注册极光
    String REGISTERJIGUANGADMIN = Host + "act=registerJMessageForPatient&data=";
    //注销
    String ZHUXIAO = Host + "act=cancellation&data=";
    //未读消息
    String WEIDUMESSAGE = Host + "act=getMsg&data=";

    //添加计划
    String ADDKANGFUJIHUA = Host + "act=insertRehabilitationPlan&data=";
    //患者获取提现或充值限制参数
    String CHONGZHICANSHU = Host + "act=getCashWithDrawalParam&data=";
    //添加订单接口
    String ADDDINGDAN = Host + "act=insertOrder&data=";
    //预支付id
    String YUZHIFUID = Host + "act=getPayModel&data=";
    //微信appid
    String WX_APP_ID = "wx773c83939b51dc11";

    String PAY_SUCCESS = "act=selectPayOrder&data=";
    //获取隐私政策
    String YINSIZHENGCE = Host + "act=getPrivacyPolicy&data=";
    //获取用户推送设置
    String ISTUISONG = Host + "act=getUserPushStatus&data=";
    //修改推送开关
    String UPDATETUISONG = Host + "act=updateUserPush&data=";
    //签约医生列表
    String QIANYUEDOCTORLIST = Host + "act=getSigningDoctorList&data=";
    //图文问诊列表
    String TUWENWENZHENLIST = Host + "act=getImageTextList&data=";
    //患者申请
    String PATIENT_APP = Host + "act=patientApplication&data=";
    //图文问诊热门科室
    String HOTKESHI = Host + "act=getHotDepartmenList&data=";
    //转诊
    String ZHUANZHEN = Host + "act=getZhuanZhenList&data=";
    //免费问诊获取医生列表
    String MIANFEIDOCTORLIST = Host+"act=getCostFreeDoctorList&data=";
    //订单中查询病例详情
    String BINGLI_INFO = Host+"act=getPatientApplicationByID&data=";
    //海康币支付
    String KAIKANGBI_ZHIFU = Host+"act=haikangPay&data=";
    String JIAOHU1 = "https://www.tsingruitech.com/m/ducg/p/yyy/open/inquiry";
    //购买后退款（海康币退款）(取消订单)
    String KAIKANGBI_TUIKUAN = Host+"act=haikangRefund&data=";

    //电话问诊列表
    String DIANHUAWENZHENLIST = Host + "act=getTelPhoneDoctorList&data=";
    //远程问诊
    String YUANCHENGWENZHENLIST = Host + "act=getLongRangeDoctorList&data=";
    //音视频通讯获取token
    String YINSHIPINTOKEN = Host + "act=getTokenAndChannel&data=";
    //获取医生服务价格
    String DOCTORFUWUPRICE = Host + "act=getDoctorBusinessList&data=";
    //删除频道
    String DELECTPINDAO = Host + "act=deleteChannel&data=";
    //患者申请列表
    String QIANYUEJILULIST = Host + "act=getPatientApplication&data=";
    //根据用户id获取详情
    String USERINFO = Host + "act=getUserByID&data=";
    //系统消息详情
    String MESSAGEINFO = Host + "act=systemmessagekey&data=";
    //获取医生聊天次数与时长
    String DOCTORSHICHANG = Host + "act=getRemainingtimesList&data=";
    //诊疗
    String DIAGNOSIS = Host + "act=getSubsidyList&data=";
    //确认诊疗信息
    String QUERENINFO = Host + "act=updateSubsidy&data=";
    //提出异议
    String TICHU_YIYI = Host + "act=unConfirmSubsidy&data=";
    //获取诊疗信息
    String PATIENT_THERAPY = Host + "act=getsky_kfzj_therapyinformation_treat&data=";
    //商品类型
    String MALL_TYPE = Host + "act=getClassificationList&data={}";
    //获取视频类型
    String VIDEO_TYPE = Host + "act=getDictionariesType&data=" ;
    //添加视频
    String ADD_VIDEO = Host + "act=insertInformationVideo&data=" ;
    //添加健康速递
    String ADD_NEWS = Host + "act=insertInformation&data=" ;
    //获取商品列表
    String MALL_LIST = Host + "act=getGoodsList&data=" ;
    //商品轮播图
    String MALL_BANNER = Host + "act=getGoodsRotationList&data=" ;
    //商品详情
    String MALL_INFO = Host + "act=getGoodsInfo&data=" ;
    //地址
    String ADDRESS_LIST = Host + "act=getReceivingAddressList&data=" ;
    //删除地址
    String ADDRESS_DEL = Host + "act=deleteReceivingAddress&data=" ;
    //添加地址
    String ADD_ADDRESS_DEL = Host + "act=insertReceivingAddress&data=" ;
    //修改地址
    String UPDATE_ADDRESS_DEL = Host + "act=updateReceivingAddress&data=" ;
    //商品订单详情
    String MALL_ORDER = Host + "act=getGoodsOrderInfo&data=" ;
    //添加订单
    String Add_GOODS_ORDER = Host + "act=insertGoodsOrder&data=" ;
    //根据输入的邀请码判断用户是否存在
    String YAOQINGCODE = Host + "act=getUserByInvitationCode&data=" ;
    // 微信GoodsPay
    String GoodsPay = Host + "act=getGoodsPayModel&data=" ;
    // 支付宝GoodsPay
    String ZHIFUBAO_GoodsPay = Host + "act=getAlipayPay&data=" ;
    //订单列表
    String GoodsList = Host + "act=getGoodsOrderList&data=" ;
    //删除商品订单
    String DleGoodsList = Host + "act=deleteGoodsOrder&data=" ;
    //发起团购
    String FAQI_TUANGOU = Host + "act=insertGoodsGroupBuying&data=" ;
    //团购详情
    String TUANGOU_INFO = Host + "act=getGoodsGroupBuyingInfo&data=" ;
    //团购列表
    String TUANGOU_LIST = Host + "act=getGoodsGroupBuyingList&data=" ;
    //患者收到货后修改收货状态
    String COMMIT_SHOUHUO = Host + "act=receiptGoodsOrder&data=" ;
    //添加订单评价
    String INSERT_GOODS_COMMENT = Host + "act=insertReviews&data=" ;
    //获取评论列表
    String GOODS_COMMENT_LIST = Host + "act=getReviewsList&data=" ;
    //加入团购
    String ADD_TUANGOU = Host + "act=shareAccessGoodsGroupBuying&data=" ;
    String ZITISIZE = "tiziSize";
}
