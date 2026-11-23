package sg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.ui.Components.e21;
import org.telegram.ui.Components.xt0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class f1 {
    public t0 a;
    public n0 b;
    public Paint c;
    public Paint d;
    public Paint e;
    public Paint f;
    public Paint g;
    public w0 h;
    public float i;
    public float j;
    public e1 k;
    public b1 l;
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

    public final void b(Canvas canvas, xt0 xt0Var, e1 e1Var) {
        float width = (e1Var.d / xt0Var.a) * canvas.getWidth();
        float height = (e1Var.e / xt0Var.b) * canvas.getHeight();
        float L = org.telegram.messenger.g0.L(5.0f);
        boolean z10 = e1Var.a;
        canvas.drawCircle(width, height, L, z10 ? this.d : this.f);
        canvas.drawCircle((e1Var.d / xt0Var.a) * canvas.getWidth(), (e1Var.e / xt0Var.b) * canvas.getHeight(), org.telegram.messenger.g0.L(5.0f), z10 ? this.e : this.g);
    }

    public final void c(float f10, float f11, boolean z10) {
        float[] fArr = this.p;
        fArr[0] = f10;
        fArr[1] = f11;
        d(z10);
    }

    public final void d(boolean z10) {
        float[] fArr = this.p;
        w0 w0Var = this.h;
        if (w0Var != null) {
            float f10 = w0Var.h;
            if (f10 != 0.0f) {
                float f11 = fArr[0] - w0Var.b;
                fArr[0] = f11;
                fArr[1] = fArr[1] - w0Var.c;
                double d = f10 * (z10 ? -1 : 1);
                float cos = (float) ((Math.cos(d) * f11) - (Math.sin(d) * fArr[1]));
                float c10 = (float) i5.c.c(d, fArr[1], Math.sin(d) * fArr[0]);
                w0 w0Var2 = this.h;
                fArr[0] = cos + w0Var2.b;
                fArr[1] = c10 + w0Var2.c;
            }
        }
    }

    public final void e() {
        w0 w0Var;
        t0 t0Var = this.a;
        if (t0Var == null || t0Var.getPainting() == null || (w0Var = this.h) == null) {
            return;
        }
        w0Var.f = t0Var.getCurrentWeight();
        h0 painting = t0Var.getPainting();
        w0 w0Var2 = this.h;
        int currentColor = t0Var.getCurrentColor();
        if (w0Var2 == null) {
            painting.getClass();
        } else if (painting.r != null) {
            painting.f.f(new e21(painting, w0Var2, currentColor, 25));
        }
        this.m.clear();
        this.n.clear();
        this.h = null;
        s0 s0Var = t0Var.a;
        if (s0Var != null) {
            s0Var.q();
        }
        t0Var.e.z = true;
    }
}
