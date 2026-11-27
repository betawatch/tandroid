package org.webrtc.audio;

import java.nio.ByteBuffer;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.audio.WebRtcAudioRecord;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
class WebRtcAudioRecordJni implements WebRtcAudioRecord.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    public static WebRtcAudioRecord.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new WebRtcAudioRecordJni() : (WebRtcAudioRecord.Natives) obj;
    }

    public static void setInstanceForTesting(WebRtcAudioRecord.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.audio.WebRtcAudioRecord.Natives
    public void cacheDirectBufferAddress(long j, WebRtcAudioRecord webRtcAudioRecord, ByteBuffer byteBuffer) {
        GEN_JNI.org_webrtc_audio_WebRtcAudioRecord_cacheDirectBufferAddress(j, webRtcAudioRecord, byteBuffer);
    }

    @Override // org.webrtc.audio.WebRtcAudioRecord.Natives
    public void dataIsRecorded(long j, WebRtcAudioRecord webRtcAudioRecord, int i, long j2) {
        GEN_JNI.org_webrtc_audio_WebRtcAudioRecord_dataIsRecorded(j, webRtcAudioRecord, i, j2);
    }
}
