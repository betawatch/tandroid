// default package

import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class zx0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ my0 b;

    public /* synthetic */ zx0(my0 my0Var, byte b) {
        this.a = b;
        this.b = my0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        my0 my0Var = this.b;
        switch (b) {
            case 0:
                dy0 dy0Var = my0Var.c;
                gm.B2(dy0Var);
                my0Var.i1.getLayoutContainer().addView(dy0Var);
                break;
            case 1:
                my0Var.dismiss();
                break;
            case 2:
                try {
                    my0Var.H();
                    break;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 3:
                my0Var.dismiss();
                d S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                    break;
                }
                break;
            case 4:
                my0Var.dismiss();
                nm7.f(z8c.t0).k(nm7.V2, new Object[0]);
                gm.d3(new bo6((byte) 15), 220L);
                break;
            default:
                my0Var.c0 = true;
                my0Var.d0 = true;
                break;
        }
    }
}
