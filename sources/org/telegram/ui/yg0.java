package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class yg0 implements ps, r9 {
    public final /* synthetic */ ah0 a;

    public /* synthetic */ yg0(ah0 ah0Var) {
        this.a = ah0Var;
    }

    @Override // org.telegram.ui.r9
    public void M(String str) {
        String c10 = vf.c.c(str);
        if (TextUtils.isEmpty(c10)) {
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.vs(25));
        } else {
            org.telegram.messenger.qp.s1(this.a.a).d2().a(c10, null, new di.e(19));
        }
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ String R0() {
        return null;
    }

    @Override // org.telegram.ui.ps
    public void b(ms msVar) {
        ah0 ah0Var = this.a;
        ah0Var.u1 = true;
        String str = msVar.c;
        ah0Var.E1.setText(str);
        ah0Var.M0(str, msVar);
        ah0Var.u1 = false;
        org.telegram.messenger.g0.i3(new ef0(this, 1), 300L);
        ah0Var.G1.requestFocus();
        zg0 zg0Var = ah0Var.G1;
        zg0Var.setSelection(zg0Var.length());
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ boolean h1(String str, j9 j9Var) {
        return false;
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ void V0(org.telegram.messenger.zr zrVar) {
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ void onDismiss() {
    }
}
