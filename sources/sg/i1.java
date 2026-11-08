package sg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.ui.Components.mt0;
import org.telegram.ui.d10;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class i1 {
    public w0 a;
    public p0 b;
    public Paint c;
    public Paint d;
    public Paint e;
    public Paint f;
    public Paint g;
    public z0 h;
    public float i;
    public float j;
    public h1 k;
    public e1 l;
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

    public final void b(Canvas canvas, mt0 mt0Var, h1 h1Var) {
        float width = (h1Var.d / mt0Var.a) * canvas.getWidth();
        float height = (h1Var.e / mt0Var.b) * canvas.getHeight();
        float L = org.telegram.messenger.g0.L(5.0f);
        boolean z9 = h1Var.a;
        canvas.drawCircle(width, height, L, z9 ? this.d : this.f);
        canvas.drawCircle((h1Var.d / mt0Var.a) * canvas.getWidth(), (h1Var.e / mt0Var.b) * canvas.getHeight(), org.telegram.messenger.g0.L(5.0f), z9 ? this.e : this.g);
    }

    public final void c(float f10, float f11, boolean z9) {
        float[] fArr = this.p;
        fArr[0] = f10;
        fArr[1] = f11;
        d(z9);
    }

    public final void d(boolean z9) {
        float[] fArr = this.p;
        z0 z0Var = this.h;
        if (z0Var != null) {
            float f10 = z0Var.h;
            if (f10 != 0.0f) {
                float f11 = fArr[0] - z0Var.b;
                fArr[0] = f11;
                fArr[1] = fArr[1] - z0Var.c;
                double d = f10 * (z9 ? -1 : 1);
                float cos = (float) ((Math.cos(d) * f11) - (Math.sin(d) * fArr[1]));
                float d2 = (float) jg.g.d(d, fArr[1], Math.sin(d) * fArr[0]);
                z0 z0Var2 = this.h;
                fArr[0] = cos + z0Var2.b;
                fArr[1] = d2 + z0Var2.c;
            }
        }
    }

    public final void e() {
        z0 z0Var;
        w0 w0Var = this.a;
        if (w0Var == null || w0Var.getPainting() == null || (z0Var = this.h) == null) {
            return;
        }
        z0Var.f = w0Var.getCurrentWeight();
        j0 painting = w0Var.getPainting();
        z0 z0Var2 = this.h;
        int currentColor = w0Var.getCurrentColor();
        if (z0Var2 == null) {
            painting.getClass();
        } else if (painting.r != null) {
            painting.f.f(new d10(painting, z0Var2, currentColor, 22));
        }
        this.m.clear();
        this.n.clear();
        this.h = null;
        v0 v0Var = w0Var.a;
        if (v0Var != null) {
            v0Var.p();
        }
        w0Var.e.z = true;
    }
}
