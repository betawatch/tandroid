package org.webrtc.audio;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
