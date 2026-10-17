package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class qo0 extends org.telegram.ui.Components.e61 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.e61.setup(new qo0());
    }

    @Override // org.telegram.ui.Components.e61
    public final void bindView(View view, org.telegram.ui.Components.f61 f61Var, boolean z10, org.telegram.ui.Components.s61 s61Var, org.telegram.ui.Components.a71 a71Var) {
        ro0 ro0Var = (ro0) view;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) f61Var.G;
        yh.i1 i1Var = ro0Var.h;
        yh.e1 e1Var = ro0Var.e;
        ro0Var.a = savedStarGift.gift.id;
        ro0Var.setPadding(0, 0, 0, 0);
        ro0Var.c(savedStarGift.gift.getDocument(), savedStarGift.gift);
        ro0Var.b = (TL_stars.starGiftAttributeBackdrop) ai.fa.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributeBackdrop.class);
        ro0Var.c = (TL_stars.starGiftAttributePattern) ai.fa.l(savedStarGift.gift.attributes, TL_stars.starGiftAttributePattern.class);
        e1Var.d(ro0Var.b);
        e1Var.e(ro0Var.c);
        if (i1Var != null) {
            i1Var.setBackdrop(ro0Var.b);
            String h = org.telegram.messenger.q.h(savedStarGift.gift.num, ',', new StringBuilder("#"));
            i1Var.b = h;
            i1Var.a.f(9, h, false);
        }
        ro0Var.b(f61Var.e, false);
    }

    @Override // org.telegram.ui.Components.e61
    public final View createView(Context context, org.telegram.ui.Components.im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new ro0(context, d6Var, true);
    }
}
