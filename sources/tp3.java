// default package

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class tp3 extends aib {
    public int c;

    public tp3(int i) {
        super(0L, false);
        this.c = i;
    }

    public abstract px2 d();

    public Throwable f(Object obj) {
        qq2 qq2Var = obj instanceof qq2 ? (qq2) obj : null;
        if (qq2Var != null) {
            return qq2Var.a;
        }
        return null;
    }

    public final void h(Throwable th) {
        dbe.a(d().getContext(), new oy2("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            px2 d = d();
            d.getClass();
            rp3 rp3Var = (rp3) d;
            qx2 qx2Var = rp3Var.e;
            Object obj = rp3Var.h;
            cy2 context = qx2Var.getContext();
            Object c = gfd.c(context, obj);
            av5 av5Var = null;
            y6c c2 = c != gfd.a ? t1e.c(qx2Var, context, c) : null;
            try {
                cy2 context2 = qx2Var.getContext();
                Object i = i();
                Throwable f = f(i);
                if (f == null) {
                    int i2 = this.c;
                    boolean z = true;
                    if (i2 != 1 && i2 != 2) {
                        z = false;
                    }
                    if (z) {
                        av5Var = (av5) context2.get(nf5.c);
                    }
                }
                if (av5Var != null && !av5Var.isActive()) {
                    CancellationException cancellationException = av5Var.getCancellationException();
                    c(cancellationException);
                    qx2Var.resumeWith(tue.a(cancellationException));
                } else if (f != null) {
                    qx2Var.resumeWith(new sc9(f));
                } else {
                    qx2Var.resumeWith(g(i));
                }
                if (c2 == null || c2.S()) {
                    gfd.a(context, c);
                }
            } catch (Throwable th) {
                if (c2 == null || c2.S()) {
                    gfd.a(context, c);
                }
                throw th;
            }
        } catch (Throwable th2) {
            h(th2);
        }
    }

    public void c(CancellationException cancellationException) {
    }

    public Object g(Object obj) {
        return obj;
    }
}
