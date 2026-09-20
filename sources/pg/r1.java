package pg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.uv0;
import org.telegram.ui.fm0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class r1 {
    public e1 a;
    public y0 b;
    public Paint c;
    public Paint d;
    public Paint e;
    public Paint f;
    public Paint g;
    public h1 h;
    public float i;
    public float j;
    public q1 k;
    public n1 l;
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

    public final void b(Canvas canvas, uv0 uv0Var, q1 q1Var) {
        float width = (q1Var.d / uv0Var.a) * canvas.getWidth();
        float height = (q1Var.e / uv0Var.b) * canvas.getHeight();
        float dp = AndroidUtilities.dp(5.0f);
        boolean z10 = q1Var.a;
        canvas.drawCircle(width, height, dp, z10 ? this.d : this.f);
        canvas.drawCircle((q1Var.d / uv0Var.a) * canvas.getWidth(), (q1Var.e / uv0Var.b) * canvas.getHeight(), AndroidUtilities.dp(5.0f), z10 ? this.e : this.g);
    }

    public final void c(float f7, float f10, boolean z10) {
        float[] fArr = this.p;
        fArr[0] = f7;
        fArr[1] = f10;
        d(z10);
    }

    public final void d(boolean z10) {
        float[] fArr = this.p;
        h1 h1Var = this.h;
        if (h1Var != null) {
            float f7 = h1Var.h;
            if (f7 != 0.0f) {
                float f10 = fArr[0] - h1Var.b;
                fArr[0] = f10;
                fArr[1] = fArr[1] - h1Var.c;
                double d = f7 * (z10 ? -1 : 1);
                float cos = (float) ((Math.cos(d) * f10) - (Math.sin(d) * fArr[1]));
                float e = (float) hg.k0.e(d, fArr[1], Math.sin(d) * fArr[0]);
                h1 h1Var2 = this.h;
                fArr[0] = cos + h1Var2.b;
                fArr[1] = e + h1Var2.c;
            }
        }
    }

    public final void e() {
        h1 h1Var;
        e1 e1Var = this.a;
        if (e1Var == null || e1Var.getPainting() == null || (h1Var = this.h) == null) {
            return;
        }
        h1Var.f = e1Var.getCurrentWeight();
        s0 painting = e1Var.getPainting();
        h1 h1Var2 = this.h;
        int currentColor = e1Var.getCurrentColor();
        if (h1Var2 == null) {
            painting.getClass();
        } else if (painting.r != null) {
            painting.f.f(new fm0(painting, h1Var2, currentColor, 11));
        }
        this.m.clear();
        this.n.clear();
        this.h = null;
        d1 d1Var = e1Var.a;
        if (d1Var != null) {
            d1Var.c();
        }
        e1Var.e.z = true;
    }
}
