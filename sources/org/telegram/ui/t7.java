package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class t7 implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ f8 a;

    public t7(f8 f8Var) {
        this.a = f8Var;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.b5 b5Var3;
        org.telegram.ui.ActionBar.b5 b5Var4;
        f8 f8Var = this.a;
        f8Var.finishFragment();
        b5Var = ((org.telegram.ui.ActionBar.o2) f8Var).parentLayout;
        if (b5Var != null) {
            b5Var2 = ((org.telegram.ui.ActionBar.o2) f8Var).parentLayout;
            if (b5Var2.getFragmentStack().size() >= 2) {
                b5Var3 = ((org.telegram.ui.ActionBar.o2) f8Var).parentLayout;
                List fragmentStack = b5Var3.getFragmentStack();
                b5Var4 = ((org.telegram.ui.ActionBar.o2) f8Var).parentLayout;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(b5Var4.getFragmentStack().size() - 2);
                if (o2Var instanceof tn) {
                    ((tn) o2Var).S7(f8Var.L, f8Var.M + 86400, z10);
                    return;
                }
                return;
            }
        }
        tn tnVar = f8Var.J;
        if (tnVar != null) {
            tnVar.S7(f8Var.L, f8Var.M + 86400, z10);
        }
    }
}
