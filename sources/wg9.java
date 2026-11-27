// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class wg9 extends Drawable {
    public final Context a;
    public final Drawable b;
    public Drawable c;
    public int d;
    public int e;
    public Drawable f;
    public boolean g;

    public wg9(Context context, int i) {
        Drawable e = c00.e(context, i);
        this.d = aob.d6;
        this.g = true;
        this.a = context;
        this.b = e;
    }

    public final void a(boolean z) {
        if (this.g == z) {
            return;
        }
        this.g = z;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        Drawable drawable = this.b;
        drawable.setBounds(bp1.A(2, centerX, drawable), bp1.y(2, centerY, drawable), bp1.w(2, centerX, drawable), bp1.i(2, centerY, drawable));
        drawable.draw(canvas);
        if (this.g) {
            int L = hl.L(9.0f) + centerX;
            int L2 = hl.L(9.0f) + centerY;
            int w0 = aob.w0(null, this.d, false);
            Drawable drawable2 = this.c;
            Context context = this.a;
            if (drawable2 == null) {
                Drawable e = c00.e(context, R.drawable.star_premium_cutout);
                this.c = e;
                this.e = w0;
                e.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.SRC_IN));
            }
            if (w0 != this.e) {
                Drawable drawable3 = this.c;
                this.e = w0;
                drawable3.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.SRC_IN));
            }
            if (this.f == null) {
                this.f = c00.e(context, R.drawable.star_premium);
            }
            this.c.setBounds(L - hl.L(9.0f), L2 - hl.L(9.0f), hl.L(9.0f) + L, hl.L(9.0f) + L2);
            this.c.draw(canvas);
            this.f.setBounds(L - hl.L(9.0f), L2 - hl.L(9.0f), hl.L(9.0f) + L, hl.L(9.0f) + L2);
            this.f.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(hl.L(38.0f), this.b.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(hl.L(38.0f), this.b.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }
}
