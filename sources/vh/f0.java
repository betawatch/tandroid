package vh;

import android.content.Context;
import android.graphics.Bitmap;
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
public final class f0 extends View {
    public final Paint a;
    public final Path b;
    public final RectF c;
    public final /* synthetic */ g0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, Context context) {
        super(context);
        this.d = g0Var;
        this.a = new Paint(1);
        this.b = new Path();
        this.c = new RectF();
        new Matrix();
        new Matrix();
        new Matrix();
    }

    private float getContainerHeight() {
        boolean z10 = getContext() instanceof BubbleActivity;
        z zVar = this.d.h;
        return ((getHeight() - (zVar.E + (!z10 ? org.telegram.messenger.i0.m : 0))) - zVar.D) - org.telegram.messenger.i0.L(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - org.telegram.messenger.i0.L(32.0f);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int currentWidth;
        int currentHeight;
        boolean z10;
        ye yeVar;
        float f7;
        float f10;
        g0 g0Var = this.d;
        z zVar = g0Var.h;
        int[] iArr = g0Var.y;
        k4 k4Var = g0Var.a;
        if (g0Var.b == null) {
            return;
        }
        canvas.save();
        Paint paint = this.a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (g0Var.s * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (g0Var.s < 1.0f) {
            Path path = this.b;
            path.rewind();
            float width = k4Var.getWidth();
            float height = k4Var.getHeight();
            RectF rectF = this.c;
            rectF.set(0.0f, 0.0f, width, height);
            int[] iArr2 = g0Var.x;
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = org.telegram.messenger.i0.P;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            org.telegram.messenger.i0.Z1(rectF, rectF2, g0Var.s, rectF);
            float W1 = org.telegram.messenger.i0.W1(g0Var.s, org.telegram.messenger.i0.L(12.0f), 0);
            path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
            canvas.clipPath(path);
        }
        float f11 = g0Var.s;
        float f12 = 1.0f - f11;
        int[] iArr3 = g0Var.w;
        canvas.translate((-iArr3[0]) * f12, (-iArr3[1]) * f12);
        if (f12 > 0.0f) {
            if (g0Var.E) {
                g0Var.b.getLocationOnScreen(iArr);
            }
            canvas.translate(iArr[0] * f12, iArr[1] * f12);
            ye yeVar2 = g0Var.b.G0;
            if (yeVar2 != null) {
                f10 = yeVar2.e;
                f7 = yeVar2.f;
            } else {
                f7 = 1.0f;
                f10 = 1.0f;
            }
            float T1 = org.telegram.messenger.i0.T1(1.0f, (g0Var.b.getScaleX() * (r9.getWidth() / f10)) / k4Var.getWidth(), f12);
            canvas.scale(T1, T1);
            canvas.rotate(g0Var.b.getRotation() * f12);
            canvas.translate(((g0Var.b.getContentWidth() * f10) / 2.0f) * f12, ((g0Var.b.getContentHeight() * f7) / 2.0f) * f12);
        }
        canvas.translate(((getContainerWidth() / 2.0f) + org.telegram.messenger.i0.L(16.0f)) * f11, (((getContainerHeight() + org.telegram.messenger.i0.L(32.0f)) / 2.0f) + zVar.E + (!(getContext() instanceof BubbleActivity) ? org.telegram.messenger.i0.m : 0)) * f11);
        if (f12 > 0.0f) {
            float contentWidth = g0Var.b.getContentWidth();
            float contentHeight = g0Var.b.getContentHeight();
            ye yeVar3 = g0Var.b.G0;
            float f13 = yeVar3 != null ? yeVar3.e : 1.0f;
            float f14 = yeVar3 != null ? yeVar3.f : 1.0f;
            float T12 = (org.telegram.messenger.i0.T1(1.0f, f13, f12) * contentWidth) / 2.0f;
            float T13 = (org.telegram.messenger.i0.T1(1.0f, f14, f12) * contentHeight) / 2.0f;
            float T14 = org.telegram.messenger.i0.T1(1.0f, 4.0f, f11);
            canvas.clipRect((-T12) * T14, (-T13) * T14, T12 * T14, T13 * T14);
        }
        currentWidth = g0Var.getCurrentWidth();
        eg.g gVar = g0Var.D;
        currentHeight = g0Var.getCurrentHeight();
        int i10 = gVar.i;
        if (i10 == 90 || i10 == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float z11 = c3.i0.z(gVar.l, 1.0f, f12, 1.0f);
        float f15 = currentWidth;
        float containerWidth = getContainerWidth() / f15;
        float f16 = currentHeight;
        if (containerWidth * f16 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f16;
        }
        canvas.translate(gVar.d * 1.0f, gVar.e * 1.0f);
        float f17 = (gVar.f / z11) * containerWidth;
        jg.e2 e2Var = g0Var.b;
        float T15 = (e2Var == null || (yeVar = e2Var.G0) == null) ? org.telegram.messenger.i0.T1(1.0f, f17, f11) : org.telegram.messenger.i0.T1(yeVar.c, f17, f11);
        canvas.scale(T15, T15);
        canvas.translate(gVar.b * f15 * 1.0f, gVar.c * f16 * 1.0f);
        float e = g0Var.d.e(false, i10) + g0Var.b.getOrientation() + gVar.g;
        ye yeVar4 = g0Var.b.G0;
        canvas.rotate(yeVar4 == null ? org.telegram.messenger.i0.T1(0.0f, e, g0Var.s) : org.telegram.messenger.i0.T1(yeVar4.d + yeVar4.k, e, g0Var.s));
        canvas.rotate(g0Var.b.getOrientation());
        org.telegram.ui.Components.t5 t5Var = g0Var.c;
        if (g0Var.E) {
            ye yeVar5 = g0Var.b.G0;
            if (yeVar5 != null && yeVar5.l) {
                z10 = true;
            }
            z10 = false;
        } else {
            eg.o oVar = zVar.L;
            if (oVar != null) {
                z10 = oVar.j;
            }
            z10 = false;
        }
        canvas.scale(org.telegram.messenger.i0.T1(1.0f, -1.0f, t5Var.d(z10)), 1.0f);
        canvas.translate((-g0Var.b.getContentWidth()) / 2.0f, (-g0Var.b.getContentHeight()) / 2.0f);
        jg.e2 e2Var2 = g0Var.b;
        Paint paint2 = e2Var2.F0;
        Bitmap bitmap = e2Var2.A0;
        if (bitmap != null) {
            paint2.setAlpha(zs.e4);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
        }
        canvas.restore();
    }
}
