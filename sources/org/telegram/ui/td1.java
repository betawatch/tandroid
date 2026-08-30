package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class td1 extends org.telegram.ui.ActionBar.h5 {
    public boolean f = false;
    public final /* synthetic */ yd1 h;

    public td1(yd1 yd1Var) {
        this.h = yd1Var;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void m() {
        yd1 yd1Var = this.h;
        if (yd1Var.a.getVisibility() != 0) {
            yd1Var.a.setVisibility(0);
            yd1Var.a.setAlpha(0.0f);
        }
        yd1Var.r.setVisibility(8);
        yd1Var.d.l();
        yd1Var.a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        yd1Var.s.animate().alpha(0.0f).setDuration(150L).setListener(new sd1(this, 0)).start();
        this.f = false;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        xd1 xd1Var = this.h.e;
        if (xd1Var.e != null) {
            Utilities.searchQueue.cancelRunnable(xd1Var.e);
            xd1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            xd1Var.c.clear();
            xd1Var.d.clear();
            xd1Var.l();
            xd1Var.h.r.setVisibility(8);
        } else {
            int i10 = xd1Var.f + 1;
            xd1Var.f = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            wd1 wd1Var = new wd1(xd1Var, obj, i10, 0);
            xd1Var.e = wd1Var;
            dispatchQueue.postRunnable(wd1Var, 300L);
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
        this.h.a.animate().alpha(0.0f).setDuration(150L).setListener(new sd1(this, 1)).start();
        this.h.e.d.clear();
        this.h.e.c.clear();
        this.h.e.l();
        this.h.s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
        this.f = true;
    }
}
