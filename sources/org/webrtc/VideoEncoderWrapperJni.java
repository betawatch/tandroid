package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.VideoEncoderWrapper;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
class VideoEncoderWrapperJni implements VideoEncoderWrapper.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    public static VideoEncoderWrapper.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new VideoEncoderWrapperJni() : (VideoEncoderWrapper.Natives) obj;
    }

    public static void setInstanceForTesting(VideoEncoderWrapper.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.VideoEncoderWrapper.Natives
    public void onEncodedFrame(long j, EncodedImage encodedImage) {
        GEN_JNI.org_webrtc_VideoEncoderWrapper_onEncodedFrame(j, encodedImage);
    }
}
