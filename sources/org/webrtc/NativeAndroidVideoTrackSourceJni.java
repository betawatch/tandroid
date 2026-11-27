package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.NativeAndroidVideoTrackSource;
import org.webrtc.VideoFrame;
import org.webrtc.VideoProcessor;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
class NativeAndroidVideoTrackSourceJni implements NativeAndroidVideoTrackSource.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    public static NativeAndroidVideoTrackSource.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new NativeAndroidVideoTrackSourceJni() : (NativeAndroidVideoTrackSource.Natives) obj;
    }

    public static void setInstanceForTesting(NativeAndroidVideoTrackSource.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.NativeAndroidVideoTrackSource.Natives
    public VideoProcessor.FrameAdaptationParameters adaptFrame(long j, int i, int i2, int i3, long j2) {
        return (VideoProcessor.FrameAdaptationParameters) GEN_JNI.org_webrtc_NativeAndroidVideoTrackSource_adaptFrame(j, i, i2, i3, j2);
    }

    @Override // org.webrtc.NativeAndroidVideoTrackSource.Natives
    public void adaptOutputFormat(long j, int i, int i2, Integer num, int i3, int i4, Integer num2, Integer num3) {
        GEN_JNI.org_webrtc_NativeAndroidVideoTrackSource_adaptOutputFormat(j, i, i2, num, i3, i4, num2, num3);
    }

    @Override // org.webrtc.NativeAndroidVideoTrackSource.Natives
    public void onFrameCaptured(long j, int i, long j2, VideoFrame.Buffer buffer) {
        GEN_JNI.org_webrtc_NativeAndroidVideoTrackSource_onFrameCaptured(j, i, j2, buffer);
    }

    @Override // org.webrtc.NativeAndroidVideoTrackSource.Natives
    public void setIsScreencast(long j, boolean z) {
        GEN_JNI.org_webrtc_NativeAndroidVideoTrackSource_setIsScreencast(j, z);
    }

    @Override // org.webrtc.NativeAndroidVideoTrackSource.Natives
    public void setState(long j, boolean z) {
        GEN_JNI.org_webrtc_NativeAndroidVideoTrackSource_setState(j, z);
    }
}
