package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class uc extends up0 {
    public final /* synthetic */ vc F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc(vc vcVar, Context context, int i10, long j3, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, j3, context, d6Var);
        this.F = vcVar;
    }

    @Override // org.telegram.ui.up0
    public final void b(int i10, boolean z10) {
        super.b(i10, z10);
        vc vcVar = this.F;
        TextView textView = vcVar.d;
        if (textView != null) {
            textView.setTextColor(vcVar.b.h.getTextColor());
        }
    }
}
