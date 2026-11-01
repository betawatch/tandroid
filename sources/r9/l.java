package r9;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;
import th.m1;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class l implements na.b, na.a {
    public final HashMap a = new HashMap();
    public ArrayDeque b = new ArrayDeque();
    public final Executor c;

    public l(Executor executor) {
        this.c = executor;
    }

    public final void a(m1 m1Var) {
        Executor executor = this.c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.a.containsKey(l9.b.class)) {
                    this.a.put(l9.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.a.get(l9.b.class)).put(m1Var, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
