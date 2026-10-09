package rg;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l1 b;

    public /* synthetic */ e1(l1 l1Var, int i10) {
        this.a = i10;
        this.b = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l1 l1Var = this.b;
                of.f.s(l1Var.getContext(), "https://" + MessagesController.getInstance(l1Var.Y).linkPrefix + "/nft/" + l1Var.D0.slug);
                break;
            case 1:
                l1 l1Var2 = this.b;
                try {
                    l1Var2.container.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                l1Var2.o0.c(l1Var2.K0);
                break;
            default:
                this.b.O0[0].setVisibility(8);
                break;
        }
    }
}
