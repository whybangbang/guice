/**
 * Copyright (C) 2006 Google Inc.
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

package com.google.inject;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;

/**
 * Annotates an implementation class with the name of its scope.
 *
 * <p>If you apply {@code Scoped} to another annotation, that annotation will
 * act as an alias and the user will not have to explicitly specify a name.
 * See {@link com.google.inject.ContainerScoped} for an example.
 *
 * @see com.google.inject.ContainerBuilder#scope(String, Scope)
 * @author crazybob
 */
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RUNTIME)
public @interface Scoped {

  /**
   * Scope name.
   */
  String value();
}
