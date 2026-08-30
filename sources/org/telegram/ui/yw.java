package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class yw extends FragmentContextView {
    public final /* synthetic */ int K0;
    public final /* synthetic */ oy L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw(oy oyVar, Context context, oy oyVar2, int i10) {
        super(context, oyVar2, true);
        this.K0 = i10;
        switch (i10) {
            case 1:
                this.L0 = oyVar;
                super(context, oyVar2, false);
                break;
            default:
                this.L0 = oyVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.K0) {
            case 0:
                oy oyVar = this.L0;
                oyVar.G1.i(oyVar.D1, i10 == 0, true);
                break;
            default:
                oy oyVar2 = this.L0;
                oyVar2.G1.i(oyVar2.F1, i10 == 0, true);
                break;
        }
    }
}
