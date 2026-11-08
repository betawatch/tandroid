package v2;

import c8.ca;
import e2.u;
import t3.h;
import v3.c;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class a {
    public static final a a = new a();

    public final ca a(u uVar) {
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
        throw new IllegalArgumentException(rf.b.i("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean b(u uVar) {
        String str = uVar.s;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
