package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.d71;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class o extends k5 {
    public final ki.u r = new ki.u(this, 23);
    public final /* synthetic */ p s;

    public o(p pVar) {
        this.s = pVar;
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final void m() {
        p pVar = this.s;
        pVar.s = null;
        AndroidUtilities.cancelRunOnUIThread(this.r);
        j jVar = pVar.e;
        if (jVar != null) {
            jVar.c();
            pVar.e = null;
        }
        d71 d71Var = pVar.a;
        if (d71Var != null) {
            d71Var.Z2.N(true);
            pVar.a.Y2.h1(0, 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final void q(EditText editText) {
        int i10;
        p pVar = this.s;
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
            ki.u uVar = this.r;
            AndroidUtilities.cancelRunOnUIThread(uVar);
            AndroidUtilities.runOnUIThread(uVar, 500L);
        }
        d71 d71Var = pVar.a;
        if (d71Var != null) {
            d71Var.Z2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                pVar.a.Y2.h1(0, 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final void n() {
    }
}
