package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class xn extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ho b;

    public xn(ho hoVar, Context context) {
        this.b = hoVar;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        ho hoVar = this.b;
        if (i7 == -1) {
            hoVar.finishFragment();
            return;
        }
        if (i7 == 1) {
            org.telegram.ui.ActionBar.z4 z4Var = hoVar.r;
            if (z4Var == null || !z4Var.y.f) {
                String K = org.telegram.messenger.t3.K(hoVar.Y, false);
                if (!hoVar.W || TextUtils.isEmpty(K)) {
                    hoVar.e0();
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, hoVar.getResourceProvider());
                String M0 = org.telegram.messenger.hd.M0(hoVar.b0 ? 2131748702 : 2131748700, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = M0;
                t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, hoVar.b0 ? 2131748703 : 2131748701, org.telegram.ui.Cells.y0.m(hoVar.getMessagesController().V2, "/", K, new StringBuilder())));
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751771, null), new w0(this, 24));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                hoVar.showDialog(t1Var);
            }
        }
    }
}
