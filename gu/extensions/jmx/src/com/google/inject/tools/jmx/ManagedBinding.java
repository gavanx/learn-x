/**
 * Copyright (C) 2006 Google Inc.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.inject.tools.jmx;

import com.google.inject.Binding;

class ManagedBinding implements ManagedBindingMBean {

    final Binding binding;

    ManagedBinding(Binding binding) {
        this.binding = binding;
    }

    public String getSource() {
        return binding.getSource().toString();
    }

    public String getKey() {
        return binding.getKey().toString();
    }

    public String getProvider() {
        return binding.getProvider().toString();
    }
}
