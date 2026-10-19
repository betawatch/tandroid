package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class rg implements Utilities.Callback0Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ rg(qn qnVar, int i10) {
        this.a = i10;
        this.b = qnVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback0Return
    public final Object run() {
        switch (this.a) {
            case 0:
                this.b.getClass();
                return Boolean.valueOf(org.telegram.ui.Components.u11.c() && LiteMode.isEnabled(65536));
            default:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.u11.c()) {
                    qn qnVar = this.b;
                    org.telegram.ui.Components.u11 u11Var = qnVar.v0;
                    if (u11Var == null || u11Var.e) {
                        if (qnVar.getParentActivity() != null && org.telegram.ui.Components.u11.c() && qnVar.x0 != null && qnVar.X0 != null) {
                            org.telegram.ui.Components.u11 u11Var2 = qnVar.v0;
                            if (u11Var2 != null) {
                                AndroidUtilities.removeFromParent(u11Var2);
                            }
                            org.telegram.ui.Components.u11 u11Var3 = new org.telegram.ui.Components.u11(qnVar.getParentActivity(), new i0(22, qnVar, r2));
                            qnVar.v0 = u11Var3;
                            org.telegram.ui.Components.u11[] u11VarArr = {u11Var3};
                            jm jmVar = qnVar.X0;
                            jmVar.addView(u11Var3, jmVar.indexOfChild(qnVar.x0) + 1, w7.z5.c(-1.0f, -1));
                        }
                    }
                    return qnVar.v0;
                }
                return null;
        }
    }
}
