package tg;

import hi.c7;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class k2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o2 b;

    public /* synthetic */ k2(o2 o2Var, int i7) {
        this.a = i7;
        this.b = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                org.telegram.messenger.g0.g3(new k2(this.b, 0));
                break;
            case 2:
                this.b.dismiss();
                break;
            default:
                o2 o2Var = this.b;
                c7 c7Var = o2Var.I;
                if (c7Var != null) {
                    c7Var.a(null);
                    o2Var.I = null;
                }
                o2Var.dismiss();
                break;
        }
    }
}
