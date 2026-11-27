// default package

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class ytd {
    public static Object a(is4 is4Var) {
        Thread currentThread = Thread.currentThread();
        rj2 rj2Var = rj2.b;
        z44 a = crb.a();
        mx2 a2 = g4e.a(u24.a, a, true);
        qc3 qc3Var = bp3.a;
        if (a2 != qc3Var && a2.get(rj2Var) == null) {
            a2 = a2.plus(qc3Var);
        }
        pk0 pk0Var = new pk0(a2, currentThread, a);
        pk0Var.R(xx2.a, pk0Var, is4Var);
        z44 z44Var = pk0Var.f;
        if (z44Var != null) {
            int i = z44.f;
            z44Var.g(false);
        }
        while (!Thread.interrupted()) {
            try {
                long h = z44Var != null ? z44Var.h() : Long.MAX_VALUE;
                if (!(pk0Var.v() instanceof hp5)) {
                    Object a3 = yed.a(pk0Var.v());
                    yp2 yp2Var = a3 instanceof yp2 ? (yp2) a3 : null;
                    if (yp2Var == null) {
                        return a3;
                    }
                    throw yp2Var.a;
                }
                LockSupport.parkNanos(pk0Var, h);
            } finally {
                if (z44Var != null) {
                    int i2 = z44.f;
                    z44Var.f(false);
                }
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        pk0Var.i(interruptedException);
        throw interruptedException;
    }
}
