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
package com.amazonaws.services.robomaker.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DeploymentJobErrorCode {

    ResourceNotFound("ResourceNotFound"),
    EnvironmentSetupError("EnvironmentSetupError"),
    EtagMismatch("EtagMismatch"),
    FailureThresholdBreached("FailureThresholdBreached"),
    RobotDeploymentAborted("RobotDeploymentAborted"),
    RobotDeploymentNoResponse("RobotDeploymentNoResponse"),
    RobotAgentConnectionTimeout("RobotAgentConnectionTimeout"),
    GreengrassDeploymentFailed("GreengrassDeploymentFailed"),
    MissingRobotArchitecture("MissingRobotArchitecture"),
    MissingRobotApplicationArchitecture("MissingRobotApplicationArchitecture"),
    MissingRobotDeploymentResource("MissingRobotDeploymentResource"),
    GreengrassGroupVersionDoesNotExist("GreengrassGroupVersionDoesNotExist"),
    ExtractingBundleFailure("ExtractingBundleFailure"),
    PreLaunchFileFailure("PreLaunchFileFailure"),
    PostLaunchFileFailure("PostLaunchFileFailure"),
    BadPermissionError("BadPermissionError"),
    DownloadConditionFailed("DownloadConditionFailed"),
    InternalServerError("InternalServerError");

    private String value;

    private DeploymentJobErrorCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return DeploymentJobErrorCode corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static DeploymentJobErrorCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (DeploymentJobErrorCode enumEntry : DeploymentJobErrorCode.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
