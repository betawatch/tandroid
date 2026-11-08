package ug;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public class y0 {
    public final f6 a;
    public LinearGradient d;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public boolean m;
    public boolean n;
    public float b = 0.5f;
    public float c = 0.5f;
    public final Matrix e = new Matrix();
    public final Paint f = new Paint(1);
    public final int[] l = new int[5];
    public float o = 1.0f;
    public float p = 1.5f;
    public float q = 0.0f;
    public final int k = -1;

    public y0(int i7, int i10, int i11, int i12, f6 f6Var) {
        this.a = f6Var;
        this.g = i7;
        this.h = i10;
        this.i = i11;
        this.j = i12;
    }

    public final void a() {
        int b10 = b(this.g);
        int b11 = b(this.h);
        int i7 = this.i;
        int b12 = i7 < 0 ? 0 : b(i7);
        int i10 = this.j;
        int b13 = i10 < 0 ? 0 : b(i10);
        int i11 = this.k;
        int b14 = i11 < 0 ? 0 : b(i11);
        LinearGradient linearGradient = this.d;
        int[] iArr = this.l;
        if (linearGradient != null && iArr[0] == b10 && iArr[1] == b11 && iArr[2] == b12 && iArr[3] == b13 && iArr[4] == b14) {
            return;
        }
        iArr[0] = b10;
        iArr[1] = b11;
        iArr[2] = b12;
        iArr[3] = b13;
        iArr[4] = b14;
        if (b12 == 0) {
            this.d = new LinearGradient(0.0f, this.o * 100.0f, this.p * 100.0f, this.q * 100.0f, new int[]{iArr[0], iArr[1]}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        } else if (b13 == 0) {
            this.d = new LinearGradient(0.0f, this.o * 100.0f, this.p * 100.0f, this.q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2]}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
        } else if (b14 == 0) {
            this.d = new LinearGradient(0.0f, this.o * 100.0f, this.p * 100.0f, this.q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2], iArr[3]}, new float[]{0.0f, 0.5f, 0.78f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            this.d = new LinearGradient(0.0f, this.o * 100.0f, this.p * 100.0f, this.q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2], iArr[3], iArr[4]}, new float[]{0.0f, 0.425f, 0.655f, 0.78f, 1.0f}, Shader.TileMode.CLAMP);
        }
        this.d.setLocalMatrix(this.e);
        this.f.setShader(this.d);
    }

    public final int b(int i7) {
        int c10 = c(i7);
        if (!this.n) {
            return c10;
        }
        return Color.argb(Color.alpha(c10), Color.red(c10) - 15, Color.green(c10) - 15, Color.blue(c10) - 15);
    }

    public int c(int i7) {
        return k6.w0(i7, this.a);
    }

    public final void d(int i7, float f10, int i10, int i11, float f11, int i12) {
        a();
        boolean z9 = this.m;
        Matrix matrix = this.e;
        if (z9) {
            matrix.reset();
            matrix.postScale((i11 - i7) / 100.0f, (i12 - i10) / 100.0f, this.b * 100.0f, this.c * 100.0f);
            matrix.postTranslate(f10, f11);
            this.d.setLocalMatrix(matrix);
            return;
        }
        int i13 = i12 - i10;
        a();
        matrix.reset();
        matrix.postScale((i11 - i7) / 100.0f, (i13 + i13) / 100.0f, 75.0f, 50.0f);
        matrix.postTranslate(f10, (-r9) + f11);
        this.d.setLocalMatrix(matrix);
    }

    public final void e(RectF rectF) {
        d((int) rectF.left, 0.0f, (int) rectF.top, (int) rectF.right, 0.0f, (int) rectF.bottom);
    }
}
