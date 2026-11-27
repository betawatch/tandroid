// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.Button;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class uv8 extends Button {
    public final RectF a;
    public final Paint b;
    public boolean c;
    public float d;
    public long e;
    public int f;

    public uv8(Context context) {
        super(context);
        setAllCaps(false);
        setTextSize(1, 14.0f);
        setTypeface(hl.o());
        setOutlineProvider(null);
        l2f.a(this, 8.0f, 0.0f, 8.0f, 0.0f);
        int L = hl.L(60.0f);
        setMinWidth(L);
        setMinimumWidth(L);
        this.a = new RectF();
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(hl.L(2.0f));
    }

    public final void a(boolean z, boolean z2) {
        if (this.c != z) {
            this.c = z;
            if (!z2) {
                this.d = z ? 1.0f : 0.0f;
            }
            this.e = System.currentTimeMillis();
            invalidate();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.c || this.d != 0.0f) {
            int measuredWidth = getMeasuredWidth() - hl.L(11.0f);
            float f = measuredWidth;
            float L = hl.L(3.0f);
            float L2 = hl.L(8.0f) + measuredWidth;
            float L3 = hl.L(11.0f);
            RectF rectF = this.a;
            rectF.set(f, L, L2, L3);
            int min = Math.min(jn7.d4, (int) (this.d * 255.0f));
            Paint paint = this.b;
            paint.setAlpha(min);
            canvas.drawArc(rectF, this.f, 220.0f, false, paint);
            long currentTimeMillis = System.currentTimeMillis();
            if (Math.abs(this.e - System.currentTimeMillis()) < 1000) {
                long j = currentTimeMillis - this.e;
                int i = (int) (this.f + ((360 * j) / 2000.0f));
                this.f = i - ((i / 360) * 360);
                boolean z = this.c;
                float f2 = this.d;
                if (z) {
                    if (f2 < 1.0f) {
                        float f3 = (j / 200.0f) + f2;
                        this.d = f3;
                        if (f3 > 1.0f) {
                            this.d = 1.0f;
                        }
                    }
                } else if (f2 > 0.0f) {
                    float f4 = f2 - (j / 200.0f);
                    this.d = f4;
                    if (f4 < 0.0f) {
                        this.d = 0.0f;
                    }
                }
            }
            this.e = currentTimeMillis;
            postInvalidateOnAnimation();
        }
    }

    public void setProgressColor(int i) {
        this.b.setColor(i);
    }
}
