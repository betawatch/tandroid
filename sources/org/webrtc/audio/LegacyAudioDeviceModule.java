package org.webrtc.audio;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
