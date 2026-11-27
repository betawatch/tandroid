package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.LibvpxVp9Decoder;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
class LibvpxVp9DecoderJni implements LibvpxVp9Decoder.Natives {
    private static JniTestInstanceHolder sOverride;

    public static LibvpxVp9Decoder.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new LibvpxVp9DecoderJni() : (LibvpxVp9Decoder.Natives) obj;
    }

    public static void setInstanceForTesting(LibvpxVp9Decoder.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.LibvpxVp9Decoder.Natives
    public long createDecoder() {
        return GEN_JNI.org_webrtc_LibvpxVp9Decoder_createDecoder();
    }

    @Override // org.webrtc.LibvpxVp9Decoder.Natives
    public boolean isSupported() {
        return GEN_JNI.org_webrtc_LibvpxVp9Decoder_isSupported();
    }
}
