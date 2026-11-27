package org.webrtc;

import org.webrtc.NativeLifecycleLock;
import org.webrtc.VideoDecoderWrapper;
import org.webrtc.VideoEncoderWrapper;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
