package th;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class u1 extends Drawable {
    public final Paint a;
    public final d6 b;
    public boolean c;
    public int d;

    public u1(int i10) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new d6(new org.telegram.ui.web.t1(this, 26), 420L, jr.h, 0);
        this.d = 255;
        paint.setColor(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float e10 = this.b.e(this.c);
        if (e10 <= 0.0f) {
            return;
        }
        Paint paint = this.a;
        paint.setAlpha((int) (this.d * e10));
        paint.setShadowLayer(AndroidUtilities.dp(12.0f) * e10, 0.0f, AndroidUtilities.dp(3.0f), g6.l1(e10, 805306368));
        Rect bounds = getBounds();
        float dp = AndroidUtilities.dp(8.0f) * e10;
        float dp2 = AndroidUtilities.dp(0.0f) * e10;
        float dp3 = AndroidUtilities.dp(12.0f) * e10;
        canvas.drawRoundRect(bounds.left + dp, bounds.top + dp2, bounds.right - dp, (AndroidUtilities.dp(6.0f) * e10) + (bounds.bottom - dp2), dp3, dp3, paint);
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
