package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class re1 extends org.telegram.ui.ActionBar.i5 {
    public boolean f = false;
    public final /* synthetic */ xe1 h;

    public re1(xe1 xe1Var) {
        this.h = xe1Var;
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void m() {
        xe1 xe1Var = this.h;
        if (xe1Var.a.getVisibility() != 0) {
            xe1Var.a.setVisibility(0);
            xe1Var.a.setAlpha(0.0f);
        }
        xe1Var.r.setVisibility(8);
        xe1Var.d.l();
        xe1Var.a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        xe1Var.s.animate().alpha(0.0f).setDuration(150L).setListener(new qe1(this, 0)).start();
        this.f = false;
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        we1 we1Var = this.h.e;
        if (we1Var.e != null) {
            Utilities.searchQueue.cancelRunnable(we1Var.e);
            we1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            we1Var.c.clear();
            we1Var.d.clear();
            we1Var.l();
            we1Var.h.r.setVisibility(8);
        } else {
            int i10 = we1Var.f + 1;
            we1Var.f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            ve1 ve1Var = new ve1(we1Var, obj, i10, 0);
            we1Var.e = ve1Var;
            dispatchQueue.postRunnable(ve1Var, 300L);
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
        this.h.a.animate().alpha(0.0f).setDuration(150L).setListener(new qe1(this, 1)).start();
        this.h.e.d.clear();
        this.h.e.c.clear();
        this.h.e.l();
        this.h.s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
        this.f = true;
    }
}
