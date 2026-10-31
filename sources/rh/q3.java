package rh;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q3 extends View {
    public float D;
    public float E;
    public final Camera F;
    public final li.k G;
    public final RectF H;
    public l3 a;
    public l3 b;
    public l3 c;
    public float d;
    public float e;
    public float f;
    public boolean h;
    public boolean n;
    public boolean r;
    public k3 s;
    public k3 w;
    public k3 x;
    public float y;

    public q3(Context context) {
        super(context);
        this.F = new Camera();
        this.G = new li.k(23);
        this.H = new RectF();
    }

    public final void a(Canvas canvas, k3 k3Var, float f7, float f10, float f11, int[] iArr, int[] iArr2, int[] iArr3) {
        if (k3Var != null) {
            Matrix matrix = k3Var.d;
            Paint paint = k3Var.c;
            if (paint == null) {
                return;
            }
            float f12 = (f7 - 0.5f) / 1.5f;
            float l4 = Utilities.l(1.0f - Math.abs(f12));
            float max = Math.max(0.8f * f10, org.telegram.messenger.i0.L(180.0f));
            float x10 = org.telegram.ui.Cells.f1.x(f12, max, 1.8f, f10 / 2.0f);
            float min = Math.min(org.telegram.messenger.i0.L(176.0f), f11) / 2.0f;
            float f13 = x10 - max;
            float f14 = x10 + max;
            canvas.saveLayerAlpha(f13, 0.0f, f14, f11, zs.e4, 31);
            matrix.reset();
            matrix.postTranslate(x10, min);
            k3Var.e.setLocalMatrix(matrix);
            paint.setAlpha((int) (l4 * 255.0f));
            canvas.drawRect(f13, 0.0f, f14, f11, paint);
            canvas.save();
            float L = org.telegram.messenger.i0.L(90.0f);
            RectF rectF = this.H;
            rectF.set(f13, 0.0f, f13 + L, f11);
            li.k kVar = this.G;
            kVar.o(canvas, rectF, 0, 1.0f);
            rectF.set(f14 - L, 0.0f, f14, f11);
            kVar.o(canvas, rectF, 2, 1.0f);
            canvas.restore();
            canvas.restore();
            for (int i10 = 0; i10 < iArr.length; i10++) {
                float width = (getWidth() / (iArr.length - 1)) * i10;
                iArr[i10] = org.telegram.ui.ActionBar.t6.w(iArr[i10], org.telegram.ui.ActionBar.t6.r1(l4 * ((width < f13 || width > f14) ? 0.0f : Math.min(Utilities.l((width - f13) / max), Utilities.l(1.0f - ((width - (f14 - max)) / max)))), k3Var.g));
            }
            for (int i11 = 0; i11 < iArr2.length; i11++) {
                float width2 = (getWidth() / (iArr2.length - 1)) * i11;
                iArr2[i11] = org.telegram.ui.ActionBar.t6.w(iArr2[i11], org.telegram.ui.ActionBar.t6.r1(l4 * ((width2 < f13 || width2 > f14) ? 0.0f : Math.min(Utilities.l((width2 - f13) / max), Utilities.l(1.0f - ((width2 - (f14 - max)) / max)))), k3Var.f));
            }
            for (int i12 = 0; i12 < iArr3.length; i12++) {
                float width3 = (getWidth() / (iArr2.length - 1)) * i12;
                iArr3[i12] = org.telegram.ui.ActionBar.t6.w(iArr3[i12], org.telegram.ui.ActionBar.t6.r1(l4 * ((width3 < f13 || width3 > f14) ? 0.0f : Math.min(Utilities.l((width3 - f13) / max), Utilities.l(1.0f - ((width3 - (f14 - max)) / max)))), k3Var.h));
            }
        }
    }

    public final void b(Canvas canvas, l3 l3Var, float f7, boolean z10) {
        if (l3Var == null) {
            return;
        }
        ImageReceiver imageReceiver = l3Var.d;
        float f10 = f7;
        if (z10) {
            f10 = Math.max(0.5f, f10);
        }
        float f11 = imageReceiver.K0;
        float f12 = imageReceiver.L0;
        float f13 = imageReceiver.M0;
        float f14 = imageReceiver.N0;
        float alpha = imageReceiver.getAlpha();
        float f15 = (f10 - 0.5f) / 1.5f;
        float l4 = Utilities.l(1.0f - Math.abs(f15));
        float width = (getWidth() / 2.0f) - (org.telegram.messenger.i0.L(220.0f) * f15);
        float L = org.telegram.messenger.i0.L(80.0f);
        float T1 = org.telegram.messenger.i0.T1(0.85f, 1.0f, l4);
        float L2 = org.telegram.messenger.i0.L(160.0f);
        canvas.save();
        float f16 = ((L2 / 2.0f) * f15) + width;
        canvas.translate(f16, L);
        Camera camera = this.F;
        camera.save();
        camera.rotateY(f15 * (-30.0f));
        camera.applyToCanvas(canvas);
        camera.restore();
        canvas.translate(-f16, -L);
        float f17 = L2 * T1;
        float f18 = f17 / 2.0f;
        imageReceiver.y0(width - f18, L - f18, f17, f17);
        imageReceiver.setAlpha(l4);
        imageReceiver.h(canvas, null);
        imageReceiver.y0(f11, f12, f13, f14);
        imageReceiver.setAlpha(alpha);
        canvas.restore();
    }

    public final void c() {
        boolean z10 = (this.a == null && this.b == null && this.c == null && this.s == null && this.w == null && this.x == null) ? false : true;
        this.c = null;
        this.b = null;
        this.a = null;
        this.f = 0.0f;
        this.e = 0.0f;
        this.d = 0.0f;
        this.r = false;
        this.n = false;
        this.h = false;
        this.x = null;
        this.w = null;
        this.s = null;
        this.E = 0.0f;
        this.D = 0.0f;
        this.y = 0.0f;
        if (z10) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        b(canvas, this.a, this.d, this.h);
        b(canvas, this.b, this.e, this.n);
        b(canvas, this.c, this.f, this.r);
    }
}
