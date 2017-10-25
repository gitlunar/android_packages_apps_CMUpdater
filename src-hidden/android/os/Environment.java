/*
 * Copyright (C) 2007 The Android Open Source Project
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

package android.os;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.os.storage.StorageVolume;
import android.text.TextUtils;
import android.util.Log;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Provides access to environment variables.
 */
public class Environment {

    public static File getMediaStorageDirectory() {
        return null;
    }

    public static File getExternalStorageDirectory() {
        return null;
    }

    public static boolean isExternalStorageEmulated() {
        return false;
    }

    public static File maybeTranslateEmulatedPathToInternal(File path) { return path; }
}