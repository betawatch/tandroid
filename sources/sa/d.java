package sa;

import java.sql.Timestamp;
import java.util.Date;
import ma.u;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d extends u {
    public static final c b = new c();
    public final u a;

    public d(u uVar) {
        this.a = uVar;
    }

    @Override // ma.u
    public final Object read(ua.a aVar) {
        Date date = (Date) this.a.read(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // ma.u
    public final void write(ua.b bVar, Object obj) {
        this.a.write(bVar, (Timestamp) obj);
    }
}
