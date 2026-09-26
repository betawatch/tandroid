package pg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.uv0;
import org.telegram.ui.wl0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class s1 {
    public f1 a;
    public y0 b;
    public Paint c;
    public Paint d;
    public Paint e;
    public Paint f;
    public Paint g;
    public i1 h;
    public float i;
    public float j;
    public r1 k;
    public o1 l;
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

    public final void b(Canvas canvas, uv0 uv0Var, r1 r1Var) {
        float width = (r1Var.d / uv0Var.a) * canvas.getWidth();
        float height = (r1Var.e / uv0Var.b) * canvas.getHeight();
        float dp = AndroidUtilities.dp(5.0f);
        boolean z10 = r1Var.a;
        canvas.drawCircle(width, height, dp, z10 ? this.d : this.f);
        canvas.drawCircle((r1Var.d / uv0Var.a) * canvas.getWidth(), (r1Var.e / uv0Var.b) * canvas.getHeight(), AndroidUtilities.dp(5.0f), z10 ? this.e : this.g);
    }

    public final void c(float f7, float f10, boolean z10) {
        float[] fArr = this.p;
        fArr[0] = f7;
        fArr[1] = f10;
        d(z10);
    }

    public final void d(boolean z10) {
        float[] fArr = this.p;
        i1 i1Var = this.h;
        if (i1Var != null) {
            float f7 = i1Var.h;
            if (f7 != 0.0f) {
                float f10 = fArr[0] - i1Var.b;
                fArr[0] = f10;
                fArr[1] = fArr[1] - i1Var.c;
                double d = f7 * (z10 ? -1 : 1);
                float cos = (float) ((Math.cos(d) * f10) - (Math.sin(d) * fArr[1]));
                float e = (float) hg.c.e(d, fArr[1], Math.sin(d) * fArr[0]);
                i1 i1Var2 = this.h;
                fArr[0] = cos + i1Var2.b;
                fArr[1] = e + i1Var2.c;
            }
        }
    }

    public final void e() {
        i1 i1Var;
        f1 f1Var = this.a;
        if (f1Var == null || f1Var.getPainting() == null || (i1Var = this.h) == null) {
            return;
        }
        i1Var.f = f1Var.getCurrentWeight();
        s0 painting = f1Var.getPainting();
        i1 i1Var2 = this.h;
        int currentColor = f1Var.getCurrentColor();
        if (i1Var2 == null) {
            painting.getClass();
        } else if (painting.r != null) {
            painting.f.f(new wl0(painting, i1Var2, currentColor, 11));
        }
        this.m.clear();
        this.n.clear();
        this.h = null;
        e1 e1Var = f1Var.a;
        if (e1Var != null) {
            e1Var.c();
        }
        f1Var.e.z = true;
    }
}
