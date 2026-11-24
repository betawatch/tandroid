// default package

import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class rw0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fx0 b;

    public /* synthetic */ rw0(fx0 fx0Var, byte b) {
        this.a = b;
        this.b = fx0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        fx0 fx0Var = this.b;
        switch (b) {
            case 0:
                ww0 ww0Var = fx0Var.c;
                gl.B2(ww0Var);
                fx0Var.i1.getLayoutContainer().addView(ww0Var);
                break;
            case 1:
                fx0Var.dismiss();
                break;
            case 2:
                try {
                    fx0Var.I();
                    break;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 3:
                fx0Var.dismiss();
                d S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                    break;
                }
                break;
            case 4:
                fx0Var.dismiss();
                kk7.f(y6c.t0).k(kk7.U2, new Object[0]);
                gl.d3(new am6((byte) 15), 220L);
                break;
            default:
                fx0Var.c0 = true;
                fx0Var.d0 = true;
                break;
        }
    }
}
