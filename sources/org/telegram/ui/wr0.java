package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class wr0 extends org.telegram.ui.Cells.q1 {
    public final /* synthetic */ int Ad;
    public final /* synthetic */ int Bd;
    public final /* synthetic */ int zd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wr0(Context context, int i7, org.telegram.ui.ActionBar.e6 e6Var, int i10, int i11, int i12) {
        super(context, i7, false, null, e6Var);
        this.zd = i12;
        this.Ad = i10;
        this.Bd = i11;
    }

    @Override // org.telegram.ui.Cells.q1
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

    @Override // org.telegram.ui.Cells.q1, android.view.View
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

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void setPressed(boolean z10) {
        int i7 = this.zd;
    }

    private final void e4(boolean z10) {
    }

    private final void f4(boolean z10) {
    }
}
