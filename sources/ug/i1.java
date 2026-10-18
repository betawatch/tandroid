package ug;

import android.content.Context;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.mb0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class i1 extends ei.d {
    public final /* synthetic */ m1 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(m1 m1Var, Context context, d6 d6Var) {
        super(context, d6Var, true);
        this.h0 = m1Var;
    }

    @Override // ei.d
    public final float a(float f7, float f10) {
        m1 m1Var = this.h0;
        boolean z10 = m1Var.t0 == 0.0f;
        m1Var.t0 = f7;
        if (z10) {
            m1Var.u0 = new mb0(m1Var, 2);
            m1Var.h0(false);
        }
        return f7;
    }
}
