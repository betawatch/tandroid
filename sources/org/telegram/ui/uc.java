package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
