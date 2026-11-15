package tg;

import hi.g7;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class h2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m2 b;

    public /* synthetic */ h2(m2 m2Var, int i7) {
        this.a = i7;
        this.b = m2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                org.telegram.messenger.g0.h3(new h2(this.b, 0));
                break;
            case 2:
                this.b.dismiss();
                break;
            default:
                m2 m2Var = this.b;
                g7 g7Var = m2Var.I;
                if (g7Var != null) {
                    g7Var.a(null);
                    m2Var.I = null;
                }
                m2Var.dismiss();
                break;
        }
    }
}
