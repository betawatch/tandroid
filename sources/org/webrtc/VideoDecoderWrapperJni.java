package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.VideoDecoderWrapper;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
class VideoDecoderWrapperJni implements VideoDecoderWrapper.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    public static VideoDecoderWrapper.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new VideoDecoderWrapperJni() : (VideoDecoderWrapper.Natives) obj;
    }

    public static void setInstanceForTesting(VideoDecoderWrapper.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.VideoDecoderWrapper.Natives
    public void onDecodedFrame(long j, VideoFrame videoFrame, Integer num, Integer num2) {
        GEN_JNI.org_webrtc_VideoDecoderWrapper_onDecodedFrame(j, videoFrame, num, num2);
    }
}
