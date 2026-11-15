package tg;

import hi.g7;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class g2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l2 b;

    public /* synthetic */ g2(l2 l2Var, int i7) {
        this.a = i7;
        this.b = l2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                org.telegram.messenger.g0.h3(new g2(this.b, 0));
                break;
            case 2:
                this.b.dismiss();
                break;
            default:
                l2 l2Var = this.b;
                g7 g7Var = l2Var.I;
                if (g7Var != null) {
                    g7Var.a(null);
                    l2Var.I = null;
                }
                l2Var.dismiss();
                break;
        }
    }
}
