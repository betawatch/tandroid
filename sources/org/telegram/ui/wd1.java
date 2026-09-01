package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class wd1 extends org.telegram.ui.ActionBar.i5 {
    public boolean f = false;
    public final /* synthetic */ be1 h;

    public wd1(be1 be1Var) {
        this.h = be1Var;
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void m() {
        be1 be1Var = this.h;
        if (be1Var.a.getVisibility() != 0) {
            be1Var.a.setVisibility(0);
            be1Var.a.setAlpha(0.0f);
        }
        be1Var.r.setVisibility(8);
        be1Var.d.l();
        be1Var.a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        be1Var.s.animate().alpha(0.0f).setDuration(150L).setListener(new vd1(this, 0)).start();
        this.f = false;
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        ae1 ae1Var = this.h.e;
        if (ae1Var.e != null) {
            Utilities.searchQueue.cancelRunnable(ae1Var.e);
            ae1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            ae1Var.c.clear();
            ae1Var.d.clear();
            ae1Var.l();
            ae1Var.h.r.setVisibility(8);
        } else {
            int i10 = ae1Var.f + 1;
            ae1Var.f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            zd1 zd1Var = new zd1(ae1Var, obj, i10, 0);
            ae1Var.e = zd1Var;
            dispatchQueue.postRunnable(zd1Var, 300L);
        }
        if (this.f || TextUtils.isEmpty(obj)) {
            if (this.f && TextUtils.isEmpty(obj)) {
                m();
                return;
            }
            return;
        }
        if (this.h.s.getVisibility() != 0) {
            this.h.s.setVisibility(0);
            this.h.s.setAlpha(0.0f);
        }
        this.h.a.animate().alpha(0.0f).setDuration(150L).setListener(new vd1(this, 1)).start();
        this.h.e.d.clear();
        this.h.e.c.clear();
        this.h.e.l();
        this.h.s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
        this.f = true;
    }
}
