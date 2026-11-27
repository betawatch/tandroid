// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class pf3 {
    public int a;
    public int b;
    public pkb c;
    public int d;
    public boolean e;
    public int f;
    public int g;

    public static pf3 b(of3 of3Var, ac7 ac7Var) {
        pf3 pf3Var = new pf3();
        pf3Var.a = ac7Var.a;
        pf3Var.b = ac7Var.m;
        String str = ac7Var.b;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        pkb pkbVar = new pkb(spannableStringBuilder, 10.0f, hl.o());
        pkbVar.q(of3Var);
        pf3Var.c = pkbVar;
        pf3Var.c.p(r47.A5(pv3.m(spannableStringBuilder, pkbVar.a.getFontMetricsInt(), false, null, 0), ac7Var.c, pf3Var.c.a.getFontMetricsInt(), false));
        pf3Var.c.n(26);
        int L = hl.L(9.32f);
        pkb pkbVar2 = pf3Var.c;
        pf3Var.g = L + ((int) pkbVar2.c);
        pkbVar2.h();
        int[] iArr = aob.r8;
        int i = iArr[ac7Var.m % iArr.length];
        pf3Var.f = i;
        pf3Var.e = true;
        pf3Var.d = aob.w0(null, i, false);
        return pf3Var;
    }

    public final void a(Canvas canvas) {
        if (this.e) {
            this.d = aob.w0(null, this.f, false);
        }
        aob.z0.setColor(aob.p1(aob.I.o() ? 0.2f : 0.1f, this.d));
        RectF rectF = hl.P;
        rectF.set(0.0f, 0.0f, this.g, hl.L(14.66f));
        canvas.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), aob.z0);
        this.c.c(hl.L(4.66f), hl.L(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
