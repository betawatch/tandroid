package org.webrtc.audio;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public interface AudioDeviceModule {
    long getNativeAudioDeviceModulePointer();

    void release();

    void setMicrophoneMute(boolean z10);

    boolean setNoiseSuppressorEnabled(boolean z10);

    boolean setPreferredMicrophoneFieldDimension(float f7);

    void setSpeakerMute(boolean z10);
}
