package org.webrtc.audio;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
@Deprecated
/* loaded from: classes4.dex */
public class LegacyAudioDeviceModule implements AudioDeviceModule {
    @Override // org.webrtc.audio.AudioDeviceModule
    public long getNativeAudioDeviceModulePointer() {
        return 0L;
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void setMicrophoneMute(boolean z4) {
        org.webrtc.voiceengine.WebRtcAudioRecord.setMicrophoneMute(z4);
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public final /* synthetic */ boolean setNoiseSuppressorEnabled(boolean z4) {
        return a.a(this, z4);
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public final /* synthetic */ boolean setPreferredMicrophoneFieldDimension(float f10) {
        return a.b(this, f10);
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void setSpeakerMute(boolean z4) {
        org.webrtc.voiceengine.WebRtcAudioTrack.setSpeakerMute(z4);
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void release() {
    }
}
