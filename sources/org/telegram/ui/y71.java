package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y71 extends org.telegram.ui.ActionBar.m0 {
    public boolean a = false;
    public final /* synthetic */ d81 b;

    public y71(d81 d81Var) {
        this.b = d81Var;
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void h() {
        d81 d81Var = this.b;
        if (d81Var.a.getVisibility() != 0) {
            d81Var.a.setVisibility(0);
            d81Var.a.setAlpha(0.0f);
        }
        d81Var.r.setVisibility(8);
        d81Var.d.f();
        d81Var.a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        d81Var.s.animate().alpha(0.0f).setDuration(150L).setListener(new x71(this, 0)).start();
        this.a = false;
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void l(EditText editText) {
        String obj = editText.getText().toString();
        c81 c81Var = this.b.e;
        if (c81Var.e != null) {
            Utilities.g.a(c81Var.e);
            c81Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            c81Var.c.clear();
            c81Var.d.clear();
            c81Var.f();
            c81Var.h.r.setVisibility(8);
        } else {
            int i3 = c81Var.f + 1;
            c81Var.f = i3;
            org.telegram.messenger.p5 p5Var = Utilities.g;
            b81 b81Var = new b81(c81Var, obj, i3, 0);
            c81Var.e = b81Var;
            p5Var.e(b81Var, 300L);
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
        this.b.a.animate().alpha(0.0f).setDuration(150L).setListener(new x71(this, 1)).start();
        this.b.e.d.clear();
        this.b.e.c.clear();
        this.b.e.f();
        this.b.s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
        this.a = true;
    }
}
