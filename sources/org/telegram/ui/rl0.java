package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class rl0 extends org.telegram.ui.Components.x31 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.x31.h(new rl0());
    }

    @Override // org.telegram.ui.Components.x31
    public final void b(View view, org.telegram.ui.Components.y31 y31Var, boolean z9, org.telegram.ui.Components.m41 m41Var, org.telegram.ui.Components.r41 r41Var) {
        sl0 sl0Var = (sl0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) y31Var.G;
        zh.z0 z0Var = sl0Var.h;
        zh.v0 v0Var = sl0Var.e;
        sl0Var.a = savedStarGift.gift.id;
        sl0Var.setPadding(0, 0, 0, 0);
        sl0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        sl0Var.b = (TL_stars.starGiftAttributeBackdrop) bi.ea.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        sl0Var.c = (TL_stars.starGiftAttributePattern) bi.ea.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        v0Var.d(sl0Var.b);
        v0Var.e(sl0Var.c);
        if (z0Var != null) {
            z0Var.setBackdrop(sl0Var.b);
            String m10 = jg.g.m(savedStarGift.gift.num, ',', new StringBuilder("#"));
            z0Var.b = m10;
            z0Var.a.f(9, m10, false);
        }
        sl0Var.b(y31Var.e, false);
    }

    @Override // org.telegram.ui.Components.x31
    public final View d(Context context, org.telegram.ui.Components.qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new sl0(context, g6Var, true);
    }
}
