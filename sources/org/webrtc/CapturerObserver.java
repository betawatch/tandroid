package org.webrtc;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public interface CapturerObserver {
    void onCapturerStarted(boolean z10);

    void onCapturerStopped();

    void onFrameCaptured(VideoFrame videoFrame);
}
