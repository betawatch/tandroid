package sa;

import java.math.BigInteger;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class i0 extends pa.u {
    @Override // pa.u
    public final Object read(xa.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        try {
            ra.d.d(v);
            return new BigInteger(v);
        } catch (NumberFormatException e) {
            StringBuilder t6 = android.support.v4.media.a.t("Failed parsing '", v, "' as BigInteger; at path ");
            t6.append(aVar.j());
            throw new pa.j(t6.toString(), e);
        }
    }

    @Override // pa.u
    public final void write(xa.b bVar, Object obj) {
        bVar.q((BigInteger) obj);
    }
}
