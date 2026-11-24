// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.BubbleActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class s23 extends View {
    public final Paint a;
    public final Path b;
    public final RectF c;
    public final Matrix d;
    public final Matrix e;
    public final Matrix f;
    public final Matrix h;
    public final Matrix n;
    public final Matrix r;
    public final /* synthetic */ t23 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s23(t23 t23Var, Context context) {
        super(context);
        this.s = t23Var;
        this.a = new Paint(1);
        this.b = new Path();
        this.c = new RectF();
        this.d = new Matrix();
        this.e = new Matrix();
        this.f = new Matrix();
        this.h = new Matrix();
        this.n = new Matrix();
        this.r = new Matrix();
    }

    private float getContainerHeight() {
        return ((getHeight() - (!(getContext() instanceof BubbleActivity) ? gl.m : 0.0f)) - this.s.f.E) - gl.L(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - gl.L(32.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a0, code lost:
    
        if (r15 != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0060, code lost:
    
        if (r15 == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Matrix matrix, boolean z) {
        int currentWidth;
        int currentHeight;
        zl6 zl6Var;
        t23 t23Var = this.s;
        currentWidth = t23Var.getCurrentWidth();
        currentHeight = t23Var.getCurrentHeight();
        c33 c33Var = t23Var.x;
        int i = c33Var.i;
        if (i == 90 || i == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float f = 1.0f;
        float f2 = 0.0f;
        float f3 = ((c33Var.l - 1.0f) * (z ? 1.0f : 0.0f)) + 1.0f;
        float f4 = currentWidth;
        float containerWidth = getContainerWidth() / f4;
        float f5 = currentHeight;
        if (containerWidth * f5 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f5;
        }
        boolean z2 = (t23Var.y.Q / 90) % 2 == 1;
        matrix.preTranslate(c33Var.d, c33Var.e);
        float f6 = (c33Var.f / f3) * containerWidth;
        f4b f4bVar = t23Var.y;
        if (f4bVar != null && (zl6Var = f4bVar.m0) != null) {
            if (z) {
                f = zl6Var.c;
            }
            f = f6;
        }
        matrix.preScale(f, f);
        float f7 = c33Var.b;
        float f8 = c33Var.c;
        if (t23Var.E && z) {
            zl6 zl6Var2 = t23Var.y.m0;
            float f9 = zl6Var2 == null ? 0.0f : !z2 ? zl6Var2.a : zl6Var2.b;
            f8 = zl6Var2 == null ? 0.0f : !z2 ? zl6Var2.b : zl6Var2.a;
            f7 = f9;
        }
        matrix.preTranslate(f7 * f4, f8 * f5);
        f4b f4bVar2 = t23Var.y;
        float f10 = f4bVar2.Q + c33Var.g + i;
        zl6 zl6Var3 = f4bVar2.m0;
        if (zl6Var3 != null) {
            if (z) {
                f2 = zl6Var3.d + zl6Var3.k;
            }
            f2 = f10;
        }
        matrix.preRotate(f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x01d6, code lost:
    
        if (r9.l != false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas, boolean z) {
        float f;
        float f2;
        Canvas canvas2;
        float f3;
        boolean z2;
        boolean z3;
        float f4;
        float f5;
        t23 t23Var = this.s;
        int[] iArr = t23Var.s;
        int[] iArr2 = t23Var.w;
        i7b i7bVar = t23Var.a;
        if (!z) {
            f = 255.0f;
            f2 = 2.0f;
            canvas2 = canvas;
        } else {
            if (t23Var.r >= 1.0f) {
                return;
            }
            f = 255.0f;
            f2 = 2.0f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, i7bVar.getWidth(), i7bVar.getHeight(), (int) (Math.min(1.0f, (1.0f - t23Var.r) * 2.0f) * 255.0f), 31);
            canvas2.translate(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
        }
        canvas2.save();
        Paint paint = this.a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (t23Var.r * f));
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (t23Var.r < 1.0f && !z) {
            Path path = this.b;
            path.rewind();
            float width = i7bVar.getWidth();
            float height = i7bVar.getHeight();
            RectF rectF = this.c;
            rectF.set(0.0f, 0.0f, width, height);
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = gl.P;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            gl.X1(rectF, rectF2, t23Var.r, rectF);
            float U1 = gl.U1(t23Var.r, gl.L(12.0f), 0);
            path.addRoundRect(rectF, U1, U1, Path.Direction.CW);
            canvas2.clipPath(path);
        }
        float f6 = t23Var.r;
        Matrix matrix = this.f;
        matrix.reset();
        Matrix matrix2 = this.h;
        matrix2.reset();
        matrix.preTranslate(-iArr[0], -iArr[1]);
        matrix.preTranslate(iArr2[0], iArr2[1]);
        matrix.preScale(i7bVar.getWidth() / t23Var.y.i0, i7bVar.getHeight() / t23Var.y.j0);
        matrix.preConcat(t23Var.y.n0);
        matrix.preTranslate(i7bVar.getContentWidth() / f2, i7bVar.getContentHeight() / f2);
        matrix2.preTranslate((getContainerWidth() / f2) + gl.L(16.0f), tb4.e(getContainerHeight(), gl.L(32.0f), f2, !(getContext() instanceof BubbleActivity) ? gl.m : 0.0f));
        if (z) {
            float f7 = t23Var.r;
            Matrix matrix3 = this.n;
            Matrix matrix4 = this.d;
            f3 = f2;
            if (matrix4 != null) {
                float[] fArr = gl.h0;
                matrix.getValues(fArr);
                float[] fArr2 = gl.i0;
                matrix4.getValues(fArr2);
                gl.Y1(fArr, fArr2, f7, fArr2);
                matrix3.setValues(fArr2);
            }
            matrix3.preRotate(-t23Var.y.Q);
            Matrix matrix5 = this.r;
            if (matrix3.invert(matrix5)) {
                f4b f4bVar = t23Var.y;
                int i = f4bVar.Q;
                zl6 zl6Var = f4bVar.m0;
                boolean z4 = ((i + (zl6Var != null ? zl6Var.k : 0)) / 90) % 2 == 1;
                float contentWidth = i7bVar.getContentWidth();
                float contentHeight = i7bVar.getContentHeight();
                zl6 zl6Var2 = t23Var.y.m0;
                if (zl6Var2 != null) {
                    f4 = zl6Var2.e;
                    f5 = zl6Var2.f;
                } else {
                    f4 = 1.0f;
                    f5 = 1.0f;
                }
                float f8 = ((z4 ? contentHeight : contentWidth) * f4) / f3;
                if (!z4) {
                    contentWidth = contentHeight;
                }
                float f9 = (contentWidth * f5) / f3;
                float R1 = gl.R1(1.0f, 4.0f, f6);
                canvas2.concat(matrix3);
                canvas2.clipRect((-f8) * R1, (-f9) * R1, f8 * R1, f9 * R1);
                canvas2.concat(matrix5);
                z2 = true;
                a(matrix, z2);
                a(matrix2, false);
                lm lmVar = t23Var.b;
                if (t23Var.E) {
                    h33 h33Var = t23Var.f.M;
                    if (h33Var != null) {
                        z2 = h33Var.j;
                        z3 = z2;
                    }
                    z3 = false;
                } else {
                    zl6 zl6Var3 = t23Var.y.m0;
                    if (zl6Var3 != null) {
                    }
                    z3 = false;
                }
                float d = lmVar.d(z3);
                float f10 = 1.0f - (d * f3);
                matrix2.preScale(f10, 1.0f);
                matrix.preScale(f10, 1.0f);
                float z5 = tb4.z(1.0f, d, 4.0f * d, 0.25f);
                matrix2.preSkew(0.0f, z5);
                matrix.preSkew(0.0f, z5);
                matrix2.preTranslate((-i7bVar.getContentWidth()) / f3, (-i7bVar.getContentHeight()) / f3);
                matrix.preTranslate((-i7bVar.getContentWidth()) / f3, (-i7bVar.getContentHeight()) / f3);
                float f11 = t23Var.r;
                float[] fArr3 = gl.h0;
                matrix.getValues(fArr3);
                float[] fArr4 = gl.i0;
                matrix2.getValues(fArr4);
                gl.Y1(fArr3, fArr4, f11, fArr4);
                Matrix matrix6 = this.e;
                matrix6.setValues(fArr4);
                canvas2.concat(matrix6);
                Paint paint2 = i7bVar.R;
                Matrix matrix7 = i7bVar.a0;
                if (i7bVar.n == null) {
                    canvas2.save();
                    canvas2.scale(i7bVar.getContentWidth() / i7bVar.getWidth(), i7bVar.getContentHeight() / i7bVar.getHeight());
                    canvas2.concat(i7bVar.k0);
                    i7bVar.n.draw(canvas2);
                    canvas2.restore();
                } else if (i7bVar.a != null && i7bVar.d != null) {
                    matrix7.reset();
                    matrix7.preScale(i7bVar.d.k0 / i7bVar.a.getWidth(), i7bVar.d.l0 / i7bVar.a.getHeight());
                    paint2.setAlpha(kk7.d4);
                    canvas2.drawBitmap(i7bVar.a, matrix7, paint2);
                }
                canvas2.restore();
                if (z) {
                    return;
                }
                canvas2.restore();
                return;
            }
        } else {
            f3 = f2;
        }
        z2 = true;
        a(matrix, z2);
        a(matrix2, false);
        lm lmVar2 = t23Var.b;
        if (t23Var.E) {
        }
        float d2 = lmVar2.d(z3);
        float f102 = 1.0f - (d2 * f3);
        matrix2.preScale(f102, 1.0f);
        matrix.preScale(f102, 1.0f);
        float z52 = tb4.z(1.0f, d2, 4.0f * d2, 0.25f);
        matrix2.preSkew(0.0f, z52);
        matrix.preSkew(0.0f, z52);
        matrix2.preTranslate((-i7bVar.getContentWidth()) / f3, (-i7bVar.getContentHeight()) / f3);
        matrix.preTranslate((-i7bVar.getContentWidth()) / f3, (-i7bVar.getContentHeight()) / f3);
        float f112 = t23Var.r;
        float[] fArr32 = gl.h0;
        matrix.getValues(fArr32);
        float[] fArr42 = gl.i0;
        matrix2.getValues(fArr42);
        gl.Y1(fArr32, fArr42, f112, fArr42);
        Matrix matrix62 = this.e;
        matrix62.setValues(fArr42);
        canvas2.concat(matrix62);
        Paint paint22 = i7bVar.R;
        Matrix matrix72 = i7bVar.a0;
        if (i7bVar.n == null) {
        }
        canvas2.restore();
        if (z) {
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.s.y == null) {
            return;
        }
        b(canvas, false);
    }
}
