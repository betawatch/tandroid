package org.webrtc.audio;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
    public final /* synthetic */ boolean setPreferredMicrophoneFieldDimension(float f7) {
        return a.b(this, f7);
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void setSpeakerMute(boolean z10) {
        org.webrtc.voiceengine.WebRtcAudioTrack.setSpeakerMute(z10);
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void release() {
    }
}
