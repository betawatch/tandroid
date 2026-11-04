package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class yn implements org.telegram.ui.Components.fj0 {
    public final /* synthetic */ ao a;

    public yn(ao aoVar) {
        this.a = aoVar;
    }

    @Override // org.telegram.ui.Components.fj0
    public final void f(int i3, View view) {
        TLRPC.TL_username tL_username;
        ao aoVar = this.a;
        bo boVar = aoVar.i3;
        if (!(view instanceof ha) || (tL_username = ((ha) view).w) == null) {
            return;
        }
        if (tL_username.editable) {
            if (boVar.fragmentView instanceof ScrollView) {
                boVar.a.smoothScrollTo(0, boVar.E.getTop() - org.telegram.messenger.g0.L(128.0f));
            }
            boVar.b.requestFocus();
            org.telegram.messenger.g0.K3(boVar.b);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, aoVar.getContext(), boVar.getResourceProvider());
        String M0 = org.telegram.messenger.bd.M0(tL_username.active ? 2131743674 : 2131743681, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.M0(tL_username.active ? 2131743673 : 2131743680, null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(tL_username.active ? 2131749333 : 2131745363, null), new b7(this, tL_username, view, 8));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new org.telegram.messenger.go(20));
        alertDialog$Builder.p();
    }
}
