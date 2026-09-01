package sa;

import java.util.Currency;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public class r0 extends pa.u {
    @Override // pa.u
    public final Object read(xa.a aVar) {
        String v = aVar.v();
        try {
            return Currency.getInstance(v);
        } catch (IllegalArgumentException e6) {
            StringBuilder t6 = android.support.v4.media.a.t("Failed parsing '", v, "' as Currency; at path ");
            t6.append(aVar.j());
            throw new pa.j(t6.toString(), e6);
        }
    }

    @Override // pa.u
    public final void write(xa.b bVar, Object obj) {
        bVar.r(((Currency) obj).getCurrencyCode());
    }
}
