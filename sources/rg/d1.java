package rg;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k1 b;

    public /* synthetic */ d1(k1 k1Var, int i10) {
        this.a = i10;
        this.b = k1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k1 k1Var = this.b;
                nf.f.s(k1Var.getContext(), "https://" + MessagesController.getInstance(k1Var.Y).linkPrefix + "/nft/" + k1Var.D0.slug);
                break;
            case 1:
                k1 k1Var2 = this.b;
                try {
                    k1Var2.container.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                k1Var2.o0.c(k1Var2.K0);
                break;
            default:
                this.b.O0[0].setVisibility(8);
                break;
        }
    }
}
