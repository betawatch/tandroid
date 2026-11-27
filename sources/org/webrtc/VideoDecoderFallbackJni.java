package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.VideoDecoderFallback;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
class VideoDecoderFallbackJni implements VideoDecoderFallback.Natives {
    private static JniTestInstanceHolder sOverride;

    public static VideoDecoderFallback.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new VideoDecoderFallbackJni() : (VideoDecoderFallback.Natives) obj;
    }

    public static void setInstanceForTesting(VideoDecoderFallback.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.VideoDecoderFallback.Natives
    public long create(long j, VideoDecoder videoDecoder, VideoDecoder videoDecoder2) {
        return GEN_JNI.org_webrtc_VideoDecoderFallback_create(j, videoDecoder, videoDecoder2);
    }
}
