package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class xp0 extends FrameLayout {
    public int B;
    public int C;
    public boolean D;
    public final /* synthetic */ zp0 E;
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
    public int v;
    public int w;
    public int x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp0(zp0 zp0Var, Context context) {
        super(context);
        this.E = zp0Var;
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
        this.a.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.a.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setColor(-1);
        Paint paint3 = new Paint();
        this.c = paint3;
        paint3.setColor(-939524096);
        setBackgroundColor(-13421773);
        setOnTouchListener(new g0(this, 4));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        zp0 zp0Var = this.E;
        BitmapDrawable bitmapDrawable = zp0Var.b;
        if (bitmapDrawable != null) {
            try {
                int i10 = this.x;
                int i11 = this.y;
                bitmapDrawable.setBounds(i10, i11, this.v + i10, this.w + i11);
                zp0Var.b.draw(canvas);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        canvas.drawRect(this.x, this.y, r0 + this.v, this.h, this.c);
        float f10 = this.x;
        float f11 = this.h;
        canvas.drawRect(f10, f11, this.f, f11 + this.e, this.c);
        float f12 = this.f + this.d;
        float f13 = this.h;
        canvas.drawRect(f12, f13, this.x + this.v, f13 + this.e, this.c);
        canvas.drawRect(this.x, this.h + this.e, r14 + this.v, this.y + this.w, this.c);
        float f14 = this.f;
        float f15 = this.h;
        canvas.drawRect(f14, f15, f14 + this.d, f15 + this.e, this.a);
        int dp = AndroidUtilities.dp(1.0f);
        float f16 = this.f;
        float f17 = dp;
        float f18 = dp * 3;
        canvas.drawRect(f16 + f17, this.h + f17, f16 + f17 + AndroidUtilities.dp(20.0f), this.h + f18, this.b);
        float f19 = this.f;
        float f20 = this.h;
        canvas.drawRect(f19 + f17, f20 + f17, f19 + f18, f20 + f17 + AndroidUtilities.dp(20.0f), this.b);
        float dp2 = ((this.f + this.d) - f17) - AndroidUtilities.dp(20.0f);
        float f21 = this.h;
        canvas.drawRect(dp2, f21 + f17, (this.f + this.d) - f17, f21 + f18, this.b);
        float f22 = this.f;
        float f23 = this.d;
        float f24 = this.h;
        canvas.drawRect((f22 + f23) - f18, f24 + f17, (f22 + f23) - f17, f24 + f17 + AndroidUtilities.dp(20.0f), this.b);
        canvas.drawRect(this.f + f17, ((this.h + this.e) - f17) - AndroidUtilities.dp(20.0f), this.f + f18, (this.h + this.e) - f17, this.b);
        float f25 = this.f;
        canvas.drawRect(f25 + f17, (this.h + this.e) - f18, f25 + f17 + AndroidUtilities.dp(20.0f), (this.h + this.e) - f17, this.b);
        float dp3 = ((this.f + this.d) - f17) - AndroidUtilities.dp(20.0f);
        float f26 = this.h;
        float f27 = this.e;
        canvas.drawRect(dp3, (f26 + f27) - f18, (this.f + this.d) - f17, (f26 + f27) - f17, this.b);
        canvas.drawRect((this.f + this.d) - f18, ((this.h + this.e) - f17) - AndroidUtilities.dp(20.0f), (this.f + this.d) - f17, (this.h + this.e) - f17, this.b);
        for (int i12 = 1; i12 < 3; i12++) {
            float f28 = this.f;
            float f29 = this.d;
            float f30 = i12;
            float f31 = this.h;
            canvas.drawRect(((f29 / 3.0f) * f30) + f28, f31 + f17, vh.w2.c(f29, 3.0f, f30, f28 + f17), (f31 + this.e) - f17, this.b);
            float f32 = this.f;
            float f33 = this.h;
            float f34 = this.e;
            canvas.drawRect(f32 + f17, vh.w2.c(f34, 3.0f, f30, f33), this.d + (f32 - f17), ((f34 / 3.0f) * f30) + f33 + f17, this.b);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        zp0 zp0Var;
        Bitmap bitmap;
        super.onLayout(z4, i10, i11, i12, i13);
        this.B = (i12 - i10) - AndroidUtilities.dp(28.0f);
        int dp = (i13 - i11) - AndroidUtilities.dp(28.0f);
        this.C = dp;
        if (this.B == 0 || dp == 0 || (bitmap = (zp0Var = this.E).a) == null) {
            return;
        }
        float f10 = this.f - this.x;
        float f11 = this.v;
        float f12 = f10 / f11;
        float f13 = this.h - this.y;
        float f14 = this.w;
        float f15 = f13 / f14;
        float f16 = this.d / f11;
        float f17 = this.e / f14;
        float width = bitmap.getWidth();
        float height = zp0Var.a.getHeight();
        int i14 = this.B;
        float f18 = i14 / width;
        int i15 = this.C;
        if (f18 > i15 / height) {
            this.w = i15;
            this.v = (int) Math.ceil(width * r5);
        } else {
            this.v = i14;
            this.w = (int) Math.ceil(height * f18);
        }
        this.x = AndroidUtilities.dp(14.0f) + ((this.B - this.v) / 2);
        int dp2 = AndroidUtilities.dp(14.0f) + ((this.C - this.w) / 2);
        this.y = dp2;
        if (this.f != -1.0f || this.h != -1.0f) {
            float f19 = this.v;
            this.f = (f12 * f19) + this.x;
            float f20 = this.w;
            this.h = (f15 * f20) + dp2;
            this.d = f16 * f19;
            this.e = f17 * f20;
        } else if (this.D) {
            this.h = dp2;
            this.f = this.x;
            this.d = this.v;
            this.e = this.w;
        } else {
            if (this.v > this.w) {
                this.h = dp2;
                this.f = AndroidUtilities.dp(14.0f) + ((this.B - r11) / 2);
                float f21 = this.w;
                this.d = f21;
                this.e = f21;
            } else {
                this.f = this.x;
                this.h = AndroidUtilities.dp(14.0f) + ((this.C - r9) / 2);
                float f22 = this.v;
                this.d = f22;
                this.e = f22;
            }
        }
        invalidate();
    }
}
