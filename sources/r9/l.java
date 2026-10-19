package r9;

import ci.i1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class l implements na.b, na.a {
    public final HashMap a = new HashMap();
    public ArrayDeque b = new ArrayDeque();
    public final Executor c;

    public l(Executor executor) {
        this.c = executor;
    }

    public final void a(i1 i1Var) {
        Executor executor = this.c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.a.containsKey(l9.b.class)) {
                    this.a.put(l9.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.a.get(l9.b.class)).put(i1Var, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
