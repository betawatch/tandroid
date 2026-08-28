package z3;

import e4.i;
import g7.y8;
import h3.t0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d {
    public static final d a = new d();

    public final y8 a(t0 t0Var) {
        String str = t0Var.B;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new a4.b(0);
                case "application/x-icy":
                    return new d4.a();
                case "application/id3":
                    return new i(null);
                case "application/x-emsg":
                    return new a4.b(1);
                case "application/x-scte35":
                    return new g4.c();
            }
        }
        throw new IllegalArgumentException(ta.b.d("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean b(t0 t0Var) {
        String str = t0Var.B;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
