package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class zw extends FragmentContextView {
    public final /* synthetic */ int P0;
    public final /* synthetic */ qy Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw(qy qyVar, Context context, qy qyVar2, int i10) {
        super(context, qyVar2, true);
        this.P0 = i10;
        switch (i10) {
            case 1:
                this.Q0 = qyVar;
                super(context, qyVar2, false);
                break;
            default:
                this.Q0 = qyVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.P0) {
            case 0:
                qy qyVar = this.Q0;
                qyVar.J1.i(qyVar.G1, i10 == 0, true);
                break;
            default:
                qy qyVar2 = this.Q0;
                qyVar2.J1.i(qyVar2.I1, i10 == 0, true);
                break;
        }
    }
}
