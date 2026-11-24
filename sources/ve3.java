// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ve3 {
    public int a;
    public int b;
    public tgb c;
    public int d;
    public boolean e;
    public int f;
    public int g;

    public static ve3 b(ue3 ue3Var, t97 t97Var) {
        ve3 ve3Var = new ve3();
        ve3Var.a = t97Var.a;
        ve3Var.b = t97Var.m;
        String str = t97Var.b;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        tgb tgbVar = new tgb(spannableStringBuilder, 10.0f, gl.o());
        tgbVar.q(ue3Var);
        ve3Var.c = tgbVar;
        ve3Var.c.p(k27.A5(vu3.m(spannableStringBuilder, tgbVar.a.getFontMetricsInt(), false, null, 0), t97Var.c, ve3Var.c.a.getFontMetricsInt(), false));
        ve3Var.c.n(26);
        int L = gl.L(9.32f);
        tgb tgbVar2 = ve3Var.c;
        ve3Var.g = L + ((int) tgbVar2.c);
        tgbVar2.h();
        int[] iArr = bkb.q8;
        int i = iArr[t97Var.m % iArr.length];
        ve3Var.f = i;
        ve3Var.e = true;
        ve3Var.d = bkb.w0(null, i, false);
        return ve3Var;
    }

    public final void a(Canvas canvas) {
        if (this.e) {
            this.d = bkb.w0(null, this.f, false);
        }
        bkb.z0.setColor(bkb.p1(bkb.I.o() ? 0.2f : 0.1f, this.d));
        RectF rectF = gl.P;
        rectF.set(0.0f, 0.0f, this.g, gl.L(14.66f));
        canvas.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), bkb.z0);
        this.c.c(gl.L(4.66f), gl.L(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
