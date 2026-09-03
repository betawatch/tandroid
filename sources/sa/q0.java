package sa;

import java.util.UUID;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class q0 extends pa.u {
    @Override // pa.u
    public final Object read(xa.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        try {
            return UUID.fromString(v);
        } catch (IllegalArgumentException e6) {
            StringBuilder t6 = android.support.v4.media.a.t("Failed parsing '", v, "' as UUID; at path ");
            t6.append(aVar.j());
            throw new pa.j(t6.toString(), e6);
        }
    }

    @Override // pa.u
    public final void write(xa.b bVar, Object obj) {
        UUID uuid = (UUID) obj;
        bVar.r(uuid == null ? null : uuid.toString());
    }
}
