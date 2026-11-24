// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class qjb extends Drawable {
    public final RectF a = new RectF();
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Paint e;

    public qjb(View view, View view2, int i, Paint paint) {
        this.b = view;
        this.c = view2;
        this.d = i;
        this.e = paint;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float f = bounds.left;
        float f2 = bounds.top;
        float f3 = bounds.right;
        float f4 = bounds.bottom;
        RectF rectF = this.a;
        rectF.set(f, f2, f3, f4);
        bkb.s(this.b, this.c, null);
        float f5 = this.d;
        Paint paint = this.e;
        if (paint == null) {
            paint = bkb.T0("paintChatActionBackground");
        }
        canvas.drawRoundRect(rectF, f5, f5, paint);
        if (bkb.b1()) {
            canvas.drawRoundRect(rectF, f5, f5, bkb.T0("paintChatActionBackgroundDarken"));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
