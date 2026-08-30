package sa;

import java.util.Currency;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class r0 extends pa.u {
    @Override // pa.u
    public final Object read(xa.a aVar) {
        String v = aVar.v();
        try {
            return Currency.getInstance(v);
        } catch (IllegalArgumentException e) {
            StringBuilder t6 = android.support.v4.media.a.t("Failed parsing '", v, "' as Currency; at path ");
            t6.append(aVar.j());
            throw new pa.j(t6.toString(), e);
        }
    }

    @Override // pa.u
    public final void write(xa.b bVar, Object obj) {
        bVar.r(((Currency) obj).getCurrencyCode());
    }
}
