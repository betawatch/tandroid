package td;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class l0 extends ae.i {
    public int c;

    public l0(int i10) {
        super(0L, ae.l.g);
        this.c = i10;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract cd.c c();

    public Throwable g(Object obj) {
        v vVar = obj instanceof v ? (v) obj : null;
        if (vVar != null) {
            return vVar.a;
        }
        return null;
    }

    public final void i(Throwable th2, Throwable th3) {
        if (th2 == null && th3 == null) {
            return;
        }
        if (th2 != null && th3 != null) {
            i8.d.a(th2, th3);
        }
        if (th2 == null) {
            th2 = th3;
        }
        kotlin.jvm.internal.i.b(th2);
        e0.m(c().getContext(), new kd.a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    public abstract Object j();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        r7 = (td.f1) r7.get(td.b0.b);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj = ad.j.a;
        ae.j jVar = this.b;
        try {
            cd.c c10 = c();
            kotlin.jvm.internal.i.c(c10, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            yd.h hVar = (yd.h) c10;
            ed.c cVar = hVar.e;
            Object obj2 = hVar.h;
            cd.h context = cVar.getContext();
            Object k10 = yd.a.k(context, obj2);
            h2 v = k10 != yd.a.f ? e0.v(cVar, context, k10) : null;
            try {
                cd.h context2 = cVar.getContext();
                Object j10 = j();
                Throwable g10 = g(j10);
                if (g10 == null) {
                    int i10 = this.c;
                    boolean z10 = true;
                    if (i10 != 1 && i10 != 2) {
                        z10 = false;
                    }
                }
                f1 f1Var = null;
                if (f1Var != null && !f1Var.isActive()) {
                    CancellationException cancellationException = f1Var.getCancellationException();
                    b(j10, cancellationException);
                    cVar.resumeWith(l9.b.a(cancellationException));
                } else if (g10 != null) {
                    cVar.resumeWith(l9.b.a(g10));
                } else {
                    cVar.resumeWith(h(j10));
                }
                if (v == null || v.M()) {
                    yd.a.f(context, k10);
                }
                try {
                    jVar.getClass();
                } catch (Throwable th2) {
                    obj = l9.b.a(th2);
                }
                i(null, ad.g.a(obj));
            } catch (Throwable th3) {
                if (v == null || v.M()) {
                    yd.a.f(context, k10);
                }
                throw th3;
            }
        } catch (Throwable th4) {
            try {
                jVar.getClass();
            } catch (Throwable th5) {
                obj = l9.b.a(th5);
            }
            i(th4, ad.g.a(obj));
        }
    }

    public Object h(Object obj) {
        return obj;
    }
}
