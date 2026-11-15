package ug;

import org.telegram.messenger.np;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class b1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g1 b;

    public /* synthetic */ b1(g1 g1Var, int i7) {
        this.a = i7;
        this.b = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g1 g1Var = this.b;
                vf.c.t(g1Var.getContext(), "https://" + np.s1(g1Var.U1).V2 + "/nft/" + g1Var.z2.slug);
                break;
            case 1:
                g1 g1Var2 = this.b;
                try {
                    g1Var2.c.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                g1Var2.k2.c(g1Var2.G2);
                break;
            default:
                this.b.K2[0].setVisibility(8);
                break;
        }
    }
}
