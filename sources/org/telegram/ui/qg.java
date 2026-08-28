package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qg implements Utilities.Callback0Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ qg(qn qnVar, int i9) {
        this.a = i9;
        this.b = qnVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback0Return
    public final Object run() {
        switch (this.a) {
            case 0:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.d01.c()) {
                    qn qnVar = this.b;
                    org.telegram.ui.Components.d01 d01Var = qnVar.r0;
                    if (d01Var == null || d01Var.e) {
                        if (qnVar.getParentActivity() != null && org.telegram.ui.Components.d01.c() && qnVar.t0 != null && qnVar.T0 != null) {
                            org.telegram.ui.Components.d01 d01Var2 = qnVar.r0;
                            if (d01Var2 != null) {
                                AndroidUtilities.removeFromParent(d01Var2);
                            }
                            org.telegram.ui.Components.d01 d01Var3 = new org.telegram.ui.Components.d01(qnVar.getParentActivity(), new rd(2, qnVar, r2));
                            qnVar.r0 = d01Var3;
                            org.telegram.ui.Components.d01[] d01VarArr = {d01Var3};
                            im imVar = qnVar.T0;
                            imVar.addView(d01Var3, imVar.indexOfChild(qnVar.t0) + 1, g7.e6.c(-1.0f, -1));
                        }
                    }
                    return qnVar.r0;
                }
                return null;
            default:
                this.b.getClass();
                return Boolean.valueOf(org.telegram.ui.Components.d01.c() && LiteMode.isEnabled(65536));
        }
    }
}
