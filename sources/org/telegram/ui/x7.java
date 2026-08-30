package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class x7 implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ j8 a;

    public x7(j8 j8Var) {
        this.a = j8Var;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z4) {
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        org.telegram.ui.ActionBar.e5 e5Var3;
        org.telegram.ui.ActionBar.e5 e5Var4;
        j8 j8Var = this.a;
        j8Var.finishFragment();
        e5Var = ((org.telegram.ui.ActionBar.p2) j8Var).parentLayout;
        if (e5Var != null) {
            e5Var2 = ((org.telegram.ui.ActionBar.p2) j8Var).parentLayout;
            if (e5Var2.getFragmentStack().size() >= 2) {
                e5Var3 = ((org.telegram.ui.ActionBar.p2) j8Var).parentLayout;
                List fragmentStack = e5Var3.getFragmentStack();
                e5Var4 = ((org.telegram.ui.ActionBar.p2) j8Var).parentLayout;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) fragmentStack.get(e5Var4.getFragmentStack().size() - 2);
                if (p2Var instanceof xn) {
                    ((xn) p2Var).S7(j8Var.M, j8Var.N + 86400, z4);
                    return;
                }
                return;
            }
        }
        xn xnVar = j8Var.K;
        if (xnVar != null) {
            xnVar.S7(j8Var.M, j8Var.N + 86400, z4);
        }
    }
}
