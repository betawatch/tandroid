// default package

import android.view.WindowManager;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a;
import org.telegram.ui.o;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ys implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o b;

    public /* synthetic */ ys(o oVar, byte b) {
        this.a = b;
        this.b = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 10;
        o oVar = this.b;
        switch (b) {
            case 0:
                float currentProgress = 0.7f - oVar.i0.e0.getCurrentProgress();
                if (currentProgress > 0.0f) {
                    float f = currentProgress < 0.25f ? 0.01f : 0.02f;
                    n46 n46Var = oVar.i0.e0;
                    n46Var.a(true, n46Var.getCurrentProgress() + f);
                    hl.d3(oVar.k0, 100L);
                    break;
                }
                break;
            case 1:
                hl.c3(new ys(oVar, b2));
                break;
            case 2:
                oVar.L.a(true);
                break;
            case 3:
                oVar.L.a(true);
                break;
            case 4:
                hl.c3(new ys(oVar, b2));
                break;
            case 5:
                oVar.a0();
                break;
            case 6:
                a aVar = oVar.h0;
                if (aVar != null) {
                    aVar.setLayerType(0, null);
                    oVar.a0 = (byte) 0;
                    oVar.K();
                    break;
                }
                break;
            case 7:
                oVar.f0();
                break;
            case 8:
                e S = LaunchActivity.S();
                if (S != null) {
                    bg0 bg0Var = new bg0();
                    bg0Var.a = true;
                    S.showAsSheet(new ixc(new vs(oVar, (byte) 3)), bg0Var);
                    break;
                }
                break;
            case 9:
                a aVar2 = oVar.h0;
                if (aVar2 != null && oVar.g0 != null) {
                    aVar2.setLayerType(0, null);
                    oVar.a0 = (byte) 0;
                    hl.t1(oVar.M.getCurrentFocus());
                    break;
                }
                break;
            case 10:
                oVar.d0();
                break;
            default:
                try {
                    if (oVar.g0.getParent() != null) {
                        ((WindowManager) oVar.M.getSystemService("window")).removeView(oVar.g0);
                        break;
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
                break;
        }
    }
}
