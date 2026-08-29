package qa;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class f1 extends na.u {
    @Override // na.u
    public final Object read(va.a aVar) {
        return new AtomicBoolean(aVar.n());
    }

    @Override // na.u
    public final void write(va.b bVar, Object obj) {
        bVar.s(((AtomicBoolean) obj).get());
    }
}
