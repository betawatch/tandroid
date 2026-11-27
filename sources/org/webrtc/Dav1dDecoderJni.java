package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.Dav1dDecoder;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
class Dav1dDecoderJni implements Dav1dDecoder.Natives {
    private static JniTestInstanceHolder sOverride;

    public static Dav1dDecoder.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new Dav1dDecoderJni() : (Dav1dDecoder.Natives) obj;
    }

    public static void setInstanceForTesting(Dav1dDecoder.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.Dav1dDecoder.Natives
    public long createDecoder() {
        return GEN_JNI.org_webrtc_Dav1dDecoder_createDecoder();
    }
}
