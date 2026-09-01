package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class rv0 extends org.telegram.ui.Cells.t1 {
    public final Path Ce;
    public final Paint De;
    public final /* synthetic */ byte[] Ee;
    public final /* synthetic */ int Fe;
    public final /* synthetic */ int Ge;
    public final /* synthetic */ tv0 He;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv0(tv0 tv0Var, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, byte[] bArr, int i11, int i12) {
        super(context, i10, false, null, g6Var);
        this.He = tv0Var;
        this.Ee = bArr;
        this.Fe = i11;
        this.Ge = i12;
        this.Ce = new Path();
        this.De = new Paint(1);
    }

    @Override // org.telegram.ui.Cells.t1
    public final void Y1(Canvas canvas) {
        this.f6 = 0;
        this.g6 = this.V5.size() - 1;
        this.h6 = (-AndroidUtilities.dp(7.0f)) * this.He.y;
        super.Y1(canvas);
    }

    @Override // org.telegram.ui.Cells.t1, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        int I2 = I2(this.Ee);
        float H2 = H2(I2);
        float G2 = G2(I2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPollButtonsLeft(), H2, getPollButtonsRight(), G2);
        float f10 = rectF.top;
        float dp = AndroidUtilities.dp(3.0f);
        tv0 tv0Var = this.He;
        rectF.top = AndroidUtilities.lerp(dp, tv0Var.S ? -AndroidUtilities.dp(3.0f) : 0.0f, tv0Var.y) + f10;
        float f11 = rectF.bottom;
        boolean z4 = tv0Var.S;
        float dp2 = AndroidUtilities.dp(3.0f);
        if (!z4) {
            dp2 = AndroidUtilities.lerp(dp2, 0.0f, tv0Var.y);
        }
        rectF.bottom = f11 + dp2;
        Path path = this.Ce;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
        Paint paint = this.De;
        paint.setColor(0);
        paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.k6.l1(tv0Var.y * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        canvas.clipPath(path);
        S1(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Cells.t1, android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(this.Fe, this.Ge);
    }

    @Override // org.telegram.ui.Cells.t1, android.view.View
    public final void setPressed(boolean z4) {
    }
}
