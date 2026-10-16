package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
