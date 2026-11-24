// default package

import java.io.File;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class wi7 extends vy5 implements rr4 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wi7(Serializable serializable, Object obj, byte b) {
        super(1);
        this.b = b;
        this.c = serializable;
        this.d = obj;
    }

    @Override // rr4
    public final Object invoke(Object obj) {
        Object mk1Var;
        pk1 pk1Var;
        g7c g7cVar;
        byte b = this.b;
        Object obj2 = this.d;
        Serializable serializable = this.c;
        g7c g7cVar2 = g7c.a;
        px2 px2Var = null;
        switch (b) {
            case 0:
                if (rr5.a((String) obj, ((File) serializable).getName())) {
                    hn8 hn8Var = (hn8) obj2;
                    Object d = hn8Var.d(g7cVar2);
                    if (!(d instanceof nk1)) {
                        break;
                    } else {
                        Object obj3 = ((ok1) lrd.a(new hj1(hn8Var, px2Var, (byte) 2))).a;
                        break;
                    }
                }
                break;
            default:
                Throwable th = (Throwable) obj;
                ((e93) serializable).invoke(th);
                y11 y11Var = (y11) ((xvc) obj2).d;
                y11Var.c(th, false);
                do {
                    y11Var.getClass();
                    Unsafe unsafe = fy.a;
                    long longVolatile = unsafe.getLongVolatile(y11Var, y11.y);
                    long longVolatile2 = unsafe.getLongVolatile(y11Var, y11.F);
                    if (y11Var.r(longVolatile2, true)) {
                        mk1Var = new mk1(y11Var.k());
                    } else {
                        long j = longVolatile2 & 1152921504606846975L;
                        nk1 nk1Var = ok1.b;
                        if (longVolatile < j) {
                            Object obj4 = a21.k;
                            pk1 pk1Var2 = (pk1) unsafe.getObjectVolatile(y11Var, y11.x);
                            while (true) {
                                if (y11Var.s()) {
                                    mk1Var = new mk1(y11Var.k());
                                } else {
                                    long andIncrement = y11.c.getAndIncrement(y11Var);
                                    long j2 = a21.b;
                                    long j3 = andIncrement / j2;
                                    int i = (int) (andIncrement % j2);
                                    if (pk1Var2.d != j3) {
                                        pk1 h = y11Var.h(j3, pk1Var2);
                                        if (h != null) {
                                            pk1Var = h;
                                        } else {
                                            continue;
                                        }
                                    } else {
                                        pk1Var = pk1Var2;
                                    }
                                    mk1Var = y11Var.C(pk1Var, i, andIncrement, obj4);
                                    pk1Var2 = pk1Var;
                                    if (mk1Var == a21.m) {
                                        amc amcVar = obj4 instanceof amc ? (amc) obj4 : null;
                                        if (amcVar != null) {
                                            amcVar.a(pk1Var2, i);
                                        }
                                        y11Var.F(andIncrement);
                                        pk1Var2.i();
                                    } else if (mk1Var == a21.o) {
                                        if (andIncrement < y11Var.o()) {
                                            pk1Var2.b();
                                        }
                                    } else if (mk1Var != a21.n) {
                                        pk1Var2.b();
                                    } else {
                                        dq9.m("unexpected");
                                        mk1Var = null;
                                    }
                                }
                            }
                        }
                        mk1Var = nk1Var;
                    }
                    if (mk1Var instanceof nk1) {
                        mk1Var = null;
                    }
                    if (mk1Var != null) {
                        ((d37) mk1Var).b.P(th == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th);
                        g7cVar = g7cVar2;
                    } else {
                        g7cVar = null;
                    }
                } while (g7cVar != null);
        }
        return g7cVar2;
    }
}
