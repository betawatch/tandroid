package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class yb extends g11 {
    public final /* synthetic */ tb f2;
    public final /* synthetic */ x01[] g2;
    public final /* synthetic */ pc h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(pc pcVar, pc pcVar2, Activity activity, Integer num, int i3, org.telegram.ui.ActionBar.e6 e6Var, int i10, int i11, tb tbVar, x01[] x01VarArr) {
        super(pcVar2, activity, true, num, i3, true, e6Var, i10, i11);
        this.h2 = pcVar;
        this.f2 = tbVar;
        this.g2 = x01VarArr;
    }

    @Override // org.telegram.ui.g11
    public final long getDialogId() {
        return this.h2.a;
    }

    @Override // org.telegram.ui.g11
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.g11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f2.a(Long.valueOf(l10 == null ? 0L : l10.longValue()), num, tL_starGiftUnique);
        x01 x01Var = this.g2[0];
        if (x01Var != null) {
            this.h2.R = null;
            x01Var.dismiss();
        }
    }
}
