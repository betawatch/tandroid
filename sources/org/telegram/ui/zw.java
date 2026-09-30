package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class zw extends FragmentContextView {
    public final /* synthetic */ int Q0;
    public final /* synthetic */ qy R0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw(qy qyVar, Context context, qy qyVar2, int i10) {
        super(context, qyVar2, true);
        this.Q0 = i10;
        switch (i10) {
            case 1:
                this.R0 = qyVar;
                super(context, qyVar2, false);
                break;
            default:
                this.R0 = qyVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.Q0) {
            case 0:
                qy qyVar = this.R0;
                qyVar.J1.i(qyVar.G1, i10 == 0, true);
                break;
            default:
                qy qyVar2 = this.R0;
                qyVar2.J1.i(qyVar2.I1, i10 == 0, true);
                break;
        }
    }
}
