package pa;

import java.util.Currency;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class r0 extends ma.u {
    @Override // ma.u
    public final Object read(ua.a aVar) {
        String v = aVar.v();
        try {
            return Currency.getInstance(v);
        } catch (IllegalArgumentException e9) {
            StringBuilder r10 = a9.p.r("Failed parsing '", v, "' as Currency; at path ");
            r10.append(aVar.j());
            throw new ma.j(r10.toString(), e9);
        }
    }

    @Override // ma.u
    public final void write(ua.b bVar, Object obj) {
        bVar.r(((Currency) obj).getCurrencyCode());
    }
}
