package sa;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class f1 extends pa.u {
    @Override // pa.u
    public final Object read(xa.a aVar) {
        return new AtomicBoolean(aVar.n());
    }

    @Override // pa.u
    public final void write(xa.b bVar, Object obj) {
        bVar.s(((AtomicBoolean) obj).get());
    }
}
