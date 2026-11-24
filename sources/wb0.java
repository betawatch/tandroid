// default package

import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class wb0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mc0 b;

    public /* synthetic */ wb0(mc0 mc0Var, byte b) {
        this.a = b;
        this.b = mc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        mc0 mc0Var = this.b;
        switch (b) {
            case 0:
                if (!mc0Var.V) {
                    if (mc0Var.O <= 0.0f) {
                        mc0Var.l0(!mc0Var.a.w, true, false);
                        break;
                    } else {
                        if (mc0Var.N != null) {
                            mc0Var.F = 1.0f;
                            mc0Var.G = true;
                        }
                        gm.t1(mc0Var.fragmentView);
                        break;
                    }
                }
                break;
            default:
                mc0Var.getClass();
                mc0Var.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                break;
        }
    }
}
