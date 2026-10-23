package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class y7 implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ k8 a;

    public y7(k8 k8Var) {
        this.a = k8Var;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.d5 d5Var3;
        org.telegram.ui.ActionBar.d5 d5Var4;
        k8 k8Var = this.a;
        k8Var.finishFragment();
        d5Var = ((org.telegram.ui.ActionBar.n2) k8Var).parentLayout;
        if (d5Var != null) {
            d5Var2 = ((org.telegram.ui.ActionBar.n2) k8Var).parentLayout;
            if (d5Var2.getFragmentStack().size() >= 2) {
                d5Var3 = ((org.telegram.ui.ActionBar.n2) k8Var).parentLayout;
                List fragmentStack = d5Var3.getFragmentStack();
                d5Var4 = ((org.telegram.ui.ActionBar.n2) k8Var).parentLayout;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(d5Var4.getFragmentStack().size() - 2);
                if (n2Var instanceof qn) {
                    ((qn) n2Var).V7(k8Var.P, k8Var.Q + 86400, z10);
                    return;
                }
                return;
            }
        }
        qn qnVar = k8Var.N;
        if (qnVar != null) {
            qnVar.V7(k8Var.P, k8Var.Q + 86400, z10);
        }
    }
}
