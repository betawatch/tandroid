// default package

import java.io.File;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class tg7 extends vw5 implements qp4 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tg7(Serializable serializable, Object obj, byte b) {
        super(1);
        this.b = b;
        this.c = serializable;
        this.d = obj;
    }

    @Override // qp4
    public final Object invoke(Object obj) {
        Object ej1Var;
        hj1 hj1Var;
        g5c g5cVar;
        byte b = this.b;
        Object obj2 = this.d;
        Serializable serializable = this.c;
        g5c g5cVar2 = g5c.a;
        fw2 fw2Var = null;
        switch (b) {
            case 0:
                if (rp5.a((String) obj, ((File) serializable).getName())) {
                    fl8 fl8Var = (fl8) obj2;
                    Object d = fl8Var.d(g5cVar2);
                    if (!(d instanceof fj1)) {
                        break;
                    } else {
                        Object obj3 = ((gj1) ipd.a(new ai1(fl8Var, fw2Var, (byte) 2))).a;
                        break;
                    }
                }
                break;
            default:
                Throwable th = (Throwable) obj;
                ((s73) serializable).invoke(th);
                q01 q01Var = (q01) ((c5a) obj2).d;
                q01Var.c(th, false);
                do {
                    q01Var.getClass();
                    Unsafe unsafe = ex.a;
                    long longVolatile = unsafe.getLongVolatile(q01Var, q01.y);
                    long longVolatile2 = unsafe.getLongVolatile(q01Var, q01.F);
                    if (q01Var.r(longVolatile2, true)) {
                        ej1Var = new ej1(q01Var.k());
                    } else {
                        long j = longVolatile2 & 1152921504606846975L;
                        fj1 fj1Var = gj1.b;
                        if (longVolatile < j) {
                            Object obj4 = s01.k;
                            hj1 hj1Var2 = (hj1) unsafe.getObjectVolatile(q01Var, q01.x);
                            while (true) {
                                if (q01Var.s()) {
                                    ej1Var = new ej1(q01Var.k());
                                } else {
                                    long andIncrement = q01.c.getAndIncrement(q01Var);
                                    long j2 = s01.b;
                                    long j3 = andIncrement / j2;
                                    int i = (int) (andIncrement % j2);
                                    if (hj1Var2.d != j3) {
                                        hj1 h = q01Var.h(j3, hj1Var2);
                                        if (h != null) {
                                            hj1Var = h;
                                        } else {
                                            continue;
                                        }
                                    } else {
                                        hj1Var = hj1Var2;
                                    }
                                    ej1Var = q01Var.C(hj1Var, i, andIncrement, obj4);
                                    hj1Var2 = hj1Var;
                                    if (ej1Var == s01.m) {
                                        akc akcVar = obj4 instanceof akc ? (akc) obj4 : null;
                                        if (akcVar != null) {
                                            akcVar.a(hj1Var2, i);
                                        }
                                        q01Var.F(andIncrement);
                                        hj1Var2.i();
                                    } else if (ej1Var == s01.o) {
                                        if (andIncrement < q01Var.o()) {
                                            hj1Var2.b();
                                        }
                                    } else if (ej1Var != s01.n) {
                                        hj1Var2.b();
                                    } else {
                                        sc8.j("unexpected");
                                        ej1Var = null;
                                    }
                                }
                            }
                        }
                        ej1Var = fj1Var;
                    }
                    if (ej1Var instanceof fj1) {
                        ej1Var = null;
                    }
                    if (ej1Var != null) {
                        ((d17) ej1Var).b.P(th == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th);
                        g5cVar = g5cVar2;
                    } else {
                        g5cVar = null;
                    }
                } while (g5cVar != null);
        }
        return g5cVar2;
    }
}
