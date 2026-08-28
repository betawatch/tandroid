package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y40 b;

    public /* synthetic */ x40(y40 y40Var, int i9) {
        this.a = i9;
        this.b = y40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y40 y40Var = this.b;
                fh.l2 l2Var = y40Var.b;
                if (l2Var != null) {
                    l2Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new x40(y40Var, 2), 16L);
                break;
            case 1:
                fh.l2 l2Var2 = this.b.b;
                if (l2Var2 != null) {
                    l2Var2.setVisibility(4);
                    break;
                }
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
