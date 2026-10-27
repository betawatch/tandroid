package s2;

import a8.wd;
import b2.x;
import org.telegram.ui.Components.b10;
import q3.h;
import s3.c;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a {
    public static final a a = new a();

    public final wd a(x xVar) {
        String str = xVar.s;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new m3.b(0);
                case "application/x-icy":
                    return new p3.a();
                case "application/id3":
                    return new h(null);
                case "application/x-emsg":
                    return new m3.b(1);
                case "application/x-scte35":
                    return new c();
            }
        }
        throw new IllegalArgumentException(b10.j("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean b(x xVar) {
        String str = xVar.s;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
