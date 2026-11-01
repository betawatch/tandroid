package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class rc extends pn0 {
    public final /* synthetic */ sc G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc(sc scVar, Context context, int i10, long j10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(i10, j10, context, p6Var);
        this.G = scVar;
    }

    @Override // org.telegram.ui.pn0
    public final void b(int i10, boolean z10) {
        super.b(i10, z10);
        sc scVar = this.G;
        TextView textView = scVar.d;
        if (textView != null) {
            textView.setTextColor(scVar.b.h.getTextColor());
        }
    }
}
