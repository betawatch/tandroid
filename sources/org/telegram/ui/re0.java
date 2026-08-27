package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class re0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ se0 b;

    public /* synthetic */ re0(se0 se0Var, int i10) {
        this.a = i10;
        this.b = se0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                se0 se0Var = this.b;
                te0 te0Var = se0Var.d;
                if (se0Var.b) {
                    boolean z10 = te0Var.G;
                    org.telegram.ui.Components.oi0 oi0Var = te0Var.F;
                    fd fdVar = te0Var.n;
                    if (z10 && System.currentTimeMillis() - se0Var.a >= 10000) {
                        fdVar.setAnimation(oi0Var);
                        oi0Var.L(0, false, false);
                        oi0Var.q0 = new re0(se0Var, 1);
                        fdVar.d();
                        se0Var.a = System.currentTimeMillis();
                    }
                    fdVar.postDelayed(se0Var.c, 1000L);
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new re0(this.b, 2));
                break;
            default:
                te0 te0Var2 = this.b.d;
                org.telegram.ui.Components.oi0 oi0Var2 = te0Var2.E;
                oi0Var2.L(0, false, false);
                te0Var2.n.setAnimation(oi0Var2);
                break;
        }
    }
}
