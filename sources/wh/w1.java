package wh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class w1 extends Drawable {
    public final Paint a;
    public final org.telegram.ui.Components.z5 b;
    public boolean c;
    public int d;

    public w1(int i10) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new org.telegram.ui.Components.z5(new v1(this, 0), 420L, pr.h, 0);
        this.d = 255;
        paint.setColor(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float e6 = this.b.e(this.c);
        if (e6 <= 0.0f) {
            return;
        }
        Paint paint = this.a;
        paint.setAlpha((int) (this.d * e6));
        paint.setShadowLayer(AndroidUtilities.dp(12.0f) * e6, 0.0f, AndroidUtilities.dp(3.0f), k6.l1(e6, 805306368));
        Rect bounds = getBounds();
        float dp = AndroidUtilities.dp(8.0f) * e6;
        float dp2 = AndroidUtilities.dp(0.0f) * e6;
        float dp3 = AndroidUtilities.dp(12.0f) * e6;
        canvas.drawRoundRect(bounds.left + dp, bounds.top + dp2, bounds.right - dp, (AndroidUtilities.dp(6.0f) * e6) + (bounds.bottom - dp2), dp3, dp3, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.d = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
