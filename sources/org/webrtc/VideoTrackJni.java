package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.VideoTrack;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
class VideoTrackJni implements VideoTrack.Natives {
    private static JniTestInstanceHolder sOverride;

    public static VideoTrack.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new VideoTrackJni() : (VideoTrack.Natives) obj;
    }

    public static void setInstanceForTesting(VideoTrack.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.VideoTrack.Natives
    public void addSink(long j, long j2) {
        GEN_JNI.org_webrtc_VideoTrack_addSink(j, j2);
    }

    @Override // org.webrtc.VideoTrack.Natives
    public void freeSink(long j) {
        GEN_JNI.org_webrtc_VideoTrack_freeSink(j);
    }

    @Override // org.webrtc.VideoTrack.Natives
    public void removeSink(long j, long j2) {
        GEN_JNI.org_webrtc_VideoTrack_removeSink(j, j2);
    }

    @Override // org.webrtc.VideoTrack.Natives
    public long wrapSink(VideoSink videoSink) {
        return GEN_JNI.org_webrtc_VideoTrack_wrapSink(videoSink);
    }
}
