// default package

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class v08 {
    public boolean f;
    public boolean g;
    public boolean h;
    public Path i;
    public Paint j;
    public Drawable k;
    public final n41 l;
    public boolean m;
    public final lm n;
    public int o;
    public final /* synthetic */ w08 r;
    public final Paint a = new Paint(1);
    public final Paint b = new Paint(1);
    public final Paint c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF p = new RectF();
    public final RectF q = new RectF();

    public v08(w08 w08Var) {
        this.r = w08Var;
        this.l = new n41(w08Var);
        this.n = new lm(w08Var, 0L, 320L, s33.h);
    }

    public final void a(da7 da7Var) {
        w08 w08Var = this.r;
        wjb wjbVar = w08Var.a;
        if (da7Var == null) {
            return;
        }
        int[] iArr = da7Var.g;
        int[] iArr2 = da7Var.h;
        boolean o = wjbVar == null ? bkb.I.o() : wjbVar.a();
        byte b = w08Var.c;
        Paint paint = this.b;
        Paint paint2 = this.a;
        if (b != 1) {
            paint2.setColor(da7Var.e(0, wjbVar));
            paint.setColor(da7Var.o(o) ? da7Var.e(1, wjbVar) : da7Var.e(0, wjbVar));
            this.f = da7Var.o(o);
            this.g = false;
            return;
        }
        if (o && da7Var.g() != da7Var.f() && da7Var.i() == da7Var.f()) {
            paint2.setColor(da7Var.e(1, wjbVar));
            paint.setColor(da7Var.e(0, wjbVar));
        } else {
            paint2.setColor(da7Var.e(0, wjbVar));
            paint.setColor(da7Var.e(1, wjbVar));
        }
        this.c.setColor(da7Var.e(2, wjbVar));
        this.f = da7Var.h(o) != (o ? iArr2 : iArr)[0];
        int j = da7Var.j(o);
        if (o) {
            iArr = iArr2;
        }
        this.g = j != iArr[0];
    }
}
