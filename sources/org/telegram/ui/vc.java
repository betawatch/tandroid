package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class vc extends lp0 {
    public final /* synthetic */ wc C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc(wc wcVar, Context context, int i10, long j10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, j10, context, f6Var);
        this.C = wcVar;
    }

    @Override // org.telegram.ui.lp0
    public final void b(int i10, boolean z4) {
        super.b(i10, z4);
        wc wcVar = this.C;
        TextView textView = wcVar.d;
        if (textView != null) {
            textView.setTextColor(wcVar.b.h.getTextColor());
        }
    }
}
