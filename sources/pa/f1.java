package pa;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class f1 extends ma.u {
    @Override // ma.u
    public final Object read(ua.a aVar) {
        return new AtomicBoolean(aVar.n());
    }

    @Override // ma.u
    public final void write(ua.b bVar, Object obj) {
        bVar.s(((AtomicBoolean) obj).get());
    }
}
