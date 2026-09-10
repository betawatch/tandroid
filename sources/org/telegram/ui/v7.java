package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class v7 implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ h8 a;

    public v7(h8 h8Var) {
        this.a = h8Var;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.f5 f5Var2;
        org.telegram.ui.ActionBar.f5 f5Var3;
        org.telegram.ui.ActionBar.f5 f5Var4;
        h8 h8Var = this.a;
        h8Var.finishFragment();
        f5Var = ((org.telegram.ui.ActionBar.p2) h8Var).parentLayout;
        if (f5Var != null) {
            f5Var2 = ((org.telegram.ui.ActionBar.p2) h8Var).parentLayout;
            if (f5Var2.getFragmentStack().size() >= 2) {
                f5Var3 = ((org.telegram.ui.ActionBar.p2) h8Var).parentLayout;
                List fragmentStack = f5Var3.getFragmentStack();
                f5Var4 = ((org.telegram.ui.ActionBar.p2) h8Var).parentLayout;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) fragmentStack.get(f5Var4.getFragmentStack().size() - 2);
                if (p2Var instanceof eo) {
                    ((eo) p2Var).S7(h8Var.P, h8Var.Q + 86400, z10);
                    return;
                }
                return;
            }
        }
        eo eoVar = h8Var.N;
        if (eoVar != null) {
            eoVar.S7(h8Var.P, h8Var.Q + 86400, z10);
        }
    }
}
