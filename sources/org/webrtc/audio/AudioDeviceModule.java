package org.webrtc.audio;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public interface AudioDeviceModule {
    long getNativeAudioDeviceModulePointer();

    void release();

    void setMicrophoneMute(boolean z10);

    boolean setNoiseSuppressorEnabled(boolean z10);

    boolean setPreferredMicrophoneFieldDimension(float f10);

    void setSpeakerMute(boolean z10);
}
