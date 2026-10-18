package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ro0 extends org.telegram.ui.Components.e61 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.e61.setup(new ro0());
    }

    @Override // org.telegram.ui.Components.e61
    public final void bindView(View view, org.telegram.ui.Components.f61 f61Var, boolean z10, org.telegram.ui.Components.s61 s61Var, org.telegram.ui.Components.a71 a71Var) {
        so0 so0Var = (so0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) f61Var.G;
        yh.i1 i1Var = so0Var.h;
        yh.e1 e1Var = so0Var.e;
        so0Var.a = savedStarGift.gift.id;
        so0Var.setPadding(0, 0, 0, 0);
        so0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        so0Var.b = (TL_stars.starGiftAttributeBackdrop) ai.ga.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        so0Var.c = (TL_stars.starGiftAttributePattern) ai.ga.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        e1Var.d(so0Var.b);
        e1Var.e(so0Var.c);
        if (i1Var != null) {
            i1Var.setBackdrop(so0Var.b);
            String h = org.telegram.messenger.g0.h(savedStarGift.gift.num, ',', new StringBuilder("#"));
            i1Var.b = h;
            i1Var.a.f(9, h, false);
        }
        so0Var.b(f61Var.e, false);
    }

    @Override // org.telegram.ui.Components.e61
    public final View createView(Context context, org.telegram.ui.Components.im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new so0(context, d6Var, true);
    }
}
