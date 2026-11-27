// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.BubbleActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class p33 extends View {
    public final Paint a;
    public final Path b;
    public final RectF c;
    public final /* synthetic */ q33 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p33(q33 q33Var, Context context) {
        super(context);
        this.d = q33Var;
        this.a = new Paint(1);
        this.b = new Path();
        this.c = new RectF();
    }

    private float getContainerHeight() {
        boolean z = getContext() instanceof BubbleActivity;
        i33 i33Var = this.d.h;
        return ((getHeight() - (i33Var.F + (!z ? hl.m : 0))) - i33Var.E) - hl.L(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - hl.L(32.0f);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int currentWidth;
        int currentHeight;
        boolean z;
        fo6 fo6Var;
        float f;
        float f2;
        float f3;
        float f4;
        q33 q33Var = this.d;
        i33 i33Var = q33Var.h;
        int[] iArr = q33Var.y;
        gbb gbbVar = q33Var.a;
        if (q33Var.b == null) {
            return;
        }
        canvas.save();
        Paint paint = this.a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (q33Var.s * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (q33Var.s < 1.0f) {
            Path path = this.b;
            path.rewind();
            float width = gbbVar.getWidth();
            float height = gbbVar.getHeight();
            RectF rectF = this.c;
            rectF.set(0.0f, 0.0f, width, height);
            int[] iArr2 = q33Var.x;
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = hl.P;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            hl.X1(rectF, rectF2, q33Var.s, rectF);
            float U1 = hl.U1(q33Var.s, hl.L(12.0f), 0);
            path.addRoundRect(rectF, U1, U1, Path.Direction.CW);
            canvas.clipPath(path);
        }
        float f5 = q33Var.s;
        float f6 = 1.0f - f5;
        int[] iArr3 = q33Var.w;
        canvas.translate((-iArr3[0]) * f6, (-iArr3[1]) * f6);
        if (f6 > 0.0f) {
            if (q33Var.F) {
                q33Var.b.getLocationOnScreen(iArr);
            }
            canvas.translate(iArr[0] * f6, iArr[1] * f6);
            fo6 fo6Var2 = q33Var.b.I0;
            if (fo6Var2 != null) {
                f4 = fo6Var2.e;
                f3 = fo6Var2.f;
            } else {
                f3 = 1.0f;
                f4 = 1.0f;
            }
            float R1 = hl.R1(1.0f, (q33Var.b.getScaleX() * (r9.getWidth() / f4)) / gbbVar.getWidth(), f6);
            canvas.scale(R1, R1);
            canvas.rotate(q33Var.b.getRotation() * f6);
            canvas.translate(((q33Var.b.getContentWidth() * f4) / 2.0f) * f6, ((q33Var.b.getContentHeight() * f3) / 2.0f) * f6);
        }
        canvas.translate(((getContainerWidth() / 2.0f) + hl.L(16.0f)) * f5, (((getContainerHeight() + hl.L(32.0f)) / 2.0f) + i33Var.F + (!(getContext() instanceof BubbleActivity) ? hl.m : 0)) * f5);
        if (f6 > 0.0f) {
            float contentWidth = q33Var.b.getContentWidth();
            float contentHeight = q33Var.b.getContentHeight();
            fo6 fo6Var3 = q33Var.b.I0;
            if (fo6Var3 != null) {
                f2 = fo6Var3.e;
                f = fo6Var3.f;
            } else {
                f = 1.0f;
                f2 = 1.0f;
            }
            float R12 = (hl.R1(1.0f, f2, f6) * contentWidth) / 2.0f;
            float R13 = (hl.R1(1.0f, f, f6) * contentHeight) / 2.0f;
            float R14 = hl.R1(1.0f, 4.0f, f5);
            canvas.clipRect((-R12) * R14, (-R13) * R14, R12 * R14, R13 * R14);
        }
        currentWidth = q33Var.getCurrentWidth();
        u33 u33Var = q33Var.E;
        currentHeight = q33Var.getCurrentHeight();
        int i = u33Var.i;
        if (i == 90 || i == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float A = qd4.A(u33Var.l, 1.0f, f6, 1.0f);
        float f7 = currentWidth;
        float containerWidth = getContainerWidth() / f7;
        float f8 = currentHeight;
        if (containerWidth * f8 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f8;
        }
        canvas.translate(u33Var.d * 1.0f, u33Var.e * 1.0f);
        float f9 = (u33Var.f / A) * containerWidth;
        v98 v98Var = q33Var.b;
        float R15 = (v98Var == null || (fo6Var = v98Var.I0) == null) ? hl.R1(1.0f, f9, f5) : hl.R1(fo6Var.c, f9, f5);
        canvas.scale(R15, R15);
        canvas.translate(u33Var.b * f7 * 1.0f, u33Var.c * f8 * 1.0f);
        float e = q33Var.d.e(false, i) + q33Var.b.getOrientation() + u33Var.g;
        fo6 fo6Var4 = q33Var.b.I0;
        canvas.rotate(fo6Var4 == null ? hl.R1(0.0f, e, q33Var.s) : hl.R1(fo6Var4.d + fo6Var4.k, e, q33Var.s));
        canvas.rotate(q33Var.b.getOrientation());
        mm mmVar = q33Var.c;
        if (q33Var.F) {
            fo6 fo6Var5 = q33Var.b.I0;
            if (fo6Var5 != null && fo6Var5.l) {
                z = true;
            }
            z = false;
        } else {
            z33 z33Var = i33Var.M;
            if (z33Var != null) {
                z = z33Var.j;
            }
            z = false;
        }
        canvas.scale(hl.R1(1.0f, -1.0f, mmVar.d(z)), 1.0f);
        canvas.translate((-q33Var.b.getContentWidth()) / 2.0f, (-q33Var.b.getContentHeight()) / 2.0f);
        v98 v98Var2 = q33Var.b;
        Paint paint2 = v98Var2.H0;
        Bitmap bitmap = v98Var2.C0;
        if (bitmap != null) {
            paint2.setAlpha(jn7.d4);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
        }
        canvas.restore();
    }
}
