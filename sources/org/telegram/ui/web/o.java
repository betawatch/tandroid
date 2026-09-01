package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import oh.t3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.b61;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class o extends i5 {
    public final t3 f = new t3(this, 28);
    public final /* synthetic */ p h;

    public o(p pVar) {
        this.h = pVar;
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void m() {
        p pVar = this.h;
        pVar.s = null;
        AndroidUtilities.cancelRunOnUIThread(this.f);
        i iVar = pVar.e;
        if (iVar != null) {
            iVar.c();
            pVar.e = null;
        }
        b61 b61Var = pVar.a;
        if (b61Var != null) {
            b61Var.V2.N(true);
            pVar.a.U2.h1(0, 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void q(EditText editText) {
        int i10;
        p pVar = this.h;
        boolean z4 = !TextUtils.isEmpty(pVar.s);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(pVar.s, obj)) {
            pVar.s = obj;
            i iVar = pVar.e;
            if (iVar != null) {
                iVar.c();
            }
            i10 = ((p2) pVar).currentAccount;
            i iVar2 = new i(obj, i10, new l(pVar, 1));
            pVar.e = iVar2;
            iVar2.a();
            t3 t3Var = this.f;
            AndroidUtilities.cancelRunOnUIThread(t3Var);
            AndroidUtilities.runOnUIThread(t3Var, 500L);
        }
        b61 b61Var = pVar.a;
        if (b61Var != null) {
            b61Var.V2.N(true);
            if (z4 != (!TextUtils.isEmpty(obj))) {
                pVar.a.U2.h1(0, 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void n() {
    }
}
