package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class tg0 implements ns, r9 {
    public final /* synthetic */ vg0 a;

    public /* synthetic */ tg0(vg0 vg0Var) {
        this.a = vg0Var;
    }

    @Override // org.telegram.ui.r9
    public void M(String str) {
        String c2 = sf.c.c(str);
        if (TextUtils.isEmpty(c2)) {
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.go(24));
        } else {
            org.telegram.messenger.hp.s1(this.a.a).d2().a(c2, null, new ei.e(18));
        }
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ String M0() {
        return null;
    }

    @Override // org.telegram.ui.ns
    public void c(ks ksVar) {
        vg0 vg0Var = this.a;
        vg0Var.v1 = true;
        String str = ksVar.c;
        vg0Var.F1.setText(str);
        vg0Var.M0(str, ksVar);
        vg0Var.v1 = false;
        org.telegram.messenger.g0.i3(new sg0(this, 0), 300L);
        vg0Var.H1.requestFocus();
        ug0 ug0Var = vg0Var.H1;
        ug0Var.setSelection(ug0Var.length());
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ boolean e1(String str, i9 i9Var) {
        return false;
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ void V0(org.telegram.messenger.rr rrVar) {
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ void onDismiss() {
    }
}
