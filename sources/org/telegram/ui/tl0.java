package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class tl0 extends org.telegram.ui.Components.k41 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.k41.h(new tl0());
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, org.telegram.ui.Components.l41 l41Var, boolean z10, org.telegram.ui.Components.z41 z41Var, org.telegram.ui.Components.e51 e51Var) {
        ul0 ul0Var = (ul0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) l41Var.H;
        bi.d3 d3Var = ul0Var.h;
        bi.y2 y2Var = ul0Var.e;
        ul0Var.a = savedStarGift.gift.id;
        ul0Var.setPadding(0, 0, 0, 0);
        ul0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        ul0Var.b = (TL_stars.starGiftAttributeBackdrop) di.x8.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        ul0Var.c = (TL_stars.starGiftAttributePattern) di.x8.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        y2Var.d(ul0Var.b);
        y2Var.e(ul0Var.c);
        if (d3Var != null) {
            d3Var.setBackdrop(ul0Var.b);
            String l10 = i5.c.l(savedStarGift.gift.num, ',', new StringBuilder("#"));
            d3Var.b = l10;
            d3Var.a.g(9, l10, false);
        }
        ul0Var.b(l41Var.e, false);
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, org.telegram.ui.Components.ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new ul0(context, i6Var, true);
    }
}
