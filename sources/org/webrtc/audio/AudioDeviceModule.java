package org.webrtc.audio;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public interface AudioDeviceModule {
    long getNativeAudioDeviceModulePointer();

    void release();

    void setMicrophoneMute(boolean z4);

    boolean setNoiseSuppressorEnabled(boolean z4);

    boolean setPreferredMicrophoneFieldDimension(float f10);

    void setSpeakerMute(boolean z4);
}
