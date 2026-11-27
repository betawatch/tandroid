package org.webrtc;

import org.webrtc.NativeLifecycleLock;
import org.webrtc.VideoDecoderWrapper;
import org.webrtc.VideoEncoderWrapper;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements NativeLifecycleLock.NativeDisposer {
    public final /* synthetic */ byte a;

    public /* synthetic */ g(byte b) {
        this.a = b;
    }

    @Override // org.webrtc.NativeLifecycleLock.NativeDisposer
    public final void dispose(long j) {
        switch (this.a) {
            case 0:
                VideoDecoderWrapper.NativeDecoderCallback.lambda$invalidate$1(j);
                break;
            default:
                VideoEncoderWrapper.NativeEncoderCallback.lambda$invalidate$1(j);
                break;
        }
    }
}
