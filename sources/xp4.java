// default package

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class xp4 {
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
    public final int m = aob.Oh;
    public final int n = aob.Ph;
    public final int o = aob.Qh;
    public final int p = aob.Rh;
    public final int q = aob.Zh;
    public final int r = aob.ai;
    public final int s = aob.bi;

    public xp4(int i) {
        this.i = i;
        a();
    }

    public final void a() {
        int i = this.i;
        if (i == 0) {
            int w0 = aob.w0(null, this.m, false);
            this.j = w0;
            int w02 = aob.w0(null, this.n, false);
            this.k = w02;
            this.g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w0, w02}, (float[]) null, Shader.TileMode.CLAMP);
            return;
        }
        if (i == 1) {
            int w03 = aob.w0(null, this.o, false);
            this.j = w03;
            int w04 = aob.w0(null, this.p, false);
            this.k = w04;
            this.g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w03, w04}, (float[]) null, Shader.TileMode.CLAMP);
            return;
        }
        if (i == 3) {
            int w05 = aob.w0(null, this.q, false);
            this.j = w05;
            int w06 = aob.w0(null, this.s, false);
            this.l = w06;
            int w07 = aob.w0(null, this.r, false);
            this.k = w07;
            this.g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{w05, w06, w07}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public final void b(Paint paint) {
        int i = this.i;
        if (i != 0 && i != 1 && i != 3) {
            paint.setShader(null);
            paint.setColor(aob.w0(null, aob.Sh, false));
        } else {
            if (i86.e(512)) {
                paint.setShader(this.g);
                return;
            }
            paint.setShader(null);
            int i2 = this.j;
            int i3 = this.k;
            if (i == 3) {
                paint.setColor(vm2.f(0.5f, vm2.f(0.5f, i2, i3), this.l));
            } else {
                paint.setColor(vm2.f(0.5f, i2, i3));
            }
        }
    }
}
