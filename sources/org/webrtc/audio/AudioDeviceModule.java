package org.webrtc.audio;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public interface AudioDeviceModule {
    long getNativeAudioDeviceModulePointer();

    void release();

    void setMicrophoneMute(boolean z9);

    boolean setNoiseSuppressorEnabled(boolean z9);

    boolean setPreferredMicrophoneFieldDimension(float f10);

    void setSpeakerMute(boolean z9);
}
