package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class zn extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ jo b;

    public zn(jo joVar, Context context) {
        this.b = joVar;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        jo joVar = this.b;
        if (i7 == -1) {
            joVar.finishFragment();
            return;
        }
        if (i7 == 1) {
            org.telegram.ui.ActionBar.d5 d5Var = joVar.r;
            if (d5Var == null || !d5Var.y.f) {
                String K = org.telegram.messenger.v3.K(joVar.Y, false);
                if (!joVar.W || TextUtils.isEmpty(K)) {
                    joVar.e0();
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, joVar.getResourceProvider());
                String M0 = org.telegram.messenger.gd.M0(joVar.b0 ? 2131748510 : 2131748508, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.S = M0;
                u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, joVar.b0 ? 2131748511 : 2131748509, p5.c.m(joVar.getMessagesController().X2, "/", K, new StringBuilder())));
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751760, null), new w0(this, 24));
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                joVar.showDialog(u1Var);
            }
        }
    }
}
