package r9;

import bi.w2;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class l implements na.b, na.a {
    public final HashMap a = new HashMap();
    public ArrayDeque b = new ArrayDeque();
    public final Executor c;

    public l(Executor executor) {
        this.c = executor;
    }

    public final void a(w2 w2Var) {
        Executor executor = this.c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.a.containsKey(l9.b.class)) {
                    this.a.put(l9.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.a.get(l9.b.class)).put(w2Var, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
