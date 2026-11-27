// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class xy4 extends rne {
    public final boolean a;
    public final Paint b = new Paint();
    public final Paint c;
    public final Paint d;
    public int e;
    public int f;
    public final /* synthetic */ bz4 g;

    public xy4(bz4 bz4Var, boolean z) {
        this.g = bz4Var;
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = new Paint(1);
        this.e = -1;
        this.f = -1;
        this.a = z;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    @Override // rne
    public final void b() {
        this.e = -1;
    }

    @Override // rne
    public final void c(Canvas canvas) {
        Paint paint;
        Paint paint2;
        float f;
        float f2;
        bz4 bz4Var = this.g;
        Rect bounds = bz4Var.getBounds();
        int width = bounds.width();
        int height = bounds.height();
        float f3 = width;
        int ceil = (int) Math.ceil(f3 / 5.0f);
        float f4 = height;
        int ceil2 = (int) Math.ceil(f4 / 5.0f);
        boolean z = this.a;
        boolean z2 = z ? bz4Var.w : bz4Var.x;
        Paint paint3 = this.c;
        Paint paint4 = this.d;
        if (!z2 && this.e == width && this.f == height) {
            paint = paint3;
            paint2 = paint4;
        } else {
            int i = bz4Var.y;
            float f5 = (i == 1 || i == 4) ? f4 : f3;
            if (z) {
                cz4 cz4Var = bz4Var.E;
                cz4Var.getClass();
                paint2 = paint4;
                paint = paint3;
                paint.setShader(bz4Var.l(cz4Var, f5, 0.0f, -1, 5));
                cz4 cz4Var2 = bz4Var.F;
                cz4Var2.getClass();
                paint2.setShader(bz4Var.l(cz4Var2, f5, 0.0f, bz4Var.I, 5));
            } else {
                paint = paint3;
                paint2 = paint4;
                cz4 cz4Var3 = bz4Var.G;
                cz4Var3.getClass();
                paint2.setShader(bz4Var.l(cz4Var3, f5, 0.0f, bz4Var.K, 5));
            }
            this.e = width;
            this.f = height;
            if (z) {
                bz4Var.w = false;
            } else {
                bz4Var.x = false;
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
            canvas.drawColor((bz4Var.I & 16777215) | (-16777216));
            canvas.save();
            canvas.scale(0.2f, 0.2f);
            float f8 = bounds.left;
            float f9 = bz4Var.d;
            float f10 = f8 + f9;
            float f11 = bounds.top;
            float f12 = bz4Var.e;
            float f13 = f11 + f12;
            canvas.translate(-f10, -f13);
            bz4Var.f.e(f10, f13, bounds.right + f9, f12 + bounds.bottom, canvas);
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

    @Override // rne
    public final void e(float f) {
        this.b.setAlpha(Math.round(f * 255.0f));
    }
}
