package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class xv0 extends org.telegram.ui.Cells.s1 {
    public final Path He;
    public final Paint Ie;
    public final /* synthetic */ byte[] Je;
    public final /* synthetic */ int Ke;
    public final /* synthetic */ int Le;
    public final /* synthetic */ zv0 Me;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv0(zv0 zv0Var, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var, byte[] bArr, int i11, int i12) {
        super(context, i10, false, null, u6Var);
        this.Me = zv0Var;
        this.Je = bArr;
        this.Ke = i11;
        this.Le = i12;
        this.He = new Path();
        this.Ie = new Paint(1);
    }

    @Override // org.telegram.ui.Cells.s1
    public final void Y1(Canvas canvas) {
        this.i6 = 0;
        this.j6 = this.Y5.size() - 1;
        this.k6 = (-AndroidUtilities.dp(7.0f)) * this.Me.y;
        super.Y1(canvas);
    }

    @Override // org.telegram.ui.Cells.s1, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        int I2 = I2(this.Je);
        float H2 = H2(I2);
        float G2 = G2(I2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPollButtonsLeft(), H2, getPollButtonsRight(), G2);
        float f7 = rectF.top;
        float dp = AndroidUtilities.dp(3.0f);
        zv0 zv0Var = this.Me;
        rectF.top = AndroidUtilities.lerp(dp, zv0Var.V ? -AndroidUtilities.dp(3.0f) : 0.0f, zv0Var.y) + f7;
        float f10 = rectF.bottom;
        boolean z10 = zv0Var.V;
        float dp2 = AndroidUtilities.dp(3.0f);
        if (!z10) {
            dp2 = AndroidUtilities.lerp(dp2, 0.0f, zv0Var.y);
        }
        rectF.bottom = f10 + dp2;
        Path path = this.He;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
        Paint paint = this.Ie;
        paint.setColor(0);
        paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.y6.o1(zv0Var.y * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        canvas.clipPath(path);
        S1(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Cells.s1, android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(this.Ke, this.Le);
    }

    @Override // org.telegram.ui.Cells.s1, android.view.View
    public final void setPressed(boolean z10) {
    }
}
