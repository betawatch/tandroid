package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.Dav1dDecoder;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
