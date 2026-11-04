package ug;

import ai.v2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j2 b;

    public /* synthetic */ e2(j2 j2Var, int i3) {
        this.a = i3;
        this.b = j2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                org.telegram.messenger.g0.h3(new e2(this.b, 0));
                break;
            case 2:
                this.b.dismiss();
                break;
            default:
                j2 j2Var = this.b;
                v2 v2Var = j2Var.I;
                if (v2Var != null) {
                    v2Var.a(null);
                    j2Var.I = null;
                }
                j2Var.dismiss();
                break;
        }
    }
}
