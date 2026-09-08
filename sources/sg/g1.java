package sg;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
