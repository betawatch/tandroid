// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qi0 extends View {
    public Bitmap a;
    public Bitmap b;
    public Paint c;
    public byte d;
    public int e;
    public pi0 f;

    public int getRating() {
        return this.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.c;
        int i = 0;
        while (i < this.d) {
            paint.setColor(cmb.w0(null, i < this.e ? cmb.l5 : cmb.s5, false));
            canvas.drawBitmap(i < this.e ? this.a : this.b, gm.L(48.0f) * i, 0.0f, paint);
            i++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        byte b = this.d;
        setMeasuredDimension(hg9.y(16.0f, b - 1, gm.L(32.0f) * b), gm.L(32.0f));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        float L = gm.L(-8.0f);
        for (int i2 = 0; i2 < this.d; i2++) {
            if (motionEvent.getX() > L && motionEvent.getX() < gm.L(48.0f) + L && this.e != (i = i2 + 1)) {
                this.e = i;
                pi0 pi0Var = this.f;
                if (pi0Var != null) {
                    View view = ((en0) pi0Var).a;
                    view.setEnabled(i > 0);
                    ((TextView) view).setText(jb6.M0(i < 4 ? 2131747984 : 2131745374, null).toUpperCase());
                }
                invalidate();
                return true;
            }
            L += gm.L(48.0f);
        }
        return true;
    }

    public void setOnRatingChangeListener(pi0 pi0Var) {
        this.f = pi0Var;
    }
}
