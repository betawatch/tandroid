// default package

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class y28 {
    public boolean f;
    public boolean g;
    public boolean h;
    public Path i;
    public Paint j;
    public Drawable k;
    public final u51 l;
    public boolean m;
    public final ln n;
    public int o;
    public final /* synthetic */ z28 r;
    public final Paint a = new Paint(1);
    public final Paint b = new Paint(1);
    public final Paint c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF p = new RectF();
    public final RectF q = new RectF();

    public y28(z28 z28Var) {
        this.r = z28Var;
        this.l = new u51(z28Var);
        this.n = new ln(z28Var, 0L, 320L, d53.h);
    }

    public final void a(ec7 ec7Var) {
        z28 z28Var = this.r;
        ylb ylbVar = z28Var.a;
        if (ec7Var == null) {
            return;
        }
        int[] iArr = ec7Var.g;
        int[] iArr2 = ec7Var.h;
        boolean o = ylbVar == null ? cmb.I.o() : ylbVar.a();
        byte b = z28Var.c;
        Paint paint = this.b;
        Paint paint2 = this.a;
        if (b != 1) {
            paint2.setColor(ec7Var.e(0, ylbVar));
            paint.setColor(ec7Var.o(o) ? ec7Var.e(1, ylbVar) : ec7Var.e(0, ylbVar));
            this.f = ec7Var.o(o);
            this.g = false;
            return;
        }
        if (o && ec7Var.g() != ec7Var.f() && ec7Var.i() == ec7Var.f()) {
            paint2.setColor(ec7Var.e(1, ylbVar));
            paint.setColor(ec7Var.e(0, ylbVar));
        } else {
            paint2.setColor(ec7Var.e(0, ylbVar));
            paint.setColor(ec7Var.e(1, ylbVar));
        }
        this.c.setColor(ec7Var.e(2, ylbVar));
        this.f = ec7Var.h(o) != (o ? iArr2 : iArr)[0];
        int j = ec7Var.j(o);
        if (o) {
            iArr = iArr2;
        }
        this.g = j != iArr[0];
    }
}
