// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class tqc extends Drawable {
    public final /* synthetic */ byte a;
    public final Path b;
    public final Paint c;
    public final Object d;
    public final Object e;

    public tqc() {
        this.a = (byte) 0;
        this.c = new Paint(1);
        this.b = new Path();
        this.d = new RectF();
        this.e = new float[]{hl.L(24.0f), hl.L(24.0f), hl.L(24.0f), hl.L(24.0f), 0.0f, 0.0f, 0.0f, 0.0f};
    }

    public final void c() {
        invalidateSelf();
        ((xt) this.e).P.setContentDescription(ob6.M0(2131750547, null));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        byte b = this.a;
        Paint paint = this.c;
        Path path = this.b;
        switch (b) {
            case 0:
                canvas.drawPath(path, paint);
                break;
            default:
                float d = ((mm) this.d).d(true);
                float centerX = getBounds().centerX();
                float centerY = getBounds().centerY();
                float width = getBounds().width();
                float f = 0.57f * width;
                path.rewind();
                float f2 = f / 2.0f;
                path.moveTo(centerX - hl.R1(f2, (-f) / 2.0f, d), centerY);
                float f3 = f2 + centerX;
                path.lineTo(f3, centerY);
                float f4 = f3 - (0.27f * width);
                float f5 = (0.54f * width) / 2.0f;
                path.moveTo(f4, centerY - f5);
                path.lineTo(f3, centerY);
                path.lineTo(f4, f5 + centerY);
                canvas.save();
                paint.setStrokeWidth(hl.L(2.0f));
                canvas.translate(0.0f, (-width) * 0.1f * d);
                canvas.rotate(d * 90.0f, centerX, centerY);
                canvas.drawPath(path, paint);
                canvas.restore();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        switch (this.a) {
            case 1:
                return hl.L(24.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        switch (this.a) {
            case 1:
                return hl.L(24.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
            case 0:
                return -3;
            default:
                return -2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        switch (this.a) {
            case 0:
                super.onBoundsChange(rect);
                RectF rectF = (RectF) this.d;
                rectF.set(rect);
                Path path = this.b;
                path.reset();
                path.addRoundRect(rectF, (float[]) this.e, Path.Direction.CW);
                this.c.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{-16216082, -12207881}, new float[]{0.15f, 0.53f}, Shader.TileMode.CLAMP));
                break;
            default:
                super.onBoundsChange(rect);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        switch (this.a) {
            case 0:
                this.c.setAlpha(i);
                invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.a) {
            case 0:
                this.c.setColorFilter(colorFilter);
                invalidateSelf();
                break;
        }
    }

    private final void a(int i) {
    }

    private final void b(ColorFilter colorFilter) {
    }

    public tqc(xt xtVar) {
        this.a = (byte) 1;
        this.e = xtVar;
        this.b = new Path();
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.d = new mm(new olc(this, (byte) 18), 350L, k43.h, 0);
    }
}
