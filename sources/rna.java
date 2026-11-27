// default package

import android.content.Context;
import android.graphics.PointF;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class rna extends y46 {
    public final k43 r;
    public int s;
    public float t;

    public rna(Context context) {
        super(context);
        this.r = k43.f;
        this.t = 1.0f;
    }

    @Override // y46, b89
    public final void g(View view, a89 a89Var) {
        int j = j(o(), view);
        int k = k(p(), view);
        int m = m((int) Math.sqrt((k * k) + (j * j)));
        if (m > 0) {
            a89Var.b(-j, -k, m, this.r);
        }
        hl.d3(new pg6((Object) this, (byte) 28), Math.max(0, m));
    }

    @Override // y46
    public final int k(int i, View view) {
        return super.k(i, view) - this.s;
    }

    @Override // y46
    public final int m(int i) {
        return Math.round(Math.min(super.m(i), 500) * this.t);
    }

    @Override // y46
    public final int n(int i) {
        return Math.round(Math.min(super.n(i), jn7.f2) * this.t);
    }

    @Override // y46
    public final void q(a89 a89Var) {
        PointF a = a(this.a);
        if (a == null || (a.x == 0.0f && a.y == 0.0f)) {
            a89Var.d = this.a;
            h();
            return;
        }
        b89.b(a);
        this.k = a;
        this.o = (int) (a.x * 10000.0f);
        this.p = (int) (a.y * 10000.0f);
        a89Var.b((int) (this.o * 1.2f), (int) (this.p * 1.2f), (int) (n(10000) * 1.2f), this.r);
    }
}
