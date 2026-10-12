package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class zc extends eq0 {
    public final /* synthetic */ ad F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc(ad adVar, Context context, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, j10, context, c6Var);
        this.F = adVar;
    }

    @Override // org.telegram.ui.eq0
    public final void b(int i10, boolean z10) {
        super.b(i10, z10);
        ad adVar = this.F;
        TextView textView = adVar.d;
        if (textView != null) {
            textView.setTextColor(adVar.b.h.getTextColor());
        }
    }
}
