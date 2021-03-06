/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.secvault.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Master Key Reader Configuration bean.
 *
 * @since 5.0.0
 */
public class MasterKeyReaderConfiguration {

    private String type = "";
    private Map<String, String> parameters = new HashMap<>();

    /**
     * Get master key reader implementation type.
     *
     * @return master key reader implementation type
     */
    public Optional<String> getType() {
        return Optional.ofNullable(type);
    }

    /**
     * Set master key reader implementation type.
     *
     * @param type master key reader implementation type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Get master key reader configuration parameters.
     *
     * @param key parameter key
     * @return master key reader configuration parameters
     */
    public Optional<String> getParameter(String key) {
        return Optional.ofNullable(parameters.get(key));
    }

    /**
     * Set parameter value.
     *
     * @param key   parameter key
     * @param value parameter value
     */
    public void setParameter(String key, String value) {
        parameters.put(key, value);
    }
}
