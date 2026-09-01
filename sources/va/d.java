package va;

import java.sql.Timestamp;
import java.util.Date;
import pa.u;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class d extends u {
    public static final c b = new c();
    public final u a;

    public d(u uVar) {
        this.a = uVar;
    }

    @Override // pa.u
    public final Object read(xa.a aVar) {
        Date date = (Date) this.a.read(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // pa.u
    public final void write(xa.b bVar, Object obj) {
        this.a.write(bVar, (Timestamp) obj);
    }
}
