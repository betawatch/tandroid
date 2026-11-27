// default package

import java.util.concurrent.CancellationException;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class tle {
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
    public static final Object a(nm4 nm4Var, so8 so8Var, boolean z, ax2 ax2Var) {
        om4 om4Var;
        int i;
        y01 y01Var;
        y01 y01Var2;
        nm4 nm4Var2;
        try {
            if (ax2Var instanceof om4) {
                om4Var = (om4) ax2Var;
                int i2 = om4Var.f;
                if ((i2 & TLObject.FLAG_31) != 0) {
                    om4Var.f = i2 - TLObject.FLAG_31;
                    Object obj = om4Var.e;
                    i = om4Var.f;
                    vx2 vx2Var = vx2.a;
                    if (i != 0) {
                        ixe.b(obj);
                        if (nm4Var instanceof irb) {
                            throw ((irb) nm4Var).a;
                        }
                        z01 z01Var = so8Var.e;
                        z01Var.getClass();
                        y01Var = new y01(z01Var);
                        om4Var.a = nm4Var;
                        om4Var.b = so8Var;
                        om4Var.c = y01Var;
                        om4Var.d = z;
                        om4Var.f = 1;
                        obj = y01Var.b(om4Var);
                        if (obj != vx2Var) {
                        }
                        return vx2Var;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            grb.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = om4Var.d;
                        y01Var2 = om4Var.c;
                        so8Var = om4Var.b;
                        nm4Var2 = om4Var.a;
                        ixe.b(obj);
                        nm4 nm4Var3 = nm4Var2;
                        y01Var = y01Var2;
                        nm4Var = nm4Var3;
                        om4Var.a = nm4Var;
                        om4Var.b = so8Var;
                        om4Var.c = y01Var;
                        om4Var.d = z;
                        om4Var.f = 1;
                        obj = y01Var.b(om4Var);
                        if (obj != vx2Var) {
                            y01 y01Var3 = y01Var;
                            nm4Var2 = nm4Var;
                            y01Var2 = y01Var3;
                            if (!((Boolean) obj).booleanValue()) {
                                if (z) {
                                    so8Var.cancel(null);
                                }
                                return f9c.a;
                            }
                            Object obj2 = y01Var2.a;
                            ow5 ow5Var = b11.p;
                            if (obj2 == ow5Var) {
                                throw new IllegalStateException("`hasNext()` has not been invoked");
                            }
                            y01Var2.a = ow5Var;
                            if (obj2 == b11.l) {
                                Throwable l = y01Var2.c.l();
                                int i3 = lqa.a;
                                throw l;
                            }
                            om4Var.a = nm4Var2;
                            om4Var.b = so8Var;
                            om4Var.c = y01Var2;
                            om4Var.d = z;
                            om4Var.f = 2;
                        }
                        return vx2Var;
                    }
                    z = om4Var.d;
                    y01Var2 = om4Var.c;
                    so8Var = om4Var.b;
                    nm4Var2 = om4Var.a;
                    ixe.b(obj);
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
                    so8Var.cancel(cancellationException);
                }
                throw th2;
            }
        }
        om4Var = new om4(ax2Var);
        Object obj3 = om4Var.e;
        i = om4Var.f;
        vx2 vx2Var2 = vx2.a;
    }
}
