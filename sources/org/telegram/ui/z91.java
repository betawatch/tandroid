package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z91 extends org.telegram.ui.ActionBar.p0 {
    public boolean a = false;
    public final /* synthetic */ ea1 b;

    public z91(ea1 ea1Var) {
        this.b = ea1Var;
    }

    @Override // org.telegram.ui.ActionBar.p0
    public final void h() {
        ea1 ea1Var = this.b;
        if (ea1Var.a.getVisibility() != 0) {
            ea1Var.a.setVisibility(0);
            ea1Var.a.setAlpha(0.0f);
        }
        ea1Var.r.setVisibility(8);
        ea1Var.d.f();
        ea1Var.a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        ea1Var.s.animate().alpha(0.0f).setDuration(150L).setListener(new y91(this, 0)).start();
        this.a = false;
    }

    @Override // org.telegram.ui.ActionBar.p0
    public final void l(EditText editText) {
        String obj = editText.getText().toString();
        da1 da1Var = this.b.e;
        if (da1Var.e != null) {
            Utilities.g.a(da1Var.e);
            da1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            da1Var.c.clear();
            da1Var.d.clear();
            da1Var.f();
            da1Var.h.r.setVisibility(8);
        } else {
            int i10 = da1Var.f + 1;
            da1Var.f = i10;
            org.telegram.messenger.r5 r5Var = Utilities.g;
            ca1 ca1Var = new ca1(da1Var, obj, i10, 0);
            da1Var.e = ca1Var;
            r5Var.d(ca1Var, 300L);
        }
        if (this.a || TextUtils.isEmpty(obj)) {
            if (this.a && TextUtils.isEmpty(obj)) {
                h();
                return;
            }
            return;
        }
        if (this.b.s.getVisibility() != 0) {
            this.b.s.setVisibility(0);
            this.b.s.setAlpha(0.0f);
        }
        this.b.a.animate().alpha(0.0f).setDuration(150L).setListener(new y91(this, 1)).start();
        this.b.e.d.clear();
        this.b.e.c.clear();
        this.b.e.f();
        this.b.s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
        this.a = true;
    }
}
