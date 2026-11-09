package zd;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public abstract class i0 extends ge.i {
    public int c;

    public i0(int i7) {
        super(0L, false);
        this.c = i7;
    }

    public abstract id.c c();

    public Throwable g(Object obj) {
        v vVar = obj instanceof v ? (v) obj : null;
        if (vVar != null) {
            return vVar.a;
        }
        return null;
    }

    public final void i(Throwable th2) {
        b0.m(c().getContext(), new qd.a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    public abstract Object j();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        r4 = (zd.a1) r5.get(zd.y.b);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        try {
            id.c c10 = c();
            kotlin.jvm.internal.j.c(c10, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            ee.f fVar = (ee.f) c10;
            kd.c cVar = fVar.e;
            Object obj = fVar.h;
            id.h context = cVar.getContext();
            Object l10 = ee.a.l(context, obj);
            a1 a1Var = null;
            a2 x10 = l10 != ee.a.d ? b0.x(cVar, context, l10) : null;
            try {
                id.h context2 = cVar.getContext();
                Object j3 = j();
                Throwable g10 = g(j3);
                if (g10 == null) {
                    int i7 = this.c;
                    boolean z9 = true;
                    if (i7 != 1 && i7 != 2) {
                        z9 = false;
                    }
                }
                if (a1Var != null && !a1Var.isActive()) {
                    CancellationException cancellationException = a1Var.getCancellationException();
                    b(cancellationException);
                    cVar.resumeWith(af.b.b(cancellationException));
                } else if (g10 != null) {
                    cVar.resumeWith(af.b.b(g10));
                } else {
                    cVar.resumeWith(h(j3));
                }
                if (x10 != null && !x10.T()) {
                    return;
                }
                ee.a.g(context, l10);
            } catch (Throwable th2) {
                if (x10 == null || x10.T()) {
                    ee.a.g(context, l10);
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
