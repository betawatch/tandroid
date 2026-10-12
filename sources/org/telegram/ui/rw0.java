package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class rw0 extends org.telegram.ui.Cells.u1 {
    public final /* synthetic */ int Ge;
    public final /* synthetic */ int He;
    public final /* synthetic */ int Ie;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rw0(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11, int i12, int i13) {
        super(context, i10, false, null, c6Var);
        this.Ge = i13;
        this.He = i11;
        this.Ie = i12;
    }

    @Override // org.telegram.ui.Cells.u1
    public final void Y1(Canvas canvas) {
        switch (this.Ge) {
            case 0:
                this.i6 = 0;
                this.j6 = this.Y5.size() - 1;
                super.Y1(canvas);
                break;
            default:
                this.i6 = 0;
                this.j6 = this.Y5.size() - 1;
                super.Y1(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.u1, android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.Ge) {
            case 0:
                setMeasuredDimension(this.He, this.Ie);
                break;
            default:
                setMeasuredDimension(this.He, this.Ie);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.u1, android.view.View
    public final void setPressed(boolean z10) {
        int i10 = this.Ge;
    }

    private final void A4(boolean z10) {
    }

    private final void B4(boolean z10) {
    }
}
