package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class xj extends FragmentContextView {
    public final /* synthetic */ int J0;
    public final /* synthetic */ rn K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj(rn rnVar, Context context, rn rnVar2, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, rnVar2, null, true, c6Var);
        this.J0 = i10;
        switch (i10) {
            case 1:
                this.K0 = rnVar;
                super(context, rnVar2, null, false, c6Var);
                break;
            default:
                this.K0 = rnVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.J0) {
            case 0:
                rn rnVar = this.K0;
                rnVar.I0.i(rnVar.W1, i10 == 0, true);
                break;
            default:
                rn rnVar2 = this.K0;
                rnVar2.I0.i(rnVar2.U1, i10 == 0, true);
                break;
        }
    }
}
