package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.ye;
import org.telegram.messenger.zs;
import org.telegram.ui.BubbleActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a0 extends View {
    public final Paint a;
    public final Path b;
    public final RectF c;
    public final Matrix d;
    public final Matrix e;
    public final Matrix f;
    public final Matrix h;
    public final Matrix n;
    public final Matrix r;
    public final /* synthetic */ b0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, Context context) {
        super(context);
        this.s = b0Var;
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
        return ((getHeight() - (!(getContext() instanceof BubbleActivity) ? org.telegram.messenger.i0.m : 0.0f)) - this.s.f.D) - org.telegram.messenger.i0.L(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - org.telegram.messenger.i0.L(32.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a0, code lost:
    
        if (r15 != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0060, code lost:
    
        if (r15 != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Matrix matrix, boolean z10) {
        int currentWidth;
        int currentHeight;
        ye yeVar;
        b0 b0Var = this.s;
        currentWidth = b0Var.getCurrentWidth();
        currentHeight = b0Var.getCurrentHeight();
        eg.g gVar = b0Var.x;
        int i10 = gVar.i;
        if (i10 == 90 || i10 == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float f7 = 1.0f;
        float f10 = 0.0f;
        float f11 = ((gVar.l - 1.0f) * (z10 ? 1.0f : 0.0f)) + 1.0f;
        float f12 = currentWidth;
        float containerWidth = getContainerWidth() / f12;
        float f13 = currentHeight;
        if (containerWidth * f13 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f13;
        }
        boolean z11 = (b0Var.y.Q / 90) % 2 == 1;
        matrix.preTranslate(gVar.d, gVar.e);
        float f14 = (gVar.f / f11) * containerWidth;
        n5 n5Var = b0Var.y;
        if (n5Var != null && (yeVar = n5Var.m0) != null) {
            if (z10) {
                f7 = yeVar.c;
            }
            f7 = f14;
        }
        matrix.preScale(f7, f7);
        float f15 = gVar.b;
        float f16 = gVar.c;
        if (b0Var.D && z10) {
            ye yeVar2 = b0Var.y.m0;
            float f17 = yeVar2 == null ? 0.0f : !z11 ? yeVar2.a : yeVar2.b;
            float f18 = yeVar2 == null ? 0.0f : !z11 ? yeVar2.b : yeVar2.a;
            f15 = f17;
            f16 = f18;
        }
        matrix.preTranslate(f15 * f12, f16 * f13);
        n5 n5Var2 = b0Var.y;
        float f19 = n5Var2.Q + gVar.g + i10;
        ye yeVar3 = n5Var2.m0;
        if (yeVar3 != null) {
            if (z10) {
                f10 = yeVar3.d + yeVar3.k;
            }
            f10 = f19;
        }
        matrix.preRotate(f10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x01df, code lost:
    
        if (r9.l != false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas, boolean z10) {
        float f7;
        float f10;
        Canvas canvas2;
        float f11;
        boolean z11;
        boolean z12;
        b0 b0Var = this.s;
        int[] iArr = b0Var.s;
        int[] iArr2 = b0Var.w;
        k4 k4Var = b0Var.a;
        if (!z10) {
            f7 = 255.0f;
            f10 = 2.0f;
            canvas2 = canvas;
        } else {
            if (b0Var.r >= 1.0f) {
                return;
            }
            f7 = 255.0f;
            f10 = 2.0f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, k4Var.getWidth(), k4Var.getHeight(), (int) (Math.min(1.0f, (1.0f - b0Var.r) * 2.0f) * 255.0f), 31);
            canvas2.translate(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
        }
        canvas2.save();
        Paint paint = this.a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (b0Var.r * f7));
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (b0Var.r < 1.0f && !z10) {
            Path path = this.b;
            path.rewind();
            float width = k4Var.getWidth();
            float height = k4Var.getHeight();
            RectF rectF = this.c;
            rectF.set(0.0f, 0.0f, width, height);
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = org.telegram.messenger.i0.P;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            org.telegram.messenger.i0.Z1(rectF, rectF2, b0Var.r, rectF);
            float W1 = org.telegram.messenger.i0.W1(b0Var.r, org.telegram.messenger.i0.L(12.0f), 0);
            path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
            canvas2.clipPath(path);
        }
        float f12 = b0Var.r;
        Matrix matrix = this.f;
        matrix.reset();
        Matrix matrix2 = this.h;
        matrix2.reset();
        matrix.preTranslate(-iArr[0], -iArr[1]);
        matrix.preTranslate(iArr2[0], iArr2[1]);
        matrix.preScale(k4Var.getWidth() / b0Var.y.i0, k4Var.getHeight() / b0Var.y.j0);
        matrix.preConcat(b0Var.y.n0);
        matrix.preTranslate(k4Var.getContentWidth() / f10, k4Var.getContentHeight() / f10);
        matrix2.preTranslate((getContainerWidth() / f10) + org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.m5.a(getContainerHeight(), org.telegram.messenger.i0.L(32.0f), f10, !(getContext() instanceof BubbleActivity) ? org.telegram.messenger.i0.m : 0.0f));
        if (z10) {
            float f13 = b0Var.r;
            Matrix matrix3 = this.n;
            Matrix matrix4 = this.d;
            if (matrix4 == null) {
                f11 = f10;
            } else {
                f11 = f10;
                float[] fArr = org.telegram.messenger.i0.h0;
                matrix.getValues(fArr);
                float[] fArr2 = org.telegram.messenger.i0.i0;
                matrix4.getValues(fArr2);
                org.telegram.messenger.i0.a2(fArr, fArr2, f13, fArr2);
                matrix3.setValues(fArr2);
            }
            matrix3.preRotate(-b0Var.y.Q);
            Matrix matrix5 = this.r;
            if (matrix3.invert(matrix5)) {
                n5 n5Var = b0Var.y;
                int i10 = n5Var.Q;
                ye yeVar = n5Var.m0;
                boolean z13 = ((i10 + (yeVar != null ? yeVar.k : 0)) / 90) % 2 == 1;
                float contentWidth = k4Var.getContentWidth();
                float contentHeight = k4Var.getContentHeight();
                ye yeVar2 = b0Var.y.m0;
                float f14 = yeVar2 != null ? yeVar2.e : 1.0f;
                float f15 = yeVar2 != null ? yeVar2.f : 1.0f;
                float f16 = ((z13 ? contentHeight : contentWidth) * f14) / f11;
                if (!z13) {
                    contentWidth = contentHeight;
                }
                float f17 = (contentWidth * f15) / f11;
                float T1 = org.telegram.messenger.i0.T1(1.0f, 4.0f, f12);
                canvas2.concat(matrix3);
                canvas2.clipRect((-f16) * T1, (-f17) * T1, f16 * T1, f17 * T1);
                canvas2.concat(matrix5);
                z11 = true;
                a(matrix, z11);
                a(matrix2, false);
                org.telegram.ui.Components.t5 t5Var = b0Var.b;
                if (b0Var.D) {
                    eg.o oVar = b0Var.f.L;
                    if (oVar != null) {
                        z11 = oVar.j;
                        z12 = z11;
                    }
                    z12 = false;
                } else {
                    ye yeVar3 = b0Var.y.m0;
                    if (yeVar3 != null) {
                    }
                    z12 = false;
                }
                float d = t5Var.d(z12);
                float f18 = 1.0f - (d * f11);
                matrix2.preScale(f18, 1.0f);
                matrix.preScale(f18, 1.0f);
                float A = org.telegram.messenger.m5.A(1.0f, d, 4.0f * d, 0.25f);
                matrix2.preSkew(0.0f, A);
                matrix.preSkew(0.0f, A);
                matrix2.preTranslate((-k4Var.getContentWidth()) / f11, (-k4Var.getContentHeight()) / f11);
                matrix.preTranslate((-k4Var.getContentWidth()) / f11, (-k4Var.getContentHeight()) / f11);
                float f19 = b0Var.r;
                float[] fArr3 = org.telegram.messenger.i0.h0;
                matrix.getValues(fArr3);
                float[] fArr4 = org.telegram.messenger.i0.i0;
                matrix2.getValues(fArr4);
                org.telegram.messenger.i0.a2(fArr3, fArr4, f19, fArr4);
                Matrix matrix6 = this.e;
                matrix6.setValues(fArr4);
                canvas2.concat(matrix6);
                Paint paint2 = k4Var.Q;
                Matrix matrix7 = k4Var.W;
                if (k4Var.n == null) {
                    canvas2.save();
                    canvas2.scale(k4Var.getContentWidth() / k4Var.getWidth(), k4Var.getContentHeight() / k4Var.getHeight());
                    canvas2.concat(k4Var.j0);
                    k4Var.n.draw(canvas2);
                    canvas2.restore();
                } else if (k4Var.a != null && k4Var.d != null) {
                    matrix7.reset();
                    matrix7.preScale(k4Var.d.k0 / k4Var.a.getWidth(), k4Var.d.l0 / k4Var.a.getHeight());
                    paint2.setAlpha(zs.e4);
                    canvas2.drawBitmap(k4Var.a, matrix7, paint2);
                }
                canvas2.restore();
                if (z10) {
                    return;
                }
                canvas2.restore();
                return;
            }
        } else {
            f11 = f10;
        }
        z11 = true;
        a(matrix, z11);
        a(matrix2, false);
        org.telegram.ui.Components.t5 t5Var2 = b0Var.b;
        if (b0Var.D) {
        }
        float d10 = t5Var2.d(z12);
        float f182 = 1.0f - (d10 * f11);
        matrix2.preScale(f182, 1.0f);
        matrix.preScale(f182, 1.0f);
        float A2 = org.telegram.messenger.m5.A(1.0f, d10, 4.0f * d10, 0.25f);
        matrix2.preSkew(0.0f, A2);
        matrix.preSkew(0.0f, A2);
        matrix2.preTranslate((-k4Var.getContentWidth()) / f11, (-k4Var.getContentHeight()) / f11);
        matrix.preTranslate((-k4Var.getContentWidth()) / f11, (-k4Var.getContentHeight()) / f11);
        float f192 = b0Var.r;
        float[] fArr32 = org.telegram.messenger.i0.h0;
        matrix.getValues(fArr32);
        float[] fArr42 = org.telegram.messenger.i0.i0;
        matrix2.getValues(fArr42);
        org.telegram.messenger.i0.a2(fArr32, fArr42, f192, fArr42);
        Matrix matrix62 = this.e;
        matrix62.setValues(fArr42);
        canvas2.concat(matrix62);
        Paint paint22 = k4Var.Q;
        Matrix matrix72 = k4Var.W;
        if (k4Var.n == null) {
        }
        canvas2.restore();
        if (z10) {
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
