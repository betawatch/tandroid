package v7;

import java.util.concurrent.Future;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class p8 {
    public static Object a(Future future) {
        Object obj;
        boolean z10 = false;
        if (!future.isDone()) {
            throw new IllegalStateException(u6.a("Future was expected to be done: %s", future));
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
