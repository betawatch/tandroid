package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class yg implements Utilities.Callback0Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;

    public /* synthetic */ yg(wn wnVar, int i10) {
        this.a = i10;
        this.b = wnVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback0Return
    public final Object run() {
        switch (this.a) {
            case 0:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.m11.c()) {
                    wn wnVar = this.b;
                    org.telegram.ui.Components.m11 m11Var = wnVar.v0;
                    if (m11Var == null || m11Var.e) {
                        if (wnVar.getParentActivity() != null && org.telegram.ui.Components.m11.c() && wnVar.x0 != null && wnVar.X0 != null) {
                            org.telegram.ui.Components.m11 m11Var2 = wnVar.v0;
                            if (m11Var2 != null) {
                                AndroidUtilities.removeFromParent(m11Var2);
                            }
                            org.telegram.ui.Components.m11 m11Var3 = new org.telegram.ui.Components.m11(wnVar.getParentActivity(), new org.telegram.ui.ActionBar.a6(25, wnVar, r2));
                            wnVar.v0 = m11Var3;
                            org.telegram.ui.Components.m11[] m11VarArr = {m11Var3};
                            pm pmVar = wnVar.X0;
                            pmVar.addView(m11Var3, pmVar.indexOfChild(wnVar.x0) + 1, w7.y5.c(-1.0f, -1));
                        }
                    }
                    return wnVar.v0;
                }
                return null;
            default:
                this.b.getClass();
                return Boolean.valueOf(org.telegram.ui.Components.m11.c() && LiteMode.isEnabled(65536));
        }
    }
}
