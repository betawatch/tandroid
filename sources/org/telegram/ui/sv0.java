package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dw0 b;

    public /* synthetic */ sv0(dw0 dw0Var, int i10) {
        this.a = i10;
        this.b = dw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dw0 dw0Var = this.b;
                AndroidUtilities.runOnUIThread(new sv0(dw0Var, 3));
                org.telegram.ui.Cells.u1 u1Var = dw0Var.L;
                if (u1Var != null) {
                    u1Var.setVisibility(0);
                    org.telegram.ui.Cells.u1 u1Var2 = dw0Var.L;
                    u1Var2.L7 = null;
                    u1Var2.invalidate();
                }
                tm tmVar = dw0Var.e0;
                if (tmVar != null) {
                    AndroidUtilities.runOnUIThread(tmVar);
                    dw0Var.e0 = null;
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

    public /* synthetic */ sv0(dw0 dw0Var, boolean z10) {
        this.a = 0;
        this.b = dw0Var;
    }
}
