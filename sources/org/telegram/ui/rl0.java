package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class rl0 extends org.telegram.ui.Components.m41 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.m41.h(new rl0());
    }

    @Override // org.telegram.ui.Components.m41
    public final void b(View view, org.telegram.ui.Components.n41 n41Var, boolean z10, org.telegram.ui.Components.b51 b51Var, org.telegram.ui.Components.g51 g51Var) {
        sl0 sl0Var = (sl0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) n41Var.H;
        bi.j3 j3Var = sl0Var.h;
        bi.e3 e3Var = sl0Var.e;
        sl0Var.a = savedStarGift.gift.id;
        sl0Var.setPadding(0, 0, 0, 0);
        sl0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        sl0Var.b = (TL_stars.starGiftAttributeBackdrop) di.y8.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        sl0Var.c = (TL_stars.starGiftAttributePattern) di.y8.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        e3Var.d(sl0Var.b);
        e3Var.e(sl0Var.c);
        if (j3Var != null) {
            j3Var.setBackdrop(sl0Var.b);
            String l10 = i5.c.l(savedStarGift.gift.num, ',', new StringBuilder("#"));
            j3Var.b = l10;
            j3Var.a.g(9, l10, false);
        }
        sl0Var.b(n41Var.e, false);
    }

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, org.telegram.ui.Components.ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new sl0(context, i6Var, true);
    }
}
