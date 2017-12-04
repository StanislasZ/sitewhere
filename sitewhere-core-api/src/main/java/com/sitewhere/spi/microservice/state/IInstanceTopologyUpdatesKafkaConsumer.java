/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.spi.microservice.state;

import com.sitewhere.spi.microservice.kafka.IMicroserviceKafkaConsumer;

/**
 * Kafka consumer that processes instance topology updates.
 * 
 * @author Derek
 */
public interface IInstanceTopologyUpdatesKafkaConsumer extends IMicroserviceKafkaConsumer {

    /**
     * Called when an instance topology update is received.
     * 
     * @param state
     */
    public void onInstanceTopologyUpdate(IInstanceTopologyUpdate update);
}