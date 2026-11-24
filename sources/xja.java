// default package

import android.content.Context;
import android.graphics.PointF;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class xja extends u26 {
    public final s33 r;
    public int s;
    public float t;

    public xja(Context context) {
        super(context);
        this.r = s33.f;
        this.t = 1.0f;
    }

    @Override // u26, o49
    public final void g(View view, n49 n49Var) {
        int j = j(o(), view);
        int k = k(p(), view);
        int m = m((int) Math.sqrt((k * k) + (j * j)));
        if (m > 0) {
            n49Var.b(-j, -k, m, this.r);
        }
        gl.d3(new am6((Object) this, (byte) 25), Math.max(0, m));
    }

    @Override // u26
    public final int k(int i, View view) {
        return super.k(i, view) - this.s;
    }

    @Override // u26
    public final int m(int i) {
        return Math.round(Math.min(super.m(i), 500) * this.t);
    }

    @Override // u26
    public final int n(int i) {
        return Math.round(Math.min(super.n(i), kk7.f2) * this.t);
    }

    @Override // u26
    public final void q(n49 n49Var) {
        PointF a = a(this.a);
        if (a == null || (a.x == 0.0f && a.y == 0.0f)) {
            n49Var.d = this.a;
            h();
            return;
        }
        o49.b(a);
        this.k = a;
        this.o = (int) (a.x * 10000.0f);
        this.p = (int) (a.y * 10000.0f);
        n49Var.b((int) (this.o * 1.2f), (int) (this.p * 1.2f), (int) (n(10000) * 1.2f), this.r);
    }
}
