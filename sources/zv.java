// default package

import android.graphics.Bitmap;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class zv {
    public long a;
    public Bitmap b;

    public static zv a(VideoPlayerHolderBase videoPlayerHolderBase, yv yvVar) {
        zv zvVar = new zv();
        zvVar.a = videoPlayerHolderBase.getCurrentPosition();
        if (videoPlayerHolderBase.firstFrameRendered) {
            TextureView textureView = yvVar.n;
            TextureView textureView2 = yvVar.n;
            if (textureView != null && textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(textureView2.getSurfaceTexture());
                    Bitmap createBitmap = Bitmap.createBitmap(textureView2.getMeasuredWidth(), textureView2.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    hl.x0(surface, createBitmap);
                    surface.release();
                    zvVar.b = createBitmap;
                    return zvVar;
                }
                zvVar.b = textureView2.getBitmap();
            }
        }
        return zvVar;
    }
}
