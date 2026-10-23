package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class se0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ te0 b;

    public /* synthetic */ se0(te0 te0Var, int i10) {
        this.a = i10;
        this.b = te0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                te0 te0Var = this.b;
                ue0 ue0Var = te0Var.d;
                if (te0Var.b) {
                    boolean z10 = ue0Var.K;
                    org.telegram.ui.Components.yj0 yj0Var = ue0Var.J;
                    jd jdVar = ue0Var.n;
                    if (z10 && System.currentTimeMillis() - te0Var.a >= 10000) {
                        jdVar.setAnimation(yj0Var);
                        yj0Var.N(0, false, false);
                        yj0Var.t0 = new se0(te0Var, 1);
                        jdVar.d();
                        te0Var.a = System.currentTimeMillis();
                    }
                    jdVar.postDelayed(te0Var.c, 1000L);
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new se0(this.b, 2));
                break;
            default:
                ue0 ue0Var2 = this.b.d;
                org.telegram.ui.Components.yj0 yj0Var2 = ue0Var2.I;
                yj0Var2.N(0, false, false);
                ue0Var2.n.setAnimation(yj0Var2);
                break;
        }
    }
}
