package com.sohu.tv.mq.cloud.web.vo;
/**
 * 集群信息
 * @Description: 
 * @author yongfeigao
 * @date 2018年8月3日
 */
public class ClusterInfoDTO {
    // 集群id
    private int clusterId;
    // 是否启用vip通道
    private boolean vipChannelEnabled;
    // 是否广播消费
    private boolean broadcast;
    public int getClusterId() {
        return clusterId;
    }
    public void setClusterId(int clusterId) {
        this.clusterId = clusterId;
    }
    public boolean isVipChannelEnabled() {
        return vipChannelEnabled;
    }
    public void setVipChannelEnabled(boolean vipChannelEnabled) {
        this.vipChannelEnabled = vipChannelEnabled;
    }
    public boolean isBroadcast() {
        return broadcast;
    }
    public void setBroadcast(boolean broadcast) {
        this.broadcast = broadcast;
    }
}
