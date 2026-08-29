package ta;

import java.sql.Timestamp;
import java.util.Date;
import na.u;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d extends u {
    public static final c b = new c();
    public final u a;

    public d(u uVar) {
        this.a = uVar;
    }

    @Override // na.u
    public final Object read(va.a aVar) {
        Date date = (Date) this.a.read(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // na.u
    public final void write(va.b bVar, Object obj) {
        this.a.write(bVar, (Timestamp) obj);
    }
}
