package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class vt0 extends g31 {
    public final /* synthetic */ ih.s e2;
    public final /* synthetic */ x21[] f2;
    public final /* synthetic */ PremiumPreviewFragment g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.p6 p6Var, int i11, ih.s sVar, x21[] x21VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i10, true, p6Var, i11);
        this.g2 = premiumPreviewFragment;
        this.e2 = sVar;
        this.f2 = x21VarArr;
    }

    @Override // org.telegram.ui.g31
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.g31
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.e2.a(l4, num);
        x21 x21Var = this.f2[0];
        if (x21Var != null) {
            this.g2.u0 = null;
            x21Var.dismiss();
        }
    }
}
