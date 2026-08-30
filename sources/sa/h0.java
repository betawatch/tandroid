package sa;

import java.math.BigDecimal;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        } catch (NumberFormatException e) {
            StringBuilder t6 = android.support.v4.media.a.t("Failed parsing '", v, "' as BigDecimal; at path ");
            t6.append(aVar.j());
            throw new pa.j(t6.toString(), e);
        }
    }

    @Override // pa.u
    public final void write(xa.b bVar, Object obj) {
        bVar.q((BigDecimal) obj);
    }
}
