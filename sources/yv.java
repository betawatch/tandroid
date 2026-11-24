// default package

import android.graphics.Bitmap;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class yv {
    public long a;
    public Bitmap b;

    public static yv a(VideoPlayerHolderBase videoPlayerHolderBase, xv xvVar) {
        yv yvVar = new yv();
        yvVar.a = videoPlayerHolderBase.getCurrentPosition();
        if (videoPlayerHolderBase.firstFrameRendered) {
            TextureView textureView = xvVar.n;
            TextureView textureView2 = xvVar.n;
            if (textureView != null && textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(textureView2.getSurfaceTexture());
                    Bitmap createBitmap = Bitmap.createBitmap(textureView2.getMeasuredWidth(), textureView2.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    gl.x0(surface, createBitmap);
                    surface.release();
                    yvVar.b = createBitmap;
                    return yvVar;
                }
                yvVar.b = textureView2.getBitmap();
            }
        }
        return yvVar;
    }
}
