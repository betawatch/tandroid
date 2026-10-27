package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                    boolean z10 = te0Var.K;
                    org.telegram.ui.Components.yj0 yj0Var = te0Var.J;
                    kd kdVar = te0Var.n;
                    if (z10 && System.currentTimeMillis() - se0Var.a >= 10000) {
                        kdVar.setAnimation(yj0Var);
                        yj0Var.N(0, false, false);
                        yj0Var.t0 = new re0(se0Var, 1);
                        kdVar.d();
                        se0Var.a = System.currentTimeMillis();
                    }
                    kdVar.postDelayed(se0Var.c, 1000L);
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new re0(this.b, 2));
                break;
            default:
                te0 te0Var2 = this.b.d;
                org.telegram.ui.Components.yj0 yj0Var2 = te0Var2.I;
                yj0Var2.N(0, false, false);
                te0Var2.n.setAnimation(yj0Var2);
                break;
        }
    }
}
