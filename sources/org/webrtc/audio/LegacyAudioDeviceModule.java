package org.webrtc.audio;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
@Deprecated
/* loaded from: classes3.dex */
public class LegacyAudioDeviceModule implements AudioDeviceModule {
    @Override // org.webrtc.audio.AudioDeviceModule
    public long getNativeAudioDeviceModulePointer() {
        return 0L;
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void setMicrophoneMute(boolean z) {
        org.webrtc.voiceengine.WebRtcAudioRecord.setMicrophoneMute(z);
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public final boolean setNoiseSuppressorEnabled(boolean z) {
        return false;
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public final boolean setPreferredMicrophoneFieldDimension(float f) {
        return false;
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void setSpeakerMute(boolean z) {
        org.webrtc.voiceengine.WebRtcAudioTrack.setSpeakerMute(z);
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void release() {
    }
}
