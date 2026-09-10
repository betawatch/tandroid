package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.Components.l61;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class o extends i5 {
    public final org.telegram.ui.Components.voip.x f = new org.telegram.ui.Components.voip.x(this, 10);
    public final /* synthetic */ p h;

    public o(p pVar) {
        this.h = pVar;
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void m() {
        p pVar = this.h;
        pVar.s = null;
        AndroidUtilities.cancelRunOnUIThread(this.f);
        j jVar = pVar.e;
        if (jVar != null) {
            jVar.c();
            pVar.e = null;
        }
        l61 l61Var = pVar.a;
        if (l61Var != null) {
            l61Var.Y2.N(true);
            pVar.a.X2.h1(0, 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.i5
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
            i10 = ((org.telegram.ui.ActionBar.p2) pVar).currentAccount;
            j jVar2 = new j(obj, i10, new m(pVar, 1));
            pVar.e = jVar2;
            jVar2.a();
            org.telegram.ui.Components.voip.x xVar = this.f;
            AndroidUtilities.cancelRunOnUIThread(xVar);
            AndroidUtilities.runOnUIThread(xVar, 500L);
        }
        l61 l61Var = pVar.a;
        if (l61Var != null) {
            l61Var.Y2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                pVar.a.X2.h1(0, 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void n() {
    }
}
