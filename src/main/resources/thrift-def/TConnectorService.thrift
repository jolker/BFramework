include "TServiceBase.thrift"

namespace java com.bliss.framework.thriftgen.xgame.connectorservice

service TConnectorService extends TServiceBase.TServiceBase {
	void pushResponse(1:string token, 2:TServiceBase.TResponseInfo response)
	void pushResponses(1:string token, 2:list<TServiceBase.TResponseInfo> lstResponse)
	void removeSessions(1:string token, 2:list<i32> lstSessionId)
	void removeSession(1:string token, 2:i32 sessionid)
	list<TServiceBase.TResponseInfo> perform(1:TServiceBase.AdminCommand cmd, 2:string token, 3:list<i32> moduleId, 4:TServiceBase.TAdminRequest data)
	list<TServiceBase.ServiceStatus> getStatus(1:list<i32> moduleId)
}
