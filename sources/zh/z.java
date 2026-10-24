package zh;

import android.graphics.Bitmap;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class z implements Runnable {
    public final /* synthetic */ b0 a;

    public z(b0 b0Var) {
        this.a = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.a;
        CameraView cameraView = b0Var.b;
        if (!b0Var.h0 || cameraView == null) {
            return;
        }
        TextureView textureView = cameraView.getTextureView();
        int width = textureView.getWidth();
        int height = textureView.getHeight();
        if (width > 0 && height > 0) {
            if (width > 720 || height > 720) {
                float f7 = width;
                float f10 = height;
                float min = Math.min(720.0f / f7, 720.0f / f10);
                width = Math.max(1, (int) (f7 * min));
                height = Math.max(1, (int) (f10 * min));
            }
            Bitmap bitmap = this.a.k0;
            if (bitmap == null || bitmap.getWidth() != width || this.a.k0.getHeight() != height) {
                this.a.k0 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            }
            try {
                textureView.getBitmap(this.a.k0);
                b0 b0Var2 = this.a;
                z4.b f11 = b0.f(b0Var2.k0, b0Var2.i0, b0Var2.j0, b0Var2.O);
                if (f11 != null) {
                    AndroidUtilities.runOnUIThread(new u2.k0(26, this, f11));
                    return;
                }
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        if (this.a.h0) {
            this.a.g0.postDelayed(this, 150L);
        }
    }
}
