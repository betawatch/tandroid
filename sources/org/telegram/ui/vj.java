package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class vj extends lh.e {
    public final /* synthetic */ bn M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj(bn bnVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, pi piVar, dh.c cVar) {
        super(context, cVar, piVar, h6Var);
        this.M = bnVar;
    }

    @Override // lh.e, android.view.View
    public final void setVisibility(int i7) {
        super.setVisibility(i7);
        this.M.jd.h(3, i7 == 0, getMeasuredWidth() > 0);
    }
}
