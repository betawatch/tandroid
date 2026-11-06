package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
