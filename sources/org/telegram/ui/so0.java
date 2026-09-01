package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class so0 extends org.telegram.ui.Components.i51 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.i51.setup(new so0());
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, org.telegram.ui.Components.j51 j51Var, boolean z4, org.telegram.ui.Components.x51 x51Var, org.telegram.ui.Components.i61 i61Var) {
        to0 to0Var = (to0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) j51Var.G;
        lh.y1 y1Var = to0Var.h;
        lh.u1 u1Var = to0Var.e;
        to0Var.a = savedStarGift.gift.id;
        to0Var.setPadding(0, 0, 0, 0);
        to0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        to0Var.b = (TL_stars.starGiftAttributeBackdrop) mh.t7.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        to0Var.c = (TL_stars.starGiftAttributePattern) mh.t7.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        u1Var.d(to0Var.b);
        u1Var.e(to0Var.c);
        if (y1Var != null) {
            y1Var.setBackdrop(to0Var.b);
            String l10 = l.d.l(savedStarGift.gift.num, ',', new StringBuilder("#"));
            y1Var.b = l10;
            y1Var.a.e(9, l10, false);
        }
        to0Var.b(j51Var.e, false);
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, org.telegram.ui.Components.tl0 tl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new to0(context, g6Var, true);
    }
}
