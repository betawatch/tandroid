package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class vr0 extends org.telegram.ui.Cells.q1 {
    public final Paint Ad;
    public final /* synthetic */ byte[] Bd;
    public final /* synthetic */ int Cd;
    public final /* synthetic */ int Dd;
    public final /* synthetic */ xr0 Ed;
    public final Path zd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr0(xr0 xr0Var, Context context, int i7, org.telegram.ui.ActionBar.e6 e6Var, byte[] bArr, int i10, int i11) {
        super(context, i7, false, null, e6Var);
        this.Ed = xr0Var;
        this.Bd = bArr;
        this.Cd = i10;
        this.Dd = i11;
        this.zd = new Path();
        this.Ad = new Paint(1);
    }

    @Override // org.telegram.ui.Cells.q1
    public final void j1(Canvas canvas) {
        this.S4 = 0;
        this.T4 = this.Q4.size() - 1;
        this.U4 = (-org.telegram.messenger.g0.L(7.0f)) * this.Ed.E;
        super.j1(canvas);
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        int W1 = W1(this.Bd);
        float V1 = V1(W1);
        float U1 = U1(W1);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getPollButtonsLeft(), V1, getPollButtonsRight(), U1);
        float f10 = rectF.top;
        float L = org.telegram.messenger.g0.L(3.0f);
        xr0 xr0Var = this.Ed;
        rectF.top = org.telegram.messenger.g0.T1(L, xr0Var.W ? -org.telegram.messenger.g0.L(3.0f) : 0.0f, xr0Var.E) + f10;
        float f11 = rectF.bottom;
        boolean z10 = xr0Var.W;
        float L2 = org.telegram.messenger.g0.L(3.0f);
        if (!z10) {
            L2 = org.telegram.messenger.g0.T1(L2, 0.0f, xr0Var.E);
        }
        rectF.bottom = f11 + L2;
        Path path = this.zd;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
        Paint paint = this.Ad;
        paint.setColor(0);
        paint.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), org.telegram.ui.ActionBar.j6.r1(xr0Var.E * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        canvas.clipPath(path);
        d1(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(this.Cd, this.Dd);
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void setPressed(boolean z10) {
    }
}
