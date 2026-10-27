package org.webrtc;

import android.graphics.Matrix;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
