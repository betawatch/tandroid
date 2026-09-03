package sa;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class e1 extends pa.u {
    @Override // pa.u
    public final Object read(xa.a aVar) {
        try {
            return new AtomicInteger(aVar.p());
        } catch (NumberFormatException e) {
            throw new pa.j(e);
        }
    }

    @Override // pa.u
    public final void write(xa.b bVar, Object obj) {
        bVar.o(((AtomicInteger) obj).get());
    }
}
