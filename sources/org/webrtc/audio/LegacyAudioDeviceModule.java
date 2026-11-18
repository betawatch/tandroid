package org.webrtc.audio;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
@Deprecated
/* loaded from: classes4.dex */
public class LegacyAudioDeviceModule implements AudioDeviceModule {
    @Override // org.webrtc.audio.AudioDeviceModule
    public long getNativeAudioDeviceModulePointer() {
        return 0L;
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void setMicrophoneMute(boolean z10) {
        org.webrtc.voiceengine.WebRtcAudioRecord.setMicrophoneMute(z10);
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public final /* synthetic */ boolean setNoiseSuppressorEnabled(boolean z10) {
        return a.a(this, z10);
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public final /* synthetic */ boolean setPreferredMicrophoneFieldDimension(float f10) {
        return a.b(this, f10);
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void setSpeakerMute(boolean z10) {
        org.webrtc.voiceengine.WebRtcAudioTrack.setSpeakerMute(z10);
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void release() {
    }
}
