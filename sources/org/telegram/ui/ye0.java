package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ye0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ze0 b;

    public /* synthetic */ ye0(ze0 ze0Var, int i10) {
        this.a = i10;
        this.b = ze0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ze0 ze0Var = this.b;
                af0 af0Var = ze0Var.d;
                if (ze0Var.b) {
                    boolean z4 = af0Var.H;
                    org.telegram.ui.Components.hj0 hj0Var = af0Var.G;
                    kd kdVar = af0Var.n;
                    if (z4 && System.currentTimeMillis() - ze0Var.a >= 10000) {
                        kdVar.setAnimation(hj0Var);
                        hj0Var.L(0, false, false);
                        hj0Var.r0 = new ye0(ze0Var, 1);
                        kdVar.d();
                        ze0Var.a = System.currentTimeMillis();
                    }
                    kdVar.postDelayed(ze0Var.c, 1000L);
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ye0(this.b, 2));
                break;
            default:
                af0 af0Var2 = this.b.d;
                org.telegram.ui.Components.hj0 hj0Var2 = af0Var2.F;
                hj0Var2.L(0, false, false);
                af0Var2.n.setAnimation(hj0Var2);
                break;
        }
    }
}
