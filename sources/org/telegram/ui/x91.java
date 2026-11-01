package org.telegram.ui;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class x91 extends org.telegram.ui.ActionBar.p0 {
    public boolean a = false;
    public final /* synthetic */ ca1 b;

    public x91(ca1 ca1Var) {
        this.b = ca1Var;
    }

    @Override // org.telegram.ui.ActionBar.p0
    public final void h() {
        ca1 ca1Var = this.b;
        if (ca1Var.a.getVisibility() != 0) {
            ca1Var.a.setVisibility(0);
            ca1Var.a.setAlpha(0.0f);
        }
        ca1Var.r.setVisibility(8);
        ca1Var.d.f();
        ca1Var.a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        ca1Var.s.animate().alpha(0.0f).setDuration(150L).setListener(new w91(this, 0)).start();
        this.a = false;
    }

    @Override // org.telegram.ui.ActionBar.p0
    public final void l(EditText editText) {
        String obj = editText.getText().toString();
        ba1 ba1Var = this.b.e;
        if (ba1Var.e != null) {
            Utilities.g.a(ba1Var.e);
            ba1Var.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            ba1Var.c.clear();
            ba1Var.d.clear();
            ba1Var.f();
            ba1Var.h.r.setVisibility(8);
        } else {
            int i10 = ba1Var.f + 1;
            ba1Var.f = i10;
            org.telegram.messenger.r5 r5Var = Utilities.g;
            aa1 aa1Var = new aa1(ba1Var, obj, i10, 0);
            ba1Var.e = aa1Var;
            r5Var.d(aa1Var, 300L);
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
        this.b.a.animate().alpha(0.0f).setDuration(150L).setListener(new w91(this, 1)).start();
        this.b.e.d.clear();
        this.b.e.c.clear();
        this.b.e.f();
        this.b.s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
        this.a = true;
    }
}
