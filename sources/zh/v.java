package zh;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.internal.vision.t2;
import com.google.android.gms.internal.vision.x1;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import w7.z5;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b0 b;

    public /* synthetic */ v(b0 b0Var, int i10) {
        this.a = i10;
        this.b = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b0 b0Var = this.b;
                b0Var.g();
                b0Var.a.b(b0Var);
                break;
            case 1:
                b0 b0Var2 = this.b;
                r8.n nVar = b0Var2.i0;
                if (nVar != null) {
                    nVar.X0();
                    b0Var2.i0 = null;
                }
                Bitmap bitmap = b0Var2.k0;
                if (bitmap != null) {
                    bitmap.recycle();
                    b0Var2.k0 = null;
                }
                b0Var2.f0.quitSafely();
                break;
            case 2:
                b0 b0Var3 = this.b;
                try {
                    Context context = ApplicationLoader.applicationContext;
                    x1 x1Var = new x1();
                    x1Var.a = 256;
                    b0Var3.i0 = new r8.n(new t2(context, x1Var));
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                b0Var3.j0 = new a6.i(23);
                break;
            default:
                b0 b0Var4 = this.b;
                if (!b0Var4.V && !b0Var4.U && b0Var4.b == null && CameraView.isCameraAllowed()) {
                    CameraController.getInstance().initCamera(null);
                    CameraView cameraView = new CameraView(b0Var4.getContext(), false);
                    cameraView.setUseMaxPreview(true);
                    cameraView.setOptimizeForBarcode(true);
                    cameraView.setAlpha(0.0f);
                    cameraView.setDelegate(new org.telegram.ui.web.m(26, b0Var4, cameraView));
                    b0Var4.b = cameraView;
                    b0Var4.addView(cameraView, 0, z5.c(-1.0f, -1));
                    break;
                }
                break;
        }
    }
}
