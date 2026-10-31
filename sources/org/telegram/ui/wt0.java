package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class wt0 extends i31 {
    public final /* synthetic */ ih.s e2;
    public final /* synthetic */ z21[] f2;
    public final /* synthetic */ PremiumPreviewFragment g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.p6 p6Var, int i11, ih.s sVar, z21[] z21VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i10, true, p6Var, i11);
        this.g2 = premiumPreviewFragment;
        this.e2 = sVar;
        this.f2 = z21VarArr;
    }

    @Override // org.telegram.ui.i31
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.i31
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.e2.a(l4, num);
        z21 z21Var = this.f2[0];
        if (z21Var != null) {
            this.g2.u0 = null;
            z21Var.dismiss();
        }
    }
}
