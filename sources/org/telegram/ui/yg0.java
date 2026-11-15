package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class yg0 implements ss, s9 {
    public final /* synthetic */ bh0 a;

    public /* synthetic */ yg0(bh0 bh0Var) {
        this.a = bh0Var;
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ String J0() {
        return null;
    }

    @Override // org.telegram.ui.s9
    public void M(String str) {
        String c10 = vf.c.c(str);
        if (TextUtils.isEmpty(c10)) {
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ih(29));
        } else {
            org.telegram.messenger.np.s1(this.a.a).d2().a(c10, null, new fi.e(19));
        }
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ boolean d1(String str, j9 j9Var) {
        return false;
    }

    @Override // org.telegram.ui.ss
    public void e(ps psVar) {
        bh0 bh0Var = this.a;
        bh0Var.y1 = true;
        String str = psVar.c;
        bh0Var.I1.setText(str);
        bh0Var.M0(str, psVar);
        bh0Var.y1 = false;
        org.telegram.messenger.g0.i3(new ef0(this, 1), 300L);
        bh0Var.K1.requestFocus();
        zg0 zg0Var = bh0Var.K1;
        zg0Var.setSelection(zg0Var.length());
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ void S0(org.telegram.messenger.wr wrVar) {
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ void onDismiss() {
    }
}
