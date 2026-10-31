package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.t5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b0 extends Drawable {
    public final ImageView a;
    public final Paint b;
    public final RectF c;
    public final long d;
    public final Drawable e;
    public boolean f;
    public float g;
    public boolean h;
    public final t5 i;
    public final t5 j;
    public final t5 k;
    public bi0 l;

    public b0(Context context, ImageView imageView) {
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new RectF();
        this.h = false;
        vh.d0 d0Var = new vh.d0(this, 29);
        gr grVar = gr.h;
        this.i = new t5(d0Var, 320L, grVar, 0);
        this.j = new t5(new vh.d0(this, 29), 320L, grVar, 0);
        this.k = new t5(new vh.d0(this, 29), 320L, grVar, 0);
        this.a = imageView;
        this.d = System.currentTimeMillis();
        this.e = i0.a.f(context, R.drawable.search_files_filled);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f7;
        float f10;
        bi0 bi0Var;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        float d = this.k.d(this.h);
        float f11 = 0.0f;
        char c10 = 2;
        if (d < 1.0f) {
            float f12 = 1.0f - d;
            float f13 = (0.4f * f12) + 0.6f;
            canvas2.save();
            float f14 = centerX;
            float f15 = centerY;
            canvas2.scale(f13, f13, f14, f15);
            Drawable drawable = this.e;
            drawable.setBounds(org.telegram.ui.Cells.f1.z(2, centerX, drawable), org.telegram.ui.Cells.f1.y(2, centerY, drawable), org.telegram.ui.Cells.f1.w(2, centerX, drawable), org.telegram.ui.Cells.f1.f(2, centerY, drawable));
            drawable.setAlpha((int) (f12 * 255.0f));
            drawable.draw(canvas2);
            float L = org.telegram.messenger.i0.L(14.0f);
            int r12 = t6.r1(0.2f * f12, -1);
            Paint paint = this.b;
            paint.setColor(r12);
            canvas2.drawCircle(f14, f15, L, paint);
            float f16 = f12 * 1.0f;
            paint.setColor(t6.r1(f16, -1));
            float f17 = f14 - L;
            f10 = 255.0f;
            float f18 = f15 - L;
            float f19 = f14 + L;
            float f20 = f15 + L;
            RectF rectF = this.c;
            rectF.set(f17, f18, f19, f20);
            float d10 = this.i.d(this.f);
            paint.setColor(t6.r1((1.0f - d10) * f12 * 0.15f, -1));
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.d;
            canvas2.drawArc(rectF, (-(((((currentTimeMillis - j10) % 600) / 600.0f) - 1.0f) * 360.0f)) - 90.0f, -90.0f, false, paint);
            float currentTimeMillis2 = ((System.currentTimeMillis() - j10) * 0.45f) % 5400.0f;
            float max = Math.max(0.0f, ((1520.0f * currentTimeMillis2) / 5400.0f) - 20.0f);
            int i10 = 0;
            while (i10 < 4) {
                u1.a aVar = kp.h;
                float f21 = f11;
                aVar.getInterpolation((currentTimeMillis2 - (i10 * 1350)) / 667.0f);
                max += aVar.getInterpolation((currentTimeMillis2 - (r10 + 667)) / 667.0f) * 250.0f;
                i10++;
                f11 = f21;
                c10 = c10;
            }
            f7 = f11;
            paint.setColor(t6.r1(f16, -1));
            canvas2 = canvas;
            canvas2.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, this.j.e(false, this.g)) * (-360.0f) * d10, false, paint);
            invalidateSelf();
            canvas2.restore();
        } else {
            f7 = 0.0f;
            f10 = 255.0f;
        }
        if (d <= f7 || (bi0Var = this.l) == null) {
            return;
        }
        int i11 = bi0Var.b / 2;
        int i12 = bi0Var.c / 2;
        bi0Var.setBounds(centerX - i11, centerY - i12, i11 + centerX, i12 + centerY);
        this.l.setAlpha((int) (d * f10));
        this.l.draw(canvas2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(40.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(40.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
