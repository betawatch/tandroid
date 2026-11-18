package org.webrtc;

import android.content.Context;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public interface VideoCapturer {
    void changeCaptureFormat(int i7, int i10, int i11);

    void dispose();

    void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver);

    boolean isScreencast();

    void startCapture(int i7, int i10, int i11);

    void stopCapture();
}
