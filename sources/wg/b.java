package wg;

import android.graphics.Color;
import org.telegram.messenger.i0;
import org.telegram.messenger.sc;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class b implements a {
    public final p6 a;
    public final int b;
    public final float c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;

    public b(int i10, p6 p6Var) {
        this(p6Var, i10, sc.e(262144) ? 0.85f : 0.76f);
    }

    @Override // wg.a
    public int E() {
        a();
        if (!b() || Color.alpha(t6.w0(this.n, this.a)) == 0) {
            return this.h;
        }
        return 0;
    }

    @Override // wg.a
    public final float N() {
        if (b()) {
            return i0.N(1.0f);
        }
        return -1.0f;
    }

    @Override // wg.a
    public final float X() {
        if (b()) {
            return i0.N(2.25f);
        }
        return -1.0f;
    }

    public final void a() {
        if (this.r != a7.b) {
            d();
        }
    }

    public final boolean b() {
        return this.n >= 0 && t6.i1(this.a);
    }

    @Override // wg.a
    public final float b0() {
        return i0.N(0.6f);
    }

    public boolean c() {
        return i0.B(t6.w0(this.b, this.a)) < 0.721f;
    }

    public final void d() {
        this.r = a7.b;
        this.d = t6.r1(this.c, t6.w0(this.b, this.a));
        if (c()) {
            this.f = 687865855;
            this.h = 352321535;
            this.e = 0;
        } else {
            this.f = -1;
            this.h = -1;
            this.e = TLObject.FLAG_29;
        }
    }

    @Override // wg.a
    public final int h0() {
        if (b()) {
            return t6.w0(t6.ya, this.a);
        }
        return 0;
    }

    @Override // wg.a
    public int j0() {
        a();
        return b() ? t6.w0(t6.xa, this.a) : this.e;
    }

    @Override // wg.a
    public int n0() {
        a();
        return this.d;
    }

    @Override // wg.a
    public int u() {
        a();
        if (!b() || Color.alpha(t6.w0(this.n, this.a)) == 0) {
            return this.f;
        }
        return 0;
    }

    @Override // wg.a
    public final int w() {
        if (b()) {
            return t6.w0(this.n, this.a);
        }
        return 0;
    }

    public b(p6 p6Var, int i10, float f7) {
        this.n = -1;
        this.r = a7.b;
        this.a = p6Var;
        this.b = i10;
        this.c = f7;
        d();
    }
}
