package ra;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import la.g;
import la.j;
import la.u;
import la.v;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b extends u {
    public static final a b = new a();
    public final SimpleDateFormat a;

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public class a implements v {
        @Override // la.v
        public final u create(g gVar, sa.a aVar) {
            if (aVar.a == Time.class) {
                return new b(0);
            }
            return null;
        }
    }

    public /* synthetic */ b(int i9) {
        this();
    }

    @Override // la.u
    public final Object read(ta.a aVar) {
        Time time;
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        synchronized (this) {
            TimeZone timeZone = this.a.getTimeZone();
            try {
                try {
                    time = new Time(this.a.parse(v).getTime());
                } catch (ParseException e10) {
                    throw new j("Failed parsing '" + v + "' as SQL Time; at path " + aVar.j(), e10);
                }
            } finally {
                this.a.setTimeZone(timeZone);
            }
        }
        return time;
    }

    @Override // la.u
    public final void write(ta.c cVar, Object obj) {
        String format;
        Time time = (Time) obj;
        if (time == null) {
            cVar.i();
            return;
        }
        synchronized (this) {
            format = this.a.format((Date) time);
        }
        cVar.r(format);
    }

    private b() {
        this.a = new SimpleDateFormat("hh:mm:ss a");
    }
}
