package ug;

import org.telegram.messenger.mp;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class d1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i1 b;

    public /* synthetic */ d1(i1 i1Var, int i7) {
        this.a = i7;
        this.b = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i1 i1Var = this.b;
                vf.c.t(i1Var.getContext(), "https://" + mp.u1(i1Var.U1).X2 + "/nft/" + i1Var.z2.slug);
                break;
            case 1:
                i1 i1Var2 = this.b;
                try {
                    i1Var2.c.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                i1Var2.k2.c(i1Var2.G2);
                break;
            default:
                this.b.K2[0].setVisibility(8);
                break;
        }
    }
}
