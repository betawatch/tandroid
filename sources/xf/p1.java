package xf;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.jh0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p1 {
    public c1 a;
    public w0 b;
    public Paint c;
    public Paint d;
    public Paint e;
    public Paint f;
    public Paint g;
    public f1 h;
    public float i;
    public float j;
    public o1 k;
    public l1 l;
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

    public final void b(Canvas canvas, qu0 qu0Var, o1 o1Var) {
        float width = (o1Var.d / qu0Var.a) * canvas.getWidth();
        float height = (o1Var.e / qu0Var.b) * canvas.getHeight();
        float dp = AndroidUtilities.dp(5.0f);
        boolean z10 = o1Var.a;
        canvas.drawCircle(width, height, dp, z10 ? this.d : this.f);
        canvas.drawCircle((o1Var.d / qu0Var.a) * canvas.getWidth(), (o1Var.e / qu0Var.b) * canvas.getHeight(), AndroidUtilities.dp(5.0f), z10 ? this.e : this.g);
    }

    public final void c(float f10, float f11, boolean z10) {
        float[] fArr = this.p;
        fArr[0] = f10;
        fArr[1] = f11;
        d(z10);
    }

    public final void d(boolean z10) {
        float[] fArr = this.p;
        f1 f1Var = this.h;
        if (f1Var != null) {
            float f10 = f1Var.h;
            if (f10 != 0.0f) {
                float f11 = fArr[0] - f1Var.b;
                fArr[0] = f11;
                fArr[1] = fArr[1] - f1Var.c;
                double d = f10 * (z10 ? -1 : 1);
                float cos = (float) ((Math.cos(d) * f11) - (Math.sin(d) * fArr[1]));
                float b10 = (float) j3.r0.b(d, fArr[1], Math.sin(d) * fArr[0]);
                f1 f1Var2 = this.h;
                fArr[0] = cos + f1Var2.b;
                fArr[1] = b10 + f1Var2.c;
            }
        }
    }

    public final void e() {
        f1 f1Var;
        c1 c1Var = this.a;
        if (c1Var == null || c1Var.getPainting() == null || (f1Var = this.h) == null) {
            return;
        }
        f1Var.f = c1Var.getCurrentWeight();
        q0 painting = c1Var.getPainting();
        f1 f1Var2 = this.h;
        int currentColor = c1Var.getCurrentColor();
        if (f1Var2 == null) {
            painting.getClass();
        } else if (painting.r != null) {
            painting.f.f(new jh0(painting, f1Var2, currentColor, 17));
        }
        this.m.clear();
        this.n.clear();
        this.h = null;
        b1 b1Var = c1Var.a;
        if (b1Var != null) {
            b1Var.c();
        }
        c1Var.e.z = true;
    }
}
