package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ze0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ af0 b;

    public /* synthetic */ ze0(af0 af0Var, int i10) {
        this.a = i10;
        this.b = af0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                af0 af0Var = this.b;
                bf0 bf0Var = af0Var.d;
                if (af0Var.b) {
                    boolean z10 = bf0Var.K;
                    org.telegram.ui.Components.ij0 ij0Var = bf0Var.J;
                    id idVar = bf0Var.n;
                    if (z10 && System.currentTimeMillis() - af0Var.a >= 10000) {
                        idVar.setAnimation(ij0Var);
                        ij0Var.N(0, false, false);
                        ij0Var.t0 = new ze0(af0Var, 1);
                        idVar.d();
                        af0Var.a = System.currentTimeMillis();
                    }
                    idVar.postDelayed(af0Var.c, 1000L);
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ze0(this.b, 2));
                break;
            default:
                bf0 bf0Var2 = this.b.d;
                org.telegram.ui.Components.ij0 ij0Var2 = bf0Var2.I;
                ij0Var2.N(0, false, false);
                bf0Var2.n.setAnimation(ij0Var2);
                break;
        }
    }
}
