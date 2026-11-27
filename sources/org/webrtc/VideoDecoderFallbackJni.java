package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.VideoDecoderFallback;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
