package sa;

import java.sql.Timestamp;
import java.util.Date;
import ma.g;
import ma.u;
import ma.v;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class c implements v {
    @Override // ma.v
    public final u create(g gVar, ta.a aVar) {
        if (aVar.a != Timestamp.class) {
            return null;
        }
        gVar.getClass();
        return new d(gVar.b(new ta.a(Date.class)));
    }
}
