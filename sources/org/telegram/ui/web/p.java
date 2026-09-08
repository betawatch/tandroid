package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class p extends g5 {
    public final b f = new b(this, 1);
    public final /* synthetic */ q h;

    public p(q qVar) {
        this.h = qVar;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void m() {
        q qVar = this.h;
        qVar.s = null;
        AndroidUtilities.cancelRunOnUIThread(this.f);
        j jVar = qVar.e;
        if (jVar != null) {
            jVar.c();
            qVar.e = null;
        }
        x51 x51Var = qVar.a;
        if (x51Var != null) {
            x51Var.Y2.N(true);
            qVar.a.X2.h1(0, 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void q(EditText editText) {
        int i10;
        q qVar = this.h;
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
            b bVar = this.f;
            AndroidUtilities.cancelRunOnUIThread(bVar);
            AndroidUtilities.runOnUIThread(bVar, 500L);
        }
        x51 x51Var = qVar.a;
        if (x51Var != null) {
            x51Var.Y2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                qVar.a.X2.h1(0, 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void n() {
    }
}
