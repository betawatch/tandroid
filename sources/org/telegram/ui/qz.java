package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qz implements org.telegram.ui.Components.cm0, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q00 b;

    public /* synthetic */ qz(q00 q00Var, int i10) {
        this.a = i10;
        this.b = q00Var;
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean c(int i10, View view) {
        q00 q00Var = this.b;
        h00 h00Var = (h00) q00Var.P.get(i10);
        if (h00Var == null || !(view instanceof org.telegram.ui.Cells.ab)) {
            return false;
        }
        org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) view;
        q00Var.x0(h00Var, abVar.getName(), abVar.getCurrentObject(), h00Var.g);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 1:
                q00 q00Var = this.b;
                org.telegram.ui.ActionBar.e2 e2Var2 = null;
                if (q00Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.e2 e2Var3 = new org.telegram.ui.ActionBar.e2(q00Var.getParentActivity(), 3, null);
                    e2Var3.i0 = false;
                    e2Var3.show();
                    e2Var2 = e2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = q00Var.r.id;
                q00Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new z7(28, q00Var, e2Var2));
                break;
            case 2:
                this.b.s0();
                break;
            case 3:
                this.b.s0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }
}
