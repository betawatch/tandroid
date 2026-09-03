package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                    boolean z4 = bf0Var.H;
                    org.telegram.ui.Components.gj0 gj0Var = bf0Var.G;
                    md mdVar = bf0Var.n;
                    if (z4 && System.currentTimeMillis() - af0Var.a >= 10000) {
                        mdVar.setAnimation(gj0Var);
                        gj0Var.L(0, false, false);
                        gj0Var.r0 = new ze0(af0Var, 1);
                        mdVar.d();
                        af0Var.a = System.currentTimeMillis();
                    }
                    mdVar.postDelayed(af0Var.c, 1000L);
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ze0(this.b, 2));
                break;
            default:
                bf0 bf0Var2 = this.b.d;
                org.telegram.ui.Components.gj0 gj0Var2 = bf0Var2.F;
                gj0Var2.L(0, false, false);
                bf0Var2.n.setAnimation(gj0Var2);
                break;
        }
    }
}
