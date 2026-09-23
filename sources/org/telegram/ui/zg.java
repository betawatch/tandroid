package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class zg implements Utilities.Callback0Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;

    public /* synthetic */ zg(xn xnVar, int i10) {
        this.a = i10;
        this.b = xnVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback0Return
    public final Object run() {
        switch (this.a) {
            case 0:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.w01.c()) {
                    xn xnVar = this.b;
                    org.telegram.ui.Components.w01 w01Var = xnVar.v0;
                    if (w01Var == null || w01Var.e) {
                        if (xnVar.getParentActivity() != null && org.telegram.ui.Components.w01.c() && xnVar.x0 != null && xnVar.X0 != null) {
                            org.telegram.ui.Components.w01 w01Var2 = xnVar.v0;
                            if (w01Var2 != null) {
                                AndroidUtilities.removeFromParent(w01Var2);
                            }
                            org.telegram.ui.Components.w01 w01Var3 = new org.telegram.ui.Components.w01(xnVar.getParentActivity(), new m4(20, xnVar, r2));
                            xnVar.v0 = w01Var3;
                            org.telegram.ui.Components.w01[] w01VarArr = {w01Var3};
                            qm qmVar = xnVar.X0;
                            qmVar.addView(w01Var3, qmVar.indexOfChild(xnVar.x0) + 1, w7.x5.c(-1.0f, -1));
                        }
                    }
                    return xnVar.v0;
                }
                return null;
            default:
                this.b.getClass();
                return Boolean.valueOf(org.telegram.ui.Components.w01.c() && LiteMode.isEnabled(65536));
        }
    }
}
