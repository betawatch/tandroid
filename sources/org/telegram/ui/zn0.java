package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class zn0 extends FrameLayout {
    public int D;
    public int E;
    public int F;
    public boolean G;
    public final /* synthetic */ bo0 H;
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public float d;
    public float e;
    public float f;
    public float h;
    public int n;
    public float r;
    public float s;
    public int w;
    public int x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn0(bo0 bo0Var, Context context) {
        super(context);
        this.H = bo0Var;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = 600.0f;
        this.e = 600.0f;
        this.f = -1.0f;
        this.h = -1.0f;
        this.n = 0;
        this.r = 0.0f;
        this.s = 0.0f;
        Paint paint = new Paint();
        this.a = paint;
        paint.setColor(1073412858);
        this.a.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        this.a.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setColor(-1);
        Paint paint3 = new Paint();
        this.c = paint3;
        paint3.setColor(-939524096);
        setBackgroundColor(-13421773);
        setOnTouchListener(new d0(this, 4));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        bo0 bo0Var = this.H;
        BitmapDrawable bitmapDrawable = bo0Var.b;
        if (bitmapDrawable != null) {
            try {
                int i10 = this.y;
                int i11 = this.D;
                bitmapDrawable.setBounds(i10, i11, this.w + i10, this.x + i11);
                bo0Var.b.draw(canvas);
            } catch (Throwable th2) {
                org.telegram.messenger.f8.g(th2, true);
            }
        }
        canvas.drawRect(this.y, this.D, r0 + this.w, this.h, this.c);
        float f7 = this.y;
        float f10 = this.h;
        canvas.drawRect(f7, f10, this.f, f10 + this.e, this.c);
        float f11 = this.f + this.d;
        float f12 = this.h;
        canvas.drawRect(f11, f12, this.y + this.w, f12 + this.e, this.c);
        canvas.drawRect(this.y, this.h + this.e, r0 + this.w, this.D + this.x, this.c);
        float f13 = this.f;
        float f14 = this.h;
        canvas.drawRect(f13, f14, f13 + this.d, f14 + this.e, this.a);
        int L = org.telegram.messenger.i0.L(1.0f);
        float f15 = L;
        float f16 = this.f + f15;
        float f17 = L * 3;
        canvas.drawRect(f16, this.h + f15, f16 + org.telegram.messenger.i0.L(20.0f), this.h + f17, this.b);
        float f18 = this.f;
        float f19 = this.h + f15;
        canvas.drawRect(f18 + f15, f19, f18 + f17, f19 + org.telegram.messenger.i0.L(20.0f), this.b);
        float L2 = ((this.f + this.d) - f15) - org.telegram.messenger.i0.L(20.0f);
        float f20 = this.h;
        canvas.drawRect(L2, f20 + f15, (this.f + this.d) - f15, f20 + f17, this.b);
        float f21 = this.f + this.d;
        float f22 = this.h + f15;
        canvas.drawRect(f21 - f17, f22, f21 - f15, f22 + org.telegram.messenger.i0.L(20.0f), this.b);
        canvas.drawRect(this.f + f15, ((this.h + this.e) - f15) - org.telegram.messenger.i0.L(20.0f), this.f + f17, (this.h + this.e) - f15, this.b);
        float f23 = this.f + f15;
        canvas.drawRect(f23, (this.h + this.e) - f17, f23 + org.telegram.messenger.i0.L(20.0f), (this.h + this.e) - f15, this.b);
        float L3 = ((this.f + this.d) - f15) - org.telegram.messenger.i0.L(20.0f);
        float f24 = this.h + this.e;
        canvas.drawRect(L3, f24 - f17, (this.f + this.d) - f15, f24 - f15, this.b);
        canvas.drawRect((this.f + this.d) - f17, ((this.h + this.e) - f15) - org.telegram.messenger.i0.L(20.0f), (this.f + this.d) - f15, (this.h + this.e) - f15, this.b);
        for (int i12 = 1; i12 < 3; i12++) {
            float f25 = this.f;
            float f26 = i12;
            float f27 = (this.d / 3.0f) * f26;
            float f28 = this.h;
            canvas.drawRect(f27 + f25, f28 + f15, f25 + f15 + f27, (f28 + this.e) - f15, this.b);
            float f29 = this.f;
            float c10 = a1.g.c(this.e, 3.0f, f26, this.h);
            canvas.drawRect(f29 + f15, c10, (f29 - f15) + this.d, c10 + f15, this.b);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        bo0 bo0Var;
        Bitmap bitmap;
        super.onLayout(z10, i10, i11, i12, i13);
        this.E = (i12 - i10) - org.telegram.messenger.i0.L(28.0f);
        int L = (i13 - i11) - org.telegram.messenger.i0.L(28.0f);
        this.F = L;
        if (this.E == 0 || L == 0 || (bitmap = (bo0Var = this.H).a) == null) {
            return;
        }
        float f7 = this.f - this.y;
        float f10 = this.w;
        float f11 = f7 / f10;
        float f12 = this.h - this.D;
        float f13 = this.x;
        float f14 = f12 / f13;
        float f15 = this.d / f10;
        float f16 = this.e / f13;
        float width = bitmap.getWidth();
        float height = bo0Var.a.getHeight();
        int i14 = this.E;
        float f17 = i14 / width;
        int i15 = this.F;
        if (f17 > i15 / height) {
            this.x = i15;
            this.w = (int) Math.ceil(width * r5);
        } else {
            this.w = i14;
            this.x = (int) Math.ceil(height * f17);
        }
        this.y = org.telegram.messenger.i0.L(14.0f) + ((this.E - this.w) / 2);
        int L2 = org.telegram.messenger.i0.L(14.0f) + ((this.F - this.x) / 2);
        this.D = L2;
        if (this.f != -1.0f || this.h != -1.0f) {
            float f18 = this.w;
            this.f = (f11 * f18) + this.y;
            float f19 = this.x;
            this.h = (f14 * f19) + L2;
            this.d = f15 * f18;
            this.e = f16 * f19;
        } else if (this.G) {
            this.h = L2;
            this.f = this.y;
            this.d = this.w;
            this.e = this.x;
        } else {
            if (this.w > this.x) {
                this.h = L2;
                this.f = org.telegram.messenger.i0.L(14.0f) + ((this.E - r11) / 2);
                float f20 = this.x;
                this.d = f20;
                this.e = f20;
            } else {
                this.f = this.y;
                this.h = org.telegram.messenger.i0.L(14.0f) + ((this.F - r9) / 2);
                float f21 = this.w;
                this.d = f21;
                this.e = f21;
            }
        }
        invalidate();
    }
}
