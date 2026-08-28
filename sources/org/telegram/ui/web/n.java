package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import mh.m2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.c51;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class n extends e5 {
    public final m2 f = new m2(this, 15);
    public final /* synthetic */ o h;

    public n(o oVar) {
        this.h = oVar;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void m() {
        o oVar = this.h;
        oVar.s = null;
        AndroidUtilities.cancelRunOnUIThread(this.f);
        i iVar = oVar.e;
        if (iVar != null) {
            iVar.c();
            oVar.e = null;
        }
        c51 c51Var = oVar.a;
        if (c51Var != null) {
            c51Var.U2.N(true);
            oVar.a.T2.h1(0, 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void q(EditText editText) {
        int i9;
        o oVar = this.h;
        boolean z10 = !TextUtils.isEmpty(oVar.s);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(oVar.s, obj)) {
            oVar.s = obj;
            i iVar = oVar.e;
            if (iVar != null) {
                iVar.c();
            }
            i9 = ((o2) oVar).currentAccount;
            i iVar2 = new i(obj, i9, new l(oVar, 1));
            oVar.e = iVar2;
            iVar2.a();
            m2 m2Var = this.f;
            AndroidUtilities.cancelRunOnUIThread(m2Var);
            AndroidUtilities.runOnUIThread(m2Var, 500L);
        }
        c51 c51Var = oVar.a;
        if (c51Var != null) {
            c51Var.U2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                oVar.a.T2.h1(0, 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void n() {
    }
}
