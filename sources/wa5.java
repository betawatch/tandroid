// default package

import android.graphics.Matrix;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class wa5 {
    public float c;
    public float d;
    public float e;
    public float f;
    public RadialGradient g;
    public final int i;
    public int j;
    public int k;
    public int l;
    public float a = -1.0f;
    public float b = -1.0f;
    public final Matrix h = new Matrix();

    public wa5(int i) {
        this.i = i;
    }

    public final void a(float f) {
        int i = this.i;
        if (i == 0) {
            int i2 = this.j;
            int i3 = aob.Kh;
            if (i2 != aob.w0(null, i3, false) || this.k != aob.w0(null, aob.Lh, false)) {
                int w0 = aob.w0(null, i3, false);
                this.j = w0;
                int w02 = aob.w0(null, aob.Lh, false);
                this.k = w02;
                this.g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w0, w02}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else if (i == 1) {
            int i4 = this.j;
            int i5 = aob.Mh;
            if (i4 != aob.w0(null, i5, false) || this.k != aob.w0(null, aob.Nh, false)) {
                int w03 = aob.w0(null, i5, false);
                this.j = w03;
                int w04 = aob.w0(null, aob.Nh, false);
                this.k = w04;
                this.g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w03, w04}, (float[]) null, Shader.TileMode.CLAMP);
            }
        } else {
            if (i != 3) {
                return;
            }
            int i6 = this.j;
            int i7 = aob.Zh;
            if (i6 != aob.w0(null, i7, false) || this.k != aob.w0(null, aob.ai, false) || this.l != aob.w0(null, aob.bi, false)) {
                int w05 = aob.w0(null, aob.ai, false);
                this.k = w05;
                int w06 = aob.w0(null, aob.bi, false);
                this.l = w06;
                int w07 = aob.w0(null, i7, false);
                this.j = w07;
                this.g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w05, w06, w07}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        int L = hl.L(130.0f);
        float f2 = this.e;
        if (f2 == 0.0f || this.f >= f2) {
            this.e = Utilities.b.nextInt(700) + 500;
            this.f = 0.0f;
            if (this.a == -1.0f) {
                b();
            }
            this.c = this.a;
            this.d = this.b;
            b();
        }
        float i8 = bs2.i(0.32f, f, 16.0f, this.f);
        this.f = i8;
        float f3 = this.e;
        if (i8 > f3) {
            this.f = f3;
            i8 = f3;
        }
        float interpolation = k43.g.getInterpolation(i8 / f3);
        float f4 = L;
        float f5 = this.c;
        float f6 = ((((this.a - f5) * interpolation) + f5) * f4) - 200.0f;
        float f7 = this.d;
        float f8 = ((((this.b - f7) * interpolation) + f7) * f4) - 200.0f;
        float f9 = (f4 / 400.0f) * (i == 3 ? 2.0f : 1.5f);
        Matrix matrix = this.h;
        matrix.reset();
        matrix.postTranslate(f6, f8);
        matrix.postScale(f9, f9, f6 + 200.0f, f8 + 200.0f);
        this.g.setLocalMatrix(matrix);
    }

    public final void b() {
        int i = this.i;
        if (i == 0) {
            SecureRandom secureRandom = Utilities.b;
            this.a = qu6.d(secureRandom.nextInt(100), 0.1f, 100.0f, 0.2f);
            this.b = qu6.d(secureRandom.nextInt(100), 0.1f, 100.0f, 0.7f);
        } else if (i == 3) {
            SecureRandom secureRandom2 = Utilities.b;
            this.a = qu6.d(secureRandom2.nextInt(100), 0.1f, 100.0f, 0.6f);
            this.b = (secureRandom2.nextInt(100) * 0.1f) / 100.0f;
        } else {
            SecureRandom secureRandom3 = Utilities.b;
            this.a = c00.B(secureRandom3.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.b = secureRandom3.nextInt(100) / 100.0f;
        }
    }
}
