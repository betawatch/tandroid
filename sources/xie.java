// default package

import java.util.concurrent.CancellationException;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class xie {
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008b, code lost:
    
        if (r1.c(r11, r0) == r5) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071 A[Catch: all -> 0x00ab, TryCatch #0 {all -> 0x00ab, blocks: (B:12:0x002f, B:14:0x0056, B:17:0x0069, B:19:0x0071, B:21:0x0077, B:23:0x007d, B:25:0x0092, B:26:0x009a, B:28:0x009b, B:29:0x00a2, B:38:0x0041, B:41:0x004c), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x008b -> B:13:0x008e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(jm4 jm4Var, hn8 hn8Var, boolean z, qx2 qx2Var) {
        km4 km4Var;
        int i;
        x11 x11Var;
        x11 x11Var2;
        jm4 jm4Var2;
        try {
            if (qx2Var instanceof km4) {
                km4Var = (km4) qx2Var;
                int i2 = km4Var.f;
                if ((i2 & TLObject.FLAG_31) != 0) {
                    km4Var.f = i2 - TLObject.FLAG_31;
                    Object obj = km4Var.e;
                    i = km4Var.f;
                    ly2 ly2Var = ly2.a;
                    if (i != 0) {
                        tue.b(obj);
                        if (jm4Var instanceof jpb) {
                            throw ((jpb) jm4Var).a;
                        }
                        y11 y11Var = hn8Var.e;
                        y11Var.getClass();
                        x11Var = new x11(y11Var);
                        km4Var.a = jm4Var;
                        km4Var.b = hn8Var;
                        km4Var.c = x11Var;
                        km4Var.d = z;
                        km4Var.f = 1;
                        obj = x11Var.b(km4Var);
                        if (obj != ly2Var) {
                        }
                        return ly2Var;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            dq9.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = km4Var.d;
                        x11Var2 = km4Var.c;
                        hn8Var = km4Var.b;
                        jm4Var2 = km4Var.a;
                        tue.b(obj);
                        jm4 jm4Var3 = jm4Var2;
                        x11Var = x11Var2;
                        jm4Var = jm4Var3;
                        km4Var.a = jm4Var;
                        km4Var.b = hn8Var;
                        km4Var.c = x11Var;
                        km4Var.d = z;
                        km4Var.f = 1;
                        obj = x11Var.b(km4Var);
                        if (obj != ly2Var) {
                            x11 x11Var3 = x11Var;
                            jm4Var2 = jm4Var;
                            x11Var2 = x11Var3;
                            if (!((Boolean) obj).booleanValue()) {
                                if (z) {
                                    hn8Var.cancel(null);
                                }
                                return g7c.a;
                            }
                            Object obj2 = x11Var2.a;
                            du2 du2Var = a21.p;
                            if (obj2 == du2Var) {
                                throw new IllegalStateException("`hasNext()` has not been invoked");
                            }
                            x11Var2.a = du2Var;
                            if (obj2 == a21.l) {
                                Throwable l = x11Var2.c.l();
                                int i3 = poa.a;
                                throw l;
                            }
                            km4Var.a = jm4Var2;
                            km4Var.b = hn8Var;
                            km4Var.c = x11Var2;
                            km4Var.d = z;
                            km4Var.f = 2;
                        }
                        return ly2Var;
                    }
                    z = km4Var.d;
                    x11Var2 = km4Var.c;
                    hn8Var = km4Var.b;
                    jm4Var2 = km4Var.a;
                    tue.b(obj);
                    if (!((Boolean) obj).booleanValue()) {
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (z) {
                    CancellationException cancellationException = th instanceof CancellationException ? th : null;
                    if (cancellationException == null) {
                        cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                        cancellationException.initCause(th);
                    }
                    hn8Var.cancel(cancellationException);
                }
                throw th2;
            }
        }
        km4Var = new km4(qx2Var);
        Object obj3 = km4Var.e;
        i = km4Var.f;
        ly2 ly2Var2 = ly2.a;
    }
}
