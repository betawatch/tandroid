package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class xv0 extends org.telegram.ui.Cells.s1 {
    public final /* synthetic */ int Ce;
    public final /* synthetic */ int De;
    public final /* synthetic */ int Ee;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xv0(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11, int i12, int i13) {
        super(context, i10, false, null, f6Var);
        this.Ce = i13;
        this.De = i11;
        this.Ee = i12;
    }

    @Override // org.telegram.ui.Cells.s1
    public final void Y1(Canvas canvas) {
        switch (this.Ce) {
            case 0:
                this.f6 = 0;
                this.g6 = this.V5.size() - 1;
                super.Y1(canvas);
                break;
            default:
                this.f6 = 0;
                this.g6 = this.V5.size() - 1;
                super.Y1(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.s1, android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.Ce) {
            case 0:
                setMeasuredDimension(this.De, this.Ee);
                break;
            default:
                setMeasuredDimension(this.De, this.Ee);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.s1, android.view.View
    public final void setPressed(boolean z4) {
        int i10 = this.Ce;
    }

    private final void A4(boolean z4) {
    }

    private final void B4(boolean z4) {
    }
}
