package yg;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.i0;
import org.telegram.messenger.w0;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.t6;
import rf.o;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c extends Drawable {
    public final /* synthetic */ int a;
    public final Drawable b;
    public int c;
    public int d;

    public c() {
        this.a = 1;
        this.d = zs.e4;
        this.b = i0.a.f(w0.b, R.drawable.settings_arrow);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                this.b.draw(canvas);
                break;
            default:
                float exactCenterX = getBounds().exactCenterX();
                float exactCenterY = getBounds().exactCenterY();
                int x02 = t6.x0(null, t6.G6, false);
                int x03 = t6.x0(null, t6.d6, false);
                int i10 = this.c;
                Drawable drawable = this.b;
                if (i10 != x03) {
                    this.c = x03;
                    drawable.setColorFilter(new PorterDuffColorFilter(x03, PorterDuff.Mode.SRC_IN));
                }
                canvas.drawCircle(exactCenterX, exactCenterY, i0.L(7.6666665f), t6.n0(i0.b.o(x03, this.d)));
                canvas.drawCircle(exactCenterX, exactCenterY, i0.L(6.6666665f), t6.n0(i0.b.o(x02, this.d)));
                o.d(drawable, exactCenterX, exactCenterY, 17);
                canvas.translate(0.0f, i0.L(0.66f));
                canvas.save();
                canvas.rotate(90.0f, exactCenterX, exactCenterY);
                o.b(canvas, drawable, 0.8f);
                canvas.restore();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        switch (this.a) {
            case 0:
                return this.b.getAlpha();
            default:
                return this.d;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        switch (this.a) {
            case 1:
                return i0.L(13.333333f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        switch (this.a) {
            case 1:
                return i0.L(13.333333f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
            case 0:
                return this.b.getOpacity();
            default:
                return -3;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        switch (this.a) {
            case 0:
                super.onBoundsChange(rect);
                int width = rect.width();
                int i10 = this.c;
                int i11 = (width - i10) / 2;
                int height = rect.height();
                int i12 = this.d;
                int i13 = (height - i12) / 2;
                this.b.setBounds(i11, i13, i10 + i11, i12 + i13);
                break;
            default:
                super.onBoundsChange(rect);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        switch (this.a) {
            case 0:
                this.b.setAlpha(i10);
                break;
            default:
                this.d = i10;
                this.b.setAlpha(i10);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.a;
    }

    public c(int i10, int i11, Drawable drawable) {
        this.a = 0;
        this.c = i10;
        this.d = i11;
        this.b = drawable;
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
