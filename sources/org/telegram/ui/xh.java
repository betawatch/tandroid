package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
                return Boolean.valueOf(org.telegram.ui.Components.v11.c() && LiteMode.isEnabled(65536));
            default:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.v11.c()) {
                    yn ynVar = this.b;
                    org.telegram.ui.Components.v11 v11Var = ynVar.t0;
                    if (v11Var == null || v11Var.e) {
                        if (ynVar.getParentActivity() != null && org.telegram.ui.Components.v11.c() && ynVar.v0 != null && ynVar.V0 != null) {
                            org.telegram.ui.Components.v11 v11Var2 = ynVar.t0;
                            if (v11Var2 != null) {
                                AndroidUtilities.removeFromParent(v11Var2);
                            }
                            org.telegram.ui.Components.v11 v11Var3 = new org.telegram.ui.Components.v11(ynVar.getParentActivity(), new org.telegram.ui.ActionBar.g6(24, ynVar, r2));
                            ynVar.t0 = v11Var3;
                            org.telegram.ui.Components.v11[] v11VarArr = {v11Var3};
                            qm qmVar = ynVar.V0;
                            qmVar.addView(v11Var3, qmVar.indexOfChild(ynVar.v0) + 1, w7.z5.c(-1.0f, -1));
                        }
                    }
                    return ynVar.t0;
                }
                return null;
        }
    }
}
