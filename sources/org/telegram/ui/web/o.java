package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.z51;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class o extends h5 {
    public final i2.g0 f = new i2.g0(this, 28);
    public final /* synthetic */ p h;

    public o(p pVar) {
        this.h = pVar;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void m() {
        p pVar = this.h;
        pVar.v = null;
        AndroidUtilities.cancelRunOnUIThread(this.f);
        i iVar = pVar.f;
        if (iVar != null) {
            iVar.c();
            pVar.f = null;
        }
        z51 z51Var = pVar.a;
        if (z51Var != null) {
            z51Var.Y2.N(true);
            pVar.a.X2.h1(0, 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void q(EditText editText) {
        int i10;
        p pVar = this.h;
        boolean z10 = !TextUtils.isEmpty(pVar.v);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(pVar.v, obj)) {
            pVar.v = obj;
            i iVar = pVar.f;
            if (iVar != null) {
                iVar.c();
            }
            i10 = ((o2) pVar).currentAccount;
            i iVar2 = new i(obj, i10, new l(pVar, 1));
            pVar.f = iVar2;
            iVar2.a();
            i2.g0 g0Var = this.f;
            AndroidUtilities.cancelRunOnUIThread(g0Var);
            AndroidUtilities.runOnUIThread(g0Var, 500L);
        }
        z51 z51Var = pVar.a;
        if (z51Var != null) {
            z51Var.Y2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                pVar.a.X2.h1(0, 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void n() {
    }
}
