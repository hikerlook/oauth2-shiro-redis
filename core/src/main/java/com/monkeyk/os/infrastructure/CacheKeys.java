/*
 * Copyright (c) 2015 MONKEYK Information Technology Co. Ltd
 * www.monkeyk.com
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * MONKEYK Information Technology Co. Ltd ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement you
 * entered into with MONKEYK Information Technology Co. Ltd.
 */
package com.monkeyk.os.infrastructure;

/**
 * 2015/10/21
 *
 * @author Shengzhao Li
 */
public abstract class CacheKeys {


    /**
     * AccessToken  cache
     * key:  tokenId + cache_name
     */
    public static final String ACCESS_TOKEN_CACHE = "accessTokenCache";


    /**
     * ClientDetails  cache
     * key:  clientId + cache_name
     */
    public static final String CLIENT_DETAILS_CACHE = "clientDetailsCache";


    /**
     * ClientDetails  cache with resourceIds
     * key:  clientId + resourceIds
     */
    public static final String CLIENT_DETAILS_RESOURCEIDS_CACHE = "clientDetailsResourceIdsCache";


    //private
    private CacheKeys() {
    }

}