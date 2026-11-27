package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.LibvpxVp8Decoder;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
class LibvpxVp8DecoderJni implements LibvpxVp8Decoder.Natives {
    private static JniTestInstanceHolder sOverride;

    public static LibvpxVp8Decoder.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new LibvpxVp8DecoderJni() : (LibvpxVp8Decoder.Natives) obj;
    }

    public static void setInstanceForTesting(LibvpxVp8Decoder.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.LibvpxVp8Decoder.Natives
    public long createDecoder(long j) {
        return GEN_JNI.org_webrtc_LibvpxVp8Decoder_createDecoder(j);
    }
}
