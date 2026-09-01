package va;

import java.sql.Timestamp;
import java.util.Date;
import pa.g;
import pa.u;
import pa.v;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
