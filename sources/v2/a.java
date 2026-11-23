package v2;

import c8.da;
import e2.u;
import t3.h;
import v3.c;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class a {
    public static final a a = new a();

    public final da a(u uVar) {
        String str = uVar.s;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new p3.b(0);
                case "application/x-icy":
                    return new s3.a();
                case "application/id3":
                    return new h(null);
                case "application/x-emsg":
                    return new p3.b(1);
                case "application/x-scte35":
                    return new c();
            }
        }
        throw new IllegalArgumentException(p5.c.k("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean b(u uVar) {
        String str = uVar.s;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
