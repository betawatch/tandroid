// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class qkd {
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
