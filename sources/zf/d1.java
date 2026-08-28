package zf;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k1 b;

    public /* synthetic */ d1(k1 k1Var, int i9) {
        this.a = i9;
        this.b = k1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k1 k1Var = this.b;
                ve.e.s(k1Var.getContext(), "https://" + MessagesController.getInstance(k1Var.U).linkPrefix + "/nft/" + k1Var.z0.slug);
                break;
            case 1:
                k1 k1Var2 = this.b;
                try {
                    k1Var2.container.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                k1Var2.k0.c(k1Var2.G0);
                break;
            default:
                this.b.K0[0].setVisibility(8);
                break;
        }
    }
}
