package org.webrtc.audio;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public interface AudioDeviceModule {
    long getNativeAudioDeviceModulePointer();

    void release();

    void setMicrophoneMute(boolean z9);

    boolean setNoiseSuppressorEnabled(boolean z9);

    boolean setPreferredMicrophoneFieldDimension(float f10);

    void setSpeakerMute(boolean z9);
}
