package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class o extends g5 {
    public final ki.u r = new ki.u(this, 23);
    public final /* synthetic */ p s;

    public o(p pVar) {
        this.s = pVar;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void m() {
        p pVar = this.s;
        pVar.s = null;
        AndroidUtilities.cancelRunOnUIThread(this.r);
        i iVar = pVar.e;
        if (iVar != null) {
            iVar.c();
            pVar.e = null;
        }
        u61 u61Var = pVar.a;
        if (u61Var != null) {
            u61Var.W2.N(true);
            pVar.a.V2.h1(0, 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void q(EditText editText) {
        int i10;
        p pVar = this.s;
        boolean z10 = !TextUtils.isEmpty(pVar.s);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(pVar.s, obj)) {
            pVar.s = obj;
            i iVar = pVar.e;
            if (iVar != null) {
                iVar.c();
            }
            i10 = ((n2) pVar).currentAccount;
            i iVar2 = new i(obj, i10, new l(pVar, 1));
            pVar.e = iVar2;
            iVar2.a();
            ki.u uVar = this.r;
            AndroidUtilities.cancelRunOnUIThread(uVar);
            AndroidUtilities.runOnUIThread(uVar, 500L);
        }
        u61 u61Var = pVar.a;
        if (u61Var != null) {
            u61Var.W2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                pVar.a.V2.h1(0, 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void n() {
    }
}
