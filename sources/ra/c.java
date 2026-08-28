package ra;

import java.sql.Timestamp;
import java.util.Date;
import la.g;
import la.u;
import la.v;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class c implements v {
    @Override // la.v
    public final u create(g gVar, sa.a aVar) {
        if (aVar.a != Timestamp.class) {
            return null;
        }
        gVar.getClass();
        return new d(gVar.b(new sa.a(Date.class)));
    }
}
