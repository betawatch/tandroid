package sg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.ui.Components.ot0;
import org.telegram.ui.f10;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class h1 {
    public v0 a;
    public p0 b;
    public Paint c;
    public Paint d;
    public Paint e;
    public Paint f;
    public Paint g;
    public y0 h;
    public float i;
    public float j;
    public g1 k;
    public d1 l;
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

    public final void b(Canvas canvas, ot0 ot0Var, g1 g1Var) {
        float width = (g1Var.d / ot0Var.a) * canvas.getWidth();
        float height = (g1Var.e / ot0Var.b) * canvas.getHeight();
        float L = org.telegram.messenger.g0.L(5.0f);
        boolean z9 = g1Var.a;
        canvas.drawCircle(width, height, L, z9 ? this.d : this.f);
        canvas.drawCircle((g1Var.d / ot0Var.a) * canvas.getWidth(), (g1Var.e / ot0Var.b) * canvas.getHeight(), org.telegram.messenger.g0.L(5.0f), z9 ? this.e : this.g);
    }

    public final void c(float f10, float f11, boolean z9) {
        float[] fArr = this.p;
        fArr[0] = f10;
        fArr[1] = f11;
        d(z9);
    }

    public final void d(boolean z9) {
        float[] fArr = this.p;
        y0 y0Var = this.h;
        if (y0Var != null) {
            float f10 = y0Var.h;
            if (f10 != 0.0f) {
                float f11 = fArr[0] - y0Var.b;
                fArr[0] = f11;
                fArr[1] = fArr[1] - y0Var.c;
                double d = f10 * (z9 ? -1 : 1);
                float cos = (float) ((Math.cos(d) * f11) - (Math.sin(d) * fArr[1]));
                float d2 = (float) jg.g.d(d, fArr[1], Math.sin(d) * fArr[0]);
                y0 y0Var2 = this.h;
                fArr[0] = cos + y0Var2.b;
                fArr[1] = d2 + y0Var2.c;
            }
        }
    }

    public final void e() {
        y0 y0Var;
        v0 v0Var = this.a;
        if (v0Var == null || v0Var.getPainting() == null || (y0Var = this.h) == null) {
            return;
        }
        y0Var.f = v0Var.getCurrentWeight();
        j0 painting = v0Var.getPainting();
        y0 y0Var2 = this.h;
        int currentColor = v0Var.getCurrentColor();
        if (y0Var2 == null) {
            painting.getClass();
        } else if (painting.r != null) {
            painting.f.f(new f10(painting, y0Var2, currentColor, 22));
        }
        this.m.clear();
        this.n.clear();
        this.h = null;
        u0 u0Var = v0Var.a;
        if (u0Var != null) {
            u0Var.p();
        }
        v0Var.e.z = true;
    }
}
