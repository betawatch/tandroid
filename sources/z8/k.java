package z8;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class k implements v9.b, v9.a {
    public final HashMap a = new HashMap();
    public ArrayDeque b = new ArrayDeque();
    public final Executor c;

    public k(Executor executor) {
        this.c = executor;
    }

    public final void a(a9.m mVar) {
        Executor executor = this.c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.a.containsKey(t8.b.class)) {
                    this.a.put(t8.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.a.get(t8.b.class)).put(mVar, executor);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
