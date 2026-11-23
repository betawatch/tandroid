package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class zx0 extends q11 {
    public final /* synthetic */ by0 f2;
    public final /* synthetic */ h11[] g2;
    public final /* synthetic */ cy0 h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx0(cy0 cy0Var, cy0 cy0Var2, Activity activity, Integer num, by0 by0Var, h11[] h11VarArr) {
        super(cy0Var2, activity, false, num, 2, null);
        this.h2 = cy0Var;
        this.f2 = by0Var;
        this.g2 = h11VarArr;
    }

    @Override // org.telegram.ui.q11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i7;
        if (l10 == null) {
            return;
        }
        cy0 cy0Var = this.h2;
        i7 = ((org.telegram.ui.ActionBar.g2) cy0Var).currentAccount;
        org.telegram.messenger.ri.d0(i7).f2("animated_" + l10);
        by0 by0Var = this.f2;
        if (by0Var != null) {
            by0Var.a(true);
        }
        h11 h11Var = this.g2[0];
        if (h11Var != null) {
            cy0Var.n = null;
            h11Var.dismiss();
        }
    }

    @Override // org.telegram.ui.q11
    public final void r(a11 a11Var, ch.p0 p0Var) {
        int i7;
        cy0 cy0Var = this.h2;
        i7 = ((org.telegram.ui.ActionBar.g2) cy0Var).currentAccount;
        org.telegram.messenger.ri.d0(i7).f2(p0Var.f);
        by0 by0Var = this.f2;
        if (by0Var != null) {
            by0Var.a(true);
        }
        h11 h11Var = this.g2[0];
        if (h11Var != null) {
            cy0Var.n = null;
            h11Var.dismiss();
        }
    }
}
