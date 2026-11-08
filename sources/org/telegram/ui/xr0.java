package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class xr0 extends org.telegram.ui.Cells.q1 {
    public final Path ld;
    public final Paint md;
    public final /* synthetic */ byte[] nd;
    public final /* synthetic */ int od;
    public final /* synthetic */ int pd;
    public final /* synthetic */ zr0 qd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr0(zr0 zr0Var, Context context, int i7, org.telegram.ui.ActionBar.f6 f6Var, byte[] bArr, int i10, int i11) {
        super(context, i7, false, null, f6Var);
        this.qd = zr0Var;
        this.nd = bArr;
        this.od = i10;
        this.pd = i11;
        this.ld = new Path();
        this.md = new Paint(1);
    }

    @Override // org.telegram.ui.Cells.q1
    public final void j1(Canvas canvas) {
        this.R4 = 0;
        this.S4 = this.P4.size() - 1;
        this.T4 = (-org.telegram.messenger.g0.L(7.0f)) * this.qd.D;
        super.j1(canvas);
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        int V1 = V1(this.nd);
        float U1 = U1(V1);
        float T1 = T1(V1);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getPollButtonsLeft(), U1, getPollButtonsRight(), T1);
        float f10 = rectF.top;
        float L = org.telegram.messenger.g0.L(3.0f);
        zr0 zr0Var = this.qd;
        rectF.top = org.telegram.messenger.g0.T1(L, zr0Var.V ? -org.telegram.messenger.g0.L(3.0f) : 0.0f, zr0Var.D) + f10;
        float f11 = rectF.bottom;
        boolean z9 = zr0Var.V;
        float L2 = org.telegram.messenger.g0.L(3.0f);
        if (!z9) {
            L2 = org.telegram.messenger.g0.T1(L2, 0.0f, zr0Var.D);
        }
        rectF.bottom = f11 + L2;
        Path path = this.ld;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
        Paint paint = this.md;
        paint.setColor(0);
        paint.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), org.telegram.ui.ActionBar.k6.r1(zr0Var.D * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        canvas.clipPath(path);
        d1(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(this.od, this.pd);
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void setPressed(boolean z9) {
    }
}
