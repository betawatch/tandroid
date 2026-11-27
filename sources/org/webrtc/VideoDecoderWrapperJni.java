package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.VideoDecoderWrapper;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
