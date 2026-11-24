// default package

import android.content.Context;
import android.graphics.PointF;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class yla extends v46 {
    public final d53 r;
    public int s;
    public float t;

    public yla(Context context) {
        super(context);
        this.r = d53.f;
        this.t = 1.0f;
    }

    @Override // v46, q69
    public final void g(View view, p69 p69Var) {
        int j = j(o(), view);
        int k = k(p(), view);
        int m = m((int) Math.sqrt((k * k) + (j * j)));
        if (m > 0) {
            p69Var.b(-j, -k, m, this.r);
        }
        gm.d3(new bo6((Object) this, (byte) 25), Math.max(0, m));
    }

    @Override // v46
    public final int k(int i, View view) {
        return super.k(i, view) - this.s;
    }

    @Override // v46
    public final int m(int i) {
        return Math.round(Math.min(super.m(i), 500) * this.t);
    }

    @Override // v46
    public final int n(int i) {
        return Math.round(Math.min(super.n(i), nm7.f2) * this.t);
    }

    @Override // v46
    public final void q(p69 p69Var) {
        PointF a = a(this.a);
        if (a == null || (a.x == 0.0f && a.y == 0.0f)) {
            p69Var.d = this.a;
            h();
            return;
        }
        q69.b(a);
        this.k = a;
        this.o = (int) (a.x * 10000.0f);
        this.p = (int) (a.y * 10000.0f);
        p69Var.b((int) (this.o * 1.2f), (int) (this.p * 1.2f), (int) (n(10000) * 1.2f), this.r);
    }
}
