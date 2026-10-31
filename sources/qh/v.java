package qh;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.internal.vision.t2;
import com.google.android.gms.internal.vision.x1;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.f8;
import vh.w3;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y b;

    public /* synthetic */ v(y yVar, int i10) {
        this.a = i10;
        this.b = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y yVar = this.b;
                yVar.g();
                yVar.a.s(yVar);
                break;
            case 1:
                y yVar2 = this.b;
                r8.n nVar = yVar2.i0;
                if (nVar != null) {
                    nVar.X0();
                    yVar2.i0 = null;
                }
                Bitmap bitmap = yVar2.k0;
                if (bitmap != null) {
                    bitmap.recycle();
                    yVar2.k0 = null;
                }
                yVar2.f0.quitSafely();
                break;
            case 2:
                y yVar3 = this.b;
                try {
                    Context context = org.telegram.messenger.w0.b;
                    x1 x1Var = new x1();
                    x1Var.a = 256;
                    yVar3.i0 = new r8.n(new t2(context, x1Var));
                } catch (Throwable th2) {
                    f8.g(th2, true);
                }
                yVar3.j0 = new w3();
                break;
            default:
                y yVar4 = this.b;
                if (!yVar4.V && !yVar4.U && yVar4.b == null && CameraView.isCameraAllowed()) {
                    CameraController.getInstance().initCamera(null);
                    CameraView cameraView = new CameraView(yVar4.getContext(), false);
                    cameraView.setUseMaxPreview(true);
                    cameraView.setOptimizeForBarcode(true);
                    cameraView.setAlpha(0.0f);
                    cameraView.setDelegate(new org.telegram.ui.web.k0(7, yVar4, cameraView));
                    yVar4.b = cameraView;
                    yVar4.addView(cameraView, 0, b6.c(-1.0f, -1));
                    break;
                }
                break;
        }
    }
}
