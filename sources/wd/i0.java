package wd;

import b8.ib;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class i0 extends de.i {
    public int c;

    public i0(int i3) {
        super(0L, false);
        this.c = i3;
    }

    public abstract fd.c c();

    public Throwable g(Object obj) {
        v vVar = obj instanceof v ? (v) obj : null;
        if (vVar != null) {
            return vVar.a;
        }
        return null;
    }

    public final void i(Throwable th2) {
        b0.m(c().getContext(), new nd.a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    public abstract Object j();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        r4 = (wd.a1) r5.get(wd.y.b);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        try {
            fd.c c2 = c();
            kotlin.jvm.internal.j.c(c2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            be.f fVar = (be.f) c2;
            hd.c cVar = fVar.e;
            Object obj = fVar.h;
            fd.h context = cVar.getContext();
            Object l10 = be.a.l(context, obj);
            a1 a1Var = null;
            a2 x10 = l10 != be.a.d ? b0.x(cVar, context, l10) : null;
            try {
                fd.h context2 = cVar.getContext();
                Object j10 = j();
                Throwable g7 = g(j10);
                if (g7 == null) {
                    int i3 = this.c;
                    boolean z10 = true;
                    if (i3 != 1 && i3 != 2) {
                        z10 = false;
                    }
                }
                if (a1Var != null && !a1Var.isActive()) {
                    CancellationException cancellationException = a1Var.getCancellationException();
                    b(cancellationException);
                    cVar.resumeWith(ib.a(cancellationException));
                } else if (g7 != null) {
                    cVar.resumeWith(ib.a(g7));
                } else {
                    cVar.resumeWith(h(j10));
                }
                if (x10 != null && !x10.T()) {
                    return;
                }
                be.a.g(context, l10);
            } catch (Throwable th2) {
                if (x10 == null || x10.T()) {
                    be.a.g(context, l10);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            i(th3);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object h(Object obj) {
        return obj;
    }
}
