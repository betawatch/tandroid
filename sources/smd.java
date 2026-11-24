// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class smd {
    public boolean a(t2 t2Var, k2 k2Var, k2 k2Var2) {
        synchronized (t2Var) {
            if (t2Var.b != k2Var) {
                return false;
            }
            t2Var.b = k2Var2;
            return true;
        }
    }

    public boolean b(t2 t2Var, Object obj, Object obj2) {
        synchronized (t2Var) {
            if (t2Var.a != obj) {
                return false;
            }
            t2Var.a = obj2;
            return true;
        }
    }

    public boolean c(t2 t2Var, s2 s2Var, s2 s2Var2) {
        synchronized (t2Var) {
            if (t2Var.c != s2Var) {
                return false;
            }
            t2Var.c = s2Var2;
            return true;
        }
    }

    public k2 d(t2 t2Var) {
        k2 k2Var;
        k2 k2Var2 = k2.d;
        synchronized (t2Var) {
            k2Var = t2Var.b;
            if (k2Var != k2Var2) {
                t2Var.b = k2Var2;
            }
        }
        return k2Var;
    }

    public s2 e(t2 t2Var) {
        s2 s2Var;
        s2 s2Var2 = s2.c;
        synchronized (t2Var) {
            s2Var = t2Var.c;
            if (s2Var != s2Var2) {
                t2Var.c = s2Var2;
            }
        }
        return s2Var;
    }

    public void f(s2 s2Var, s2 s2Var2) {
        s2Var.b = s2Var2;
    }

    public void g(s2 s2Var, Thread thread) {
        s2Var.a = thread;
    }
}
