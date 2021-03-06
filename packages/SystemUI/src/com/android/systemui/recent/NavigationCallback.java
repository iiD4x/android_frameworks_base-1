/*
 * Copyright (C) 2013 ParanoidAndroid Project
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

package com.android.systemui.recent;

import android.graphics.drawable.Drawable;

public interface NavigationCallback {

    final static int NAVBAR_BACK_HINT = 0;
    final static int NAVBAR_RECENTS_HINT = 1;

    void setNavigationIconHints(int hints, boolean force);
    int getNavigationIconHints();

}
