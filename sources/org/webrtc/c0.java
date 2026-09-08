package org.webrtc;

import android.graphics.Matrix;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class c0 {
    public static VideoFrame.TextureBuffer a(VideoFrame.TextureBuffer textureBuffer, Matrix matrix, int i10, int i11) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public static int b(VideoFrame.TextureBuffer textureBuffer) {
        return textureBuffer.getHeight();
    }

    public static int c(VideoFrame.TextureBuffer textureBuffer) {
        return textureBuffer.getWidth();
    }
}
