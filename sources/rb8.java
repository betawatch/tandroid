// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class rb8 extends View {
    public final Paint a;
    public final TextPaint b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final String h;
    public final String n;
    public int r;
    public final /* synthetic */ PhotoViewer s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb8(Context context, PhotoViewer photoViewer) {
        super(context);
        this.s = photoViewer;
        this.a = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        textPaint.setTextSize(gm.L(14.0f));
        textPaint.setColor(-3289651);
        this.h = jb6.M0(2131754736, "AccDescrVideoCompressLow");
        this.n = jb6.M0(2131754737, "AccDescrVideoCompressHigh");
        setImportantForAccessibility(1);
        setFocusable(true);
        setAccessibilityDelegate(new i86(this, (byte) 1));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.s.e8 != 1) {
            this.f = (((getMeasuredWidth() - (this.c * this.s.e8)) - (((this.s.e8 << 1) - 2) * this.d)) - (this.e << 1)) / (this.s.e8 - 1);
        } else {
            this.f = ((getMeasuredWidth() - (this.c * this.s.e8)) - (this.d << 1)) - (this.e << 1);
        }
        int L = gm.L(6.0f) + (getMeasuredHeight() / 2);
        int i = 0;
        while (i < this.s.e8) {
            int i2 = this.e;
            int i3 = this.f + (this.d << 1);
            int i4 = this.c;
            int i5 = (i4 / 2) + ((i3 + i4) * i) + i2;
            int i6 = this.s.d8;
            Paint paint = this.a;
            if (i <= i6) {
                paint.setColor(-11292945);
            } else {
                paint.setColor(1728053247);
            }
            canvas.drawCircle(i5, L, i == this.s.d8 ? gm.L(6.0f) : this.c / 2, this.a);
            if (i != 0) {
                canvas.drawRect((i == this.s.d8 + 1 ? gm.N(2.0f) : 0.0f) + (((i5 - (this.c / 2)) - this.d) - this.f), L - gm.L(1.0f), (r4 + this.f) - (i == this.s.d8 ? gm.N(2.0f) : 0.0f), gm.L(2.0f) + L, this.a);
            }
            i++;
        }
        canvas.drawText(this.h, this.e, L - gm.L(16.0f), this.b);
        canvas.drawText(this.n, (getMeasuredWidth() - this.e) - this.b.measureText(this.n), L - gm.L(16.0f), this.b);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.c = gm.L(8.0f);
        this.d = gm.L(2.0f);
        this.e = gm.L(18.0f);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.r = this.s.d8;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        int i = 0;
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            while (true) {
                if (i >= this.s.e8) {
                    break;
                }
                int i2 = this.e;
                int i3 = this.f;
                int i4 = this.d;
                int i5 = this.c;
                int i6 = (((i4 << 1) + i3 + i5) * i) + i2;
                int i7 = i5 / 2;
                int i8 = i6 + i7;
                int i9 = (i3 / 2) + i7 + i4;
                if (x <= i8 - i9 || x >= i8 + i9) {
                    i++;
                } else if (this.s.d8 != i) {
                    this.s.d8 = i;
                    this.s.N();
                    invalidate();
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.s.d8 != this.r) {
                this.s.x1(1);
            }
            this.s.K6 = false;
            return true;
        }
        return true;
    }
}
