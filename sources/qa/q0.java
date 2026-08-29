package qa;

import java.util.UUID;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class q0 extends na.u {
    @Override // na.u
    public final Object read(va.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        try {
            return UUID.fromString(v);
        } catch (IllegalArgumentException e10) {
            StringBuilder s10 = a4.w.s("Failed parsing '", v, "' as UUID; at path ");
            s10.append(aVar.j());
            throw new na.j(s10.toString(), e10);
        }
    }

    @Override // na.u
    public final void write(va.b bVar, Object obj) {
        UUID uuid = (UUID) obj;
        bVar.r(uuid == null ? null : uuid.toString());
    }
}
