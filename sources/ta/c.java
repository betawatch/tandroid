package ta;

import java.sql.Timestamp;
import java.util.Date;
import na.g;
import na.u;
import na.v;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class c implements v {
    @Override // na.v
    public final u create(g gVar, ua.a aVar) {
        if (aVar.a != Timestamp.class) {
            return null;
        }
        gVar.getClass();
        return new d(gVar.b(new ua.a(Date.class)));
    }
}
