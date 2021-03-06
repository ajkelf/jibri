/*
 * Copyright @ 2018 - present 8x8, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jitsi.jibri.selenium

import org.jitsi.jibri.error.JibriError
import org.jitsi.jibri.status.ErrorScope

object FailedToJoinCall : JibriError(ErrorScope.SESSION, "Failed to join the call")
object ChromeHung : JibriError(ErrorScope.SESSION, "Chrome hung")
object NoMediaReceived : JibriError(ErrorScope.SESSION, "No media received")
object IceFailed : JibriError(ErrorScope.SESSION, "ICE failed")
