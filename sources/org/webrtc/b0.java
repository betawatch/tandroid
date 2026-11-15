package org.webrtc;

import android.graphics.Matrix;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class b0 {
    public static VideoFrame.TextureBuffer a(VideoFrame.TextureBuffer textureBuffer, Matrix matrix, int i7, int i10) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public static int b(VideoFrame.TextureBuffer textureBuffer) {
        return textureBuffer.getHeight();
    }

    public static int c(VideoFrame.TextureBuffer textureBuffer) {
        return textureBuffer.getWidth();
    }
}
