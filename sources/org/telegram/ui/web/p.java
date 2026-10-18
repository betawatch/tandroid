package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class p extends g5 {
    public final ki.u r = new ki.u(this, 23);
    public final /* synthetic */ q s;

    public p(q qVar) {
        this.s = qVar;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void m() {
        q qVar = this.s;
        qVar.s = null;
        AndroidUtilities.cancelRunOnUIThread(this.r);
        j jVar = qVar.e;
        if (jVar != null) {
            jVar.c();
            qVar.e = null;
        }
        u61 u61Var = qVar.a;
        if (u61Var != null) {
            u61Var.W2.N(true);
            qVar.a.V2.h1(0, 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void q(EditText editText) {
        int i10;
        q qVar = this.s;
        boolean z10 = !TextUtils.isEmpty(qVar.s);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(qVar.s, obj)) {
            qVar.s = obj;
            j jVar = qVar.e;
            if (jVar != null) {
                jVar.c();
            }
            i10 = ((org.telegram.ui.ActionBar.n2) qVar).currentAccount;
            j jVar2 = new j(obj, i10, new m(qVar, 1));
            qVar.e = jVar2;
            jVar2.a();
            ki.u uVar = this.r;
            AndroidUtilities.cancelRunOnUIThread(uVar);
            AndroidUtilities.runOnUIThread(uVar, 500L);
        }
        u61 u61Var = qVar.a;
        if (u61Var != null) {
            u61Var.W2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                qVar.a.V2.h1(0, 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void n() {
    }
}
