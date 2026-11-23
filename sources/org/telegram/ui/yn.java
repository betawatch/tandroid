package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class yn extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ io b;

    public yn(io ioVar, Context context) {
        this.b = ioVar;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        io ioVar = this.b;
        if (i7 == -1) {
            ioVar.finishFragment();
            return;
        }
        if (i7 == 1) {
            org.telegram.ui.ActionBar.c5 c5Var = ioVar.r;
            if (c5Var == null || !c5Var.y.f) {
                String K = org.telegram.messenger.v3.K(ioVar.Y, false);
                if (!ioVar.W || TextUtils.isEmpty(K)) {
                    ioVar.e0();
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, ioVar.getResourceProvider());
                String N0 = org.telegram.messenger.gd.N0(ioVar.b0 ? 2131748509 : 2131748507, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, ioVar.b0 ? 2131748510 : 2131748508, p5.c.m(ioVar.getMessagesController().X2, "/", K, new StringBuilder())));
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751759, null), new w0(this, 24));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                ioVar.showDialog(t1Var);
            }
        }
    }
}
