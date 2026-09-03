package sa;

import java.util.UUID;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        } catch (IllegalArgumentException e) {
            StringBuilder t6 = android.support.v4.media.a.t("Failed parsing '", v, "' as UUID; at path ");
            t6.append(aVar.j());
            throw new pa.j(t6.toString(), e);
        }
    }

    @Override // pa.u
    public final void write(xa.b bVar, Object obj) {
        UUID uuid = (UUID) obj;
        bVar.r(uuid == null ? null : uuid.toString());
    }
}
