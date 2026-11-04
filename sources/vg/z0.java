package vg;

import org.telegram.messenger.hp;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h1 b;

    public /* synthetic */ z0(h1 h1Var, int i3) {
        this.a = i3;
        this.b = h1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h1 h1Var = this.b;
                sf.c.t(h1Var.getContext(), "https://" + hp.s1(h1Var.R1).V2 + "/nft/" + h1Var.w2.slug);
                break;
            case 1:
                h1 h1Var2 = this.b;
                try {
                    h1Var2.c.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                h1Var2.h2.c(h1Var2.D2);
                break;
            default:
                this.b.H2[0].setVisibility(8);
                break;
        }
    }
}
