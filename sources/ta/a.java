package ta;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import na.g;
import na.j;
import na.u;
import na.v;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a extends u {
    public static final a b = new a();
    public final SimpleDateFormat a;

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public class a implements v {
        @Override // na.v
        public final u create(g gVar, ua.a aVar) {
            if (aVar.a == Date.class) {
                return new a(0);
            }
            return null;
        }
    }

    public /* synthetic */ a(int i10) {
        this();
    }

    @Override // na.u
    public final Object read(va.a aVar) {
        Date date;
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        synchronized (this) {
            TimeZone timeZone = this.a.getTimeZone();
            try {
                try {
                    date = new Date(this.a.parse(v).getTime());
                } catch (ParseException e10) {
                    throw new j("Failed parsing '" + v + "' as SQL Date; at path " + aVar.j(), e10);
                }
            } finally {
                this.a.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // na.u
    public final void write(va.b bVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            bVar.i();
            return;
        }
        synchronized (this) {
            format = this.a.format((java.util.Date) date);
        }
        bVar.r(format);
    }

    private a() {
        this.a = new SimpleDateFormat("MMM d, yyyy");
    }
}
