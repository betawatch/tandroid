package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class yo0 extends org.telegram.ui.Components.s61 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.s61.setup(new yo0());
    }

    @Override // org.telegram.ui.Components.s61
    public final void bindView(View view, org.telegram.ui.Components.t61 t61Var, boolean z10, org.telegram.ui.Components.j71 j71Var, org.telegram.ui.Components.r71 r71Var) {
        zo0 zo0Var = (zo0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) t61Var.G;
        zh.h1 h1Var = zo0Var.h;
        zh.d1 d1Var = zo0Var.e;
        zo0Var.a = savedStarGift.gift.id;
        zo0Var.setPadding(0, 0, 0, 0);
        zo0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        zo0Var.b = (TL_stars.starGiftAttributeBackdrop) bi.ca.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        zo0Var.c = (TL_stars.starGiftAttributePattern) bi.ca.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        d1Var.d(zo0Var.b);
        d1Var.e(zo0Var.c);
        if (h1Var != null) {
            h1Var.setBackdrop(zo0Var.b);
            String i10 = org.telegram.messenger.t.i(savedStarGift.gift.num, ',', new StringBuilder("#"));
            h1Var.b = i10;
            h1Var.a.f(9, i10, false);
        }
        zo0Var.b(t61Var.e, false);
    }

    @Override // org.telegram.ui.Components.s61
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new zo0(context, u6Var, true);
    }
}
