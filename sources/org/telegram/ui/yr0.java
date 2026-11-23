package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class yr0 extends org.telegram.ui.Cells.r1 {
    public final /* synthetic */ int Ad;
    public final /* synthetic */ int Bd;
    public final /* synthetic */ int zd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yr0(Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, int i10, int i11, int i12) {
        super(context, i7, false, null, i6Var);
        this.zd = i12;
        this.Ad = i10;
        this.Bd = i11;
    }

    @Override // org.telegram.ui.Cells.r1
    public final void j1(Canvas canvas) {
        switch (this.zd) {
            case 0:
                this.S4 = 0;
                this.T4 = this.Q4.size() - 1;
                super.j1(canvas);
                break;
            default:
                this.S4 = 0;
                this.T4 = this.Q4.size() - 1;
                super.j1(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.r1, android.view.View
    public final void onMeasure(int i7, int i10) {
        switch (this.zd) {
            case 0:
                setMeasuredDimension(this.Ad, this.Bd);
                break;
            default:
                setMeasuredDimension(this.Ad, this.Bd);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.r1, android.view.View
    public final void setPressed(boolean z10) {
        int i7 = this.zd;
    }

    private final void f4(boolean z10) {
    }

    private final void g4(boolean z10) {
    }
}
