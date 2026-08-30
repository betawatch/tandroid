package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xe0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ye0 b;

    public /* synthetic */ xe0(ye0 ye0Var, int i10) {
        this.a = i10;
        this.b = ye0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ye0 ye0Var = this.b;
                ze0 ze0Var = ye0Var.d;
                if (ye0Var.b) {
                    boolean z4 = ze0Var.H;
                    org.telegram.ui.Components.gj0 gj0Var = ze0Var.G;
                    kd kdVar = ze0Var.n;
                    if (z4 && System.currentTimeMillis() - ye0Var.a >= 10000) {
                        kdVar.setAnimation(gj0Var);
                        gj0Var.L(0, false, false);
                        gj0Var.r0 = new xe0(ye0Var, 1);
                        kdVar.d();
                        ye0Var.a = System.currentTimeMillis();
                    }
                    kdVar.postDelayed(ye0Var.c, 1000L);
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new xe0(this.b, 2));
                break;
            default:
                ze0 ze0Var2 = this.b.d;
                org.telegram.ui.Components.gj0 gj0Var2 = ze0Var2.F;
                gj0Var2.L(0, false, false);
                ze0Var2.n.setAnimation(gj0Var2);
                break;
        }
    }
}
