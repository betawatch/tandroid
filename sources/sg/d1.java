package sg;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l1 b;

    public /* synthetic */ d1(l1 l1Var, int i10) {
        this.a = i10;
        this.b = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l1 l1Var = this.b;
                pf.d.r(l1Var.getContext(), "https://" + MessagesController.getInstance(l1Var.Y).linkPrefix + "/nft/" + l1Var.D0.slug);
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
