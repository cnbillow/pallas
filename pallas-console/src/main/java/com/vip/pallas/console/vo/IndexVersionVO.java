/**
 * Copyright 2019 vip.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package com.vip.pallas.console.vo;


import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IndexVersionVO implements Serializable {
    private Long id;

    @NotNull(message = "indexId不能为空")
    private Long indexId;

    @NotNull(message = "shardNum不能为空")
    @JsonProperty("shardNum")
    private Byte numOfShards;

    @NotNull(message = "replicationNum不能为空")
    @JsonProperty("replicationNum")
    private Byte numOfReplication;

    private String vdpQueue;

    @NotEmpty(message = "routingKey不能为空")
    private String routingKey;

    @NotEmpty(message = "idField不能为空")
    private String idField;

    @NotEmpty(message = "updateTimeField不能为空")
    private String updateTimeField;

    @NotNull(message = "schema不能为空")
    private Object schema;

    private int vdp;

    private Boolean filterFields;

    private Boolean checkSum;

    private String preferExecutor;

    private Long clusterId;

    private String allocationNodes;

    private Boolean dynamic;

    private Long indexSlowThreshold;

    private Long fetchSlowThreshold;

    private Long querySlowThreshold;

    @Positive(message = "refresh interval必须大于0")
    private Byte refreshInterval;

    private Long maxResultWindow;

    private Integer totalShardsPerNode;

    private String flushThresholdSize;

    private String syncInterval;

    private String translogDurability;

    private Boolean sourceDisabled;

    private String sourceIncludes;

    private String sourceExcludes;

    public Boolean getSourceDisabled() {
        return sourceDisabled;
    }

    public void setSourceDisabled(Boolean sourceDisabled) {
        this.sourceDisabled = sourceDisabled;
    }


    public String getSourceIncludes() {
        return sourceIncludes;
    }

    public void setSourceIncludes(String sourceIncludes) {
        this.sourceIncludes = sourceIncludes;
    }

    public String getSourceExcludes() {
        return sourceExcludes;
    }

    public void setSourceExcludes(String sourceExcludes) {
        this.sourceExcludes = sourceExcludes;
    }

    public Long getMaxResultWindow() {
        return maxResultWindow;
    }

    public void setMaxResultWindow(Long maxResultWindow) {
        this.maxResultWindow = maxResultWindow;
    }

    public int getTotalShardsPerNode() {
        return totalShardsPerNode;
    }

    public void setTotalShardsPerNode(Integer totalShardsPerNode) {
        this.totalShardsPerNode = totalShardsPerNode;
    }


    public String getFlushThresholdSize() {
        return flushThresholdSize;
    }

    public void setFlushThresholdSize(String flushThresholdSize) {
        this.flushThresholdSize = flushThresholdSize;
    }

    public String getSyncInterval() {
        return syncInterval;
    }

    public void setSyncInterval(String syncInterval) {
        this.syncInterval = syncInterval;
    }

    public String getTranslogDurability() {
        return translogDurability;
    }

    public void setTranslogDurability(String translogDurability) {
        this.translogDurability = translogDurability;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIndexId() {
        return indexId;
    }

    public void setIndexId(Long indexId) {
        this.indexId = indexId;
    }

    public Byte getNumOfShards() {
        return numOfShards;
    }

    public void setNumOfShards(Byte numOfShards) {
        this.numOfShards = numOfShards;
    }

    public Byte getNumOfReplication() {
        return numOfReplication;
    }

    public void setNumOfReplication(Byte numOfReplication) {
        this.numOfReplication = numOfReplication;
    }

    public String getVdpQueue() {
        return vdpQueue;
    }

    public void setVdpQueue(String vdpQueue) {
        this.vdpQueue = vdpQueue;
    }

    public String getRoutingKey() {
        return routingKey;
    }

    public void setRoutingKey(String routingKey) {
        this.routingKey = routingKey;
    }

    public String getIdField() {
        return idField;
    }

    public void setIdField(String idField) {
        this.idField = idField;
    }

    public String getUpdateTimeField() {
        return updateTimeField;
    }

    public void setUpdateTimeField(String updateTimeField) {
        this.updateTimeField = updateTimeField;
    }

    public Object getSchema() {
        return schema;
    }

    public void setSchema(Object schema) {
        this.schema = schema;
    }

    public int getVdp() {
        return vdp;
    }

    public void setVdp(int vdp) {
        this.vdp = vdp;
    }

    public Boolean getFilterFields() {
        return filterFields;
    }

    public void setFilterFields(Boolean filterFields) {
        this.filterFields = filterFields;
    }

    public Boolean getCheckSum() {
        return checkSum;
    }

    public void setCheckSum(Boolean checkSum) {
        this.checkSum = checkSum;
    }

    public String getPreferExecutor() {
        return preferExecutor;
    }

    public void setPreferExecutor(String preferExecutor) {
        this.preferExecutor = preferExecutor;
    }

    public Long getClusterId() {
        return clusterId;
    }

    public void setClusterId(Long clusterId) {
        this.clusterId = clusterId;
    }

    public String getAllocationNodes() {
        return allocationNodes;
    }

    public void setAllocationNodes(String allocationNodes) {
        this.allocationNodes = allocationNodes;
    }

    public Boolean getDynamic() {
        return dynamic;
    }

    public void setDynamic(Boolean dynamic) {
        this.dynamic = dynamic;
    }

    public Long getIndexSlowThreshold() {
        return indexSlowThreshold;
    }

    public void setIndexSlowThreshold(Long indexSlowThreshold) {
        if(indexSlowThreshold == 0){
            indexSlowThreshold = -1L;
        }
        this.indexSlowThreshold = indexSlowThreshold;
    }

    public Long getFetchSlowThreshold() {
        return fetchSlowThreshold;
    }

    public void setFetchSlowThreshold(Long fetchSlowThreshold) {
        if(fetchSlowThreshold == 0){
            fetchSlowThreshold = -1L;
        }
        this.fetchSlowThreshold = fetchSlowThreshold;
    }

    public Long getQuerySlowThreshold() {
        return querySlowThreshold;
    }

    public void setQuerySlowThreshold(Long querySlowThreshold) {
        if(querySlowThreshold == 0){
            querySlowThreshold = -1L;
        }
        this.querySlowThreshold = querySlowThreshold;
    }

    public Byte getRefreshInterval() {
        return refreshInterval;
    }

    public void setRefreshInterval(Byte refreshInterval) {
        this.refreshInterval = refreshInterval;
    }
}