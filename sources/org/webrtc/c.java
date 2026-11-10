package org.webrtc;

import android.content.Context;
import android.graphics.Matrix;
import android.view.WindowManager;
import org.telegram.messenger.qs;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class c {
    public static VideoFrame.TextureBuffer a(TextureBufferImpl textureBufferImpl, boolean z9, int i7) {
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        if (z9) {
            matrix.preScale(-1.0f, 1.0f);
        }
        matrix.preRotate(i7);
        matrix.preTranslate(-0.5f, -0.5f);
        return textureBufferImpl.applyTransformMatrix(matrix, textureBufferImpl.getWidth(), textureBufferImpl.getHeight());
    }

    public static int b(Context context) {
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return 90;
        }
        if (rotation == 2) {
            return qs.K2;
        }
        if (rotation != 3) {
            return 0;
        }
        return qs.t4;
    }
}
