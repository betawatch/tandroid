package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class zw extends FragmentContextView {
    public final /* synthetic */ int K0;
    public final /* synthetic */ py L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw(py pyVar, Context context, py pyVar2, int i10) {
        super(context, pyVar2, true);
        this.K0 = i10;
        switch (i10) {
            case 1:
                this.L0 = pyVar;
                super(context, pyVar2, false);
                break;
            default:
                this.L0 = pyVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.K0) {
            case 0:
                py pyVar = this.L0;
                pyVar.G1.i(pyVar.D1, i10 == 0, true);
                break;
            default:
                py pyVar2 = this.L0;
                pyVar2.G1.i(pyVar2.F1, i10 == 0, true);
                break;
        }
    }
}
