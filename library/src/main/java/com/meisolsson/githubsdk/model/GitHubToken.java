/*
 * Copyright 2015 Henrik Olsson
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.meisolsson.githubsdk.model;

import android.os.Parcelable;
import android.support.annotation.Nullable;

import com.google.auto.value.AutoValue;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

@AutoValue
public abstract class GitHubToken implements Parcelable {

    @Json(name = "access_token")
    @Nullable
    public abstract String accessToken();

    @Nullable
    public abstract String scope();

    @Json(name = "token_type")
    @Nullable
    public abstract String tokeType();

    @Nullable
    public abstract String error();

    public static JsonAdapter<GitHubToken> jsonAdapter(Moshi moshi){
        return new AutoValue_GitHubToken.MoshiJsonAdapter(moshi);
    }
}
