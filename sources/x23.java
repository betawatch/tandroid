// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.BubbleActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class x23 extends View {
    public final Paint a;
    public final Path b;
    public final RectF c;
    public final /* synthetic */ y23 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x23(y23 y23Var, Context context) {
        super(context);
        this.d = y23Var;
        this.a = new Paint(1);
        this.b = new Path();
        this.c = new RectF();
    }

    private float getContainerHeight() {
        boolean z = getContext() instanceof BubbleActivity;
        q23 q23Var = this.d.h;
        return ((getHeight() - (q23Var.F + (!z ? gl.m : 0))) - q23Var.E) - gl.L(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - gl.L(32.0f);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int currentWidth;
        int currentHeight;
        boolean z;
        zl6 zl6Var;
        float f;
        float f2;
        float f3;
        float f4;
        y23 y23Var = this.d;
        q23 q23Var = y23Var.h;
        int[] iArr = y23Var.y;
        i7b i7bVar = y23Var.a;
        if (y23Var.b == null) {
            return;
        }
        canvas.save();
        Paint paint = this.a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (y23Var.s * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (y23Var.s < 1.0f) {
            Path path = this.b;
            path.rewind();
            float width = i7bVar.getWidth();
            float height = i7bVar.getHeight();
            RectF rectF = this.c;
            rectF.set(0.0f, 0.0f, width, height);
            int[] iArr2 = y23Var.x;
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = gl.P;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            gl.X1(rectF, rectF2, y23Var.s, rectF);
            float U1 = gl.U1(y23Var.s, gl.L(12.0f), 0);
            path.addRoundRect(rectF, U1, U1, Path.Direction.CW);
            canvas.clipPath(path);
        }
        float f5 = y23Var.s;
        float f6 = 1.0f - f5;
        int[] iArr3 = y23Var.w;
        canvas.translate((-iArr3[0]) * f6, (-iArr3[1]) * f6);
        if (f6 > 0.0f) {
            if (y23Var.F) {
                y23Var.b.getLocationOnScreen(iArr);
            }
            canvas.translate(iArr[0] * f6, iArr[1] * f6);
            zl6 zl6Var2 = y23Var.b.I0;
            if (zl6Var2 != null) {
                f4 = zl6Var2.e;
                f3 = zl6Var2.f;
            } else {
                f3 = 1.0f;
                f4 = 1.0f;
            }
            float R1 = gl.R1(1.0f, (y23Var.b.getScaleX() * (r9.getWidth() / f4)) / i7bVar.getWidth(), f6);
            canvas.scale(R1, R1);
            canvas.rotate(y23Var.b.getRotation() * f6);
            canvas.translate(((y23Var.b.getContentWidth() * f4) / 2.0f) * f6, ((y23Var.b.getContentHeight() * f3) / 2.0f) * f6);
        }
        canvas.translate(((getContainerWidth() / 2.0f) + gl.L(16.0f)) * f5, (((getContainerHeight() + gl.L(32.0f)) / 2.0f) + q23Var.F + (!(getContext() instanceof BubbleActivity) ? gl.m : 0)) * f5);
        if (f6 > 0.0f) {
            float contentWidth = y23Var.b.getContentWidth();
            float contentHeight = y23Var.b.getContentHeight();
            zl6 zl6Var3 = y23Var.b.I0;
            if (zl6Var3 != null) {
                f2 = zl6Var3.e;
                f = zl6Var3.f;
            } else {
                f = 1.0f;
                f2 = 1.0f;
            }
            float R12 = (gl.R1(1.0f, f2, f6) * contentWidth) / 2.0f;
            float R13 = (gl.R1(1.0f, f, f6) * contentHeight) / 2.0f;
            float R14 = gl.R1(1.0f, 4.0f, f5);
            canvas.clipRect((-R12) * R14, (-R13) * R14, R12 * R14, R13 * R14);
        }
        currentWidth = y23Var.getCurrentWidth();
        c33 c33Var = y23Var.E;
        currentHeight = y23Var.getCurrentHeight();
        int i = c33Var.i;
        if (i == 90 || i == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float A = tb4.A(c33Var.l, 1.0f, f6, 1.0f);
        float f7 = currentWidth;
        float containerWidth = getContainerWidth() / f7;
        float f8 = currentHeight;
        if (containerWidth * f8 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f8;
        }
        canvas.translate(c33Var.d * 1.0f, c33Var.e * 1.0f);
        float f9 = (c33Var.f / A) * containerWidth;
        e68 e68Var = y23Var.b;
        float R15 = (e68Var == null || (zl6Var = e68Var.I0) == null) ? gl.R1(1.0f, f9, f5) : gl.R1(zl6Var.c, f9, f5);
        canvas.scale(R15, R15);
        canvas.translate(c33Var.b * f7 * 1.0f, c33Var.c * f8 * 1.0f);
        float e = y23Var.d.e(false, i) + y23Var.b.getOrientation() + c33Var.g;
        zl6 zl6Var4 = y23Var.b.I0;
        canvas.rotate(zl6Var4 == null ? gl.R1(0.0f, e, y23Var.s) : gl.R1(zl6Var4.d + zl6Var4.k, e, y23Var.s));
        canvas.rotate(y23Var.b.getOrientation());
        lm lmVar = y23Var.c;
        if (y23Var.F) {
            zl6 zl6Var5 = y23Var.b.I0;
            if (zl6Var5 != null && zl6Var5.l) {
                z = true;
            }
            z = false;
        } else {
            h33 h33Var = q23Var.M;
            if (h33Var != null) {
                z = h33Var.j;
            }
            z = false;
        }
        canvas.scale(gl.R1(1.0f, -1.0f, lmVar.d(z)), 1.0f);
        canvas.translate((-y23Var.b.getContentWidth()) / 2.0f, (-y23Var.b.getContentHeight()) / 2.0f);
        e68 e68Var2 = y23Var.b;
        Paint paint2 = e68Var2.H0;
        Bitmap bitmap = e68Var2.C0;
        if (bitmap != null) {
            paint2.setAlpha(kk7.d4);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
        }
        canvas.restore();
    }
}
