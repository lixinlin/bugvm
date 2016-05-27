/*
 * Copyright 2000-2009 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * @author max
 */
package com.intellij.ui;

import com.intellij.openapi.components.ServiceManager;
import com.intellij.util.Function;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public abstract class IconDeferrer {
  public static IconDeferrer getInstance() {
    return ServiceManager.getService(IconDeferrer.class);
  }

  public abstract <T> Icon defer(Icon base, T param, @NotNull Function<T, Icon> f);
  public abstract <T> Icon deferAutoUpdatable(Icon base, T param, @NotNull Function<T, Icon> f);
}