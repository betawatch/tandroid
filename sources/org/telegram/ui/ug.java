package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.b11.c()) {
                    xn xnVar = this.b;
                    org.telegram.ui.Components.b11 b11Var = xnVar.s0;
                    if (b11Var == null || b11Var.e) {
                        if (xnVar.getParentActivity() != null && org.telegram.ui.Components.b11.c() && xnVar.u0 != null && xnVar.U0 != null) {
                            org.telegram.ui.Components.b11 b11Var2 = xnVar.s0;
                            if (b11Var2 != null) {
                                AndroidUtilities.removeFromParent(b11Var2);
                            }
                            org.telegram.ui.Components.b11 b11Var3 = new org.telegram.ui.Components.b11(xnVar.getParentActivity(), new fc(7, xnVar, r2));
                            xnVar.s0 = b11Var3;
                            org.telegram.ui.Components.b11[] b11VarArr = {b11Var3};
                            pm pmVar = xnVar.U0;
                            pmVar.addView(b11Var3, pmVar.indexOfChild(xnVar.u0) + 1, k7.c6.c(-1.0f, -1));
                        }
                    }
                    return xnVar.s0;
                }
                return null;
            default:
                this.b.getClass();
                return Boolean.valueOf(org.telegram.ui.Components.b11.c() && LiteMode.isEnabled(65536));
        }
    }
}
