package sa;

import java.util.Currency;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
