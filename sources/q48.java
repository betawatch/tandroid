// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class q48 extends FrameLayout {
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final /* synthetic */ r48 I;
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public float d;
    public float e;
    public float f;
    public float h;
    public byte n;
    public float r;
    public float s;
    public int w;
    public int x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q48(r48 r48Var, Context context) {
        super(context);
        this.I = r48Var;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = 600.0f;
        this.e = 600.0f;
        this.f = -1.0f;
        this.h = -1.0f;
        this.n = (byte) 0;
        this.r = 0.0f;
        this.s = 0.0f;
        Paint paint = new Paint();
        this.a = paint;
        paint.setColor(1073412858);
        this.a.setStrokeWidth(gl.L(2.0f));
        this.a.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setColor(-1);
        Paint paint3 = new Paint();
        this.c = paint3;
        paint3.setColor(-939524096);
        setBackgroundColor(-13421773);
        setOnTouchListener(new a7(this, (byte) 13));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        r48 r48Var = this.I;
        BitmapDrawable bitmapDrawable = r48Var.b;
        if (bitmapDrawable != null) {
            try {
                int i = this.y;
                int i2 = this.E;
                bitmapDrawable.setBounds(i, i2, this.w + i, this.x + i2);
                r48Var.b.draw(canvas);
            } catch (Throwable th) {
                fa4.g(th, true);
            }
        }
        canvas.drawRect(this.y, this.E, r0 + this.w, this.h, this.c);
        float f = this.y;
        float f2 = this.h;
        canvas.drawRect(f, f2, this.f, f2 + this.e, this.c);
        float f3 = this.f + this.d;
        float f4 = this.h;
        canvas.drawRect(f3, f4, this.y + this.w, f4 + this.e, this.c);
        canvas.drawRect(this.y, this.h + this.e, r0 + this.w, this.E + this.x, this.c);
        float f5 = this.f;
        float f6 = this.h;
        canvas.drawRect(f5, f6, f5 + this.d, f6 + this.e, this.a);
        int L = gl.L(1.0f);
        float f7 = L;
        float f8 = this.f + f7;
        float f9 = L * 3;
        canvas.drawRect(f8, this.h + f7, f8 + gl.L(20.0f), this.h + f9, this.b);
        float f10 = this.f;
        float f11 = this.h + f7;
        canvas.drawRect(f10 + f7, f11, f10 + f9, f11 + gl.L(20.0f), this.b);
        float L2 = ((this.f + this.d) - f7) - gl.L(20.0f);
        float f12 = this.h;
        canvas.drawRect(L2, f12 + f7, (this.f + this.d) - f7, f12 + f9, this.b);
        float f13 = this.f + this.d;
        float f14 = this.h + f7;
        canvas.drawRect(f13 - f9, f14, f13 - f7, f14 + gl.L(20.0f), this.b);
        canvas.drawRect(this.f + f7, ((this.h + this.e) - f7) - gl.L(20.0f), this.f + f9, (this.h + this.e) - f7, this.b);
        float f15 = this.f + f7;
        canvas.drawRect(f15, (this.h + this.e) - f9, f15 + gl.L(20.0f), (this.h + this.e) - f7, this.b);
        float L3 = ((this.f + this.d) - f7) - gl.L(20.0f);
        float f16 = this.h + this.e;
        canvas.drawRect(L3, f16 - f9, (this.f + this.d) - f7, f16 - f7, this.b);
        canvas.drawRect((this.f + this.d) - f9, ((this.h + this.e) - f7) - gl.L(20.0f), (this.f + this.d) - f7, (this.h + this.e) - f7, this.b);
        for (int i3 = 1; i3 < 3; i3++) {
            float f17 = this.f;
            float f18 = i3;
            float f19 = (this.d / 3.0f) * f18;
            float f20 = this.h;
            canvas.drawRect(f19 + f17, f20 + f7, f17 + f7 + f19, (f20 + this.e) - f7, this.b);
            float f21 = this.f;
            float A = b00.A(this.e, 3.0f, f18, this.h);
            canvas.drawRect(f21 + f7, A, (f21 - f7) + this.d, A + f7, this.b);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        r48 r48Var;
        Bitmap bitmap;
        super.onLayout(z, i, i2, i3, i4);
        this.F = (i3 - i) - gl.L(28.0f);
        int L = (i4 - i2) - gl.L(28.0f);
        this.G = L;
        if (this.F == 0 || L == 0 || (bitmap = (r48Var = this.I).a) == null) {
            return;
        }
        float f = this.f - this.y;
        float f2 = this.w;
        float f3 = f / f2;
        float f4 = this.h - this.E;
        float f5 = this.x;
        float f6 = f4 / f5;
        float f7 = this.d / f2;
        float f8 = this.e / f5;
        float width = bitmap.getWidth();
        float height = r48Var.a.getHeight();
        int i5 = this.F;
        float f9 = i5 / width;
        int i6 = this.G;
        if (f9 > i6 / height) {
            this.x = i6;
            this.w = (int) Math.ceil(width * r4);
        } else {
            this.w = i5;
            this.x = (int) Math.ceil(height * f9);
        }
        this.y = gl.L(14.0f) + ((this.F - this.w) / 2);
        int L2 = gl.L(14.0f) + ((this.G - this.x) / 2);
        this.E = L2;
        if (this.f != -1.0f || this.h != -1.0f) {
            float f10 = this.w;
            this.f = (f3 * f10) + this.y;
            float f11 = this.x;
            this.h = (f6 * f11) + L2;
            this.d = f7 * f10;
            this.e = f8 * f11;
        } else if (this.H) {
            this.h = L2;
            this.f = this.y;
            this.d = this.w;
            this.e = this.x;
        } else {
            if (this.w > this.x) {
                this.h = L2;
                this.f = gl.L(14.0f) + ((this.F - r9) / 2);
                float f12 = this.x;
                this.d = f12;
                this.e = f12;
            } else {
                this.f = this.y;
                this.h = gl.L(14.0f) + ((this.G - r7) / 2);
                float f13 = this.w;
                this.d = f13;
                this.e = f13;
            }
        }
        invalidate();
    }
}
