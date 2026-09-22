package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class tc extends aq0 {
    public final /* synthetic */ uc F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc(uc ucVar, Context context, int i10, long j3, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, j3, context, f6Var);
        this.F = ucVar;
    }

    @Override // org.telegram.ui.aq0
    public final void b(int i10, boolean z10) {
        super.b(i10, z10);
        uc ucVar = this.F;
        TextView textView = ucVar.d;
        if (textView != null) {
            textView.setTextColor(ucVar.b.h.getTextColor());
        }
    }
}
