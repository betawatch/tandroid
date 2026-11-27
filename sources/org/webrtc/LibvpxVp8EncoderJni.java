package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.LibvpxVp8Encoder;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
class LibvpxVp8EncoderJni implements LibvpxVp8Encoder.Natives {
    private static JniTestInstanceHolder sOverride;

    public static LibvpxVp8Encoder.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new LibvpxVp8EncoderJni() : (LibvpxVp8Encoder.Natives) obj;
    }

    public static void setInstanceForTesting(LibvpxVp8Encoder.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.LibvpxVp8Encoder.Natives
    public long create(long j) {
        return GEN_JNI.org_webrtc_LibvpxVp8Encoder_create(j);
    }
}
