package sa;

import java.math.BigDecimal;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public class h0 extends pa.u {
    @Override // pa.u
    public final Object read(xa.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        try {
            return ra.d.i(v);
        } catch (NumberFormatException e6) {
            StringBuilder t6 = android.support.v4.media.a.t("Failed parsing '", v, "' as BigDecimal; at path ");
            t6.append(aVar.j());
            throw new pa.j(t6.toString(), e6);
        }
    }

    @Override // pa.u
    public final void write(xa.b bVar, Object obj) {
        bVar.q((BigDecimal) obj);
    }
}
