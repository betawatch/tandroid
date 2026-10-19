package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
                v10 v10Var = a50Var.b;
                if (v10Var != null) {
                    v10Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new z40(a50Var, 2), 16L);
                break;
            case 1:
                v10 v10Var2 = this.b.b;
                if (v10Var2 != null) {
                    v10Var2.setVisibility(4);
                    break;
                }
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
