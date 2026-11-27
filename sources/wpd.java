// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class wpd {
    public boolean a(b4 b4Var, w3 w3Var, w3 w3Var2) {
        synchronized (b4Var) {
            if (b4Var.b != w3Var) {
                return false;
            }
            b4Var.b = w3Var2;
            return true;
        }
    }

    public boolean b(b4 b4Var, Object obj, Object obj2) {
        synchronized (b4Var) {
            if (b4Var.a != obj) {
                return false;
            }
            b4Var.a = obj2;
            return true;
        }
    }

    public boolean c(b4 b4Var, a4 a4Var, a4 a4Var2) {
        synchronized (b4Var) {
            if (b4Var.c != a4Var) {
                return false;
            }
            b4Var.c = a4Var2;
            return true;
        }
    }

    public void d(a4 a4Var, a4 a4Var2) {
        a4Var.b = a4Var2;
    }

    public void e(a4 a4Var, Thread thread) {
        a4Var.a = thread;
    }
}
