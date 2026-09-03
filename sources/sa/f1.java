package sa;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
