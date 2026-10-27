package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class tc extends rp0 {
    public final /* synthetic */ uc G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc(uc ucVar, Context context, int i10, long j10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(i10, j10, context, u6Var);
        this.G = ucVar;
    }

    @Override // org.telegram.ui.rp0
    public final void b(int i10, boolean z10) {
        super.b(i10, z10);
        uc ucVar = this.G;
        TextView textView = ucVar.d;
        if (textView != null) {
            textView.setTextColor(ucVar.b.h.getTextColor());
        }
    }
}
