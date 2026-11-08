package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class xx0 extends q11 {
    public final /* synthetic */ zx0 e2;
    public final /* synthetic */ h11[] f2;
    public final /* synthetic */ ay0 g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx0(ay0 ay0Var, ay0 ay0Var2, Activity activity, Integer num, zx0 zx0Var, h11[] h11VarArr) {
        super(ay0Var2, activity, false, num, 2, null);
        this.g2 = ay0Var;
        this.e2 = zx0Var;
        this.f2 = h11VarArr;
    }

    @Override // org.telegram.ui.q11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i7;
        if (l10 == null) {
            return;
        }
        ay0 ay0Var = this.g2;
        i7 = ((org.telegram.ui.ActionBar.f2) ay0Var).currentAccount;
        org.telegram.messenger.ui.b0(i7).a2("animated_" + l10);
        zx0 zx0Var = this.e2;
        if (zx0Var != null) {
            zx0Var.a(true);
        }
        h11 h11Var = this.f2[0];
        if (h11Var != null) {
            ay0Var.n = null;
            h11Var.dismiss();
        }
    }

    @Override // org.telegram.ui.q11
    public final void r(a11 a11Var, ch.o0 o0Var) {
        int i7;
        ay0 ay0Var = this.g2;
        i7 = ((org.telegram.ui.ActionBar.f2) ay0Var).currentAccount;
        org.telegram.messenger.ui.b0(i7).a2(o0Var.f);
        zx0 zx0Var = this.e2;
        if (zx0Var != null) {
            zx0Var.a(true);
        }
        h11 h11Var = this.f2[0];
        if (h11Var != null) {
            ay0Var.n = null;
            h11Var.dismiss();
        }
    }
}
