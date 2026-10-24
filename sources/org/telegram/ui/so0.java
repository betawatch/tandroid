package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class so0 extends org.telegram.ui.Components.l61 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.l61.setup(new so0());
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, org.telegram.ui.Components.m61 m61Var, boolean z10, org.telegram.ui.Components.b71 b71Var, org.telegram.ui.Components.j71 j71Var) {
        to0 to0Var = (to0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) m61Var.G;
        yh.h1 h1Var = to0Var.h;
        yh.d1 d1Var = to0Var.e;
        to0Var.a = savedStarGift.gift.id;
        to0Var.setPadding(0, 0, 0, 0);
        to0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        to0Var.b = (TL_stars.starGiftAttributeBackdrop) ai.ha.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        to0Var.c = (TL_stars.starGiftAttributePattern) ai.ha.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        d1Var.d(to0Var.b);
        d1Var.e(to0Var.c);
        if (h1Var != null) {
            h1Var.setBackdrop(to0Var.b);
            String m10 = i2.o1.m(savedStarGift.gift.num, ',', new StringBuilder("#"));
            h1Var.b = m10;
            h1Var.a.f(9, m10, false);
        }
        to0Var.b(m61Var.e, false);
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new to0(context, g6Var, true);
    }
}
