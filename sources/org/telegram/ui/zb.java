package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class zb extends n11 {
    public final /* synthetic */ ub f2;
    public final /* synthetic */ e11[] g2;
    public final /* synthetic */ qc h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(qc qcVar, qc qcVar2, Activity activity, Integer num, int i7, org.telegram.ui.ActionBar.e6 e6Var, int i10, int i11, ub ubVar, e11[] e11VarArr) {
        super(qcVar2, activity, true, num, i7, true, e6Var, i10, i11);
        this.h2 = qcVar;
        this.f2 = ubVar;
        this.g2 = e11VarArr;
    }

    @Override // org.telegram.ui.n11
    public final long getDialogId() {
        return this.h2.a;
    }

    @Override // org.telegram.ui.n11
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.n11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f2.a(Long.valueOf(l10 == null ? 0L : l10.longValue()), num, tL_starGiftUnique);
        e11 e11Var = this.g2[0];
        if (e11Var != null) {
            this.h2.R = null;
            e11Var.dismiss();
        }
    }
}
