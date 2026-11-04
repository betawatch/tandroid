package ug;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import gi.j3;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xq;
import org.telegram.ui.u40;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class o1 extends View {
    public Bitmap a;
    public Paint b;
    public Paint c;
    public Paint d;
    public float e;
    public float f;
    public Path h;
    public Rect n;
    public RectF r;
    public int s;
    public boolean w;
    public q0.a x;
    public float y;

    public final void a(boolean z10) {
        if (this.w) {
            return;
        }
        this.w = true;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.setInterpolator(xq.f);
        duration.addUpdateListener(new j3(this, 27));
        duration.addListener(new u40(15, this, z10));
        duration.start();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((tg.i) this).E.p1.c();
        this.a.recycle();
        this.a = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i3;
        float f10;
        Rect rect = this.n;
        Paint paint = this.b;
        RectF rectF = this.r;
        Path path = this.h;
        super.onDraw(canvas);
        float min = Math.min(getWidth(), getHeight()) * 0.2f;
        float width = this.e * getWidth();
        float height = this.f * getHeight();
        int round = Math.round(this.e * this.a.getWidth());
        int round2 = Math.round(this.f * this.a.getHeight());
        int pixel = this.a.getPixel(Utilities.j(round, r11.getWidth() - 1, 0), Utilities.j(round2, this.a.getHeight() - 1, 0));
        this.s = pixel;
        Paint paint2 = this.d;
        paint2.setColor(pixel);
        float f11 = this.y;
        if (f11 == 0.0f || f11 == 1.0f) {
            i3 = round;
            f10 = 1.0f;
            canvas.save();
        } else {
            RectF rectF2 = org.telegram.messenger.g0.P;
            f10 = 1.0f;
            i3 = round;
            rectF2.set(width - min, height - min, width + min, height + min);
            canvas.saveLayerAlpha(rectF2, (int) (this.y * 255.0f), 31);
        }
        float f12 = (this.y * 0.5f) + 0.5f;
        canvas.scale(f12, f12, width, height);
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(width, height, min, direction);
        canvas.clipPath(path);
        int round3 = Math.round(3.5f);
        rect.set(i3 - round3, round2 - round3, i3 + round3, round2 + round3);
        rectF.set(width - min, height - min, width + min, height + min);
        canvas.drawBitmap(this.a, rect, rectF, (Paint) null);
        float strokeWidth = min - (paint2.getStrokeWidth() / 2.0f);
        canvas.drawCircle(width, height, strokeWidth, paint2);
        float strokeWidth2 = (strokeWidth - (paint2.getStrokeWidth() / 2.0f)) - (paint.getStrokeWidth() / 2.0f);
        canvas.drawCircle(width, height, strokeWidth2, paint);
        float strokeWidth3 = strokeWidth2 - (paint.getStrokeWidth() / 2.0f);
        path.rewind();
        path.addCircle(width, height, strokeWidth3, direction);
        canvas.clipPath(path);
        float f13 = (strokeWidth3 * 2.0f) / 8.0f;
        path.rewind();
        for (float f14 = -3.5f; f14 < 4.5f; f14 += f10) {
            float f15 = (f14 * f13) + width;
            path.moveTo(f15, height - strokeWidth3);
            path.lineTo(f15, height + strokeWidth3);
        }
        for (float f16 = -3.5f; f16 < 4.5f; f16 += f10) {
            float f17 = (f16 * f13) + height;
            path.moveTo(width - strokeWidth3, f17);
            path.lineTo(width + strokeWidth3, f17);
        }
        canvas.drawPath(path, this.c);
        float f18 = f13 / 2.0f;
        rectF.set(width - f18, height - f18, width + f18, height + f18);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), paint);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        if (i3 == 0 || i10 == 0 || i11 == 0 || i12 == 0 || !isLaidOut()) {
            return;
        }
        this.e = (i11 * this.e) / i3;
        this.f = (i12 * this.f) / i10;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.e = motionEvent.getX() / getWidth();
            this.f = motionEvent.getY() / getHeight();
            invalidate();
            getParent().requestDisallowInterceptTouchEvent(true);
            return true;
        }
        if (actionMasked == 1) {
            a(true);
            return true;
        }
        if (actionMasked != 2) {
            if (actionMasked != 3) {
                return true;
            }
            a(false);
            return true;
        }
        this.e = motionEvent.getX() / getWidth();
        this.f = motionEvent.getY() / getHeight();
        invalidate();
        return true;
    }

    public void setColorListener(q0.a aVar) {
        this.x = aVar;
    }
}
