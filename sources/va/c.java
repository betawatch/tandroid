package va;

import java.sql.Timestamp;
import java.util.Date;
import pa.g;
import pa.u;
import pa.v;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
