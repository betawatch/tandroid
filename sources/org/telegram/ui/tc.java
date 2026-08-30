package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class tc extends fp0 {
    public final /* synthetic */ uc C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc(uc ucVar, Context context, int i10, long j10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, j10, context, f6Var);
        this.C = ucVar;
    }

    @Override // org.telegram.ui.fp0
    public final void b(int i10, boolean z4) {
        super.b(i10, z4);
        uc ucVar = this.C;
        TextView textView = ucVar.d;
        if (textView != null) {
            textView.setTextColor(ucVar.b.h.getTextColor());
        }
    }
}
