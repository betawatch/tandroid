package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class zo implements org.telegram.ui.Components.gk0 {
    public final /* synthetic */ bp a;

    public zo(bp bpVar) {
        this.a = bpVar;
    }

    @Override // org.telegram.ui.Components.gk0
    public final void f(int i10, View view) {
        TLRPC.TL_username tL_username;
        bp bpVar = this.a;
        cp cpVar = bpVar.h3;
        if (!(view instanceof la) || (tL_username = ((la) view).w) == null) {
            return;
        }
        if (tL_username.editable) {
            if (cpVar.fragmentView instanceof ScrollView) {
                cpVar.a.smoothScrollTo(0, cpVar.D.getTop() - org.telegram.messenger.i0.L(128.0f));
            }
            cpVar.b.requestFocus();
            org.telegram.messenger.i0.J3(cpVar.b);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bpVar.getContext(), cpVar.getResourceProvider());
        String L0 = org.telegram.messenger.cd.L0(tL_username.active ? 2131743690 : 2131743697, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.cd.L0(tL_username.active ? 2131743689 : 2131743696, null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(tL_username.active ? 2131749334 : 2131745371, null), new a7(this, tL_username, view, 8));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new org.telegram.ui.Cells.m5(7));
        alertDialog$Builder.p();
    }
}
