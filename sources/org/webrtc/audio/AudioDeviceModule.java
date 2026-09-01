package org.webrtc.audio;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public interface AudioDeviceModule {
    long getNativeAudioDeviceModulePointer();

    void release();

    void setMicrophoneMute(boolean z4);

    boolean setNoiseSuppressorEnabled(boolean z4);

    boolean setPreferredMicrophoneFieldDimension(float f10);

    void setSpeakerMute(boolean z4);
}
