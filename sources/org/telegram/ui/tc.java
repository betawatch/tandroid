package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class tc extends pp0 {
    public final /* synthetic */ uc G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc(uc ucVar, Context context, int i10, long j10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(i10, j10, context, u6Var);
        this.G = ucVar;
    }

    @Override // org.telegram.ui.pp0
    public final void b(int i10, boolean z10) {
        super.b(i10, z10);
        uc ucVar = this.G;
        TextView textView = ucVar.d;
        if (textView != null) {
            textView.setTextColor(ucVar.b.h.getTextColor());
        }
    }
}
