package s2;

import b2.s;
import org.telegram.ui.Cells.p6;
import q3.i;
import s3.c;
import w7.l;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class a {
    public static final a a = new a();

    public final l a(s sVar) {
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
        throw new IllegalArgumentException(p6.i("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean b(s sVar) {
        String str = sVar.r;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
