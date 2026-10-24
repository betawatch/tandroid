package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class tv0 extends org.telegram.ui.Cells.t1 {
    public final /* synthetic */ int Ge;
    public final /* synthetic */ int He;
    public final /* synthetic */ int Ie;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tv0(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11, int i12, int i13) {
        super(context, i10, false, null, g6Var);
        this.Ge = i13;
        this.He = i11;
        this.Ie = i12;
    }

    @Override // org.telegram.ui.Cells.t1
    public final void X1(Canvas canvas) {
        switch (this.Ge) {
            case 0:
                this.i6 = 0;
                this.j6 = this.Y5.size() - 1;
                super.X1(canvas);
                break;
            default:
                this.i6 = 0;
                this.j6 = this.Y5.size() - 1;
                super.X1(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.t1, android.view.View
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

    @Override // org.telegram.ui.Cells.t1, android.view.View
    public final void setPressed(boolean z10) {
        int i10 = this.Ge;
    }

    private final void A4(boolean z10) {
    }

    private final void z4(boolean z10) {
    }
}
