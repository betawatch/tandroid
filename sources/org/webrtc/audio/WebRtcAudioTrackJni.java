package org.webrtc.audio;

import java.nio.ByteBuffer;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.audio.WebRtcAudioTrack;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
class WebRtcAudioTrackJni implements WebRtcAudioTrack.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    public static WebRtcAudioTrack.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new WebRtcAudioTrackJni() : (WebRtcAudioTrack.Natives) obj;
    }

    public static void setInstanceForTesting(WebRtcAudioTrack.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.audio.WebRtcAudioTrack.Natives
    public void cacheDirectBufferAddress(long j, ByteBuffer byteBuffer) {
        GEN_JNI.org_webrtc_audio_WebRtcAudioTrack_cacheDirectBufferAddress(j, byteBuffer);
    }

    @Override // org.webrtc.audio.WebRtcAudioTrack.Natives
    public void getPlayoutData(long j, int i) {
        GEN_JNI.org_webrtc_audio_WebRtcAudioTrack_getPlayoutData(j, i);
    }
}
