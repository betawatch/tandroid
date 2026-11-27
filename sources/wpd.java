// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
