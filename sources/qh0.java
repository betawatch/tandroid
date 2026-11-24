// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class qh0 extends View {
    public Bitmap a;
    public Bitmap b;
    public Paint c;
    public byte d;
    public int e;
    public ph0 f;

    public int getRating() {
        return this.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.c;
        int i = 0;
        while (i < this.d) {
            paint.setColor(bkb.w0(null, i < this.e ? bkb.l5 : bkb.s5, false));
            canvas.drawBitmap(i < this.e ? this.a : this.b, gl.L(48.0f) * i, 0.0f, paint);
            i++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        byte b = this.d;
        setMeasuredDimension(de9.y(16.0f, b - 1, gl.L(32.0f) * b), gl.L(32.0f));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        float L = gl.L(-8.0f);
        for (int i2 = 0; i2 < this.d; i2++) {
            if (motionEvent.getX() > L && motionEvent.getX() < gl.L(48.0f) + L && this.e != (i = i2 + 1)) {
                this.e = i;
                ph0 ph0Var = this.f;
                if (ph0Var != null) {
                    View view = ((em0) ph0Var).a;
                    view.setEnabled(i > 0);
                    ((TextView) view).setText(k96.M0(i < 4 ? 2131748058 : 2131745448, null).toUpperCase());
                }
                invalidate();
                return true;
            }
            L += gl.L(48.0f);
        }
        return true;
    }

    public void setOnRatingChangeListener(ph0 ph0Var) {
        this.f = ph0Var;
    }
}
