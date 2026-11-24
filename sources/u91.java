// default package

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.a;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class u91 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ da1 b;

    public /* synthetic */ u91(da1 da1Var, byte b) {
        this.a = b;
        this.b = da1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 1;
        byte b3 = 0;
        da1 da1Var = this.b;
        switch (b) {
            case 0:
                if (!da1Var.isFinishing()) {
                    da1Var.S = null;
                    da1Var.O = false;
                    da1Var.e0.run();
                    if (!da1Var.O) {
                        gl.e3(new u91(da1Var, (byte) 8), 500L);
                        break;
                    }
                }
                break;
            case 1:
                CameraView cameraView = da1Var.d;
                if (cameraView != null) {
                    da1Var.g0(cameraView.getTextureView().getBitmap());
                    break;
                }
                break;
            case 2:
                da1Var.finishFragment();
                break;
            case 3:
                ca1 ca1Var = da1Var.N;
                if (ca1Var != null) {
                    ca1Var.G(da1Var.S);
                }
                da1Var.finishFragment();
                break;
            case 4:
                da1Var.c0();
                break;
            case 5:
                da1Var.V = new ln8((byte) 1);
                Context context = a.b;
                zre zreVar = new zre();
                zreVar.a = 256;
                da1Var.W = new ye0(new jbd(context, zreVar));
                break;
            case 6:
                if (da1Var.h.getTag() != null) {
                    da1Var.h.setTag(null);
                    da1Var.h.animate().setDuration(200L).alpha(0.0f).setInterpolator(s33.f).start();
                    break;
                }
                break;
            case 7:
                CameraView cameraView2 = da1Var.d;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(da1Var.d.getCameraSession());
                }
                gl.d3(new u91(da1Var, (byte) 3));
                break;
            default:
                float f = da1Var.Z;
                float f2 = da1Var.O ? 1.0f : 0.0f;
                da1Var.a0 = f2;
                if (f != f2) {
                    ValueAnimator valueAnimator = da1Var.Y;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(da1Var.Z, da1Var.a0);
                    da1Var.Y = ofFloat;
                    ofFloat.addUpdateListener(new w91(da1Var, b3));
                    da1Var.Y.setDuration((long) (Math.abs(da1Var.Z - da1Var.a0) * 300.0f));
                    da1Var.Y.setInterpolator(s33.f);
                    da1Var.Y.start();
                    yla ylaVar = da1Var.b0;
                    if (ylaVar != null) {
                        ylaVar.d();
                    }
                    boolean z = da1Var.O;
                    float f3 = da1Var.c0;
                    if (!z) {
                        f3 = 1.0f - f3;
                    }
                    yla ylaVar2 = new yla(new ti4(f3 * 500.0f));
                    da1Var.b0 = ylaVar2;
                    ylaVar2.b(new v91(da1Var, b2));
                    da1Var.b0.m = new zla(500.0f);
                    da1Var.b0.m.a(1.0f);
                    da1Var.b0.m.b(500.0f);
                    da1Var.b0.h();
                    break;
                }
                break;
        }
    }
}
