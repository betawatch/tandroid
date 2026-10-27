package org.webrtc;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public interface SdpObserver {
    void onCreateFailure(String str);

    void onCreateSuccess(SessionDescription sessionDescription);

    void onSetFailure(String str);

    void onSetSuccess();
}
