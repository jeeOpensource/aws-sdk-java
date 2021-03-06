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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetEnabledStandards" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEnabledStandardsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>StandardsSubscriptions</code> objects that include information about the enabled standards.
     * </p>
     */
    private java.util.List<StandardsSubscription> standardsSubscriptions;
    /**
     * <p>
     * The token that is required for pagination.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>StandardsSubscriptions</code> objects that include information about the enabled standards.
     * </p>
     * 
     * @return A list of <code>StandardsSubscriptions</code> objects that include information about the enabled
     *         standards.
     */

    public java.util.List<StandardsSubscription> getStandardsSubscriptions() {
        return standardsSubscriptions;
    }

    /**
     * <p>
     * A list of <code>StandardsSubscriptions</code> objects that include information about the enabled standards.
     * </p>
     * 
     * @param standardsSubscriptions
     *        A list of <code>StandardsSubscriptions</code> objects that include information about the enabled
     *        standards.
     */

    public void setStandardsSubscriptions(java.util.Collection<StandardsSubscription> standardsSubscriptions) {
        if (standardsSubscriptions == null) {
            this.standardsSubscriptions = null;
            return;
        }

        this.standardsSubscriptions = new java.util.ArrayList<StandardsSubscription>(standardsSubscriptions);
    }

    /**
     * <p>
     * A list of <code>StandardsSubscriptions</code> objects that include information about the enabled standards.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStandardsSubscriptions(java.util.Collection)} or
     * {@link #withStandardsSubscriptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param standardsSubscriptions
     *        A list of <code>StandardsSubscriptions</code> objects that include information about the enabled
     *        standards.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnabledStandardsResult withStandardsSubscriptions(StandardsSubscription... standardsSubscriptions) {
        if (this.standardsSubscriptions == null) {
            setStandardsSubscriptions(new java.util.ArrayList<StandardsSubscription>(standardsSubscriptions.length));
        }
        for (StandardsSubscription ele : standardsSubscriptions) {
            this.standardsSubscriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>StandardsSubscriptions</code> objects that include information about the enabled standards.
     * </p>
     * 
     * @param standardsSubscriptions
     *        A list of <code>StandardsSubscriptions</code> objects that include information about the enabled
     *        standards.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnabledStandardsResult withStandardsSubscriptions(java.util.Collection<StandardsSubscription> standardsSubscriptions) {
        setStandardsSubscriptions(standardsSubscriptions);
        return this;
    }

    /**
     * <p>
     * The token that is required for pagination.
     * </p>
     * 
     * @param nextToken
     *        The token that is required for pagination.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that is required for pagination.
     * </p>
     * 
     * @return The token that is required for pagination.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that is required for pagination.
     * </p>
     * 
     * @param nextToken
     *        The token that is required for pagination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnabledStandardsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStandardsSubscriptions() != null)
            sb.append("StandardsSubscriptions: ").append(getStandardsSubscriptions()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEnabledStandardsResult == false)
            return false;
        GetEnabledStandardsResult other = (GetEnabledStandardsResult) obj;
        if (other.getStandardsSubscriptions() == null ^ this.getStandardsSubscriptions() == null)
            return false;
        if (other.getStandardsSubscriptions() != null && other.getStandardsSubscriptions().equals(this.getStandardsSubscriptions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStandardsSubscriptions() == null) ? 0 : getStandardsSubscriptions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetEnabledStandardsResult clone() {
        try {
            return (GetEnabledStandardsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
