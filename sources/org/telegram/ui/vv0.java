package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gw0 b;

    public /* synthetic */ vv0(gw0 gw0Var, int i10) {
        this.a = i10;
        this.b = gw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gw0 gw0Var = this.b;
                AndroidUtilities.runOnUIThread(new vv0(gw0Var, 3));
                org.telegram.ui.Cells.u1 u1Var = gw0Var.L;
                if (u1Var != null) {
                    u1Var.setVisibility(0);
                    org.telegram.ui.Cells.u1 u1Var2 = gw0Var.L;
                    u1Var2.L7 = null;
                    u1Var2.invalidate();
                }
                um umVar = gw0Var.e0;
                if (umVar != null) {
                    AndroidUtilities.runOnUIThread(umVar);
                    gw0Var.e0 = null;
                    break;
                }
                break;
            case 1:
                this.b.c(false);
                break;
            case 2:
                this.b.c(false);
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }

    public /* synthetic */ vv0(gw0 gw0Var, boolean z10) {
        this.a = 0;
        this.b = gw0Var;
    }
}
