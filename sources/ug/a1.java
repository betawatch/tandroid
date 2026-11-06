package ug;

import org.telegram.messenger.qp;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;

    public /* synthetic */ a1(f1 f1Var, int i7) {
        this.a = i7;
        this.b = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f1 f1Var = this.b;
                vf.c.t(f1Var.getContext(), "https://" + qp.s1(f1Var.Q1).U2 + "/nft/" + f1Var.v2.slug);
                break;
            case 1:
                f1 f1Var2 = this.b;
                try {
                    f1Var2.c.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                f1Var2.g2.c(f1Var2.C2);
                break;
            default:
                this.b.G2[0].setVisibility(8);
                break;
        }
    }
}
