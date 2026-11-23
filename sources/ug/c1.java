package ug;

import org.telegram.messenger.mp;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h1 b;

    public /* synthetic */ c1(h1 h1Var, int i7) {
        this.a = i7;
        this.b = h1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h1 h1Var = this.b;
                vf.c.t(h1Var.getContext(), "https://" + mp.u1(h1Var.U1).X2 + "/nft/" + h1Var.z2.slug);
                break;
            case 1:
                h1 h1Var2 = this.b;
                try {
                    h1Var2.c.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                h1Var2.k2.c(h1Var2.G2);
                break;
            default:
                this.b.K2[0].setVisibility(8);
                break;
        }
    }
}
