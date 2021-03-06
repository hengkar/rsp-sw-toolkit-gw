/*
 * Copyright (C) 2018 Intel Corporation
 * SPDX-License-Identifier: BSD-3-Clause
 */
package com.intel.rfid.api;

public class TagStatsUpdateNotification extends JsonNotification {

    public static final String METHOD_NAME = "tag_stats_update";

    public TagStatsUpdate params = new TagStatsUpdate();

    public TagStatsUpdateNotification() {
        method = METHOD_NAME;
    }

    public TagStatsUpdateNotification(TagStatsUpdate _update) {
        this();
        params = _update;
    }

}
