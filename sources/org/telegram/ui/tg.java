package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tg implements Utilities.Callback0Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;

    public /* synthetic */ tg(sn snVar, int i10) {
        this.a = i10;
        this.b = snVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback0Return
    public final Object run() {
        switch (this.a) {
            case 0:
                this.b.getClass();
                return Boolean.valueOf(org.telegram.ui.Components.t11.c() && LiteMode.isEnabled(65536));
            default:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.t11.c()) {
                    sn snVar = this.b;
                    org.telegram.ui.Components.t11 t11Var = snVar.v0;
                    if (t11Var == null || t11Var.e) {
                        if (snVar.getParentActivity() != null && org.telegram.ui.Components.t11.c() && snVar.x0 != null && snVar.X0 != null) {
                            org.telegram.ui.Components.t11 t11Var2 = snVar.v0;
                            if (t11Var2 != null) {
                                AndroidUtilities.removeFromParent(t11Var2);
                            }
                            org.telegram.ui.Components.t11 t11Var3 = new org.telegram.ui.Components.t11(snVar.getParentActivity(), new i0(22, snVar, r2));
                            snVar.v0 = t11Var3;
                            org.telegram.ui.Components.t11[] t11VarArr = {t11Var3};
                            lm lmVar = snVar.X0;
                            lmVar.addView(t11Var3, lmVar.indexOfChild(snVar.x0) + 1, w7.z5.d(-1.0f, -1));
                        }
                    }
                    return snVar.v0;
                }
                return null;
        }
    }
}
