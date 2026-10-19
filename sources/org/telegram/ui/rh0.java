package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class rh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mi0 b;

    public /* synthetic */ rh0(mi0 mi0Var, int i10) {
        this.a = i10;
        this.b = mi0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                mi0 mi0Var = this.b;
                mi0Var.getClass();
                wh.f.f(false);
                wh.f fVar = mi0Var.i0;
                if (fVar != null) {
                    fVar.b(mi0Var.F);
                }
                AndroidUtilities.runOnUIThread(new rh0(mi0Var, 0));
                break;
            case 2:
                wh.f.f(false);
                mi0 mi0Var2 = this.b;
                wh.f fVar2 = mi0Var2.i0;
                if (fVar2 != null) {
                    fVar2.b(mi0Var2.F);
                }
                AndroidUtilities.runOnUIThread(new rh0(mi0Var2, 3));
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
