package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class wn extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ go b;

    public wn(go goVar, Context context) {
        this.b = goVar;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        go goVar = this.b;
        if (i7 == -1) {
            goVar.finishFragment();
            return;
        }
        if (i7 == 1) {
            org.telegram.ui.ActionBar.b5 b5Var = goVar.r;
            if (b5Var == null || !b5Var.y.f) {
                String K = org.telegram.messenger.t3.K(goVar.X, false);
                if (!goVar.V || TextUtils.isEmpty(K)) {
                    goVar.e0();
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, goVar.getResourceProvider());
                String M0 = org.telegram.messenger.id.M0(goVar.a0 ? 2131748703 : 2131748701, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, goVar.a0 ? 2131748704 : 2131748702, org.telegram.ui.Cells.f1.n(goVar.getMessagesController().U2, "/", K, new StringBuilder())));
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751771, null), new w0(this, 24));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                goVar.showDialog(u1Var);
            }
        }
    }
}
