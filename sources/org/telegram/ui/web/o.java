package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.l71;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class o extends org.telegram.ui.ActionBar.s0 {
    public final k2.c a = new k2.c(this, 26);
    public final /* synthetic */ p b;

    public o(p pVar) {
        this.b = pVar;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void h() {
        p pVar = this.b;
        pVar.v = null;
        AndroidUtilities.cancelRunOnUIThread(this.a);
        j jVar = pVar.f;
        if (jVar != null) {
            jVar.c();
            pVar.f = null;
        }
        l71 l71Var = pVar.a;
        if (l71Var != null) {
            l71Var.g3.O(true);
            pVar.a.f3.h1(0, 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void l(EditText editText) {
        int i10;
        p pVar = this.b;
        boolean z10 = !TextUtils.isEmpty(pVar.v);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(pVar.v, obj)) {
            pVar.v = obj;
            j jVar = pVar.f;
            if (jVar != null) {
                jVar.c();
            }
            i10 = ((r2) pVar).currentAccount;
            j jVar2 = new j(obj, i10, new m(pVar, 1));
            pVar.f = jVar2;
            jVar2.a();
            k2.c cVar = this.a;
            AndroidUtilities.cancelRunOnUIThread(cVar);
            AndroidUtilities.runOnUIThread(cVar, 500L);
        }
        l71 l71Var = pVar.a;
        if (l71Var != null) {
            l71Var.g3.O(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                pVar.a.f3.h1(0, 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void i() {
    }
}
