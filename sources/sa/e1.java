package sa;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class e1 extends pa.u {
    @Override // pa.u
    public final Object read(xa.a aVar) {
        try {
            return new AtomicInteger(aVar.p());
        } catch (NumberFormatException e6) {
            throw new pa.j(e6);
        }
    }

    @Override // pa.u
    public final void write(xa.b bVar, Object obj) {
        bVar.o(((AtomicInteger) obj).get());
    }
}
