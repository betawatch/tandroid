package tg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import k2.p1;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.rw;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g1 {
    public u0 a;
    public o0 b;
    public Paint c;
    public Paint d;
    public Paint e;
    public Paint f;
    public Paint g;
    public x0 h;
    public float i;
    public float j;
    public f1 k;
    public c1 l;
    public ArrayList m;
    public ArrayList n;
    public Matrix o;
    public float[] p;

    public static float a(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f14 - f12;
        float f17 = f15 - f13;
        float max = Math.max(Math.min((((f11 - f13) * f17) + ((f10 - f12) * f16)) / ((f17 * f17) + (f16 * f16)), 1.0f), 0.0f);
        float f18 = ((f16 * max) + f12) - f10;
        float f19 = ((max * f17) + f13) - f11;
        return (float) Math.sqrt((f19 * f19) + (f18 * f18));
    }

    public final void b(Canvas canvas, lt0 lt0Var, f1 f1Var) {
        float width = (f1Var.d / lt0Var.a) * canvas.getWidth();
        float height = (f1Var.e / lt0Var.b) * canvas.getHeight();
        float L = org.telegram.messenger.g0.L(5.0f);
        boolean z10 = f1Var.a;
        canvas.drawCircle(width, height, L, z10 ? this.d : this.f);
        canvas.drawCircle((f1Var.d / lt0Var.a) * canvas.getWidth(), (f1Var.e / lt0Var.b) * canvas.getHeight(), org.telegram.messenger.g0.L(5.0f), z10 ? this.e : this.g);
    }

    public final void c(float f10, float f11, boolean z10) {
        float[] fArr = this.p;
        fArr[0] = f10;
        fArr[1] = f11;
        d(z10);
    }

    public final void d(boolean z10) {
        float[] fArr = this.p;
        x0 x0Var = this.h;
        if (x0Var != null) {
            float f10 = x0Var.h;
            if (f10 != 0.0f) {
                float f11 = fArr[0] - x0Var.b;
                fArr[0] = f11;
                fArr[1] = fArr[1] - x0Var.c;
                double d = f10 * (z10 ? -1 : 1);
                float cos = (float) ((Math.cos(d) * f11) - (Math.sin(d) * fArr[1]));
                float c2 = (float) p1.c(d, fArr[1], Math.sin(d) * fArr[0]);
                x0 x0Var2 = this.h;
                fArr[0] = cos + x0Var2.b;
                fArr[1] = c2 + x0Var2.c;
            }
        }
    }

    public final void e() {
        x0 x0Var;
        u0 u0Var = this.a;
        if (u0Var == null || u0Var.getPainting() == null || (x0Var = this.h) == null) {
            return;
        }
        x0Var.f = u0Var.getCurrentWeight();
        i0 painting = u0Var.getPainting();
        x0 x0Var2 = this.h;
        int currentColor = u0Var.getCurrentColor();
        if (x0Var2 == null) {
            painting.getClass();
        } else if (painting.r != null) {
            painting.f.f(new rw(painting, x0Var2, currentColor, 25));
        }
        this.m.clear();
        this.n.clear();
        this.h = null;
        t0 t0Var = u0Var.a;
        if (t0Var != null) {
            t0Var.m();
        }
        u0Var.e.z = true;
    }
}
