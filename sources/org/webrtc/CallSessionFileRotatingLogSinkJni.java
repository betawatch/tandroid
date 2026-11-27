package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.CallSessionFileRotatingLogSink;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
