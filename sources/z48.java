// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class z48 extends View {
    public Paint a;
    public Paint b;
    public int c;
    public int d;
    public float e;
    public boolean f;
    public int h;
    public byte n;
    public y48 r;

    public final void a(int i, boolean z) {
        y48 y48Var;
        int i2 = this.h;
        if (i < i2) {
            i = i2;
        } else {
            byte b = this.n;
            if (i > b) {
                i = b;
            }
        }
        this.e = (i - i2) / (this.n - i2);
        invalidate();
        if (!z || (y48Var = this.r) == null) {
            return;
        }
        y48Var.n(((Integer) getTag()).intValue(), getProgress());
    }

    public int getProgress() {
        return (int) ((this.e * (this.n - r0)) + this.h);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        Paint paint = this.b;
        int measuredHeight = getMeasuredHeight();
        int i = this.c;
        int i2 = (measuredHeight - i) / 2;
        int measuredWidth = (int) ((getMeasuredWidth() - i) * this.e);
        float f2 = i / 2;
        canvas.drawRect(f2, (getMeasuredHeight() / 2) - gl.L(1.0f), getMeasuredWidth() - r9, gl.L(1.0f) + (getMeasuredHeight() / 2), this.a);
        if (this.h == 0) {
            canvas.drawRect(f2, (getMeasuredHeight() / 2) - gl.L(1.0f), measuredWidth, gl.L(1.0f) + (getMeasuredHeight() / 2), paint);
            f = f2;
        } else {
            f = f2;
            if (this.e > 0.5f) {
                canvas.drawRect((getMeasuredWidth() / 2) - gl.L(1.0f), (getMeasuredHeight() - i) / 2, getMeasuredWidth() / 2, (getMeasuredHeight() + i) / 2, paint);
                paint = paint;
                canvas.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() / 2) - gl.L(1.0f), measuredWidth, gl.L(1.0f) + (getMeasuredHeight() / 2), paint);
            } else {
                canvas.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() - i) / 2, gl.L(1.0f) + (getMeasuredWidth() / 2), (getMeasuredHeight() + i) / 2, paint);
                paint = paint;
                canvas.drawRect(measuredWidth, (getMeasuredHeight() / 2) - gl.L(1.0f), getMeasuredWidth() / 2, gl.L(1.0f) + (getMeasuredHeight() / 2), paint);
            }
        }
        canvas.drawCircle(measuredWidth + r9, r9 + i2, f, paint);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i = this.c;
        if (motionEvent != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            float measuredWidth = (int) ((getMeasuredWidth() - i) * this.e);
            if (motionEvent.getAction() == 0) {
                float measuredHeight = (getMeasuredHeight() - i) / 2;
                if (measuredWidth - measuredHeight <= x && x <= i + measuredWidth + measuredHeight && y >= 0.0f && y <= getMeasuredHeight()) {
                    this.f = true;
                    this.d = (int) (x - measuredWidth);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    invalidate();
                    return true;
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (this.f) {
                    this.f = false;
                    invalidate();
                    return true;
                }
            } else if (motionEvent.getAction() == 2 && this.f) {
                float f = (int) (x - this.d);
                this.e = (f >= 0.0f ? f > ((float) (getMeasuredWidth() - i)) ? getMeasuredWidth() - i : f : 0.0f) / (getMeasuredWidth() - i);
                y48 y48Var = this.r;
                if (y48Var != null) {
                    y48Var.n(((Integer) getTag()).intValue(), getProgress());
                }
                invalidate();
                return true;
            }
        }
        return false;
    }

    public void setDelegate(y48 y48Var) {
        this.r = y48Var;
    }

    public void setProgress(int i) {
        a(i, true);
    }
}
