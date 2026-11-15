package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ql0 extends org.telegram.ui.Components.a41 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.a41.h(new ql0());
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, org.telegram.ui.Components.b41 b41Var, boolean z10, org.telegram.ui.Components.p41 p41Var, org.telegram.ui.Components.u41 u41Var) {
        rl0 rl0Var = (rl0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) b41Var.G;
        bi.j2 j2Var = rl0Var.h;
        bi.e2 e2Var = rl0Var.e;
        rl0Var.a = savedStarGift.gift.id;
        rl0Var.setPadding(0, 0, 0, 0);
        rl0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        rl0Var.b = (TL_stars.starGiftAttributeBackdrop) di.v8.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        rl0Var.c = (TL_stars.starGiftAttributePattern) di.v8.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        e2Var.d(rl0Var.b);
        e2Var.e(rl0Var.c);
        if (j2Var != null) {
            j2Var.setBackdrop(rl0Var.b);
            String l10 = i5.c.l(savedStarGift.gift.num, ',', new StringBuilder("#"));
            j2Var.b = l10;
            j2Var.a.f(9, l10, false);
        }
        rl0Var.b(b41Var.e, false);
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, org.telegram.ui.Components.uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new rl0(context, e6Var, true);
    }
}
