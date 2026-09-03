package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class uo0 extends org.telegram.ui.Components.h51 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.h51.setup(new uo0());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, org.telegram.ui.Components.i51 i51Var, boolean z4, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.g61 g61Var) {
        vo0 vo0Var = (vo0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) i51Var.G;
        kh.y1 y1Var = vo0Var.h;
        kh.u1 u1Var = vo0Var.e;
        vo0Var.a = savedStarGift.gift.id;
        vo0Var.setPadding(0, 0, 0, 0);
        vo0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        vo0Var.b = (TL_stars.starGiftAttributeBackdrop) lh.t7.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        vo0Var.c = (TL_stars.starGiftAttributePattern) lh.t7.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        u1Var.d(vo0Var.b);
        u1Var.e(vo0Var.c);
        if (y1Var != null) {
            y1Var.setBackdrop(vo0Var.b);
            String l10 = kf.k0.l(savedStarGift.gift.num, ',', new StringBuilder("#"));
            y1Var.b = l10;
            y1Var.a.e(9, l10, false);
        }
        vo0Var.b(i51Var.e, false);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, org.telegram.ui.Components.rl0 rl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new vo0(context, f6Var, true);
    }
}
