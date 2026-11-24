// default package

import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class xg3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ih3 b;

    public /* synthetic */ xg3(ih3 ih3Var, byte b) {
        this.a = b;
        this.b = ih3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ih3 ih3Var = this.b;
        switch (b) {
            case 0:
                ih3Var.p(true, false);
                break;
            case 1:
                hg5 hg5Var = ih3Var.K;
                if (hg5Var != null) {
                    hg5Var.f(true);
                }
                ih3Var.f0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                break;
            default:
                ih3Var.c();
                break;
        }
    }
}
