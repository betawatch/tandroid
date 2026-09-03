package va;

import java.sql.Timestamp;
import java.util.Date;
import pa.g;
import pa.u;
import pa.v;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
