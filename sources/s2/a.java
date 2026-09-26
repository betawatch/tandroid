package s2;

import b2.s;
import q3.i;
import s3.c;
import v7.j;
import w7.m;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class a {
    public static final a a = new a();

    public final m a(s sVar) {
        String str = sVar.r;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new m3.b(0);
                case "application/x-icy":
                    return new p3.a();
                case "application/id3":
                    return new i(null);
                case "application/x-emsg":
                    return new m3.b(1);
                case "application/x-scte35":
                    return new c();
            }
        }
        throw new IllegalArgumentException(j.g("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean b(s sVar) {
        String str = sVar.r;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
