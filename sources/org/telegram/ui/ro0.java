package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
        yh.h1 h1Var = so0Var.h;
        yh.d1 d1Var = so0Var.e;
        so0Var.a = savedStarGift.gift.id;
        so0Var.setPadding(0, 0, 0, 0);
        so0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        so0Var.b = (TL_stars.starGiftAttributeBackdrop) ai.ga.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        so0Var.c = (TL_stars.starGiftAttributePattern) ai.ga.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        d1Var.d(so0Var.b);
        d1Var.e(so0Var.c);
        if (h1Var != null) {
            h1Var.setBackdrop(so0Var.b);
            String h = org.telegram.messenger.g0.h(savedStarGift.gift.num, ',', new StringBuilder("#"));
            h1Var.b = h;
            h1Var.a.f(9, h, false);
        }
        so0Var.b(f61Var.e, false);
    }

    @Override // org.telegram.ui.Components.e61
    public final View createView(Context context, org.telegram.ui.Components.im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new so0(context, d6Var, true);
    }
}
