package pa;

import java.math.BigDecimal;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class h0 extends ma.u {
    @Override // ma.u
    public final Object read(ua.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        try {
            return oa.d.i(v);
        } catch (NumberFormatException e9) {
            StringBuilder r10 = a9.p.r("Failed parsing '", v, "' as BigDecimal; at path ");
            r10.append(aVar.j());
            throw new ma.j(r10.toString(), e9);
        }
    }

    @Override // ma.u
    public final void write(ua.b bVar, Object obj) {
        bVar.q((BigDecimal) obj);
    }
}
