package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wu0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ iv0 b;

    public /* synthetic */ wu0(iv0 iv0Var, int i10) {
        this.a = i10;
        this.b = iv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                iv0 iv0Var = this.b;
                AndroidUtilities.runOnUIThread(new wu0(iv0Var, 3));
                org.telegram.ui.Cells.s1 s1Var = iv0Var.H;
                if (s1Var != null) {
                    s1Var.setVisibility(0);
                    org.telegram.ui.Cells.s1 s1Var2 = iv0Var.H;
                    s1Var2.H7 = null;
                    s1Var2.invalidate();
                }
                pm pmVar = iv0Var.a0;
                if (pmVar != null) {
                    AndroidUtilities.runOnUIThread(pmVar);
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

    public /* synthetic */ wu0(iv0 iv0Var, boolean z10) {
        this.a = 0;
        this.b = iv0Var;
    }
}
