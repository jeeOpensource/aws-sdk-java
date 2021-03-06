/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.eks.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.eks.AmazonEKS;
import com.amazonaws.services.eks.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonEKSWaiters {

    /**
     * Represents the service client
     */
    private final AmazonEKS client;

    private final ExecutorService executorService = WaiterExecutorServiceFactory.buildExecutorServiceForWaiter("AmazonEKSWaiters");

    /**
     * Constructs a new AmazonEKSWaiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AmazonEKSWaiters(AmazonEKS client) {
        this.client = client;
    }

    /**
     * Builds a ClusterDeleted waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeClusterRequest> clusterDeleted() {

        return new WaiterBuilder<DescribeClusterRequest, DescribeClusterResult>()
                .withSdkFunction(new DescribeClusterFunction(client))
                .withAcceptors(new ClusterDeleted.IsACTIVEMatcher(), new ClusterDeleted.IsCREATINGMatcher(),
                        new ClusterDeleted.IsResourceNotFoundExceptionMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ClusterActive waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeClusterRequest> clusterActive() {

        return new WaiterBuilder<DescribeClusterRequest, DescribeClusterResult>().withSdkFunction(new DescribeClusterFunction(client))
                .withAcceptors(new ClusterActive.IsDELETINGMatcher(), new ClusterActive.IsFAILEDMatcher(), new ClusterActive.IsACTIVEMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a NodegroupDeleted waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeNodegroupRequest> nodegroupDeleted() {

        return new WaiterBuilder<DescribeNodegroupRequest, DescribeNodegroupResult>().withSdkFunction(new DescribeNodegroupFunction(client))
                .withAcceptors(new NodegroupDeleted.IsDELETE_FAILEDMatcher(), new NodegroupDeleted.IsResourceNotFoundExceptionMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a NodegroupActive waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeNodegroupRequest> nodegroupActive() {

        return new WaiterBuilder<DescribeNodegroupRequest, DescribeNodegroupResult>().withSdkFunction(new DescribeNodegroupFunction(client))
                .withAcceptors(new NodegroupActive.IsCREATE_FAILEDMatcher(), new NodegroupActive.IsACTIVEMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(80), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
