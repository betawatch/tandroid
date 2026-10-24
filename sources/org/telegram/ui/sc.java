package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class sc extends jp0 {
    public final /* synthetic */ tc G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc(tc tcVar, Context context, int i10, long j10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(i10, j10, context, g6Var);
        this.G = tcVar;
    }

    @Override // org.telegram.ui.jp0
    public final void b(int i10, boolean z10) {
        super.b(i10, z10);
        tc tcVar = this.G;
        TextView textView = tcVar.d;
        if (textView != null) {
            textView.setTextColor(tcVar.b.h.getTextColor());
        }
    }
}
