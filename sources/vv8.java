// default package

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.messenger.a;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vv8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yv8 b;

    public /* synthetic */ vv8(yv8 yv8Var, byte b) {
        this.a = b;
        this.b = yv8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        yv8 yv8Var = this.b;
        switch (b) {
            case 0:
                yv8Var.g();
                yv8Var.a.H(yv8Var);
                break;
            case 1:
                ye0 ye0Var = yv8Var.j0;
                if (ye0Var != null) {
                    ye0Var.d();
                    yv8Var.j0 = null;
                }
                Bitmap bitmap = yv8Var.l0;
                if (bitmap != null) {
                    bitmap.recycle();
                    yv8Var.l0 = null;
                }
                yv8Var.g0.quitSafely();
                break;
            case 2:
                try {
                    Context context = a.b;
                    zre zreVar = new zre();
                    zreVar.a = 256;
                    yv8Var.j0 = new ye0(new jbd(context, zreVar));
                } catch (Throwable th) {
                    fa4.g(th, true);
                }
                yv8Var.k0 = new ln8((byte) 1);
                break;
            default:
                if (!yv8Var.W && !yv8Var.V && yv8Var.b == null && CameraView.isCameraAllowed()) {
                    CameraController.getInstance().initCamera(null);
                    CameraView cameraView = new CameraView(yv8Var.getContext(), false);
                    cameraView.setUseMaxPreview(true);
                    cameraView.setOptimizeForBarcode(true);
                    cameraView.setAlpha(0.0f);
                    cameraView.setDelegate(new kq8(yv8Var, cameraView, (byte) 2));
                    yv8Var.b = cameraView;
                    yv8Var.addView(cameraView, 0, nme.c(-1.0f, -1));
                    break;
                }
                break;
        }
    }
}
