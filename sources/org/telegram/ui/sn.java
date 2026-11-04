package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class sn extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ bo b;

    public sn(bo boVar, Context context) {
        this.b = boVar;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i3) {
        bo boVar = this.b;
        if (i3 == -1) {
            boVar.finishFragment();
            return;
        }
        if (i3 == 1) {
            org.telegram.ui.ActionBar.b5 b5Var = boVar.r;
            if (b5Var == null || !b5Var.y.f) {
                String K = org.telegram.messenger.t3.K(boVar.Y, false);
                if (!boVar.W || TextUtils.isEmpty(K)) {
                    boVar.e0();
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, boVar.getResourceProvider());
                String M0 = org.telegram.messenger.bd.M0(boVar.b0 ? 2131748710 : 2131748708, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                s1Var.S = M0;
                s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, boVar.b0 ? 2131748711 : 2131748709, org.telegram.ui.Cells.f1.r(boVar.getMessagesController().V2, "/", K, new StringBuilder())));
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751771, null), new x0(this, 24));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                boVar.showDialog(s1Var);
            }
        }
    }
}
