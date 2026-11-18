package org.webrtc;

import org.webrtc.Logging;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
class JNILogging {
    private final Loggable loggable;

    public JNILogging(Loggable loggable) {
        this.loggable = loggable;
    }

    public void logToInjectable(String str, Integer num, String str2) {
        this.loggable.onLogMessage(str, Logging.Severity.values()[num.intValue()], str2);
    }
}
