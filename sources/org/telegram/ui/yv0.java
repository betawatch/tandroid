package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class yv0 extends org.telegram.ui.Cells.s1 {
    public final /* synthetic */ int He;
    public final /* synthetic */ int Ie;
    public final /* synthetic */ int Je;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yv0(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var, int i11, int i12, int i13) {
        super(context, i10, false, null, u6Var);
        this.He = i13;
        this.Ie = i11;
        this.Je = i12;
    }

    @Override // org.telegram.ui.Cells.s1
    public final void Y1(Canvas canvas) {
        switch (this.He) {
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

    @Override // org.telegram.ui.Cells.s1, android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.He) {
            case 0:
                setMeasuredDimension(this.Ie, this.Je);
                break;
            default:
                setMeasuredDimension(this.Ie, this.Je);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.s1, android.view.View
    public final void setPressed(boolean z10) {
        int i10 = this.He;
    }

    private final void D4(boolean z10) {
    }

    private final void E4(boolean z10) {
    }
}
