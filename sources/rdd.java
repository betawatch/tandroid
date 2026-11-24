// default package

import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class rdd {
    public static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r6 == (-1)) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static hg2 a(String str) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (!oye.c(newPullParser, "x:xmpmeta")) {
            throw av7.a("Couldn't find xmp metadata", null);
        }
        km5 km5Var = mm5.b;
        w59 w59Var = w59.e;
        long j = -9223372036854775807L;
        loop0: while (true) {
            newPullParser.next();
            byte b2 = 2;
            if (oye.c(newPullParser, "rdf:Description")) {
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= 4) {
                        break loop0;
                    }
                    String a2 = oye.a(newPullParser, a[i2]);
                    if (a2 == null) {
                        i2++;
                    } else {
                        if (Integer.parseInt(a2) != 1) {
                            break;
                        }
                        int i3 = 0;
                        while (true) {
                            if (i3 >= 4) {
                                break;
                            }
                            String a3 = oye.a(newPullParser, b[i3]);
                            if (a3 != null) {
                                j = Long.parseLong(a3);
                            } else {
                                i3++;
                            }
                        }
                        j = -9223372036854775807L;
                        while (true) {
                            if (i >= 2) {
                                km5 km5Var2 = mm5.b;
                                w59Var = w59.e;
                                break;
                            }
                            String a4 = oye.a(newPullParser, c[i]);
                            if (a4 != null) {
                                w59Var = mm5.v(new df7("image/jpeg", "Primary", 0L, 0L), new df7("video/mp4", "MotionPhoto", Long.parseLong(a4), 0L));
                                break;
                            }
                            i++;
                        }
                    }
                }
            } else if (oye.c(newPullParser, "Container:Directory")) {
                w59Var = b(newPullParser, "Container", "Item");
            } else if (oye.c(newPullParser, "GContainer:Directory")) {
                w59Var = b(newPullParser, "GContainer", "GContainerItem");
            }
            if (oye.b(newPullParser, "x:xmpmeta")) {
                if (!w59Var.isEmpty()) {
                    return new hg2(j, w59Var, b2);
                }
            }
        }
        return null;
    }

    public static w59 b(XmlPullParser xmlPullParser, String str, String str2) {
        jm5 p = mm5.p();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (oye.c(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String a2 = oye.a(xmlPullParser, concat3);
                String a3 = oye.a(xmlPullParser, concat4);
                String a4 = oye.a(xmlPullParser, concat5);
                String a5 = oye.a(xmlPullParser, concat6);
                if (a2 == null || a3 == null) {
                    return w59.e;
                }
                p.c(new df7(a2, a3, a4 != null ? Long.parseLong(a4) : 0L, a5 != null ? Long.parseLong(a5) : 0L));
            }
        } while (!oye.b(xmlPullParser, concat2));
        return p.f();
    }
}
