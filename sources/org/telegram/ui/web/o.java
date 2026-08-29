package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import nh.m6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.o51;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class o extends e5 {
    public final m6 f = new m6(this, 24);
    public final /* synthetic */ p h;

    public o(p pVar) {
        this.h = pVar;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void m() {
        p pVar = this.h;
        pVar.s = null;
        AndroidUtilities.cancelRunOnUIThread(this.f);
        j jVar = pVar.e;
        if (jVar != null) {
            jVar.c();
            pVar.e = null;
        }
        o51 o51Var = pVar.a;
        if (o51Var != null) {
            o51Var.U2.N(true);
            pVar.a.T2.h1(0, 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void q(EditText editText) {
        int i10;
        p pVar = this.h;
        boolean z10 = !TextUtils.isEmpty(pVar.s);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(pVar.s, obj)) {
            pVar.s = obj;
            j jVar = pVar.e;
            if (jVar != null) {
                jVar.c();
            }
            i10 = ((o2) pVar).currentAccount;
            j jVar2 = new j(obj, i10, new m(pVar, 1));
            pVar.e = jVar2;
            jVar2.a();
            m6 m6Var = this.f;
            AndroidUtilities.cancelRunOnUIThread(m6Var);
            AndroidUtilities.runOnUIThread(m6Var, 500L);
        }
        o51 o51Var = pVar.a;
        if (o51Var != null) {
            o51Var.U2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                pVar.a.T2.h1(0, 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void n() {
    }
}
