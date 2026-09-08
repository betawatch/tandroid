package zh;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.ui.l20;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class m3 extends View {
    public float E;
    public final Camera F;
    public final l20 G;
    public final RectF H;
    public h3 a;
    public h3 b;
    public h3 c;
    public float d;
    public float e;
    public float f;
    public boolean h;
    public boolean n;
    public boolean r;
    public g3 s;
    public g3 v;
    public g3 w;
    public float x;
    public float y;

    public m3(Context context) {
        super(context);
        this.F = new Camera();
        this.G = new l20();
        this.H = new RectF();
    }

    public final void a(Canvas canvas, g3 g3Var, float f7, float f10, float f11, int[] iArr, int[] iArr2, int[] iArr3) {
        if (g3Var != null) {
            Matrix matrix = g3Var.d;
            Paint paint = g3Var.c;
            if (paint == null) {
                return;
            }
            float f12 = (f7 - 0.5f) / 1.5f;
            float clamp01 = Utilities.clamp01(1.0f - Math.abs(f12));
            float max = Math.max(0.8f * f10, AndroidUtilities.dp(180.0f));
            float f13 = (f10 / 2.0f) - ((f12 * max) * 1.8f);
            float min = Math.min(AndroidUtilities.dp(176.0f), f11) / 2.0f;
            float f14 = f13 - max;
            float f15 = f13 + max;
            canvas.saveLayerAlpha(f14, 0.0f, f15, f11, 255, 31);
            matrix.reset();
            matrix.postTranslate(f13, min);
            g3Var.e.setLocalMatrix(matrix);
            paint.setAlpha((int) (clamp01 * 255.0f));
            canvas.drawRect(f14, 0.0f, f15, f11, paint);
            canvas.save();
            float dp = AndroidUtilities.dp(90.0f);
            RectF rectF = this.H;
            rectF.set(f14, 0.0f, f14 + dp, f11);
            l20 l20Var = this.G;
            l20Var.b(canvas, rectF, 0, 1.0f);
            rectF.set(f15 - dp, 0.0f, f15, f11);
            l20Var.b(canvas, rectF, 2, 1.0f);
            canvas.restore();
            canvas.restore();
            for (int i10 = 0; i10 < iArr.length; i10++) {
                float width = (getWidth() / (iArr.length - 1)) * i10;
                iArr[i10] = org.telegram.ui.ActionBar.j6.v(iArr[i10], org.telegram.ui.ActionBar.j6.l1(clamp01 * ((width < f14 || width > f15) ? 0.0f : Math.min(Utilities.clamp01((width - f14) / max), Utilities.clamp01(1.0f - ((width - (f15 - max)) / max)))), g3Var.g));
            }
            for (int i11 = 0; i11 < iArr2.length; i11++) {
                float width2 = (getWidth() / (iArr2.length - 1)) * i11;
                iArr2[i11] = org.telegram.ui.ActionBar.j6.v(iArr2[i11], org.telegram.ui.ActionBar.j6.l1(clamp01 * ((width2 < f14 || width2 > f15) ? 0.0f : Math.min(Utilities.clamp01((width2 - f14) / max), Utilities.clamp01(1.0f - ((width2 - (f15 - max)) / max)))), g3Var.f));
            }
            for (int i12 = 0; i12 < iArr3.length; i12++) {
                float width3 = (getWidth() / (iArr2.length - 1)) * i12;
                iArr3[i12] = org.telegram.ui.ActionBar.j6.v(iArr3[i12], org.telegram.ui.ActionBar.j6.l1(clamp01 * ((width3 < f14 || width3 > f15) ? 0.0f : Math.min(Utilities.clamp01((width3 - f14) / max), Utilities.clamp01(1.0f - ((width3 - (f15 - max)) / max)))), g3Var.h));
            }
        }
    }

    public final void b(Canvas canvas, h3 h3Var, float f7, boolean z10) {
        if (h3Var == null) {
            return;
        }
        ImageReceiver imageReceiver = h3Var.d;
        float f10 = f7;
        if (z10) {
            f10 = Math.max(0.5f, f10);
        }
        float imageX = imageReceiver.getImageX();
        float imageY = imageReceiver.getImageY();
        float imageWidth = imageReceiver.getImageWidth();
        float imageHeight = imageReceiver.getImageHeight();
        float alpha = imageReceiver.getAlpha();
        float f11 = (f10 - 0.5f) / 1.5f;
        float clamp01 = Utilities.clamp01(1.0f - Math.abs(f11));
        float width = (getWidth() / 2.0f) - (AndroidUtilities.dp(220.0f) * f11);
        float dp = AndroidUtilities.dp(80.0f);
        float lerp = AndroidUtilities.lerp(0.85f, 1.0f, clamp01);
        float dp2 = AndroidUtilities.dp(160.0f);
        canvas.save();
        float f12 = ((dp2 / 2.0f) * f11) + width;
        canvas.translate(f12, dp);
        Camera camera = this.F;
        camera.save();
        camera.rotateY(f11 * (-30.0f));
        camera.applyToCanvas(canvas);
        camera.restore();
        canvas.translate(-f12, -dp);
        float f13 = dp2 * lerp;
        float f14 = f13 / 2.0f;
        imageReceiver.setImageCoords(width - f14, dp - f14, f13, f13);
        imageReceiver.setAlpha(clamp01);
        imageReceiver.draw(canvas);
        imageReceiver.setImageCoords(imageX, imageY, imageWidth, imageHeight);
        imageReceiver.setAlpha(alpha);
        canvas.restore();
    }

    public final void c() {
        boolean z10 = (this.a == null && this.b == null && this.c == null && this.s == null && this.v == null && this.w == null) ? false : true;
        this.c = null;
        this.b = null;
        this.a = null;
        this.f = 0.0f;
        this.e = 0.0f;
        this.d = 0.0f;
        this.r = false;
        this.n = false;
        this.h = false;
        this.w = null;
        this.v = null;
        this.s = null;
        this.E = 0.0f;
        this.y = 0.0f;
        this.x = 0.0f;
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
