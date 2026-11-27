package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.LibaomAv1Encoder;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
class LibaomAv1EncoderJni implements LibaomAv1Encoder.Natives {
    private static JniTestInstanceHolder sOverride;

    public static LibaomAv1Encoder.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new LibaomAv1EncoderJni() : (LibaomAv1Encoder.Natives) obj;
    }

    public static void setInstanceForTesting(LibaomAv1Encoder.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.LibaomAv1Encoder.Natives
    public long create(long j) {
        return GEN_JNI.org_webrtc_LibaomAv1Encoder_create(j);
    }
}
