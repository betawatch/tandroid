package pa;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class e1 extends ma.u {
    @Override // ma.u
    public final Object read(ua.a aVar) {
        try {
            return new AtomicInteger(aVar.p());
        } catch (NumberFormatException e9) {
            throw new ma.j(e9);
        }
    }

    @Override // ma.u
    public final void write(ua.b bVar, Object obj) {
        bVar.o(((AtomicInteger) obj).get());
    }
}
