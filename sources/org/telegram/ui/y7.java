package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class y7 implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ k8 a;

    public y7(k8 k8Var) {
        this.a = k8Var;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        org.telegram.ui.ActionBar.h5 h5Var;
        org.telegram.ui.ActionBar.h5 h5Var2;
        org.telegram.ui.ActionBar.h5 h5Var3;
        org.telegram.ui.ActionBar.h5 h5Var4;
        k8 k8Var = this.a;
        k8Var.finishFragment();
        h5Var = ((org.telegram.ui.ActionBar.o2) k8Var).parentLayout;
        if (h5Var != null) {
            h5Var2 = ((org.telegram.ui.ActionBar.o2) k8Var).parentLayout;
            if (h5Var2.getFragmentStack().size() >= 2) {
                h5Var3 = ((org.telegram.ui.ActionBar.o2) k8Var).parentLayout;
                List fragmentStack = h5Var3.getFragmentStack();
                h5Var4 = ((org.telegram.ui.ActionBar.o2) k8Var).parentLayout;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(h5Var4.getFragmentStack().size() - 2);
                if (o2Var instanceof sn) {
                    ((sn) o2Var).V7(k8Var.P, k8Var.Q + 86400, z10);
                    return;
                }
                return;
            }
        }
        sn snVar = k8Var.N;
        if (snVar != null) {
            snVar.V7(k8Var.P, k8Var.Q + 86400, z10);
        }
    }
}
