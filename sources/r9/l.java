package r9;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class l implements na.b, na.a {
    public final HashMap a = new HashMap();
    public ArrayDeque b = new ArrayDeque();
    public final Executor c;

    public l(Executor executor) {
        this.c = executor;
    }

    public final void a(c3.m mVar) {
        Executor executor = this.c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.a.containsKey(l9.b.class)) {
                    this.a.put(l9.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.a.get(l9.b.class)).put(mVar, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
