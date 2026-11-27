// default package

import android.graphics.Bitmap;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
