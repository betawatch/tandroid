package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class zw0 extends j71 {
    public final /* synthetic */ bi.f0 d2;
    public final /* synthetic */ a71[] e2;
    public final /* synthetic */ PremiumPreviewFragment f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw0(PremiumPreviewFragment premiumPreviewFragment, PremiumPreviewFragment premiumPreviewFragment2, Activity activity, Integer num, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11, bi.f0 f0Var, a71[] a71VarArr) {
        super(premiumPreviewFragment2, activity, true, num, i10, true, f6Var, i11);
        this.f2 = premiumPreviewFragment;
        this.d2 = f0Var;
        this.e2 = a71VarArr;
    }

    @Override // org.telegram.ui.j71
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.j71
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.d2.run(l4, num);
        a71 a71Var = this.e2[0];
        if (a71Var != null) {
            this.f2.s0 = null;
            a71Var.dismiss();
        }
    }
}
