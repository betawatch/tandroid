package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.Histogram;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
class HistogramJni implements Histogram.Natives {
    private static JniTestInstanceHolder sOverride;

    public static Histogram.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new HistogramJni() : (Histogram.Natives) obj;
    }

    public static void setInstanceForTesting(Histogram.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.Histogram.Natives
    public void addSample(long j, int i) {
        GEN_JNI.org_webrtc_Histogram_addSample(j, i);
    }

    @Override // org.webrtc.Histogram.Natives
    public long createCounts(String str, int i, int i2, int i3) {
        return GEN_JNI.org_webrtc_Histogram_createCounts(str, i, i2, i3);
    }

    @Override // org.webrtc.Histogram.Natives
    public long createEnumeration(String str, int i) {
        return GEN_JNI.org_webrtc_Histogram_createEnumeration(str, i);
    }
}
