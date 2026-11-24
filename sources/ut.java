// default package

import android.view.WindowManager;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ut implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o b;

    public /* synthetic */ ut(o oVar, byte b) {
        this.a = b;
        this.b = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 0;
        o oVar = this.b;
        switch (b) {
            case 0:
                oVar.d0();
                break;
            case 1:
                float currentProgress = 0.7f - oVar.i0.e0.getCurrentProgress();
                if (currentProgress > 0.0f) {
                    float f = currentProgress < 0.25f ? 0.01f : 0.02f;
                    k46 k46Var = oVar.i0.e0;
                    k46Var.a(true, k46Var.getCurrentProgress() + f);
                    gm.d3(oVar.k0, 100L);
                    break;
                }
                break;
            case 2:
                gm.c3(new ut(oVar, b2));
                break;
            case 3:
                gm.c3(new ut(oVar, b2));
                break;
            case 4:
                oVar.L.a(true);
                break;
            case 5:
                oVar.L.a(true);
                break;
            case 6:
                try {
                    if (oVar.g0.getParent() != null) {
                        ((WindowManager) oVar.M.getSystemService("window")).removeView(oVar.g0);
                        break;
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
                break;
            case 7:
                oVar.a0();
                break;
            case 8:
                oVar.f0();
                break;
            case 9:
                a aVar = oVar.h0;
                if (aVar != null) {
                    aVar.setLayerType(0, null);
                    oVar.a0 = (byte) 0;
                    oVar.K();
                    break;
                }
                break;
            case 10:
                d S = LaunchActivity.S();
                if (S != null) {
                    bh0 bh0Var = new bh0();
                    bh0Var.a = true;
                    S.showAsSheet(new uuc(new xt(oVar, (byte) 3)), bh0Var);
                    break;
                }
                break;
            default:
                a aVar2 = oVar.h0;
                if (aVar2 != null && oVar.g0 != null) {
                    aVar2.setLayerType(0, null);
                    oVar.a0 = (byte) 0;
                    gm.t1(oVar.M.getCurrentFocus());
                    break;
                }
                break;
        }
    }
}
