package org.webrtc.audio;

import java.nio.ByteBuffer;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.audio.WebRtcAudioTrack;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
