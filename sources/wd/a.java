package wd;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final class a implements b {
    public final AtomicReference a;

    public a(e eVar) {
        this.a = new AtomicReference(eVar);
    }

    @Override // wd.b
    public final Iterator iterator() {
        b bVar = (b) this.a.getAndSet(null);
        if (bVar != null) {
            return bVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
