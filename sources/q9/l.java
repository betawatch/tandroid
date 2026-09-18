package q9;

import ai.w1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class l implements ma.b, ma.a {
    public final HashMap a = new HashMap();
    public ArrayDeque b = new ArrayDeque();
    public final Executor c;

    public l(Executor executor) {
        this.c = executor;
    }

    public final void a(w1 w1Var) {
        Executor executor = this.c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.a.containsKey(k9.b.class)) {
                    this.a.put(k9.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.a.get(k9.b.class)).put(w1Var, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
