package v7;

import java.util.concurrent.Future;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public abstract class q8 {
    public static Object a(Future future) {
        Object obj;
        boolean z10 = false;
        if (!future.isDone()) {
            throw new IllegalStateException(v6.a("Future was expected to be done: %s", future));
        }
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static j9.w b(Object obj) {
        return obj == null ? j9.w.b : new j9.w(obj);
    }

    public static j9.p c(j9.y yVar, d9.k kVar) {
        j9.p pVar = new j9.p();
        yVar.getClass();
        pVar.n = yVar;
        pVar.r = kVar;
        yVar.a(pVar, j9.r.a);
        return pVar;
    }
}
