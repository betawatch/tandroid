package ra;

import java.sql.Timestamp;
import java.util.Date;
import la.u;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d extends u {
    public static final c b = new c();
    public final u a;

    public d(u uVar) {
        this.a = uVar;
    }

    @Override // la.u
    public final Object read(ta.a aVar) {
        Date date = (Date) this.a.read(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // la.u
    public final void write(ta.c cVar, Object obj) {
        this.a.write(cVar, (Timestamp) obj);
    }
}
