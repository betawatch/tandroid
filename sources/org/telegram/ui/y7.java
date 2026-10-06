package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class y7 implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ k8 a;

    public y7(k8 k8Var) {
        this.a = k8Var;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        org.telegram.ui.ActionBar.c5 c5Var;
        org.telegram.ui.ActionBar.c5 c5Var2;
        org.telegram.ui.ActionBar.c5 c5Var3;
        org.telegram.ui.ActionBar.c5 c5Var4;
        k8 k8Var = this.a;
        k8Var.finishFragment();
        c5Var = ((org.telegram.ui.ActionBar.n2) k8Var).parentLayout;
        if (c5Var != null) {
            c5Var2 = ((org.telegram.ui.ActionBar.n2) k8Var).parentLayout;
            if (c5Var2.getFragmentStack().size() >= 2) {
                c5Var3 = ((org.telegram.ui.ActionBar.n2) k8Var).parentLayout;
                List fragmentStack = c5Var3.getFragmentStack();
                c5Var4 = ((org.telegram.ui.ActionBar.n2) k8Var).parentLayout;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(c5Var4.getFragmentStack().size() - 2);
                if (n2Var instanceof yn) {
                    ((yn) n2Var).S7(k8Var.P, k8Var.Q + 86400, z10);
                    return;
                }
                return;
            }
        }
        yn ynVar = k8Var.N;
        if (ynVar != null) {
            ynVar.S7(k8Var.P, k8Var.Q + 86400, z10);
        }
    }
}
