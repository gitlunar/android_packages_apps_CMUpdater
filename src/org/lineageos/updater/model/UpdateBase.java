/*
 * Copyright (C) 2017 The LineageOS Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.lineageos.updater.model;

public class UpdateBase implements UpdateBaseInfo {

    private String mName;
    private String mDownloadUrl;
    private String mId;
    private int mIncremental;
    private String mType;
    private String mVersion;

    public UpdateBase() {
    }

    public UpdateBase(UpdateBaseInfo update) {
        mName = update.getName();
        mDownloadUrl = update.getDownloadUrl();
        mId = update.getId();
        mIncremental = update.getIncremental();
        mType = update.getType();
        mVersion = update.getVersion();
    }

    @Override
    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    @Override
    public String getId() {
        return mId;
    }

    public void setId(String downloadId) {
        mId = downloadId;
    }

    @Override
    public int getIncremental() {
        return mIncremental;
    }

    public void setIncremental(int incremental) {
        mIncremental = incremental;
    }

    @Override
    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    @Override
    public String getVersion() {
        return mVersion;
    }

    public void setVersion(String version) {
        mVersion = version;
    }

    @Override
    public String getDownloadUrl() {
        return mDownloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        mDownloadUrl = downloadUrl;
    }
}
