package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.AudioTrack;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
class AudioTrackJni implements AudioTrack.Natives {
    private static JniTestInstanceHolder sOverride;

    public static AudioTrack.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new AudioTrackJni() : (AudioTrack.Natives) obj;
    }

    public static void setInstanceForTesting(AudioTrack.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.AudioTrack.Natives
    public void setVolume(long j, double d) {
        GEN_JNI.org_webrtc_AudioTrack_setVolume(j, d);
    }
}
