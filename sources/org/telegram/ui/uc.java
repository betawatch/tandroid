package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class uc extends ip0 {
    public final /* synthetic */ vc F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc(vc vcVar, Context context, int i10, long j10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, j10, context, d6Var);
        this.F = vcVar;
    }

    @Override // org.telegram.ui.ip0
    public final void b(int i10, boolean z10) {
        super.b(i10, z10);
        vc vcVar = this.F;
        TextView textView = vcVar.d;
        if (textView != null) {
            textView.setTextColor(vcVar.b.h.getTextColor());
        }
    }
}
