package qg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.ai0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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

    public static float a(float f7, float f10, float f11, float f12, float f13, float f14) {
        float f15 = f13 - f11;
        float f16 = f14 - f12;
        float max = Math.max(Math.min((((f10 - f12) * f16) + ((f7 - f11) * f15)) / ((f16 * f16) + (f15 * f15)), 1.0f), 0.0f);
        float f17 = ((f15 * max) + f11) - f7;
        float f18 = ((max * f16) + f12) - f10;
        return (float) Math.sqrt((f18 * f18) + (f17 * f17));
    }

    public final void b(Canvas canvas, iv0 iv0Var, o1 o1Var) {
        float width = (o1Var.d / iv0Var.a) * canvas.getWidth();
        float height = (o1Var.e / iv0Var.b) * canvas.getHeight();
        float dp = AndroidUtilities.dp(5.0f);
        boolean z10 = o1Var.a;
        canvas.drawCircle(width, height, dp, z10 ? this.d : this.f);
        canvas.drawCircle((o1Var.d / iv0Var.a) * canvas.getWidth(), (o1Var.e / iv0Var.b) * canvas.getHeight(), AndroidUtilities.dp(5.0f), z10 ? this.e : this.g);
    }

    public final void c(float f7, float f10, boolean z10) {
        float[] fArr = this.p;
        fArr[0] = f7;
        fArr[1] = f10;
        d(z10);
    }

    public final void d(boolean z10) {
        float[] fArr = this.p;
        f1 f1Var = this.h;
        if (f1Var != null) {
            float f7 = f1Var.h;
            if (f7 != 0.0f) {
                float f10 = fArr[0] - f1Var.b;
                fArr[0] = f10;
                fArr[1] = fArr[1] - f1Var.c;
                double d = f7 * (z10 ? -1 : 1);
                float cos = (float) ((Math.cos(d) * f10) - (Math.sin(d) * fArr[1]));
                float e7 = (float) i2.g.e(d, fArr[1], Math.sin(d) * fArr[0]);
                f1 f1Var2 = this.h;
                fArr[0] = cos + f1Var2.b;
                fArr[1] = e7 + f1Var2.c;
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
            painting.f.f(new ai0(painting, f1Var2, currentColor, 12));
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
