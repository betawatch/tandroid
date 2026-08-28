package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vv0 extends b61 {
    public final /* synthetic */ bg.y0 Z1;
    public final /* synthetic */ s51[] a2;
    public final /* synthetic */ PremiumPreviewFragment b2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i9, org.telegram.ui.ActionBar.b6 b6Var, int i10, bg.y0 y0Var, s51[] s51VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i9, true, b6Var, i10);
        this.b2 = premiumPreviewFragment;
        this.Z1 = y0Var;
        this.a2 = s51VarArr;
    }

    @Override // org.telegram.ui.b61
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.b61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.Z1.run(l10, num);
        s51 s51Var = this.a2[0];
        if (s51Var != null) {
            this.b2.o0 = null;
            s51Var.dismiss();
        }
    }
}
