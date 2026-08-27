package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class v7 implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ h8 a;

    public v7(h8 h8Var) {
        this.a = h8Var;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.b5 b5Var3;
        org.telegram.ui.ActionBar.b5 b5Var4;
        h8 h8Var = this.a;
        h8Var.finishFragment();
        b5Var = ((org.telegram.ui.ActionBar.n2) h8Var).parentLayout;
        if (b5Var != null) {
            b5Var2 = ((org.telegram.ui.ActionBar.n2) h8Var).parentLayout;
            if (b5Var2.getFragmentStack().size() >= 2) {
                b5Var3 = ((org.telegram.ui.ActionBar.n2) h8Var).parentLayout;
                List fragmentStack = b5Var3.getFragmentStack();
                b5Var4 = ((org.telegram.ui.ActionBar.n2) h8Var).parentLayout;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(b5Var4.getFragmentStack().size() - 2);
                if (n2Var instanceof rn) {
                    ((rn) n2Var).S7(h8Var.L, h8Var.M + 86400, z10);
                    return;
                }
                return;
            }
        }
        rn rnVar = h8Var.J;
        if (rnVar != null) {
            rnVar.S7(h8Var.L, h8Var.M + 86400, z10);
        }
    }
}
