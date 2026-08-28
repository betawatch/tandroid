package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class u7 implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ g8 a;

    public u7(g8 g8Var) {
        this.a = g8Var;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.b5 b5Var3;
        org.telegram.ui.ActionBar.b5 b5Var4;
        g8 g8Var = this.a;
        g8Var.finishFragment();
        b5Var = ((org.telegram.ui.ActionBar.o2) g8Var).parentLayout;
        if (b5Var != null) {
            b5Var2 = ((org.telegram.ui.ActionBar.o2) g8Var).parentLayout;
            if (b5Var2.getFragmentStack().size() >= 2) {
                b5Var3 = ((org.telegram.ui.ActionBar.o2) g8Var).parentLayout;
                List fragmentStack = b5Var3.getFragmentStack();
                b5Var4 = ((org.telegram.ui.ActionBar.o2) g8Var).parentLayout;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(b5Var4.getFragmentStack().size() - 2);
                if (o2Var instanceof qn) {
                    ((qn) o2Var).S7(g8Var.L, g8Var.M + 86400, z10);
                    return;
                }
                return;
            }
        }
        qn qnVar = g8Var.J;
        if (qnVar != null) {
            qnVar.S7(g8Var.L, g8Var.M + 86400, z10);
        }
    }
}
