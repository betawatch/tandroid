package wg;

import i2.v;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class d implements a {
    public final p6 a;
    public c b;
    public c c;
    public c d;
    public c e;
    public float f;
    public float h;
    public float n;
    public float r;

    public d(p6 p6Var) {
        this.a = p6Var;
        float N = i0.N(1.0f);
        float N2 = i0.N(0.33333334f);
        this.n = N;
        this.r = N2;
        float N3 = i0.N(1.0f);
        float N4 = i0.N(0.6666667f);
        this.f = N3;
        this.h = N4;
    }

    @Override // wg.a
    public int E() {
        return a(this.d);
    }

    @Override // wg.a
    public final /* synthetic */ float N() {
        return -1.0f;
    }

    @Override // wg.a
    public final /* synthetic */ float X() {
        return -1.0f;
    }

    public final int a(c cVar) {
        boolean z10 = false;
        if (cVar == null) {
            return 0;
        }
        p6 p6Var = this.a;
        if ((p6Var instanceof th.b) || (p6Var == null ? t6.I.q() : p6Var.a())) {
            z10 = true;
        }
        return cVar.g(p6Var, z10);
    }

    public float b() {
        return this.r;
    }

    @Override // wg.a
    public /* synthetic */ float b0() {
        return 0.0f;
    }

    public float c() {
        return this.n;
    }

    public final void d(int i10, int i11) {
        this.b = new v(i11, i10, 5);
    }

    public final void e(int i10, int i11) {
        this.d = new v(i11, i10, 5);
    }

    public final void f(int i10, int i11) {
        this.c = new v(i11, i10, 5);
    }

    @Override // wg.a
    public /* synthetic */ int h0() {
        return 0;
    }

    @Override // wg.a
    public int j0() {
        return a(this.b);
    }

    @Override // wg.a
    public final int n0() {
        return a(this.e);
    }

    @Override // wg.a
    public int u() {
        return a(this.c);
    }

    @Override // wg.a
    public /* synthetic */ int w() {
        return 0;
    }
}
