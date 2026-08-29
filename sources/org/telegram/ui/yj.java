package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class yj extends FragmentContextView {
    public final /* synthetic */ int J0;
    public final /* synthetic */ tn K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj(tn tnVar, Context context, tn tnVar2, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, tnVar2, null, true, c6Var);
        this.J0 = i10;
        switch (i10) {
            case 1:
                this.K0 = tnVar;
                super(context, tnVar2, null, false, c6Var);
                break;
            default:
                this.K0 = tnVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.J0) {
            case 0:
                tn tnVar = this.K0;
                tnVar.I0.i(tnVar.W1, i10 == 0, true);
                break;
            default:
                tn tnVar2 = this.K0;
                tnVar2.I0.i(tnVar2.U1, i10 == 0, true);
                break;
        }
    }
}
