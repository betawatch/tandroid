package ud;

import android.os.Handler;
import android.os.Looper;
import cd.h;
import java.util.concurrent.CancellationException;
import k1.i;
import td.a0;
import td.e0;
import td.f2;
import td.j0;
import td.m;
import td.m0;
import td.o0;
import td.w1;
import td.z1;
import yd.o;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d extends a0 implements j0 {
    public final Handler c;
    public final boolean d;
    public final d e;

    public d(Handler handler, boolean z10) {
        this.c = handler;
        this.d = z10;
        this.e = z10 ? this : new d(handler, true);
    }

    @Override // td.j0
    public final void a(long j10, m mVar) {
        z1 z1Var = new z1(mVar, this, false, 6);
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.c.postDelayed(z1Var, j10)) {
            mVar.u(new i(1, this, z1Var));
        } else {
            f(mVar.e, z1Var);
        }
    }

    @Override // td.j0
    public final o0 b(long j10, final f2 f2Var, h hVar) {
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.c.postDelayed(f2Var, j10)) {
            return new o0() { // from class: ud.c
                @Override // td.o0
                public final void dispose() {
                    d.this.c.removeCallbacks(f2Var);
                }
            };
        }
        f(hVar, f2Var);
        return w1.a;
    }

    @Override // td.a0
    public final void c(h hVar, Runnable runnable) {
        if (this.c.post(runnable)) {
            return;
        }
        f(hVar, runnable);
    }

    @Override // td.a0
    public final boolean d() {
        return (this.d && kotlin.jvm.internal.i.a(Looper.myLooper(), this.c.getLooper())) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.c == this.c && dVar.d == this.d;
    }

    public final void f(h hVar, Runnable runnable) {
        e0.e(hVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        m0.b.c(hVar, runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.c) ^ (this.d ? 1231 : 1237);
    }

    @Override // td.a0
    public final String toString() {
        d dVar;
        String str;
        ae.e eVar = m0.a;
        d dVar2 = o.a;
        if (this == dVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                dVar = dVar2.e;
            } catch (UnsupportedOperationException unused) {
                dVar = null;
            }
            str = this == dVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String handler = this.c.toString();
        return this.d ? sc.e.A(handler, ".immediate") : handler;
    }
}
