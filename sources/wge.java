// default package

import java.util.concurrent.CancellationException;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class wge {
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
    public static final Object a(ik4 ik4Var, fl8 fl8Var, boolean z, gw2 gw2Var) {
        jk4 jk4Var;
        int i;
        p01 p01Var;
        p01 p01Var2;
        ik4 ik4Var2;
        try {
            if (gw2Var instanceof jk4) {
                jk4Var = (jk4) gw2Var;
                int i2 = jk4Var.f;
                if ((i2 & TLObject.FLAG_31) != 0) {
                    jk4Var.f = i2 - TLObject.FLAG_31;
                    Object obj = jk4Var.e;
                    i = jk4Var.f;
                    bx2 bx2Var = bx2.a;
                    if (i != 0) {
                        qse.b(obj);
                        if (ik4Var instanceof inb) {
                            throw ((inb) ik4Var).a;
                        }
                        q01 q01Var = fl8Var.e;
                        q01Var.getClass();
                        p01Var = new p01(q01Var);
                        jk4Var.a = ik4Var;
                        jk4Var.b = fl8Var;
                        jk4Var.c = p01Var;
                        jk4Var.d = z;
                        jk4Var.f = 1;
                        obj = p01Var.b(jk4Var);
                        if (obj != bx2Var) {
                        }
                        return bx2Var;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            sc8.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = jk4Var.d;
                        p01Var2 = jk4Var.c;
                        fl8Var = jk4Var.b;
                        ik4Var2 = jk4Var.a;
                        qse.b(obj);
                        ik4 ik4Var3 = ik4Var2;
                        p01Var = p01Var2;
                        ik4Var = ik4Var3;
                        jk4Var.a = ik4Var;
                        jk4Var.b = fl8Var;
                        jk4Var.c = p01Var;
                        jk4Var.d = z;
                        jk4Var.f = 1;
                        obj = p01Var.b(jk4Var);
                        if (obj != bx2Var) {
                            p01 p01Var3 = p01Var;
                            ik4Var2 = ik4Var;
                            p01Var2 = p01Var3;
                            if (!((Boolean) obj).booleanValue()) {
                                if (z) {
                                    fl8Var.cancel(null);
                                }
                                return g5c.a;
                            }
                            Object obj2 = p01Var2.a;
                            lo5 lo5Var = s01.p;
                            if (obj2 == lo5Var) {
                                throw new IllegalStateException("`hasNext()` has not been invoked");
                            }
                            p01Var2.a = lo5Var;
                            if (obj2 == s01.l) {
                                Throwable l = p01Var2.c.l();
                                int i3 = oma.a;
                                throw l;
                            }
                            jk4Var.a = ik4Var2;
                            jk4Var.b = fl8Var;
                            jk4Var.c = p01Var2;
                            jk4Var.d = z;
                            jk4Var.f = 2;
                        }
                        return bx2Var;
                    }
                    z = jk4Var.d;
                    p01Var2 = jk4Var.c;
                    fl8Var = jk4Var.b;
                    ik4Var2 = jk4Var.a;
                    qse.b(obj);
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
                    fl8Var.cancel(cancellationException);
                }
                throw th2;
            }
        }
        jk4Var = new jk4(gw2Var);
        Object obj3 = jk4Var.e;
        i = jk4Var.f;
        bx2 bx2Var2 = bx2.a;
    }
}
