package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class w2 {
    public long a;
    public Bitmap b;

    public static w2 a(VideoPlayerHolderBase videoPlayerHolderBase, v2 v2Var) {
        w2 w2Var = new w2();
        w2Var.a = videoPlayerHolderBase.getCurrentPosition();
        if (videoPlayerHolderBase.firstFrameRendered) {
            TextureView textureView = v2Var.n;
            TextureView textureView2 = v2Var.n;
            if (textureView != null && textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(textureView2.getSurfaceTexture());
                    Bitmap createBitmap = Bitmap.createBitmap(textureView2.getMeasuredWidth(), textureView2.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    org.telegram.messenger.g0.y0(surface, createBitmap);
                    surface.release();
                    w2Var.b = createBitmap;
                    return w2Var;
                }
                w2Var.b = textureView2.getBitmap();
            }
        }
        return w2Var;
    }
}
