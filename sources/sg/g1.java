package sg;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class g1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o1 b;

    public /* synthetic */ g1(o1 o1Var, int i10) {
        this.a = i10;
        this.b = o1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o1 o1Var = this.b;
                of.f.s(o1Var.getContext(), "https://" + MessagesController.getInstance(o1Var.Y).linkPrefix + "/nft/" + o1Var.D0.slug);
                break;
            case 1:
                o1 o1Var2 = this.b;
                try {
                    o1Var2.container.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                o1Var2.o0.c(o1Var2.K0);
                break;
            default:
                this.b.O0[0].setVisibility(8);
                break;
        }
    }
}
