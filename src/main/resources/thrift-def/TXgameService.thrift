include "TServiceBase.thrift"

namespace java com.bliss.framework.thriftgen.xgame.xgameservice

enum LogoutStatus {
  	WAITING_RECONNECT = 1,
  	SUCCESS = 2
}

enum LogoutReason{
	USER_LOGOUT = 1,//nguoi choi chu dong thoat
	SYSTEM_LOGOUT = 2;//he thong yeu cau thoat (truong hop giu session de doi reconnect nhung qua thoi gian cho phep)
}

service TXGameService extends TServiceBase.TServiceBase {
	TServiceBase.TResponseInfo pushMessage(1:string token, 2:i32 moduleid, 3:TServiceBase.TClientInfo clientInfo, 4:i32 msgType, 5:i32 length, 6:binary msgData)
	TServiceBase.TInternalResponse internalCall(1:string token, 2:i32 moduleid, 3:i32 userid, 4:i32 msgType, 5:i32 length, 6:binary msgData)
	LogoutStatus logout(1:string token, 2:i32 userid, 3:i32 moduleid, 4:i32 roomid, 5:LogoutReason reason)	
	void reconnect(1:string token, 2:i32 userid, 3:string params)
	TServiceBase.TResponseInfo perform(1:TServiceBase.AdminCommand cmd, 2:string token, 3:TServiceBase.TAdminRequest data)
	TServiceBase.ServiceStatus getStatus()
}
