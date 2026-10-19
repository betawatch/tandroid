package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class zj extends FragmentContextView {
    public final /* synthetic */ int R0;
    public final /* synthetic */ qn S0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj(qn qnVar, Context context, qn qnVar2, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, qnVar2, null, true, d6Var);
        this.R0 = i10;
        switch (i10) {
            case 1:
                this.S0 = qnVar;
                super(context, qnVar2, null, false, d6Var);
                break;
            default:
                this.S0 = qnVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.R0) {
            case 0:
                qn qnVar = this.S0;
                qnVar.M0.i(qnVar.a2, i10 == 0, true);
                break;
            default:
                qn qnVar2 = this.S0;
                qnVar2.M0.i(qnVar2.Y1, i10 == 0, true);
                break;
        }
    }
}
