package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qz implements org.telegram.ui.Components.cm0, org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q00 b;

    public /* synthetic */ qz(q00 q00Var, int i10) {
        this.a = i10;
        this.b = q00Var;
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean d(int i10, View view) {
        q00 q00Var = this.b;
        h00 h00Var = (h00) q00Var.P.get(i10);
        if (h00Var == null || !(view instanceof org.telegram.ui.Cells.wa)) {
            return false;
        }
        org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) view;
        q00Var.v0(h00Var, waVar.getName(), waVar.getCurrentObject(), h00Var.g);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 1:
                q00 q00Var = this.b;
                org.telegram.ui.ActionBar.c2 c2Var2 = null;
                if (q00Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.c2 c2Var3 = new org.telegram.ui.ActionBar.c2(q00Var.getParentActivity(), 3, null);
                    c2Var3.i0 = false;
                    c2Var3.show();
                    c2Var2 = c2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = q00Var.r.id;
                q00Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new vc(27, q00Var, c2Var2));
                break;
            case 2:
                this.b.q0();
                break;
            case 3:
                this.b.q0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }
}
