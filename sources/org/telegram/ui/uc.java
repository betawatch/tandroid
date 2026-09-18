package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class uc extends aq0 {
    public final /* synthetic */ vc F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc(vc vcVar, Context context, int i10, long j3, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, j3, context, f6Var);
        this.F = vcVar;
    }

    @Override // org.telegram.ui.aq0
    public final void b(int i10, boolean z10) {
        super.b(i10, z10);
        vc vcVar = this.F;
        TextView textView = vcVar.d;
        if (textView != null) {
            textView.setTextColor(vcVar.b.h.getTextColor());
        }
    }
}
