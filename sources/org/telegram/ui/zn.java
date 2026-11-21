package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
            org.telegram.ui.ActionBar.c5 c5Var = joVar.r;
            if (c5Var == null || !c5Var.y.f) {
                String K = org.telegram.messenger.v3.K(joVar.Y, false);
                if (!joVar.W || TextUtils.isEmpty(K)) {
                    joVar.e0();
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, joVar.getResourceProvider());
                String N0 = org.telegram.messenger.gd.N0(joVar.b0 ? 2131748509 : 2131748507, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, joVar.b0 ? 2131748510 : 2131748508, p5.c.m(joVar.getMessagesController().X2, "/", K, new StringBuilder())));
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751759, null), new w0(this, 24));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                joVar.showDialog(t1Var);
            }
        }
    }
}
