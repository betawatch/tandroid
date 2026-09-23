package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class sc extends sp0 {
    public final /* synthetic */ tc F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc(tc tcVar, Context context, int i10, long j3, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, j3, context, d6Var);
        this.F = tcVar;
    }

    @Override // org.telegram.ui.sp0
    public final void b(int i10, boolean z10) {
        super.b(i10, z10);
        tc tcVar = this.F;
        TextView textView = tcVar.d;
        if (textView != null) {
            textView.setTextColor(tcVar.b.h.getTextColor());
        }
    }
}
