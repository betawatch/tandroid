package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yu0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ iv0 b;

    public /* synthetic */ yu0(iv0 iv0Var, int i9) {
        this.a = i9;
        this.b = iv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                iv0 iv0Var = this.b;
                AndroidUtilities.runOnUIThread(new yu0(iv0Var, 3));
                org.telegram.ui.Cells.t1 t1Var = iv0Var.H;
                if (t1Var != null) {
                    t1Var.setVisibility(0);
                    org.telegram.ui.Cells.t1 t1Var2 = iv0Var.H;
                    t1Var2.H7 = null;
                    t1Var2.invalidate();
                }
                nm nmVar = iv0Var.a0;
                if (nmVar != null) {
                    AndroidUtilities.runOnUIThread(nmVar);
                    iv0Var.a0 = null;
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

    public /* synthetic */ yu0(iv0 iv0Var, boolean z10) {
        this.a = 0;
        this.b = iv0Var;
    }
}
