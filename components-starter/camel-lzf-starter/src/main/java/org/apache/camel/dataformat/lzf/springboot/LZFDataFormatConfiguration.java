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
package org.apache.camel.dataformat.lzf.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.DataFormatConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Compression and de-compress streams using LZF deflate algorithm.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.dataformat.lzf")
public class LZFDataFormatConfiguration
        extends
            DataFormatConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the lzf data format. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * Enable encoding (compress) using multiple processing cores.
     */
    private Boolean usingParallelCompression = false;
    /**
     * Whether the data format should set the Content-Type header with the type
     * from the data format if the data format is capable of doing so. For
     * example application/xml for data formats marshalling to XML, or
     * application/json for data formats marshalling to JSon etc.
     */
    private Boolean contentTypeHeader = false;

    public Boolean getUsingParallelCompression() {
        return usingParallelCompression;
    }

    public void setUsingParallelCompression(Boolean usingParallelCompression) {
        this.usingParallelCompression = usingParallelCompression;
    }

    public Boolean getContentTypeHeader() {
        return contentTypeHeader;
    }

    public void setContentTypeHeader(Boolean contentTypeHeader) {
        this.contentTypeHeader = contentTypeHeader;
    }
}