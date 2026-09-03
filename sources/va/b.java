package va;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import pa.g;
import pa.j;
import pa.u;
import pa.v;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b extends u {
    public static final a b = new a();
    public final SimpleDateFormat a;

    /* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
    public class a implements v {
        @Override // pa.v
        public final u create(g gVar, wa.a aVar) {
            if (aVar.a == Time.class) {
                return new b(0);
            }
            return null;
        }
    }

    public /* synthetic */ b(int i10) {
        this();
    }

    @Override // pa.u
    public final Object read(xa.a aVar) {
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
                } catch (ParseException e6) {
                    throw new j("Failed parsing '" + v + "' as SQL Time; at path " + aVar.j(), e6);
                }
            } finally {
                this.a.setTimeZone(timeZone);
            }
        }
        return time;
    }

    @Override // pa.u
    public final void write(xa.b bVar, Object obj) {
        String format;
        Time time = (Time) obj;
        if (time == null) {
            bVar.i();
            return;
        }
        synchronized (this) {
            format = this.a.format((Date) time);
        }
        bVar.r(format);
    }

    private b() {
        this.a = new SimpleDateFormat("hh:mm:ss a");
    }
}
