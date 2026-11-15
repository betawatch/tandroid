package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class wx0 extends n11 {
    public final /* synthetic */ yx0 f2;
    public final /* synthetic */ e11[] g2;
    public final /* synthetic */ zx0 h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx0(zx0 zx0Var, zx0 zx0Var2, Activity activity, Integer num, yx0 yx0Var, e11[] e11VarArr) {
        super(zx0Var2, activity, false, num, 2, null);
        this.h2 = zx0Var;
        this.f2 = yx0Var;
        this.g2 = e11VarArr;
    }

    @Override // org.telegram.ui.n11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i7;
        if (l10 == null) {
            return;
        }
        zx0 zx0Var = this.h2;
        i7 = ((org.telegram.ui.ActionBar.e2) zx0Var).currentAccount;
        org.telegram.messenger.si.b0(i7).a2("animated_" + l10);
        yx0 yx0Var = this.f2;
        if (yx0Var != null) {
            yx0Var.a(true);
        }
        e11 e11Var = this.g2[0];
        if (e11Var != null) {
            zx0Var.n = null;
            e11Var.dismiss();
        }
    }

    @Override // org.telegram.ui.n11
    public final void r(x01 x01Var, ch.p0 p0Var) {
        int i7;
        zx0 zx0Var = this.h2;
        i7 = ((org.telegram.ui.ActionBar.e2) zx0Var).currentAccount;
        org.telegram.messenger.si.b0(i7).a2(p0Var.f);
        yx0 yx0Var = this.f2;
        if (yx0Var != null) {
            yx0Var.a(true);
        }
        e11 e11Var = this.g2[0];
        if (e11Var != null) {
            zx0Var.n = null;
            e11Var.dismiss();
        }
    }
}
