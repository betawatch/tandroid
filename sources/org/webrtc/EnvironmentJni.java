package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.Environment;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
class EnvironmentJni implements Environment.Natives {
    private static JniTestInstanceHolder sOverride;

    public static Environment.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new EnvironmentJni() : (Environment.Natives) obj;
    }

    public static void setInstanceForTesting(Environment.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.Environment.Natives
    public long create(String str) {
        return GEN_JNI.org_webrtc_Environment_create(str);
    }

    @Override // org.webrtc.Environment.Natives
    public long currentTimeNanos(long j) {
        return GEN_JNI.org_webrtc_Environment_currentTimeNanos(j);
    }

    @Override // org.webrtc.Environment.Natives
    public void free(long j) {
        GEN_JNI.org_webrtc_Environment_free(j);
    }
}
