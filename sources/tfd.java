// default package

import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class tfd {
    public static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r6 == (-1)) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static vh2 a(String str) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (!q0f.c(newPullParser, "x:xmpmeta")) {
            throw bx7.a("Couldn't find xmp metadata", null);
        }
        ko5 ko5Var = mo5.b;
        y79 y79Var = y79.e;
        long j = -9223372036854775807L;
        loop0: while (true) {
            newPullParser.next();
            if (q0f.c(newPullParser, "rdf:Description")) {
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= 4) {
                        break loop0;
                    }
                    String a2 = q0f.a(newPullParser, a[i2]);
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
                            String a3 = q0f.a(newPullParser, b[i3]);
                            if (a3 != null) {
                                j = Long.parseLong(a3);
                            } else {
                                i3++;
                            }
                        }
                        j = -9223372036854775807L;
                        while (true) {
                            if (i >= 2) {
                                ko5 ko5Var2 = mo5.b;
                                y79Var = y79.e;
                                break;
                            }
                            String a4 = q0f.a(newPullParser, c[i]);
                            if (a4 != null) {
                                y79Var = mo5.v(new gh7("image/jpeg", "Primary", 0L, 0L), new gh7("video/mp4", "MotionPhoto", Long.parseLong(a4), 0L));
                                break;
                            }
                            i++;
                        }
                    }
                }
            } else if (q0f.c(newPullParser, "Container:Directory")) {
                y79Var = b(newPullParser, "Container", "Item");
            } else if (q0f.c(newPullParser, "GContainer:Directory")) {
                y79Var = b(newPullParser, "GContainer", "GContainerItem");
            }
            if (q0f.b(newPullParser, "x:xmpmeta")) {
                if (!y79Var.isEmpty()) {
                    return new vh2(j, (Object) y79Var, (byte) 3);
                }
            }
        }
        return null;
    }

    public static y79 b(XmlPullParser xmlPullParser, String str, String str2) {
        jo5 p = mo5.p();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (q0f.c(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String a2 = q0f.a(xmlPullParser, concat3);
                String a3 = q0f.a(xmlPullParser, concat4);
                String a4 = q0f.a(xmlPullParser, concat5);
                String a5 = q0f.a(xmlPullParser, concat6);
                if (a2 == null || a3 == null) {
                    return y79.e;
                }
                p.c(new gh7(a2, a3, a4 != null ? Long.parseLong(a4) : 0L, a5 != null ? Long.parseLong(a5) : 0L));
            }
        } while (!q0f.b(xmlPullParser, concat2));
        return p.f();
    }
}
