/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */
package girgin.ramazan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableBinding(CustomEventsSource.class)
@SpringBootApplication
@EnableScheduling
public class AzureServiceBusSpringCloudSampleApp3 {

    public static void main(String[] args) {
        SpringApplication.run(AzureServiceBusSpringCloudSampleApp3.class);
    }

}
