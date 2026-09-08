package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class r50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s50 b;

    public /* synthetic */ r50(s50 s50Var, int i10) {
        this.a = i10;
        this.b = s50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s50 s50Var = this.b;
                t50 t50Var = s50Var.b;
                if (t50Var != null) {
                    t50Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new r50(s50Var, 2), 16L);
                break;
            case 1:
                t50 t50Var2 = this.b.b;
                if (t50Var2 != null) {
                    t50Var2.setVisibility(4);
                    break;
                }
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
