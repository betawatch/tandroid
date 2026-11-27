package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.VideoEncoderFallback;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
class VideoEncoderFallbackJni implements VideoEncoderFallback.Natives {
    private static JniTestInstanceHolder sOverride;

    public static VideoEncoderFallback.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new VideoEncoderFallbackJni() : (VideoEncoderFallback.Natives) obj;
    }

    public static void setInstanceForTesting(VideoEncoderFallback.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.VideoEncoderFallback.Natives
    public long create(long j, VideoEncoder videoEncoder, VideoEncoder videoEncoder2) {
        return GEN_JNI.org_webrtc_VideoEncoderFallback_create(j, videoEncoder, videoEncoder2);
    }
}
