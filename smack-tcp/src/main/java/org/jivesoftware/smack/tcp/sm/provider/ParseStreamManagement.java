/**
 *
 * Copyright © 2014 Florian Schmaus
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
package org.jivesoftware.smack.tcp.sm.provider;

import org.jivesoftware.smack.tcp.sm.packet.StreamManagement.AckAnswer;
import org.jivesoftware.smack.tcp.sm.packet.StreamManagement.AckRequest;
import org.jivesoftware.smack.tcp.sm.packet.StreamManagement.Enabled;
import org.jivesoftware.smack.tcp.sm.packet.StreamManagement.Failed;
import org.jivesoftware.smack.tcp.sm.packet.StreamManagement.Resumed;
import org.xmlpull.v1.XmlPullParser;

public class ParseStreamManagement {

    public static Enabled enabled(XmlPullParser parser) {
        return null; // TODO
    }

    public static Failed failed(XmlPullParser parser) {
        return null; // TODO
    }

    public static Resumed resumed(XmlPullParser parser) {
        return null; // TODO
    }

    public static AckAnswer ackAnswer(XmlPullParser parser) {
        return null; // TODO
    }

    public static AckRequest ackRequest(XmlPullParser parser) {
        return null; // TODO
    }
}
