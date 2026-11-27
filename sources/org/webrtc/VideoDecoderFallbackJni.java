package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.VideoDecoderFallback;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
