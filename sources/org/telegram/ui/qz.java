package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qz implements org.telegram.ui.Components.rk0, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q00 b;

    public /* synthetic */ qz(q00 q00Var, int i10) {
        this.a = i10;
        this.b = q00Var;
    }

    @Override // org.telegram.ui.Components.rk0
    public boolean a(int i10, View view) {
        q00 q00Var = this.b;
        h00 h00Var = (h00) q00Var.L.get(i10);
        if (h00Var == null || !(view instanceof org.telegram.ui.Cells.sa)) {
            return false;
        }
        org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
        q00Var.v0(h00Var, saVar.getName(), saVar.getCurrentObject(), h00Var.g);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                q00 q00Var = this.b;
                org.telegram.ui.ActionBar.b2 b2Var2 = null;
                if (q00Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(q00Var.getParentActivity(), 3, null);
                    b2Var3.c0 = false;
                    b2Var3.show();
                    b2Var2 = b2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = q00Var.r.id;
                q00Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new gg(24, q00Var, b2Var2));
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
