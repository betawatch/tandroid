package sa;

import java.math.BigInteger;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        } catch (NumberFormatException e6) {
            StringBuilder t6 = android.support.v4.media.a.t("Failed parsing '", v, "' as BigInteger; at path ");
            t6.append(aVar.j());
            throw new pa.j(t6.toString(), e6);
        }
    }

    @Override // pa.u
    public final void write(xa.b bVar, Object obj) {
        bVar.q((BigInteger) obj);
    }
}
