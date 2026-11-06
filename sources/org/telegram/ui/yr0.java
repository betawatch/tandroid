package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class yr0 extends org.telegram.ui.Cells.q1 {
    public final /* synthetic */ int kd;
    public final /* synthetic */ int ld;
    public final /* synthetic */ int md;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yr0(Context context, int i7, org.telegram.ui.ActionBar.f6 f6Var, int i10, int i11, int i12) {
        super(context, i7, false, null, f6Var);
        this.kd = i12;
        this.ld = i10;
        this.md = i11;
    }

    @Override // org.telegram.ui.Cells.q1
    public final void j1(Canvas canvas) {
        switch (this.kd) {
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
        switch (this.kd) {
            case 0:
                setMeasuredDimension(this.ld, this.md);
                break;
            default:
                setMeasuredDimension(this.ld, this.md);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void setPressed(boolean z9) {
        int i7 = this.kd;
    }

    private final void c4(boolean z9) {
    }

    private final void d4(boolean z9) {
    }
}
