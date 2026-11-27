package org.webrtc.audio;

import android.content.Context;
import android.media.AudioManager;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.audio.JavaAudioDeviceModule;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
class JavaAudioDeviceModuleJni implements JavaAudioDeviceModule.Natives {
    private static JniTestInstanceHolder sOverride;

    public static JavaAudioDeviceModule.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new JavaAudioDeviceModuleJni() : (JavaAudioDeviceModule.Natives) obj;
    }

    public static void setInstanceForTesting(JavaAudioDeviceModule.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.Natives
    public long createAudioDeviceModule(Context context, AudioManager audioManager, WebRtcAudioRecord webRtcAudioRecord, WebRtcAudioTrack webRtcAudioTrack, long j, int i, int i2, boolean z, boolean z2) {
        return GEN_JNI.org_webrtc_audio_JavaAudioDeviceModule_createAudioDeviceModule(context, audioManager, webRtcAudioRecord, webRtcAudioTrack, j, i, i2, z, z2);
    }
}
