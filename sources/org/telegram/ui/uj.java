package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class uj extends lh.e {
    public final /* synthetic */ an L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj(an anVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, oi oiVar, dh.c cVar) {
        super(context, cVar, oiVar, f6Var);
        this.L = anVar;
    }

    @Override // lh.e, android.view.View
    public final void setVisibility(int i7) {
        super.setVisibility(i7);
        this.L.fd.h(3, i7 == 0, getMeasuredWidth() > 0);
    }
}
