/**
 * Copyright (C) 2007 Google Inc.
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

package com.google.inject.internal.util;

import java.lang.reflect.*;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Class utilities.
 */
public final class Classes {

    public static boolean isInnerClass(Class<?> clazz) {
        return !Modifier.isStatic(clazz.getModifiers()) && clazz.getEnclosingClass() != null;
    }

    public static boolean isConcrete(Class<?> clazz) {
        int modifiers = clazz.getModifiers();
        return !clazz.isInterface() && !Modifier.isAbstract(modifiers);
    }

    /**
     * Formats a member as concise string, such as {@code java.util.ArrayList.size},
     * {@code java.util.ArrayList<init>()} or {@code java.util.List.remove()}.
     */
    public static String toString(Member member) {
        Class<? extends Member> memberType = Classes.memberType(member);

        if (memberType == Method.class) {
            return member.getDeclaringClass().getName() + "." + member.getName() + "()";
        } else if (memberType == Field.class) {
            return member.getDeclaringClass().getName() + "." + member.getName();
        } else if (memberType == Constructor.class) {
            return member.getDeclaringClass().getName() + ".<init>()";
        } else {
            throw new AssertionError();
        }
    }

    /**
     * Returns {@code Field.class}, {@code Method.class} or {@code Constructor.class}.
     */
    public static Class<? extends Member> memberType(Member member) {
        checkNotNull(member, "member");

        if (member instanceof Field) {
            return Field.class;

        } else if (member instanceof Method) {
            return Method.class;

        } else if (member instanceof Constructor) {
            return Constructor.class;

        } else {
            throw new IllegalArgumentException("Unsupported implementation class for Member, " + member.getClass());
        }
    }
}