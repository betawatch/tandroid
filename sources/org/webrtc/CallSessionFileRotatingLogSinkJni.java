package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.CallSessionFileRotatingLogSink;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public class CallSessionFileRotatingLogSinkJni implements CallSessionFileRotatingLogSink.Natives {
    private static JniTestInstanceHolder sOverride;

    public static CallSessionFileRotatingLogSink.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new CallSessionFileRotatingLogSinkJni() : (CallSessionFileRotatingLogSink.Natives) obj;
    }

    public static void setInstanceForTesting(CallSessionFileRotatingLogSink.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.CallSessionFileRotatingLogSink.Natives
    public long addSink(String str, int i, int i2) {
        return GEN_JNI.org_webrtc_CallSessionFileRotatingLogSink_addSink(str, i, i2);
    }

    @Override // org.webrtc.CallSessionFileRotatingLogSink.Natives
    public void deleteSink(long j) {
        GEN_JNI.org_webrtc_CallSessionFileRotatingLogSink_deleteSink(j);
    }

    @Override // org.webrtc.CallSessionFileRotatingLogSink.Natives
    public byte[] getLogData(String str) {
        return (byte[]) GEN_JNI.org_webrtc_CallSessionFileRotatingLogSink_getLogData(str);
    }
}
