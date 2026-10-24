package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
                return Boolean.valueOf(org.telegram.ui.Components.y11.c() && LiteMode.isEnabled(65536));
            default:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.y11.c()) {
                    sn snVar = this.b;
                    org.telegram.ui.Components.y11 y11Var = snVar.v0;
                    if (y11Var == null || y11Var.e) {
                        if (snVar.getParentActivity() != null && org.telegram.ui.Components.y11.c() && snVar.x0 != null && snVar.j1 != null) {
                            org.telegram.ui.Components.y11 y11Var2 = snVar.v0;
                            if (y11Var2 != null) {
                                AndroidUtilities.removeFromParent(y11Var2);
                            }
                            org.telegram.ui.Components.y11 y11Var3 = new org.telegram.ui.Components.y11(snVar.getParentActivity(), new h0(22, snVar, r2));
                            snVar.v0 = y11Var3;
                            org.telegram.ui.Components.y11[] y11VarArr = {y11Var3};
                            km kmVar = snVar.j1;
                            kmVar.addView(y11Var3, kmVar.indexOfChild(snVar.x0) + 1, w7.z5.c(-1.0f, -1));
                        }
                    }
                    return snVar.v0;
                }
                return null;
        }
    }
}
