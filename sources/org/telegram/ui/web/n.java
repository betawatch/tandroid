package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class n extends f5 {
    public final i2.h0 f = new i2.h0(this, 28);
    public final /* synthetic */ o h;

    public n(o oVar) {
        this.h = oVar;
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void m() {
        o oVar = this.h;
        oVar.s = null;
        AndroidUtilities.cancelRunOnUIThread(this.f);
        i iVar = oVar.e;
        if (iVar != null) {
            iVar.c();
            oVar.e = null;
        }
        x51 x51Var = oVar.a;
        if (x51Var != null) {
            x51Var.Y2.N(true);
            oVar.a.X2.h1(0, 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.f5
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
            i10 = ((n2) oVar).currentAccount;
            i iVar2 = new i(obj, i10, new l(oVar, 1));
            oVar.e = iVar2;
            iVar2.a();
            i2.h0 h0Var = this.f;
            AndroidUtilities.cancelRunOnUIThread(h0Var);
            AndroidUtilities.runOnUIThread(h0Var, 500L);
        }
        x51 x51Var = oVar.a;
        if (x51Var != null) {
            x51Var.Y2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                oVar.a.X2.h1(0, 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final void n() {
    }
}
