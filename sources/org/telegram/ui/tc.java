package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class tc extends zp0 {
    public final /* synthetic */ uc F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc(uc ucVar, Context context, int i10, long j3, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, j3, context, f6Var);
        this.F = ucVar;
    }

    @Override // org.telegram.ui.zp0
    public final void b(int i10, boolean z10) {
        super.b(i10, z10);
        uc ucVar = this.F;
        TextView textView = ucVar.d;
        if (textView != null) {
            textView.setTextColor(ucVar.b.h.getTextColor());
        }
    }
}
