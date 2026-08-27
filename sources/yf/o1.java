package yf;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.ol0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class o1 {
    public b1 a;
    public v0 b;
    public Paint c;
    public Paint d;
    public Paint e;
    public Paint f;
    public Paint g;
    public e1 h;
    public float i;
    public float j;
    public n1 k;
    public k1 l;
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

    public final void b(Canvas canvas, tu0 tu0Var, n1 n1Var) {
        float width = (n1Var.d / tu0Var.a) * canvas.getWidth();
        float height = (n1Var.e / tu0Var.b) * canvas.getHeight();
        float dp = AndroidUtilities.dp(5.0f);
        boolean z10 = n1Var.a;
        canvas.drawCircle(width, height, dp, z10 ? this.d : this.f);
        canvas.drawCircle((n1Var.d / tu0Var.a) * canvas.getWidth(), (n1Var.e / tu0Var.b) * canvas.getHeight(), AndroidUtilities.dp(5.0f), z10 ? this.e : this.g);
    }

    public final void c(float f10, float f11, boolean z10) {
        float[] fArr = this.p;
        fArr[0] = f10;
        fArr[1] = f11;
        d(z10);
    }

    public final void d(boolean z10) {
        float[] fArr = this.p;
        e1 e1Var = this.h;
        if (e1Var != null) {
            float f10 = e1Var.h;
            if (f10 != 0.0f) {
                float f11 = fArr[0] - e1Var.b;
                fArr[0] = f11;
                fArr[1] = fArr[1] - e1Var.c;
                double d = f10 * (z10 ? -1 : 1);
                float cos = (float) ((Math.cos(d) * f11) - (Math.sin(d) * fArr[1]));
                float b10 = (float) i0.a.b(d, fArr[1], Math.sin(d) * fArr[0]);
                e1 e1Var2 = this.h;
                fArr[0] = cos + e1Var2.b;
                fArr[1] = b10 + e1Var2.c;
            }
        }
    }

    public final void e() {
        e1 e1Var;
        b1 b1Var = this.a;
        if (b1Var == null || b1Var.getPainting() == null || (e1Var = this.h) == null) {
            return;
        }
        e1Var.f = b1Var.getCurrentWeight();
        p0 painting = b1Var.getPainting();
        e1 e1Var2 = this.h;
        int currentColor = b1Var.getCurrentColor();
        if (e1Var2 == null) {
            painting.getClass();
        } else if (painting.r != null) {
            painting.f.f(new ol0(painting, e1Var2, currentColor, 17));
        }
        this.m.clear();
        this.n.clear();
        this.h = null;
        a1 a1Var = b1Var.a;
        if (a1Var != null) {
            a1Var.c();
        }
        b1Var.e.z = true;
    }
}
