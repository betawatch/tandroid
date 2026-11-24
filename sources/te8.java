// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class te8 extends gb2 {
    public final Path Ld;
    public final Paint Md;
    public final /* synthetic */ byte[] Nd;
    public final /* synthetic */ int Od;
    public final /* synthetic */ int Pd;
    public final /* synthetic */ ve8 Qd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te8(ve8 ve8Var, Context context, int i, wjb wjbVar, byte[] bArr, int i2, int i3) {
        super(context, i, false, null, wjbVar);
        this.Qd = ve8Var;
        this.Nd = bArr;
        this.Od = i2;
        this.Pd = i3;
        this.Ld = new Path();
        this.Md = new Paint(1);
    }

    @Override // gb2
    public final void j1(Canvas canvas) {
        this.S4 = 0;
        this.T4 = this.Q4.size() - 1;
        this.U4 = (-gl.L(7.0f)) * this.Qd.E;
        super.j1(canvas);
    }

    @Override // gb2, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        int Y1 = Y1(this.Nd);
        float X1 = X1(Y1);
        float W1 = W1(Y1);
        RectF rectF = gl.P;
        rectF.set(getPollButtonsLeft(), X1, getPollButtonsRight(), W1);
        float f = rectF.top;
        float L = gl.L(3.0f);
        ve8 ve8Var = this.Qd;
        rectF.top = gl.R1(L, ve8Var.W ? -gl.L(3.0f) : 0.0f, ve8Var.E) + f;
        float f2 = rectF.bottom;
        boolean z = ve8Var.W;
        float L2 = gl.L(3.0f);
        if (!z) {
            L2 = gl.R1(L2, 0.0f, ve8Var.E);
        }
        rectF.bottom = f2 + L2;
        Path path = this.Ld;
        path.rewind();
        path.addRoundRect(rectF, gl.L(8.0f), gl.L(8.0f), Path.Direction.CW);
        Paint paint = this.Md;
        paint.setColor(0);
        paint.setShadowLayer(gl.L(2.0f), 0.0f, gl.L(0.66f), bkb.p1(ve8Var.E * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, gl.L(8.0f), gl.L(8.0f), paint);
        canvas.clipPath(path);
        d1(canvas);
        canvas.restore();
    }

    @Override // gb2, android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(this.Od, this.Pd);
    }

    @Override // gb2, android.view.View
    public final void setPressed(boolean z) {
    }
}
