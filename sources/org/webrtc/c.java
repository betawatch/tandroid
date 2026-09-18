package org.webrtc;

import android.content.Context;
import android.graphics.Matrix;
import android.view.WindowManager;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class c {
    public static VideoFrame.TextureBuffer a(TextureBufferImpl textureBufferImpl, boolean z10, int i10) {
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        if (z10) {
            matrix.preScale(-1.0f, 1.0f);
        }
        matrix.preRotate(i10);
        matrix.preTranslate(-0.5f, -0.5f);
        return textureBufferImpl.applyTransformMatrix(matrix, textureBufferImpl.getWidth(), textureBufferImpl.getHeight());
    }

    public static int b(Context context) {
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }
}
