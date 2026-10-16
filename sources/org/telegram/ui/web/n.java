package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.voip.r2;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class n extends e5 {
    public final r2 f = new r2(this, 3);
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
        c71 c71Var = oVar.a;
        if (c71Var != null) {
            c71Var.W2.N(true);
            oVar.a.V2.h1(0, 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void q(EditText editText) {
        int i10;
        o oVar = this.h;
        boolean z10 = !TextUtils.isEmpty(oVar.s);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(oVar.s, obj)) {
            oVar.s = obj;
            i iVar = oVar.e;
            if (iVar != null) {
                iVar.c();
            }
            i10 = ((org.telegram.ui.ActionBar.m2) oVar).currentAccount;
            i iVar2 = new i(obj, i10, new l(oVar, 1));
            oVar.e = iVar2;
            iVar2.a();
            r2 r2Var = this.f;
            AndroidUtilities.cancelRunOnUIThread(r2Var);
            AndroidUtilities.runOnUIThread(r2Var, 500L);
        }
        c71 c71Var = oVar.a;
        if (c71Var != null) {
            c71Var.W2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                oVar.a.V2.h1(0, 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void n() {
    }
}
