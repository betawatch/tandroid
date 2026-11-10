package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class sl0 extends org.telegram.ui.Components.w31 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.w31.h(new sl0());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, org.telegram.ui.Components.x31 x31Var, boolean z9, org.telegram.ui.Components.m41 m41Var, org.telegram.ui.Components.r41 r41Var) {
        tl0 tl0Var = (tl0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) x31Var.G;
        zh.z0 z0Var = tl0Var.h;
        zh.v0 v0Var = tl0Var.e;
        tl0Var.a = savedStarGift.gift.id;
        tl0Var.setPadding(0, 0, 0, 0);
        tl0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        tl0Var.b = (TL_stars.starGiftAttributeBackdrop) bi.ea.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        tl0Var.c = (TL_stars.starGiftAttributePattern) bi.ea.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        v0Var.d(tl0Var.b);
        v0Var.e(tl0Var.c);
        if (z0Var != null) {
            z0Var.setBackdrop(tl0Var.b);
            String m10 = jg.g.m(savedStarGift.gift.num, ',', new StringBuilder("#"));
            z0Var.b = m10;
            z0Var.a.f(9, m10, false);
        }
        tl0Var.b(x31Var.e, false);
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new tl0(context, h6Var, true);
    }
}
