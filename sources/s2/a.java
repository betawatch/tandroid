package s2;

import b2.x;
import q3.i;
import s3.c;
import sc.e;
import w7.l;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class a {
    public static final a a = new a();

    public final l a(x xVar) {
        String str = xVar.s;
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
        throw new IllegalArgumentException(e.h("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean b(x xVar) {
        String str = xVar.s;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
