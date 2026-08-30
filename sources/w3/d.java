package w3;

import com.google.android.gms.common.api.internal.w;
import j3.r1;
import java.io.StringReader;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import s8.i0;
import s8.l;
import s8.t;
import s8.v;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        if (!h5.a.z(newPullParser, "x:xmpmeta")) {
            throw r1.a("Couldn't find xmp metadata", null);
        }
        t tVar = v.b;
        i0 i0Var = i0.e;
        long j10 = -9223372036854775807L;
        loop0: while (true) {
            newPullParser.next();
            if (h5.a.z(newPullParser, "rdf:Description")) {
                int i10 = 0;
                while (true) {
                    if (i10 >= 4) {
                        break loop0;
                    }
                    String t6 = h5.a.t(newPullParser, a[i10]);
                    if (t6 == null) {
                        i10++;
                    } else {
                        if (Integer.parseInt(t6) != 1) {
                            break;
                        }
                        int i11 = 0;
                        while (true) {
                            if (i11 >= 4) {
                                break;
                            }
                            String t9 = h5.a.t(newPullParser, b[i11]);
                            if (t9 != null) {
                                j10 = Long.parseLong(t9);
                            } else {
                                i11++;
                            }
                        }
                        j10 = -9223372036854775807L;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= 2) {
                                t tVar2 = v.b;
                                i0Var = i0.e;
                                break;
                            }
                            String t10 = h5.a.t(newPullParser, c[i12]);
                            if (t10 != null) {
                                Object[] objArr = {new b("image/jpeg", 0L, 0L, "Primary"), new b("video/mp4", Long.parseLong(t10), 0L, "MotionPhoto")};
                                l.b(2, objArr);
                                i0Var = v.s(2, objArr);
                                break;
                            }
                            i12++;
                        }
                    }
                }
            } else if (h5.a.z(newPullParser, "Container:Directory")) {
                i0Var = b(newPullParser, "Container", "Item");
            } else if (h5.a.z(newPullParser, "GContainer:Directory")) {
                i0Var = b(newPullParser, "GContainer", "GContainerItem");
            }
            if (h5.a.y(newPullParser, "x:xmpmeta")) {
                if (!i0Var.isEmpty()) {
                    return new f2.c(j10, i0Var, 10);
                }
            }
        }
        return null;
    }

    public static i0 b(XmlPullParser xmlPullParser, String str, String str2) {
        t tVar = v.b;
        l.c(4, "initialCapacity");
        Object[] objArr = new Object[4];
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        int i10 = 0;
        boolean z4 = false;
        do {
            xmlPullParser.next();
            if (h5.a.z(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String t6 = h5.a.t(xmlPullParser, concat3);
                String t9 = h5.a.t(xmlPullParser, concat4);
                String t10 = h5.a.t(xmlPullParser, concat5);
                String t11 = h5.a.t(xmlPullParser, concat6);
                if (t6 == null || t9 == null) {
                    return i0.e;
                }
                b bVar = new b(t6, t10 != null ? Long.parseLong(t10) : 0L, t11 != null ? Long.parseLong(t11) : 0L, t9);
                int i11 = i10 + 1;
                if (objArr.length < i11) {
                    objArr = Arrays.copyOf(objArr, w.g(objArr.length, i11));
                } else {
                    if (z4) {
                        objArr = (Object[]) objArr.clone();
                    }
                    objArr[i10] = bVar;
                    i10++;
                }
                z4 = false;
                objArr[i10] = bVar;
                i10++;
            }
        } while (!h5.a.y(xmlPullParser, concat2));
        return v.s(i10, objArr);
    }
}
