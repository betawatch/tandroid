package wd;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
