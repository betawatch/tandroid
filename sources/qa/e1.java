package qa;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class e1 extends na.u {
    @Override // na.u
    public final Object read(va.a aVar) {
        try {
            return new AtomicInteger(aVar.p());
        } catch (NumberFormatException e10) {
            throw new na.j(e10);
        }
    }

    @Override // na.u
    public final void write(va.b bVar, Object obj) {
        bVar.o(((AtomicInteger) obj).get());
    }
}
