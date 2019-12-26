/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.consul.springboot;

import java.math.BigInteger;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;
import com.orbitz.consul.Consul;
import com.orbitz.consul.option.ConsistencyMode;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.apache.camel.support.jsse.SSLContextParameters;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.DeprecatedConfigurationProperty;

/**
 * The camel consul component allows you to work with Consul, a distributed,
 * highly available, datacenter-aware, service discovery and configuration
 * system.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.consul")
public class ConsulComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the consul component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * The Consul agent URL
     */
    private String url;
    /**
     * The data center
     */
    private String datacenter;
    /**
     * SSL configuration using an
     * org.apache.camel.support.jsse.SSLContextParameters instance. The option
     * is a org.apache.camel.support.jsse.SSLContextParameters type.
     */
    private String sslContextParameters;
    /**
     * Enable usage of global SSL context parameters.
     */
    private Boolean useGlobalSslContextParameters = false;
    /**
     * Sets the ACL token to be used with Consul
     */
    private String aclToken;
    /**
     * Sets the username to be used for basic authentication
     */
    private String userName;
    /**
     * Sets the password to be used for basic authentication
     */
    private String password;
    /**
     * Sets the common configuration shared among endpoints
     */
    private ConsulConfigurationNestedConfiguration configuration;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;
    /**
     * Whether the producer should be started lazy (on the first message). By
     * starting lazy you can use this to allow CamelContext and routes to
     * startup in situations where a producer may otherwise fail during starting
     * and cause the route to fail being started. By deferring this startup to
     * be lazy then the startup failure can be handled during routing messages
     * via Camel's routing error handlers. Beware that when the first message is
     * processed then creating and starting the producer may take a little time
     * and prolong the total processing time of the processing.
     */
    private Boolean lazyStartProducer = false;
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions occurred while the consumer is trying to pickup
     * incoming messages, or the likes, will now be processed as a message and
     * handled by the routing Error Handler. By default the consumer will use
     * the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that
     * will be logged at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = false;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDatacenter() {
        return datacenter;
    }

    public void setDatacenter(String datacenter) {
        this.datacenter = datacenter;
    }

    public String getSslContextParameters() {
        return sslContextParameters;
    }

    public void setSslContextParameters(String sslContextParameters) {
        this.sslContextParameters = sslContextParameters;
    }

    public Boolean getUseGlobalSslContextParameters() {
        return useGlobalSslContextParameters;
    }

    public void setUseGlobalSslContextParameters(
            Boolean useGlobalSslContextParameters) {
        this.useGlobalSslContextParameters = useGlobalSslContextParameters;
    }

    public String getAclToken() {
        return aclToken;
    }

    public void setAclToken(String aclToken) {
        this.aclToken = aclToken;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ConsulConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            ConsulConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public static class ConsulConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.consul.ConsulConfiguration.class;
        /**
         * The default action. Can be overridden by CamelConsulAction
         */
        private String action;
        /**
         * Reference to a com.orbitz.consul.Consul in the registry.
         */
        private Consul consulClient;
        /**
         * The default key. Can be overridden by CamelConsulKey
         */
        private String key;
        /**
         * Default to transform values retrieved from Consul i.e. on KV endpoint
         * to string.
         */
        private Boolean valueAsString = false;
        /**
         * Sets the ACL token to be used with Consul
         */
        private String aclToken;
        /**
         * The second to wait for a watch event, default 10 seconds
         */
        private Integer blockSeconds = 10;
        /**
         * Connect timeout for OkHttpClient
         */
        private Long connectTimeoutMillis;
        /**
         * The consistencyMode used for queries, default ConsistencyMode.DEFAULT
         */
        private ConsistencyMode consistencyMode = ConsistencyMode.DEFAULT;
        /**
         * The data center
         */
        private String datacenter;
        @Deprecated
        private String dc;
        /**
         * The first index for watch for, default 0
         */
        private BigInteger firstIndex;
        /**
         * The near node to use for queries.
         */
        private String nearNode;
        /**
         * The note meta-data to use for queries.
         */
        private List nodeMeta;
        /**
         * Sets the password to be used for basic authentication
         */
        private String password;
        /**
         * Configure if the AgentClient should attempt a ping before returning
         * the Consul instance
         */
        private Boolean pingInstance = true;
        /**
         * Read timeout for OkHttpClient
         */
        private Long readTimeoutMillis;
        /**
         * Recursively watch, default false
         */
        private Boolean recursive = false;
        /**
         * SSL configuration using an
         * org.apache.camel.support.jsse.SSLContextParameters instance.
         */
        private SSLContextParameters sslContextParameters;
        /**
         * Set tags. You can separate multiple tags by comma.
         */
        private Set tags;
        /**
         * The Consul agent URL
         */
        private String url;
        /**
         * Sets the username to be used for basic authentication
         */
        private String userName;
        /**
         * Write timeout for OkHttpClient
         */
        private Long writeTimeoutMillis;

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }

        public Consul getConsulClient() {
            return consulClient;
        }

        public void setConsulClient(Consul consulClient) {
            this.consulClient = consulClient;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public Boolean getValueAsString() {
            return valueAsString;
        }

        public void setValueAsString(Boolean valueAsString) {
            this.valueAsString = valueAsString;
        }

        public String getAclToken() {
            return aclToken;
        }

        public void setAclToken(String aclToken) {
            this.aclToken = aclToken;
        }

        public Integer getBlockSeconds() {
            return blockSeconds;
        }

        public void setBlockSeconds(Integer blockSeconds) {
            this.blockSeconds = blockSeconds;
        }

        public Long getConnectTimeoutMillis() {
            return connectTimeoutMillis;
        }

        public void setConnectTimeoutMillis(Long connectTimeoutMillis) {
            this.connectTimeoutMillis = connectTimeoutMillis;
        }

        public ConsistencyMode getConsistencyMode() {
            return consistencyMode;
        }

        public void setConsistencyMode(ConsistencyMode consistencyMode) {
            this.consistencyMode = consistencyMode;
        }

        public String getDatacenter() {
            return datacenter;
        }

        public void setDatacenter(String datacenter) {
            this.datacenter = datacenter;
        }

        @Deprecated
        @DeprecatedConfigurationProperty
        public String getDc() {
            return dc;
        }

        @Deprecated
        public void setDc(String dc) {
            this.dc = dc;
        }

        public BigInteger getFirstIndex() {
            return firstIndex;
        }

        public void setFirstIndex(BigInteger firstIndex) {
            this.firstIndex = firstIndex;
        }

        public String getNearNode() {
            return nearNode;
        }

        public void setNearNode(String nearNode) {
            this.nearNode = nearNode;
        }

        public List getNodeMeta() {
            return nodeMeta;
        }

        public void setNodeMeta(List nodeMeta) {
            this.nodeMeta = nodeMeta;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Boolean getPingInstance() {
            return pingInstance;
        }

        public void setPingInstance(Boolean pingInstance) {
            this.pingInstance = pingInstance;
        }

        public Long getReadTimeoutMillis() {
            return readTimeoutMillis;
        }

        public void setReadTimeoutMillis(Long readTimeoutMillis) {
            this.readTimeoutMillis = readTimeoutMillis;
        }

        public Boolean getRecursive() {
            return recursive;
        }

        public void setRecursive(Boolean recursive) {
            this.recursive = recursive;
        }

        public SSLContextParameters getSslContextParameters() {
            return sslContextParameters;
        }

        public void setSslContextParameters(
                SSLContextParameters sslContextParameters) {
            this.sslContextParameters = sslContextParameters;
        }

        public Set getTags() {
            return tags;
        }

        public void setTags(Set tags) {
            this.tags = tags;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public Long getWriteTimeoutMillis() {
            return writeTimeoutMillis;
        }

        public void setWriteTimeoutMillis(Long writeTimeoutMillis) {
            this.writeTimeoutMillis = writeTimeoutMillis;
        }
    }
}