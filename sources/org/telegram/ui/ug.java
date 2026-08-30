package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ug implements Utilities.Callback0Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;

    public /* synthetic */ ug(xn xnVar, int i10) {
        this.a = i10;
        this.b = xnVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback0Return
    public final Object run() {
        switch (this.a) {
            case 0:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.a11.c()) {
                    xn xnVar = this.b;
                    org.telegram.ui.Components.a11 a11Var = xnVar.s0;
                    if (a11Var == null || a11Var.e) {
                        if (xnVar.getParentActivity() != null && org.telegram.ui.Components.a11.c() && xnVar.u0 != null && xnVar.U0 != null) {
                            org.telegram.ui.Components.a11 a11Var2 = xnVar.s0;
                            if (a11Var2 != null) {
                                AndroidUtilities.removeFromParent(a11Var2);
                            }
                            org.telegram.ui.Components.a11 a11Var3 = new org.telegram.ui.Components.a11(xnVar.getParentActivity(), new yb(8, xnVar, r2));
                            xnVar.s0 = a11Var3;
                            org.telegram.ui.Components.a11[] a11VarArr = {a11Var3};
                            pm pmVar = xnVar.U0;
                            pmVar.addView(a11Var3, pmVar.indexOfChild(xnVar.u0) + 1, k7.b6.c(-1.0f, -1));
                        }
                    }
                    return xnVar.s0;
                }
                return null;
            default:
                this.b.getClass();
                return Boolean.valueOf(org.telegram.ui.Components.a11.c() && LiteMode.isEnabled(65536));
        }
    }
}
