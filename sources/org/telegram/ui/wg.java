package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wg implements Utilities.Callback0Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ wg(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback0Return
    public final Object run() {
        switch (this.a) {
            case 0:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.a11.c()) {
                    zn znVar = this.b;
                    org.telegram.ui.Components.a11 a11Var = znVar.s0;
                    if (a11Var == null || a11Var.e) {
                        if (znVar.getParentActivity() != null && org.telegram.ui.Components.a11.c() && znVar.u0 != null && znVar.U0 != null) {
                            org.telegram.ui.Components.a11 a11Var2 = znVar.s0;
                            if (a11Var2 != null) {
                                AndroidUtilities.removeFromParent(a11Var2);
                            }
                            org.telegram.ui.Components.a11 a11Var3 = new org.telegram.ui.Components.a11(znVar.getParentActivity(), new hc(7, znVar, r2));
                            znVar.s0 = a11Var3;
                            org.telegram.ui.Components.a11[] a11VarArr = {a11Var3};
                            rm rmVar = znVar.U0;
                            rmVar.addView(a11Var3, rmVar.indexOfChild(znVar.u0) + 1, k7.b6.c(-1.0f, -1));
                        }
                    }
                    return znVar.s0;
                }
                return null;
            default:
                this.b.getClass();
                return Boolean.valueOf(org.telegram.ui.Components.a11.c() && LiteMode.isEnabled(65536));
        }
    }
}
