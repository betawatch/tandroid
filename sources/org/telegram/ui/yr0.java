package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class yr0 extends org.telegram.ui.Cells.q1 {
    public final /* synthetic */ int ld;
    public final /* synthetic */ int md;
    public final /* synthetic */ int nd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yr0(Context context, int i7, org.telegram.ui.ActionBar.f6 f6Var, int i10, int i11, int i12) {
        super(context, i7, false, null, f6Var);
        this.ld = i12;
        this.md = i10;
        this.nd = i11;
    }

    @Override // org.telegram.ui.Cells.q1
    public final void j1(Canvas canvas) {
        switch (this.ld) {
            case 0:
                this.R4 = 0;
                this.S4 = this.P4.size() - 1;
                super.j1(canvas);
                break;
            default:
                this.R4 = 0;
                this.S4 = this.P4.size() - 1;
                super.j1(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void onMeasure(int i7, int i10) {
        switch (this.ld) {
            case 0:
                setMeasuredDimension(this.md, this.nd);
                break;
            default:
                setMeasuredDimension(this.md, this.nd);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void setPressed(boolean z9) {
        int i7 = this.ld;
    }

    private final void d4(boolean z9) {
    }

    private final void e4(boolean z9) {
    }
}
