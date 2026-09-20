package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class w7 implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ i8 a;

    public w7(i8 i8Var) {
        this.a = i8Var;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.d5 d5Var3;
        org.telegram.ui.ActionBar.d5 d5Var4;
        i8 i8Var = this.a;
        i8Var.finishFragment();
        d5Var = ((org.telegram.ui.ActionBar.n2) i8Var).parentLayout;
        if (d5Var != null) {
            d5Var2 = ((org.telegram.ui.ActionBar.n2) i8Var).parentLayout;
            if (d5Var2.getFragmentStack().size() >= 2) {
                d5Var3 = ((org.telegram.ui.ActionBar.n2) i8Var).parentLayout;
                List fragmentStack = d5Var3.getFragmentStack();
                d5Var4 = ((org.telegram.ui.ActionBar.n2) i8Var).parentLayout;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(d5Var4.getFragmentStack().size() - 2);
                if (n2Var instanceof zn) {
                    ((zn) n2Var).S7(i8Var.P, i8Var.Q + 86400, z10);
                    return;
                }
                return;
            }
        }
        zn znVar = i8Var.N;
        if (znVar != null) {
            znVar.S7(i8Var.P, i8Var.Q + 86400, z10);
        }
    }
}
