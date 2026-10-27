package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ug implements Utilities.Callback0Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 b;

    public /* synthetic */ ug(int i10, org.telegram.ui.ActionBar.r2 r2Var) {
        this.a = i10;
        this.b = r2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback0Return
    public final Object run() {
        switch (this.a) {
            case 0:
                wn wnVar = (wn) this.b;
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.h21.c()) {
                    org.telegram.ui.Components.h21 h21Var = wnVar.v0;
                    if (h21Var == null || h21Var.e) {
                        if (wnVar.getParentActivity() != null && org.telegram.ui.Components.h21.c() && wnVar.x0 != null && wnVar.j1 != null) {
                            org.telegram.ui.Components.h21 h21Var2 = wnVar.v0;
                            if (h21Var2 != null) {
                                AndroidUtilities.removeFromParent(h21Var2);
                            }
                            org.telegram.ui.Components.h21 h21Var3 = new org.telegram.ui.Components.h21(wnVar.getParentActivity(), new ed(3, wnVar, r2));
                            wnVar.v0 = h21Var3;
                            org.telegram.ui.Components.h21[] h21VarArr = {h21Var3};
                            om omVar = wnVar.j1;
                            omVar.addView(h21Var3, omVar.indexOfChild(wnVar.x0) + 1, org.telegram.ui.Components.kb1.g(-1.0f, -1));
                        }
                    }
                    return wnVar.v0;
                }
                return null;
            case 1:
                ((wn) this.b).getClass();
                return Boolean.valueOf(org.telegram.ui.Components.h21.c() && LiteMode.isEnabled(65536));
            default:
                return ((ProfileActivity) this.b).getSimpleMenuOverlay();
        }
    }
}
