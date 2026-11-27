package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.Metrics;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
class MetricsJni implements Metrics.Natives {
    private static JniTestInstanceHolder sOverride;

    public static Metrics.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new MetricsJni() : (Metrics.Natives) obj;
    }

    public static void setInstanceForTesting(Metrics.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.Metrics.Natives
    public void enable() {
        GEN_JNI.org_webrtc_Metrics_enable();
    }

    @Override // org.webrtc.Metrics.Natives
    public Metrics getAndReset() {
        return (Metrics) GEN_JNI.org_webrtc_Metrics_getAndReset();
    }
}
