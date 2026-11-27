package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.LibvpxVp9Encoder;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
class LibvpxVp9EncoderJni implements LibvpxVp9Encoder.Natives {
    private static JniTestInstanceHolder sOverride;

    public static LibvpxVp9Encoder.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new LibvpxVp9EncoderJni() : (LibvpxVp9Encoder.Natives) obj;
    }

    public static void setInstanceForTesting(LibvpxVp9Encoder.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.LibvpxVp9Encoder.Natives
    public long create(long j) {
        return GEN_JNI.org_webrtc_LibvpxVp9Encoder_create(j);
    }

    @Override // org.webrtc.LibvpxVp9Encoder.Natives
    public boolean isSupported() {
        return GEN_JNI.org_webrtc_LibvpxVp9Encoder_isSupported();
    }
}
