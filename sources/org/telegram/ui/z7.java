package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class z7 implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ l8 a;

    public z7(l8 l8Var) {
        this.a = l8Var;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z4) {
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        org.telegram.ui.ActionBar.e5 e5Var3;
        org.telegram.ui.ActionBar.e5 e5Var4;
        l8 l8Var = this.a;
        l8Var.finishFragment();
        e5Var = ((org.telegram.ui.ActionBar.p2) l8Var).parentLayout;
        if (e5Var != null) {
            e5Var2 = ((org.telegram.ui.ActionBar.p2) l8Var).parentLayout;
            if (e5Var2.getFragmentStack().size() >= 2) {
                e5Var3 = ((org.telegram.ui.ActionBar.p2) l8Var).parentLayout;
                List fragmentStack = e5Var3.getFragmentStack();
                e5Var4 = ((org.telegram.ui.ActionBar.p2) l8Var).parentLayout;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) fragmentStack.get(e5Var4.getFragmentStack().size() - 2);
                if (p2Var instanceof zn) {
                    ((zn) p2Var).S7(l8Var.M, l8Var.N + 86400, z4);
                    return;
                }
                return;
            }
        }
        zn znVar = l8Var.K;
        if (znVar != null) {
            znVar.S7(l8Var.M, l8Var.N + 86400, z4);
        }
    }
}
