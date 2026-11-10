package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class yn extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ Context a;
    public final /* synthetic */ io b;

    public yn(io ioVar, Context context) {
        this.b = ioVar;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i7) {
        io ioVar = this.b;
        if (i7 == -1) {
            ioVar.finishFragment();
            return;
        }
        if (i7 == 1) {
            org.telegram.ui.ActionBar.c5 c5Var = ioVar.r;
            if (c5Var == null || !c5Var.y.f) {
                String K = org.telegram.messenger.t3.K(ioVar.X, false);
                if (!ioVar.V || TextUtils.isEmpty(K)) {
                    ioVar.e0();
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, ioVar.getResourceProvider());
                String M0 = org.telegram.messenger.id.M0(ioVar.a0 ? 2131748702 : 2131748700, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, ioVar.a0 ? 2131748703 : 2131748701, org.telegram.ui.Cells.f1.n(ioVar.getMessagesController().U2, "/", K, new StringBuilder())));
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751771, null), new w0(this, 24));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                ioVar.showDialog(u1Var);
            }
        }
    }
}
