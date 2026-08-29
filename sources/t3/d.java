package t3;

import j3.t1;
import java.io.StringReader;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import q8.l;
import q8.l0;
import q8.w;
import q8.x;
import q8.z;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class d {
    public static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r6 == (-1)) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f2.c a(String str) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (!f5.a.z(newPullParser, "x:xmpmeta")) {
            throw t1.a("Couldn't find xmp metadata", null);
        }
        x xVar = z.b;
        l0 l0Var = l0.e;
        long j10 = -9223372036854775807L;
        loop0: while (true) {
            newPullParser.next();
            if (f5.a.z(newPullParser, "rdf:Description")) {
                int i10 = 0;
                while (true) {
                    if (i10 >= 4) {
                        break loop0;
                    }
                    String t10 = f5.a.t(newPullParser, a[i10]);
                    if (t10 == null) {
                        i10++;
                    } else {
                        if (Integer.parseInt(t10) != 1) {
                            break;
                        }
                        int i11 = 0;
                        while (true) {
                            if (i11 >= 4) {
                                break;
                            }
                            String t11 = f5.a.t(newPullParser, b[i11]);
                            if (t11 != null) {
                                j10 = Long.parseLong(t11);
                            } else {
                                i11++;
                            }
                        }
                        j10 = -9223372036854775807L;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= 2) {
                                x xVar2 = z.b;
                                l0Var = l0.e;
                                break;
                            }
                            String t12 = f5.a.t(newPullParser, c[i12]);
                            if (t12 != null) {
                                l0Var = z.t(new b("image/jpeg", 0L, 0L, "Primary"), new b("video/mp4", Long.parseLong(t12), 0L, "MotionPhoto"));
                                break;
                            }
                            i12++;
                        }
                    }
                }
            } else if (f5.a.z(newPullParser, "Container:Directory")) {
                l0Var = b(newPullParser, "Container", "Item");
            } else if (f5.a.z(newPullParser, "GContainer:Directory")) {
                l0Var = b(newPullParser, "GContainer", "GContainerItem");
            }
            if (f5.a.y(newPullParser, "x:xmpmeta")) {
                if (!l0Var.isEmpty()) {
                    return new f2.c(j10, l0Var, 9);
                }
            }
        }
        return null;
    }

    public static l0 b(XmlPullParser xmlPullParser, String str, String str2) {
        x xVar = z.b;
        l.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        int i10 = 0;
        do {
            xmlPullParser.next();
            if (f5.a.z(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String t10 = f5.a.t(xmlPullParser, concat3);
                String t11 = f5.a.t(xmlPullParser, concat4);
                String t12 = f5.a.t(xmlPullParser, concat5);
                String t13 = f5.a.t(xmlPullParser, concat6);
                if (t10 == null || t11 == null) {
                    return l0.e;
                }
                b bVar = new b(t10, t12 != null ? Long.parseLong(t12) : 0L, t13 != null ? Long.parseLong(t13) : 0L, t11);
                int i11 = i10 + 1;
                if (objArr.length < i11) {
                    objArr = Arrays.copyOf(objArr, w.d(objArr.length, i11));
                }
                objArr[i10] = bVar;
                i10 = i11;
            }
        } while (!f5.a.y(xmlPullParser, concat2));
        return z.s(i10, objArr);
    }
}
