package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class yc extends cq0 {
    public final /* synthetic */ zc F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc(zc zcVar, Context context, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, j10, context, c6Var);
        this.F = zcVar;
    }

    @Override // org.telegram.ui.cq0
    public final void b(int i10, boolean z10) {
        super.b(i10, z10);
        zc zcVar = this.F;
        TextView textView = zcVar.d;
        if (textView != null) {
            textView.setTextColor(zcVar.b.h.getTextColor());
        }
    }
}
