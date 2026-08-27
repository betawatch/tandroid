package sa;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import ma.g;
import ma.j;
import ma.u;
import ma.v;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a extends u {
    public static final a b = new a();
    public final SimpleDateFormat a;

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
    public class a implements v {
        @Override // ma.v
        public final u create(g gVar, ta.a aVar) {
            if (aVar.a == Date.class) {
                return new a(0);
            }
            return null;
        }
    }

    public /* synthetic */ a(int i10) {
        this();
    }

    @Override // ma.u
    public final Object read(ua.a aVar) {
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
                } catch (ParseException e9) {
                    throw new j("Failed parsing '" + v + "' as SQL Date; at path " + aVar.j(), e9);
                }
            } finally {
                this.a.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // ma.u
    public final void write(ua.b bVar, Object obj) {
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
