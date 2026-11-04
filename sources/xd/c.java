package xd;

import android.os.Handler;
import android.os.Looper;
import b1.e;
import be.n;
import fd.h;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.j;
import l1.u0;
import u9.k;
import wd.a1;
import wd.g0;
import wd.j0;
import wd.l0;
import wd.m;
import wd.p1;
import wd.x;
import wd.y;
import wd.y1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c extends x implements g0 {
    public final Handler c;
    public final boolean d;
    public final c e;

    public c(Handler handler, boolean z10) {
        this.c = handler;
        this.d = z10;
        this.e = z10 ? this : new c(handler, true);
    }

    @Override // wd.g0
    public final void a(long j10, m mVar) {
        k kVar = new k(mVar, this, false, 7);
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.c.postDelayed(kVar, j10)) {
            mVar.u(new e(3, this, kVar));
        } else {
            g(mVar.e, kVar);
        }
    }

    @Override // wd.g0
    public final l0 b(long j10, y1 y1Var, h hVar) {
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.c.postDelayed(y1Var, j10)) {
            return new u0(1, this, y1Var);
        }
        g(hVar, y1Var);
        return p1.a;
    }

    @Override // wd.x
    public final void c(h hVar, Runnable runnable) {
        if (this.c.post(runnable)) {
            return;
        }
        g(hVar, runnable);
    }

    @Override // wd.x
    public final boolean e(h hVar) {
        return (this.d && j.a(Looper.myLooper(), this.c.getLooper())) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return cVar.c == this.c && cVar.d == this.d;
    }

    public final void g(h hVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        a1 a1Var = (a1) hVar.get(y.b);
        if (a1Var != null) {
            a1Var.cancel(cancellationException);
        }
        de.e eVar = j0.a;
        de.d.c.c(hVar, runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.c) ^ (this.d ? 1231 : 1237);
    }

    @Override // wd.x
    public final String toString() {
        c cVar;
        String str;
        de.e eVar = j0.a;
        c cVar2 = n.a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.e;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String handler = this.c.toString();
        return this.d ? t4.c.q(handler, ".immediate") : handler;
    }
}
