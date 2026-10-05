package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xh implements Utilities.Callback0Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ yn b;

    public /* synthetic */ xh(yn ynVar, int i10) {
        this.a = i10;
        this.b = ynVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback0Return
    public final Object run() {
        switch (this.a) {
            case 0:
                this.b.getClass();
                return Boolean.valueOf(org.telegram.ui.Components.w11.c() && LiteMode.isEnabled(65536));
            default:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.w11.c()) {
                    yn ynVar = this.b;
                    org.telegram.ui.Components.w11 w11Var = ynVar.t0;
                    if (w11Var == null || w11Var.e) {
                        if (ynVar.getParentActivity() != null && org.telegram.ui.Components.w11.c() && ynVar.v0 != null && ynVar.V0 != null) {
                            org.telegram.ui.Components.w11 w11Var2 = ynVar.t0;
                            if (w11Var2 != null) {
                                AndroidUtilities.removeFromParent(w11Var2);
                            }
                            org.telegram.ui.Components.w11 w11Var3 = new org.telegram.ui.Components.w11(ynVar.getParentActivity(), new org.telegram.ui.ActionBar.g6(24, ynVar, r2));
                            ynVar.t0 = w11Var3;
                            org.telegram.ui.Components.w11[] w11VarArr = {w11Var3};
                            qm qmVar = ynVar.V0;
                            qmVar.addView(w11Var3, qmVar.indexOfChild(ynVar.v0) + 1, w7.z5.c(-1.0f, -1));
                        }
                    }
                    return ynVar.t0;
                }
                return null;
        }
    }
}
