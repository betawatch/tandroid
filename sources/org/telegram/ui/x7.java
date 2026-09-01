package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class x7 implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ j8 a;

    public x7(j8 j8Var) {
        this.a = j8Var;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z4) {
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.f5 f5Var2;
        org.telegram.ui.ActionBar.f5 f5Var3;
        org.telegram.ui.ActionBar.f5 f5Var4;
        j8 j8Var = this.a;
        j8Var.finishFragment();
        f5Var = ((org.telegram.ui.ActionBar.p2) j8Var).parentLayout;
        if (f5Var != null) {
            f5Var2 = ((org.telegram.ui.ActionBar.p2) j8Var).parentLayout;
            if (f5Var2.getFragmentStack().size() >= 2) {
                f5Var3 = ((org.telegram.ui.ActionBar.p2) j8Var).parentLayout;
                List fragmentStack = f5Var3.getFragmentStack();
                f5Var4 = ((org.telegram.ui.ActionBar.p2) j8Var).parentLayout;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) fragmentStack.get(f5Var4.getFragmentStack().size() - 2);
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
