package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class qw0 extends a71 {
    public final /* synthetic */ ai.m0 d2;
    public final /* synthetic */ r61[] e2;
    public final /* synthetic */ PremiumPreviewFragment f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11, ai.m0 m0Var, r61[] r61VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i10, true, d6Var, i11);
        this.f2 = premiumPreviewFragment;
        this.d2 = m0Var;
        this.e2 = r61VarArr;
    }

    @Override // org.telegram.ui.a71
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.a71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.d2.run(l4, num);
        r61 r61Var = this.e2[0];
        if (r61Var != null) {
            this.f2.s0 = null;
            r61Var.dismiss();
        }
    }
}
