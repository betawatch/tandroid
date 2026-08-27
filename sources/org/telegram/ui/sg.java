package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sg implements Utilities.Callback0Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;

    public /* synthetic */ sg(rn rnVar, int i10) {
        this.a = i10;
        this.b = rnVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback0Return
    public final Object run() {
        switch (this.a) {
            case 0:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.f01.c()) {
                    rn rnVar = this.b;
                    org.telegram.ui.Components.f01 f01Var = rnVar.r0;
                    if (f01Var == null || f01Var.e) {
                        if (rnVar.getParentActivity() != null && org.telegram.ui.Components.f01.c() && rnVar.t0 != null && rnVar.T0 != null) {
                            org.telegram.ui.Components.f01 f01Var2 = rnVar.r0;
                            if (f01Var2 != null) {
                                AndroidUtilities.removeFromParent(f01Var2);
                            }
                            org.telegram.ui.Components.f01 f01Var3 = new org.telegram.ui.Components.f01(rnVar.getParentActivity(), new rd(2, rnVar, r2));
                            rnVar.r0 = f01Var3;
                            org.telegram.ui.Components.f01[] f01VarArr = {f01Var3};
                            jm jmVar = rnVar.T0;
                            jmVar.addView(f01Var3, jmVar.indexOfChild(rnVar.t0) + 1, h7.z5.c(-1.0f, -1));
                        }
                    }
                    return rnVar.r0;
                }
                return null;
            default:
                this.b.getClass();
                return Boolean.valueOf(org.telegram.ui.Components.f01.c() && LiteMode.isEnabled(65536));
        }
    }
}
