package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a50 b;

    public /* synthetic */ z40(a50 a50Var, int i10) {
        this.a = i10;
        this.b = a50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a50 a50Var = this.b;
                cg.h0 h0Var = a50Var.b;
                if (h0Var != null) {
                    h0Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new z40(a50Var, 2), 16L);
                break;
            case 1:
                cg.h0 h0Var2 = this.b.b;
                if (h0Var2 != null) {
                    h0Var2.setVisibility(4);
                    break;
                }
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
