package zd;

import ae.j;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a implements b {
    public final AtomicReference a;

    public a(j jVar) {
        this.a = new AtomicReference(jVar);
    }

    @Override // zd.b
    public final Iterator iterator() {
        b bVar = (b) this.a.getAndSet(null);
        if (bVar != null) {
            return bVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
