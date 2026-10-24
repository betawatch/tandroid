package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class sv0 extends org.telegram.ui.Cells.t1 {
    public final Path Ge;
    public final Paint He;
    public final /* synthetic */ byte[] Ie;
    public final /* synthetic */ int Je;
    public final /* synthetic */ int Ke;
    public final /* synthetic */ uv0 Le;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv0(uv0 uv0Var, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, byte[] bArr, int i11, int i12) {
        super(context, i10, false, null, g6Var);
        this.Le = uv0Var;
        this.Ie = bArr;
        this.Je = i11;
        this.Ke = i12;
        this.Ge = new Path();
        this.He = new Paint(1);
    }

    @Override // org.telegram.ui.Cells.t1
    public final void X1(Canvas canvas) {
        this.i6 = 0;
        this.j6 = this.Y5.size() - 1;
        this.k6 = (-AndroidUtilities.dp(7.0f)) * this.Le.y;
        super.X1(canvas);
    }

    @Override // org.telegram.ui.Cells.t1, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        int H2 = H2(this.Ie);
        float G2 = G2(H2);
        float F2 = F2(H2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPollButtonsLeft(), G2, getPollButtonsRight(), F2);
        float f7 = rectF.top;
        float dp = AndroidUtilities.dp(3.0f);
        uv0 uv0Var = this.Le;
        rectF.top = AndroidUtilities.lerp(dp, uv0Var.V ? -AndroidUtilities.dp(3.0f) : 0.0f, uv0Var.y) + f7;
        float f10 = rectF.bottom;
        boolean z10 = uv0Var.V;
        float dp2 = AndroidUtilities.dp(3.0f);
        if (!z10) {
            dp2 = AndroidUtilities.lerp(dp2, 0.0f, uv0Var.y);
        }
        rectF.bottom = f10 + dp2;
        Path path = this.Ge;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
        Paint paint = this.He;
        paint.setColor(0);
        paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.k6.o1(uv0Var.y * 0.2f, -16777216));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        canvas.clipPath(path);
        R1(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Cells.t1, android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(this.Je, this.Ke);
    }

    @Override // org.telegram.ui.Cells.t1, android.view.View
    public final void setPressed(boolean z10) {
    }
}
