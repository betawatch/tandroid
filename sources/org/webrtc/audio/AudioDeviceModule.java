package org.webrtc.audio;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public interface AudioDeviceModule {
    long getNativeAudioDeviceModulePointer();

    void release();

    void setMicrophoneMute(boolean z);

    boolean setNoiseSuppressorEnabled(boolean z);

    boolean setPreferredMicrophoneFieldDimension(float f);

    void setSpeakerMute(boolean z);
}
