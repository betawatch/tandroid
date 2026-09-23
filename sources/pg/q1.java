package pg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.yl0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class q1 {
    public d1 a;
    public x0 b;
    public Paint c;
    public Paint d;
    public Paint e;
    public Paint f;
    public Paint g;
    public g1 h;
    public float i;
    public float j;
    public p1 k;
    public m1 l;
    public ArrayList m;
    public ArrayList n;
    public Matrix o;
    public float[] p;

    public static float a(float f7, float f10, float f11, float f12, float f13, float f14) {
        float f15 = f13 - f11;
        float f16 = f14 - f12;
        float max = Math.max(Math.min((((f10 - f12) * f16) + ((f7 - f11) * f15)) / ((f16 * f16) + (f15 * f15)), 1.0f), 0.0f);
        float f17 = ((f15 * max) + f11) - f7;
        float f18 = ((max * f16) + f12) - f10;
        return (float) Math.sqrt((f18 * f18) + (f17 * f17));
    }

    public final void b(Canvas canvas, jv0 jv0Var, p1 p1Var) {
        float width = (p1Var.d / jv0Var.a) * canvas.getWidth();
        float height = (p1Var.e / jv0Var.b) * canvas.getHeight();
        float dp = AndroidUtilities.dp(5.0f);
        boolean z10 = p1Var.a;
        canvas.drawCircle(width, height, dp, z10 ? this.d : this.f);
        canvas.drawCircle((p1Var.d / jv0Var.a) * canvas.getWidth(), (p1Var.e / jv0Var.b) * canvas.getHeight(), AndroidUtilities.dp(5.0f), z10 ? this.e : this.g);
    }

    public final void c(float f7, float f10, boolean z10) {
        float[] fArr = this.p;
        fArr[0] = f7;
        fArr[1] = f10;
        d(z10);
    }

    public final void d(boolean z10) {
        float[] fArr = this.p;
        g1 g1Var = this.h;
        if (g1Var != null) {
            float f7 = g1Var.h;
            if (f7 != 0.0f) {
                float f10 = fArr[0] - g1Var.b;
                fArr[0] = f10;
                fArr[1] = fArr[1] - g1Var.c;
                double d = f7 * (z10 ? -1 : 1);
                float cos = (float) ((Math.cos(d) * f10) - (Math.sin(d) * fArr[1]));
                float e = (float) hg.c.e(d, fArr[1], Math.sin(d) * fArr[0]);
                g1 g1Var2 = this.h;
                fArr[0] = cos + g1Var2.b;
                fArr[1] = e + g1Var2.c;
            }
        }
    }

    public final void e() {
        g1 g1Var;
        d1 d1Var = this.a;
        if (d1Var == null || d1Var.getPainting() == null || (g1Var = this.h) == null) {
            return;
        }
        g1Var.f = d1Var.getCurrentWeight();
        r0 painting = d1Var.getPainting();
        g1 g1Var2 = this.h;
        int currentColor = d1Var.getCurrentColor();
        if (g1Var2 == null) {
            painting.getClass();
        } else if (painting.r != null) {
            painting.f.f(new yl0(painting, g1Var2, currentColor, 11));
        }
        this.m.clear();
        this.n.clear();
        this.h = null;
        c1 c1Var = d1Var.a;
        if (c1Var != null) {
            c1Var.c();
        }
        d1Var.e.z = true;
    }
}
