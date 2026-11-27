// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class rh0 extends View {
    public Bitmap a;
    public Bitmap b;
    public Paint c;
    public byte d;
    public int e;
    public qh0 f;

    public int getRating() {
        return this.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.c;
        int i = 0;
        while (i < this.d) {
            paint.setColor(aob.w0(null, i < this.e ? aob.m5 : aob.t5, false));
            canvas.drawBitmap(i < this.e ? this.a : this.b, hl.L(48.0f) * i, 0.0f, paint);
            i++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        byte b = this.d;
        setMeasuredDimension(uh9.y(16.0f, b - 1, hl.L(32.0f) * b), hl.L(32.0f));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        float L = hl.L(-8.0f);
        for (int i2 = 0; i2 < this.d; i2++) {
            if (motionEvent.getX() > L && motionEvent.getX() < hl.L(48.0f) + L && this.e != (i = i2 + 1)) {
                this.e = i;
                qh0 qh0Var = this.f;
                if (qh0Var != null) {
                    View view = ((em0) qh0Var).a;
                    view.setEnabled(i > 0);
                    ((TextView) view).setText(ob6.M0(i < 4 ? 2131747981 : 2131745368, null).toUpperCase());
                }
                invalidate();
                return true;
            }
            L += hl.L(48.0f);
        }
        return true;
    }

    public void setOnRatingChangeListener(qh0 qh0Var) {
        this.f = qh0Var;
    }
}
