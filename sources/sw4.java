// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class sw4 extends xie {
    public final boolean a;
    public final Paint b = new Paint();
    public final Paint c;
    public final Paint d;
    public int e;
    public int f;
    public final /* synthetic */ ww4 g;

    public sw4(ww4 ww4Var, boolean z) {
        this.g = ww4Var;
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = new Paint(1);
        this.e = -1;
        this.f = -1;
        this.a = z;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    @Override // xie
    public final void b() {
        this.e = -1;
    }

    @Override // xie
    public final void c(Canvas canvas) {
        Paint paint;
        Paint paint2;
        float f;
        float f2;
        ww4 ww4Var = this.g;
        Rect bounds = ww4Var.getBounds();
        int width = bounds.width();
        int height = bounds.height();
        float f3 = width;
        int ceil = (int) Math.ceil(f3 / 5.0f);
        float f4 = height;
        int ceil2 = (int) Math.ceil(f4 / 5.0f);
        boolean z = this.a;
        boolean z2 = z ? ww4Var.w : ww4Var.x;
        Paint paint3 = this.c;
        Paint paint4 = this.d;
        if (!z2 && this.e == width && this.f == height) {
            paint = paint3;
            paint2 = paint4;
        } else {
            int i = ww4Var.y;
            float f5 = (i == 1 || i == 4) ? f4 : f3;
            if (z) {
                xw4 xw4Var = ww4Var.E;
                xw4Var.getClass();
                paint2 = paint4;
                paint = paint3;
                paint.setShader(ww4Var.l(xw4Var, f5, 0.0f, -1, 5));
                xw4 xw4Var2 = ww4Var.F;
                xw4Var2.getClass();
                paint2.setShader(ww4Var.l(xw4Var2, f5, 0.0f, ww4Var.I, 5));
            } else {
                paint = paint3;
                paint2 = paint4;
                xw4 xw4Var3 = ww4Var.G;
                xw4Var3.getClass();
                paint2.setShader(ww4Var.l(xw4Var3, f5, 0.0f, ww4Var.K, 5));
            }
            this.e = width;
            this.f = height;
            if (z) {
                ww4Var.w = false;
            } else {
                ww4Var.x = false;
            }
        }
        canvas.save();
        canvas.scale(5.0f, 5.0f);
        float f6 = ceil;
        float f7 = ceil2;
        Paint paint5 = paint;
        Paint paint6 = paint2;
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, f6, f7, this.b);
        if (z) {
            canvas.drawColor((ww4Var.I & 16777215) | (-16777216));
            canvas.save();
            canvas.scale(0.2f, 0.2f);
            float f8 = bounds.left;
            float f9 = ww4Var.d;
            float f10 = f8 + f9;
            float f11 = bounds.top;
            float f12 = ww4Var.e;
            float f13 = f11 + f12;
            canvas.translate(-f10, -f13);
            ww4Var.f.e(f10, f13, bounds.right + f9, f12 + bounds.bottom, canvas);
            canvas.restore();
            f = f6;
            f2 = f7;
            canvas.drawRect(0.0f, 0.0f, f, f2, paint5);
        } else {
            f = f6;
            f2 = f7;
        }
        canvas.drawRect(0.0f, 0.0f, f, f2, paint6);
        canvas.restoreToCount(saveLayer);
        canvas.restore();
    }

    @Override // xie
    public final void e(float f) {
        this.b.setAlpha(Math.round(f * 255.0f));
    }
}
