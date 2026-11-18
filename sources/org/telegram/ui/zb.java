package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class zb extends r11 {
    public final /* synthetic */ ub f2;
    public final /* synthetic */ i11[] g2;
    public final /* synthetic */ qc h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(qc qcVar, qc qcVar2, Activity activity, Integer num, int i7, org.telegram.ui.ActionBar.i6 i6Var, int i10, int i11, ub ubVar, i11[] i11VarArr) {
        super(qcVar2, activity, true, num, i7, true, i6Var, i10, i11);
        this.h2 = qcVar;
        this.f2 = ubVar;
        this.g2 = i11VarArr;
    }

    @Override // org.telegram.ui.r11
    public final long getDialogId() {
        return this.h2.a;
    }

    @Override // org.telegram.ui.r11
    public final float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    @Override // org.telegram.ui.r11
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        this.f2.a(Long.valueOf(l10 == null ? 0L : l10.longValue()), num, tL_starGiftUnique);
        i11 i11Var = this.g2[0];
        if (i11Var != null) {
            this.h2.R = null;
            i11Var.dismiss();
        }
    }
}
