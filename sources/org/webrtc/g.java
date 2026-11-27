package org.webrtc;

import org.webrtc.NativeLifecycleLock;
import org.webrtc.VideoDecoderWrapper;
import org.webrtc.VideoEncoderWrapper;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
