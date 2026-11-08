package org.webrtc.audio;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
@Deprecated
/* loaded from: classes4.dex */
public class LegacyAudioDeviceModule implements AudioDeviceModule {
    @Override // org.webrtc.audio.AudioDeviceModule
    public long getNativeAudioDeviceModulePointer() {
        return 0L;
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void setMicrophoneMute(boolean z9) {
        org.webrtc.voiceengine.WebRtcAudioRecord.setMicrophoneMute(z9);
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public final /* synthetic */ boolean setNoiseSuppressorEnabled(boolean z9) {
        return a.a(this, z9);
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public final /* synthetic */ boolean setPreferredMicrophoneFieldDimension(float f10) {
        return a.b(this, f10);
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void setSpeakerMute(boolean z9) {
        org.webrtc.voiceengine.WebRtcAudioTrack.setSpeakerMute(z9);
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void release() {
    }
}
