package va;

import java.sql.Timestamp;
import java.util.Date;
import pa.g;
import pa.u;
import pa.v;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class c implements v {
    @Override // pa.v
    public final u create(g gVar, wa.a aVar) {
        if (aVar.a != Timestamp.class) {
            return null;
        }
        gVar.getClass();
        return new d(gVar.b(new wa.a(Date.class)));
    }
}
