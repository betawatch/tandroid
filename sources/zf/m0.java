package zf;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class m0 extends org.telegram.ui.Cells.q {
    public v1 e;
    public Paint f;
    public float h;

    @Override // org.telegram.ui.Cells.q, android.view.View
    public final void draw(Canvas canvas) {
        int dp = AndroidUtilities.dp(10.0f);
        v1 v1Var = this.e;
        v1Var.c.set(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), getMeasuredWidth() - AndroidUtilities.dp(5.0f), getMeasuredHeight() - AndroidUtilities.dp(5.0f));
        float f10 = -dp;
        v1Var.a.set(f10, f10, getWidth() + dp, getHeight() + dp);
        canvas.save();
        float f11 = 1.0f - this.h;
        canvas.scale(f11, f11, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        v1Var.d(canvas);
        canvas.restore();
        invalidate();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.f);
        super.draw(canvas);
    }
}
