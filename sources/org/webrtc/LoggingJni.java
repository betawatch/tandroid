package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.Logging;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
class LoggingJni implements Logging.Natives {
    private static JniTestInstanceHolder sOverride;

    public static Logging.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new LoggingJni() : (Logging.Natives) obj;
    }

    public static void setInstanceForTesting(Logging.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.Logging.Natives
    public void enableLogThreads() {
        GEN_JNI.org_webrtc_Logging_enableLogThreads();
    }

    @Override // org.webrtc.Logging.Natives
    public void enableLogTimeStamps() {
        GEN_JNI.org_webrtc_Logging_enableLogTimeStamps();
    }

    @Override // org.webrtc.Logging.Natives
    public void enableLogToDebugOutput(int i) {
        GEN_JNI.org_webrtc_Logging_enableLogToDebugOutput(i);
    }

    @Override // org.webrtc.Logging.Natives
    public void log(int i, String str, String str2) {
        GEN_JNI.org_webrtc_Logging_log(i, str, str2);
    }
}
