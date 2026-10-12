package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class v50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w50 b;

    public /* synthetic */ v50(w50 w50Var, int i10) {
        this.a = i10;
        this.b = w50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w50 w50Var = this.b;
                x50 x50Var = w50Var.b;
                if (x50Var != null) {
                    x50Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new v50(w50Var, 2), 16L);
                break;
            case 1:
                x50 x50Var2 = this.b.b;
                if (x50Var2 != null) {
                    x50Var2.setVisibility(4);
                    break;
                }
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
