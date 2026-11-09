package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class zq0 extends View {
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
    public zq0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.s = photoViewer;
        this.a = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setColor(-3289651);
        this.h = org.telegram.messenger.id.M0(2131754737, "AccDescrVideoCompressLow");
        this.n = org.telegram.messenger.id.M0(2131754738, "AccDescrVideoCompressHigh");
        setImportantForAccessibility(1);
        setFocusable(true);
        setAccessibilityDelegate(new org.telegram.ui.Components.vt0(2, this));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.s.Y7 != 1) {
            this.f = (((getMeasuredWidth() - (this.c * this.s.Y7)) - (((this.s.Y7 * 2) - 2) * this.d)) - (this.e * 2)) / (this.s.Y7 - 1);
        } else {
            this.f = ((getMeasuredWidth() - (this.c * this.s.Y7)) - (this.d * 2)) - (this.e * 2);
        }
        int L = org.telegram.messenger.g0.L(6.0f) + (getMeasuredHeight() / 2);
        int i7 = 0;
        while (i7 < this.s.Y7) {
            int i10 = this.e;
            int i11 = (this.d * 2) + this.f;
            int i12 = this.c;
            int i13 = (i12 / 2) + ((i11 + i12) * i7) + i10;
            if (i7 <= this.s.X7) {
                this.a.setColor(-11292945);
            } else {
                this.a.setColor(1728053247);
            }
            canvas.drawCircle(i13, L, i7 == this.s.X7 ? org.telegram.messenger.g0.L(6.0f) : this.c / 2, this.a);
            if (i7 != 0) {
                canvas.drawRect((i7 == this.s.X7 + 1 ? org.telegram.messenger.g0.N(2.0f) : 0.0f) + (((i13 - (this.c / 2)) - this.d) - this.f), L - org.telegram.messenger.g0.L(1.0f), (r2 + this.f) - (i7 == this.s.X7 ? org.telegram.messenger.g0.N(2.0f) : 0.0f), org.telegram.messenger.g0.L(2.0f) + L, this.a);
            }
            i7++;
        }
        canvas.drawText(this.h, this.e, L - org.telegram.messenger.g0.L(16.0f), this.b);
        canvas.drawText(this.n, (getMeasuredWidth() - this.e) - this.b.measureText(this.n), L - org.telegram.messenger.g0.L(16.0f), this.b);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.c = org.telegram.messenger.g0.L(8.0f);
        this.d = org.telegram.messenger.g0.L(2.0f);
        this.e = org.telegram.messenger.g0.L(18.0f);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.r = this.s.X7;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        int i7 = 0;
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            while (true) {
                if (i7 >= this.s.Y7) {
                    break;
                }
                int i10 = this.e;
                int i11 = this.f;
                int i12 = this.d;
                int i13 = this.c;
                int i14 = (((i12 * 2) + i11 + i13) * i7) + i10;
                int i15 = i13 / 2;
                int i16 = i14 + i15;
                int i17 = (i11 / 2) + i15 + i12;
                if (x10 <= i16 - i17 || x10 >= i16 + i17) {
                    i7++;
                } else if (this.s.X7 != i7) {
                    this.s.X7 = i7;
                    this.s.L0();
                    invalidate();
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.s.X7 != this.r) {
                this.s.m2(1);
            }
            this.s.K6 = false;
            return true;
        }
        return true;
    }
}
