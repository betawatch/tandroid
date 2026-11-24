// default package

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.messenger.a;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class wx8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zx8 b;

    public /* synthetic */ wx8(zx8 zx8Var, byte b) {
        this.a = b;
        this.b = zx8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        zx8 zx8Var = this.b;
        switch (b) {
            case 0:
                zx8Var.g();
                zx8Var.a.p(zx8Var);
                break;
            case 1:
                yf0 yf0Var = zx8Var.j0;
                if (yf0Var != null) {
                    yf0Var.d();
                    zx8Var.j0 = null;
                }
                Bitmap bitmap = zx8Var.l0;
                if (bitmap != null) {
                    bitmap.recycle();
                    zx8Var.l0 = null;
                }
                zx8Var.g0.quitSafely();
                break;
            case 2:
                try {
                    Context context = a.b;
                    cue cueVar = new cue();
                    cueVar.a = 256;
                    zx8Var.j0 = new yf0(new ldd(context, cueVar));
                } catch (Throwable th) {
                    fc4.g(th, true);
                }
                zx8Var.k0 = new ai4((byte) 24);
                break;
            default:
                if (!zx8Var.W && !zx8Var.V && zx8Var.b == null && CameraView.isCameraAllowed()) {
                    CameraController.getInstance().initCamera(null);
                    CameraView cameraView = new CameraView(zx8Var.getContext(), false);
                    cameraView.setUseMaxPreview(true);
                    cameraView.setOptimizeForBarcode(true);
                    cameraView.setAlpha(0.0f);
                    cameraView.setDelegate(new xr8(zx8Var, cameraView, (byte) 3));
                    zx8Var.b = cameraView;
                    zx8Var.addView(cameraView, 0, qoe.c(-1.0f, -1));
                    break;
                }
                break;
        }
    }
}
