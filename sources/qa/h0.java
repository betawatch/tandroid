package qa;

import java.math.BigDecimal;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class h0 extends na.u {
    @Override // na.u
    public final Object read(va.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        try {
            return pa.d.i(v);
        } catch (NumberFormatException e10) {
            StringBuilder s10 = a4.w.s("Failed parsing '", v, "' as BigDecimal; at path ");
            s10.append(aVar.j());
            throw new na.j(s10.toString(), e10);
        }
    }

    @Override // na.u
    public final void write(va.b bVar, Object obj) {
        bVar.q((BigDecimal) obj);
    }
}
