package org.webrtc.audio;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public interface AudioDeviceModule {
    long getNativeAudioDeviceModulePointer();

    void release();

    void setMicrophoneMute(boolean z10);

    boolean setNoiseSuppressorEnabled(boolean z10);

    boolean setPreferredMicrophoneFieldDimension(float f10);

    void setSpeakerMute(boolean z10);
}
