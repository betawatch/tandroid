package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vj extends FragmentContextView {
    public final /* synthetic */ int J0;
    public final /* synthetic */ qn K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj(qn qnVar, Context context, qn qnVar2, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        super(context, qnVar2, null, true, b6Var);
        this.J0 = i9;
        switch (i9) {
            case 1:
                this.K0 = qnVar;
                super(context, qnVar2, null, false, b6Var);
                break;
            default:
                this.K0 = qnVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i9) {
        switch (this.J0) {
            case 0:
                qn qnVar = this.K0;
                qnVar.I0.i(qnVar.W1, i9 == 0, true);
                break;
            default:
                qn qnVar2 = this.K0;
                qnVar2.I0.i(qnVar2.U1, i9 == 0, true);
                break;
        }
    }
}
