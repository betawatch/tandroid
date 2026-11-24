// default package

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class sb1 {
    public final int a;
    public final Drawable b;
    public final n41 c;
    public final lm d;
    public final lm e;
    public final RectF f;
    public String g;
    public tgb h;
    public tgb i;
    public float j;
    public boolean k;
    public final /* synthetic */ tb1 l;

    public sb1(tb1 tb1Var, int i) {
        this.l = tb1Var;
        this.c = new n41(tb1Var);
        s33 s33Var = s33.h;
        this.d = new lm(tb1Var, 0L, 260L, s33Var);
        this.e = new lm(tb1Var, 0L, 260L, s33Var);
        this.f = new RectF();
        this.a = i;
        this.b = tb1Var.getContext().getResources().getDrawable(i < 0 ? R.drawable.caption_arrow_up : R.drawable.caption_arrow_down).mutate();
    }

    public final float a() {
        float L = gl.L(30.0f);
        int i = this.a;
        tb1 tb1Var = this.l;
        if (i < 0) {
            float f = L / 2.0f;
            return Math.max(gl.L(8.0f) + f, (tb1Var.h - gl.L(8.0f)) - f);
        }
        return (L / 2.0f) + tb1Var.n + gl.L(8.0f);
    }

    public final void b(String str) {
        tgb tgbVar;
        if (TextUtils.equals(str, this.g)) {
            return;
        }
        this.g = str;
        tb1 tb1Var = this.l;
        if (str == null) {
            tgbVar = null;
        } else {
            tgb tgbVar2 = new tgb(str, 14.0f, gl.o());
            tgbVar2.p = b00.c(110.0f, tb1Var.getWidth(), gl.L(40.0f));
            tgbVar = tgbVar2;
        }
        this.h = tgbVar;
        tb1Var.invalidate();
    }
}
