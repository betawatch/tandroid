package tg;

import hi.t6;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class g2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k2 b;

    public /* synthetic */ g2(k2 k2Var, int i7) {
        this.a = i7;
        this.b = k2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                org.telegram.messenger.g0.g3(new g2(this.b, 0));
                break;
            case 2:
                this.b.dismiss();
                break;
            default:
                k2 k2Var = this.b;
                t6 t6Var = k2Var.I;
                if (t6Var != null) {
                    t6Var.a(null);
                    k2Var.I = null;
                }
                k2Var.dismiss();
                break;
        }
    }
}
