package u2;

import b8.te;
import d2.v;
import s3.h;
import u3.c;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a {
    public static final a a = new a();

    public final te a(v vVar) {
        String str = vVar.s;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new o3.b(0);
                case "application/x-icy":
                    return new r3.a();
                case "application/id3":
                    return new h(null);
                case "application/x-emsg":
                    return new o3.b(1);
                case "application/x-scte35":
                    return new c();
            }
        }
        throw new IllegalArgumentException(t4.c.f("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean b(v vVar) {
        String str = vVar.s;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
