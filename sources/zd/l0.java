package zd;

import java.util.concurrent.CancellationException;
import v7.s7;
import v7.u7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class l0 extends ge.i {
    public int c;

    public l0(int i10) {
        super(0L, ge.k.g);
        this.c = i10;
    }

    public abstract void c(Object obj, CancellationException cancellationException);

    public abstract id.c f();

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
            s7.a(th2, th3);
        }
        if (th2 == null) {
            th2 = th3;
        }
        kotlin.jvm.internal.i.b(th2);
        e0.m(f().getContext(), new qd.a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    public abstract Object j();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        r7 = (zd.f1) r7.get(zd.b0.b);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj = gd.i.a;
        com.google.android.gms.internal.cast.a aVar = this.b;
        try {
            id.c f7 = f();
            kotlin.jvm.internal.i.c(f7, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            ee.h hVar = (ee.h) f7;
            kd.c cVar = hVar.e;
            Object obj2 = hVar.h;
            id.h context = cVar.getContext();
            Object k10 = ee.a.k(context, obj2);
            g2 v = k10 != ee.a.f ? e0.v(cVar, context, k10) : null;
            try {
                id.h context2 = cVar.getContext();
                Object j3 = j();
                Throwable g10 = g(j3);
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
                    c(j3, cancellationException);
                    cVar.resumeWith(u7.a(cancellationException));
                } else if (g10 != null) {
                    cVar.resumeWith(u7.a(g10));
                } else {
                    cVar.resumeWith(h(j3));
                }
                if (v == null || v.M()) {
                    ee.a.f(context, k10);
                }
                try {
                    aVar.getClass();
                } catch (Throwable th2) {
                    obj = u7.a(th2);
                }
                i(null, gd.f.a(obj));
            } catch (Throwable th3) {
                if (v == null || v.M()) {
                    ee.a.f(context, k10);
                }
                throw th3;
            }
        } catch (Throwable th4) {
            try {
                aVar.getClass();
            } catch (Throwable th5) {
                obj = u7.a(th5);
            }
            i(th4, gd.f.a(obj));
        }
    }

    public Object h(Object obj) {
        return obj;
    }
}
