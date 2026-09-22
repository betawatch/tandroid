package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class x2 {
    public long a;
    public Bitmap b;

    public static x2 a(VideoPlayerHolderBase videoPlayerHolderBase, w2 w2Var) {
        x2 x2Var = new x2();
        x2Var.a = videoPlayerHolderBase.getCurrentPosition();
        if (videoPlayerHolderBase.firstFrameRendered) {
            TextureView textureView = w2Var.n;
            TextureView textureView2 = w2Var.n;
            if (textureView != null && textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(textureView2.getSurfaceTexture());
                    Bitmap createBitmap = Bitmap.createBitmap(textureView2.getMeasuredWidth(), textureView2.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                    surface.release();
                    x2Var.b = createBitmap;
                    return x2Var;
                }
                x2Var.b = textureView2.getBitmap();
            }
        }
        return x2Var;
    }
}
