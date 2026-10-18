package zh;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import com.google.android.gms.internal.vision.t2;
import com.google.android.gms.internal.vision.x1;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import w7.z5;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w b;

    public /* synthetic */ v(w wVar, int i10) {
        this.a = i10;
        this.b = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w wVar = this.b;
                wVar.f();
                f0 f0Var = (f0) wVar.a.b;
                FrameLayout frameLayout = f0Var.f;
                if (frameLayout != null) {
                    frameLayout.removeView(wVar);
                }
                if (f0Var.E == wVar) {
                    f0Var.E = null;
                }
                t0 t0Var = f0Var.d;
                if (t0Var != null) {
                    t0Var.setScanHidden(false);
                    break;
                }
                break;
            case 1:
                w wVar2 = this.b;
                r8.n nVar = wVar2.c0;
                if (nVar != null) {
                    nVar.X0();
                    wVar2.c0 = null;
                }
                Bitmap bitmap = wVar2.e0;
                if (bitmap != null) {
                    bitmap.recycle();
                    wVar2.e0 = null;
                }
                wVar2.W.quitSafely();
                break;
            case 2:
                w wVar3 = this.b;
                try {
                    Context context = ApplicationLoader.applicationContext;
                    x1 x1Var = new x1();
                    x1Var.a = 256;
                    wVar3.c0 = new r8.n(new t2(context, x1Var));
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                wVar3.d0 = new a6.i(23);
                break;
            default:
                w wVar4 = this.b;
                if (!wVar4.Q && !wVar4.P && wVar4.b == null && CameraView.isCameraAllowed()) {
                    CameraController.getInstance().initCamera(null);
                    CameraView cameraView = new CameraView(wVar4.getContext(), false);
                    cameraView.setUseMaxPreview(true);
                    cameraView.setOptimizeForBarcode(true);
                    cameraView.setAlpha(0.0f);
                    cameraView.setDelegate(new org.telegram.ui.web.m(26, wVar4, cameraView));
                    wVar4.b = cameraView;
                    wVar4.addView(cameraView, 0, z5.d(-1.0f, -1));
                    break;
                }
                break;
        }
    }
}
