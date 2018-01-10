namespace java com.bliss.framework.thriftgen.xgame.tcommon

enum AdminCommand{
	SHUTDOWN = 1,
	RELOAD = 2,
	RESTART = 3,
	EXECUTE = 4;
}

enum ServiceStatus{
	STARTED = 0,
	STOPPED = 1,
	SHUTTING_DOWN = 2
}

struct TResponseInfo {
    	1: list<i32> userIdReceive,
	2: binary messageData
}

struct TInternalResponse {
    	1: i32 msgType,
    	2: binary msgData
}

struct TAdminRequest {
	1: i32 userid,
    	2: i32 msgType,
    	3: binary msgData
}

struct TClientInfo {
	1: i32 userid,
	2: i32 version,
	3: bool isVN,
	4: i32 osType
}

struct OpAuth {
 	1: string auth_key,
	2: string source
}

service TServiceBase {
 	bool ping()
}
