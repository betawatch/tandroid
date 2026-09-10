package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class yi1 extends View {
    public final Paint a;
    public final org.telegram.ui.Components.i9 b;
    public org.telegram.ui.Components.t01 c;

    public yi1(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(-14538189);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(this, false);
        this.b = i9Var;
        i9Var.p = AndroidUtilities.dp(100.0f);
        i9Var.o = AndroidUtilities.dp(30.0f);
        i9Var.x = false;
        i9Var.s = AndroidUtilities.dp(24.0f);
        i9Var.j(AndroidUtilities.dp(18.0f));
        i9Var.t = 0.58f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.c == null) {
            return;
        }
        float dp = AndroidUtilities.dp(4.0f);
        org.telegram.ui.Components.i9 i9Var = this.b;
        float e = i9Var.e() + dp + AndroidUtilities.dp(7.0f) + this.c.c + AndroidUtilities.dp(13.0f);
        float dp2 = AndroidUtilities.dp(30.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - e) / 2.0f, 0.0f, (getWidth() + e) / 2.0f, getHeight());
        float f7 = dp2 / 2.0f;
        canvas.drawRoundRect(rectF, f7, f7, this.a);
        canvas.save();
        canvas.translate(rectF.left + AndroidUtilities.dp(4.0f), 0.0f);
        i9Var.i(canvas);
        canvas.translate(i9Var.A + AndroidUtilities.dp(7.0f), 0.0f);
        this.c.c(0.0f, f7, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(30.0f));
    }
}
