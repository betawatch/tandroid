package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class v7 implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ h8 a;

    public v7(h8 h8Var) {
        this.a = h8Var;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        org.telegram.ui.ActionBar.c5 c5Var;
        org.telegram.ui.ActionBar.c5 c5Var2;
        org.telegram.ui.ActionBar.c5 c5Var3;
        org.telegram.ui.ActionBar.c5 c5Var4;
        h8 h8Var = this.a;
        h8Var.finishFragment();
        c5Var = ((org.telegram.ui.ActionBar.n2) h8Var).parentLayout;
        if (c5Var != null) {
            c5Var2 = ((org.telegram.ui.ActionBar.n2) h8Var).parentLayout;
            if (c5Var2.getFragmentStack().size() >= 2) {
                c5Var3 = ((org.telegram.ui.ActionBar.n2) h8Var).parentLayout;
                List fragmentStack = c5Var3.getFragmentStack();
                c5Var4 = ((org.telegram.ui.ActionBar.n2) h8Var).parentLayout;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(c5Var4.getFragmentStack().size() - 2);
                if (n2Var instanceof xn) {
                    ((xn) n2Var).S7(h8Var.P, h8Var.Q + 86400, z10);
                    return;
                }
                return;
            }
        }
        xn xnVar = h8Var.N;
        if (xnVar != null) {
            xnVar.S7(h8Var.P, h8Var.Q + 86400, z10);
        }
    }
}
