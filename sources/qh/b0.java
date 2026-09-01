package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.ui.BubbleActivity;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class b0 extends View {
    public final Paint a;
    public final Path b;
    public final RectF c;
    public final Matrix d;
    public final Matrix e;
    public final Matrix f;
    public final Matrix h;
    public final Matrix n;
    public final Matrix r;
    public final /* synthetic */ c0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, Context context) {
        super(context);
        this.s = c0Var;
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
        return ((getHeight() - (!(getContext() instanceof BubbleActivity) ? AndroidUtilities.statusBarHeight : 0.0f)) - this.s.f.y) - AndroidUtilities.dp(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - AndroidUtilities.dp(32.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a5, code lost:
    
        if (r15 != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0063, code lost:
    
        if (r15 != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Matrix matrix, boolean z4) {
        int currentWidth;
        int currentHeight;
        MediaController.CropState cropState;
        c0 c0Var = this.s;
        currentWidth = c0Var.getCurrentWidth();
        currentHeight = c0Var.getCurrentHeight();
        zf.f fVar = c0Var.w;
        int i10 = fVar.i;
        if (i10 == 90 || i10 == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float f10 = 1.0f;
        float f11 = 0.0f;
        float f12 = ((fVar.l - 1.0f) * (z4 ? 1.0f : 0.0f)) + 1.0f;
        float f13 = currentWidth;
        float containerWidth = getContainerWidth() / f13;
        float f14 = currentHeight;
        if (containerWidth * f14 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f14;
        }
        boolean z10 = (c0Var.x.Q / 90) % 2 == 1;
        matrix.preTranslate(fVar.d, fVar.e);
        float f15 = (fVar.f / f12) * containerWidth;
        s6 s6Var = c0Var.x;
        if (s6Var != null && (cropState = s6Var.m0) != null) {
            if (z4) {
                f10 = cropState.cropScale;
            }
            f10 = f15;
        }
        matrix.preScale(f10, f10);
        float f16 = fVar.b;
        float f17 = fVar.c;
        if (c0Var.y && z4) {
            MediaController.CropState cropState2 = c0Var.x.m0;
            float f18 = cropState2 == null ? 0.0f : !z10 ? cropState2.cropPx : cropState2.cropPy;
            float f19 = cropState2 == null ? 0.0f : !z10 ? cropState2.cropPy : cropState2.cropPx;
            f16 = f18;
            f17 = f19;
        }
        matrix.preTranslate(f16 * f13, f17 * f14);
        s6 s6Var2 = c0Var.x;
        float f20 = s6Var2.Q + fVar.g + i10;
        MediaController.CropState cropState3 = s6Var2.m0;
        if (cropState3 != null) {
            if (z4) {
                f11 = cropState3.cropRotate + cropState3.transformRotation;
            }
            f11 = f20;
        }
        matrix.preRotate(f11);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas, boolean z4) {
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        boolean z10;
        c0 c0Var = this.s;
        int[] iArr = c0Var.s;
        int[] iArr2 = c0Var.v;
        j5 j5Var = c0Var.a;
        if (!z4) {
            canvas2 = canvas;
            f10 = 2.0f;
            f11 = 255.0f;
        } else {
            if (c0Var.r >= 1.0f) {
                return;
            }
            canvas2 = canvas;
            f10 = 2.0f;
            f11 = 255.0f;
            canvas2.saveLayerAlpha(0.0f, 0.0f, j5Var.getWidth(), j5Var.getHeight(), (int) (Math.min(1.0f, (1.0f - c0Var.r) * 2.0f) * 255.0f), 31);
            canvas2.translate(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
        }
        canvas2.save();
        Paint paint = this.a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (c0Var.r * f11));
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (c0Var.r < 1.0f && !z4) {
            Path path = this.b;
            path.rewind();
            float width = j5Var.getWidth();
            float height = j5Var.getHeight();
            RectF rectF = this.c;
            rectF.set(0.0f, 0.0f, width, height);
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            AndroidUtilities.lerp(rectF, rectF2, c0Var.r, rectF);
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, c0Var.r);
            path.addRoundRect(rectF, lerp, lerp, Path.Direction.CW);
            canvas2.clipPath(path);
        }
        float f13 = c0Var.r;
        Matrix matrix = this.f;
        matrix.reset();
        Matrix matrix2 = this.h;
        matrix2.reset();
        matrix.preTranslate(-iArr[0], -iArr[1]);
        matrix.preTranslate(iArr2[0], iArr2[1]);
        matrix.preScale(j5Var.getWidth() / c0Var.x.i0, j5Var.getHeight() / c0Var.x.j0);
        matrix.preConcat(c0Var.x.n0);
        matrix.preTranslate(j5Var.getContentWidth() / f10, j5Var.getContentHeight() / f10);
        matrix2.preTranslate((getContainerWidth() / f10) + AndroidUtilities.dp(16.0f), l.d.b(getContainerHeight(), AndroidUtilities.dp(32.0f), f10, !(getContext() instanceof BubbleActivity) ? AndroidUtilities.statusBarHeight : 0.0f));
        if (z4) {
            Matrix matrix3 = this.d;
            float f14 = c0Var.r;
            Matrix matrix4 = this.n;
            AndroidUtilities.lerp(matrix, matrix3, f14, matrix4);
            matrix4.preRotate(-c0Var.x.Q);
            Matrix matrix5 = this.r;
            if (matrix4.invert(matrix5)) {
                s6 s6Var = c0Var.x;
                f12 = 2.0f;
                int i10 = s6Var.Q;
                MediaController.CropState cropState = s6Var.m0;
                boolean z11 = ((i10 + (cropState != null ? cropState.transformRotation : 0)) / 90) % 2 == 1;
                float contentWidth = j5Var.getContentWidth();
                float contentHeight = j5Var.getContentHeight();
                MediaController.CropState cropState2 = c0Var.x.m0;
                float f15 = cropState2 != null ? cropState2.cropPw : 1.0f;
                float f16 = cropState2 != null ? cropState2.cropPh : 1.0f;
                float f17 = ((z11 ? contentHeight : contentWidth) * f15) / 2.0f;
                if (!z11) {
                    contentWidth = contentHeight;
                }
                float f18 = (contentWidth * f16) / 2.0f;
                float lerp2 = AndroidUtilities.lerp(1.0f, 4.0f, f13);
                canvas2.concat(matrix4);
                canvas2.clipRect((-f17) * lerp2, (-f18) * lerp2, f17 * lerp2, f18 * lerp2);
                canvas2.concat(matrix5);
                a(matrix, true);
                a(matrix2, false);
                org.telegram.ui.Components.z5 z5Var = c0Var.b;
                if (c0Var.y) {
                    zf.l lVar = c0Var.f.I;
                    if (lVar != null) {
                        z10 = lVar.j;
                    }
                    z10 = false;
                } else {
                    MediaController.CropState cropState3 = c0Var.x.m0;
                    if (cropState3 != null && cropState3.mirrored) {
                        z10 = true;
                    }
                    z10 = false;
                }
                float e6 = z5Var.e(z10);
                float f19 = 1.0f - (e6 * f12);
                matrix2.preScale(f19, 1.0f);
                matrix.preScale(f19, 1.0f);
                float y10 = org.telegram.messenger.y3.y(1.0f, e6, 4.0f * e6, 0.25f);
                matrix2.preSkew(0.0f, y10);
                matrix.preSkew(0.0f, y10);
                matrix2.preTranslate((-j5Var.getContentWidth()) / f12, (-j5Var.getContentHeight()) / f12);
                matrix.preTranslate((-j5Var.getContentWidth()) / f12, (-j5Var.getContentHeight()) / f12);
                float f20 = c0Var.r;
                Matrix matrix6 = this.e;
                AndroidUtilities.lerp(matrix, matrix2, f20, matrix6);
                canvas2.concat(matrix6);
                Paint paint2 = j5Var.N;
                Matrix matrix7 = j5Var.T;
                if (j5Var.n == null) {
                    canvas2.save();
                    canvas2.scale(j5Var.getContentWidth() / j5Var.getWidth(), j5Var.getContentHeight() / j5Var.getHeight());
                    canvas2.concat(j5Var.g0);
                    j5Var.n.draw(canvas2);
                    canvas2.restore();
                } else if (j5Var.a != null && j5Var.d != null) {
                    matrix7.reset();
                    matrix7.preScale(j5Var.d.k0 / j5Var.a.getWidth(), j5Var.d.l0 / j5Var.a.getHeight());
                    paint2.setAlpha(255);
                    canvas2.drawBitmap(j5Var.a, matrix7, paint2);
                }
                canvas2.restore();
                if (z4) {
                    return;
                }
                canvas2.restore();
                return;
            }
        }
        f12 = 2.0f;
        a(matrix, true);
        a(matrix2, false);
        org.telegram.ui.Components.z5 z5Var2 = c0Var.b;
        if (c0Var.y) {
        }
        float e62 = z5Var2.e(z10);
        float f192 = 1.0f - (e62 * f12);
        matrix2.preScale(f192, 1.0f);
        matrix.preScale(f192, 1.0f);
        float y102 = org.telegram.messenger.y3.y(1.0f, e62, 4.0f * e62, 0.25f);
        matrix2.preSkew(0.0f, y102);
        matrix.preSkew(0.0f, y102);
        matrix2.preTranslate((-j5Var.getContentWidth()) / f12, (-j5Var.getContentHeight()) / f12);
        matrix.preTranslate((-j5Var.getContentWidth()) / f12, (-j5Var.getContentHeight()) / f12);
        float f202 = c0Var.r;
        Matrix matrix62 = this.e;
        AndroidUtilities.lerp(matrix, matrix2, f202, matrix62);
        canvas2.concat(matrix62);
        Paint paint22 = j5Var.N;
        Matrix matrix72 = j5Var.T;
        if (j5Var.n == null) {
        }
        canvas2.restore();
        if (z4) {
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.s.x == null) {
            return;
        }
        b(canvas, false);
    }
}
