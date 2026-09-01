package sa;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
