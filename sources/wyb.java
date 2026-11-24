// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class wyb extends View implements tjb {
    public int a;
    public float b;
    public final Paint c;
    public final Paint d;
    public Drawable e;
    public boolean f;
    public int h;
    public final RectF n;

    public wyb(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f = true;
        this.h = 0;
        this.n = new RectF();
        int w0 = bkb.w0(null, bkb.O9, false);
        this.a = w0;
        paint.setColor(w0);
        paint2.setStrokeWidth(gl.L(2.0f));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setState(getDrawableState());
            invalidate();
        }
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        if (this.f) {
            float L = gl.L(((this.h == 0 ? this.b : 1.0f) * 26.0f) + 6.0f);
            float width = getWidth();
            float height = getHeight();
            RectF rectF = this.n;
            rectF.set(0.0f, 0.0f, width, height);
            canvas2.drawRoundRect(rectF, L, L, this.c);
        }
        int i = this.h;
        Paint paint = this.d;
        if (i == 0) {
            float max = (Math.max(0.4f, this.b) - 0.4f) / 0.6f;
            if (max != 0.0f) {
                float width2 = ((getWidth() - (gl.L(21.0f) << 1)) * max) + gl.L(21.0f);
                float height2 = getHeight() / 2.0f;
                canvas.drawLine(gl.L(21.0f), height2, width2, height2, paint);
                double L2 = gl.L(9.0f) * max;
                float f = (float) (width2 - (0.7071067811865476d * L2));
                float f2 = (float) (L2 * 0.7071067811865475d);
                canvas2 = canvas;
                canvas2.drawLine(width2, height2, f, height2 - f2, paint);
                canvas2.drawLine(width2, height2, f, height2 + f2, paint);
            } else {
                canvas2 = canvas;
            }
        } else if (i == 1) {
            float L3 = gl.L(21.0f);
            float width3 = getWidth() - gl.L(21.0f);
            float height3 = getHeight() / 2.0f;
            canvas2.save();
            canvas2.translate((-gl.L(2.0f)) * this.b, 0.0f);
            canvas2.rotate(this.b * 90.0f, getWidth() / 2.0f, getHeight() / 2.0f);
            canvas2.drawLine(L3 + ((width3 - L3) * this.b), height3, width3, height3, paint);
            int L4 = gl.L((this.b * (-1.0f)) + 9.0f);
            int L5 = gl.L((this.b * 7.0f) + 9.0f);
            double d = width3;
            double d2 = L4;
            double d3 = height3;
            canvas.drawLine(width3, height3, (float) (d - (d2 * 0.7071067811865476d)), (float) ((d2 * 0.7071067811865475d) + d3), paint);
            double d4 = L5;
            canvas2 = canvas;
            canvas2.drawLine(width3, height3, (float) (d - (0.7071067811865476d * d4)), (float) (d3 - (d4 * 0.7071067811865475d)), paint);
            canvas.restore();
        }
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            this.e.setHotspotBounds(0, 0, getWidth(), getHeight());
            this.e.draw(canvas2);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.c.setColor(i);
        invalidate();
    }

    public void setColor(int i) {
        this.d.setColor(i);
        invalidate();
    }

    public void setDrawBackground(boolean z) {
        this.f = z;
    }

    public void setProgress(float f) {
        this.b = f;
        invalidate();
    }

    public void setRippleDrawable(Drawable drawable) {
        this.e = drawable;
        invalidate();
    }

    public void setTransformType(int i) {
        this.h = i;
        invalidate();
    }

    @Override // tjb
    public final void updateColors() {
        Paint paint = this.c;
        try {
            if (paint.getColor() == this.a) {
                this.a = bkb.w0(null, bkb.O9, false);
                int color = paint.getColor();
                int i = this.a;
                if (color != i) {
                    paint.setColor(i);
                    invalidate();
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        Drawable drawable2 = this.e;
        return drawable2 != null && drawable == drawable2;
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
