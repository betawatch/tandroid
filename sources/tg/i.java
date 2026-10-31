package tg;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import vg.k;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i extends Drawable {
    public wg.a a;
    public int b;
    public int c;
    public int f;
    public vg.g j;
    public boolean l;
    public float m;
    public float d = 1.0f;
    public final RectF e = new RectF();
    public final Paint g = new Paint(1);
    public final k h = new k();
    public final float[] i = new float[8];
    public int k = a7.b;

    public final void a() {
        this.k = a7.b;
        wg.a aVar = this.a;
        if (aVar == null) {
            return;
        }
        this.b = t6.r1(this.d, aVar.u());
        this.c = t6.r1(this.d, this.a.E());
        float N = i0.N(1.0f);
        this.j = new vg.g(this.b, N, this.c, i0.N(0.6666667f), 0, 0.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.k != a7.b) {
            try {
                a();
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float min = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.f;
        RectF rectF = this.e;
        rectF.set(centerX - min, centerY - min, centerX + min, centerY + min);
        if (this.l) {
            rectF.set(getBounds());
            min = this.m;
        }
        Paint paint = this.g;
        if (Color.alpha(paint.getColor()) > 0) {
            canvas.drawCircle(centerX, centerY, min, paint);
        }
        if (this.j != null) {
            Arrays.fill(this.i, min);
            this.h.a(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom, this.i, this.j, 1.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.d = i10 / 255.0f;
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
