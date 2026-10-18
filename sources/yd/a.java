package yd;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class a implements b {
    public final AtomicReference a;

    public a(e eVar) {
        this.a = new AtomicReference(eVar);
    }

    @Override // yd.b
    public final Iterator iterator() {
        b bVar = (b) this.a.getAndSet(null);
        if (bVar != null) {
            return bVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
