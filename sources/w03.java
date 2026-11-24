// default package

import android.util.Base64;
import android.util.JsonReader;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class w03 {
    public static final lj4 a;

    static {
        qw5 qw5Var = new qw5();
        s60 s60Var = s60.a;
        qw5Var.a(s03.class, s60Var);
        qw5Var.a(a90.class, s60Var);
        a70 a70Var = a70.a;
        qw5Var.a(r03.class, a70Var);
        qw5Var.a(l90.class, a70Var);
        x60 x60Var = x60.a;
        qw5Var.a(zz2.class, x60Var);
        qw5Var.a(m90.class, x60Var);
        y60 y60Var = y60.a;
        qw5Var.a(yz2.class, y60Var);
        qw5Var.a(n90.class, y60Var);
        q70 q70Var = q70.a;
        qw5Var.a(q03.class, q70Var);
        qw5Var.a(la0.class, q70Var);
        p70 p70Var = p70.a;
        qw5Var.a(p03.class, p70Var);
        qw5Var.a(ka0.class, p70Var);
        z60 z60Var = z60.a;
        qw5Var.a(a03.class, z60Var);
        qw5Var.a(p90.class, z60Var);
        k70 k70Var = k70.a;
        qw5Var.a(o03.class, k70Var);
        qw5Var.a(r90.class, k70Var);
        b70 b70Var = b70.a;
        qw5Var.a(i03.class, b70Var);
        qw5Var.a(t90.class, b70Var);
        d70 d70Var = d70.a;
        qw5Var.a(g03.class, d70Var);
        qw5Var.a(u90.class, d70Var);
        g70 g70Var = g70.a;
        qw5Var.a(f03.class, g70Var);
        qw5Var.a(y90.class, g70Var);
        h70 h70Var = h70.a;
        qw5Var.a(e03.class, h70Var);
        qw5Var.a(aa0.class, h70Var);
        e70 e70Var = e70.a;
        qw5Var.a(c03.class, e70Var);
        qw5Var.a(w90.class, e70Var);
        q60 q60Var = q60.a;
        qw5Var.a(sz2.class, q60Var);
        qw5Var.a(d90.class, q60Var);
        p60 p60Var = p60.a;
        qw5Var.a(rz2.class, p60Var);
        qw5Var.a(e90.class, p60Var);
        v60 v60Var = v60.a;
        qw5Var.a(xz2.class, v60Var);
        qw5Var.a(i90.class, v60Var);
        w60 w60Var = w60.a;
        qw5Var.a(wz2.class, w60Var);
        qw5Var.a(j90.class, w60Var);
        f70 f70Var = f70.a;
        qw5Var.a(d03.class, f70Var);
        qw5Var.a(x90.class, f70Var);
        c70 c70Var = c70.a;
        qw5Var.a(b03.class, c70Var);
        qw5Var.a(v90.class, c70Var);
        r60 r60Var = r60.a;
        qw5Var.a(tz2.class, r60Var);
        qw5Var.a(f90.class, r60Var);
        i70 i70Var = i70.a;
        qw5Var.a(h03.class, i70Var);
        qw5Var.a(ba0.class, i70Var);
        j70 j70Var = j70.a;
        qw5Var.a(j03.class, j70Var);
        qw5Var.a(da0.class, j70Var);
        l70 l70Var = l70.a;
        qw5Var.a(k03.class, l70Var);
        qw5Var.a(ea0.class, l70Var);
        o70 o70Var = o70.a;
        qw5Var.a(n03.class, o70Var);
        qw5Var.a(ia0.class, o70Var);
        m70 m70Var = m70.a;
        qw5Var.a(m03.class, m70Var);
        qw5Var.a(ga0.class, m70Var);
        n70 n70Var = n70.a;
        qw5Var.a(l03.class, n70Var);
        qw5Var.a(ha0.class, n70Var);
        t60 t60Var = t60.a;
        qw5Var.a(vz2.class, t60Var);
        qw5Var.a(g90.class, t60Var);
        u60 u60Var = u60.a;
        qw5Var.a(uz2.class, u60Var);
        qw5Var.a(h90.class, u60Var);
        qw5Var.d = true;
        a = new lj4(qw5Var);
    }

    public static d90 a(JsonReader jsonReader) {
        c90 c90Var = new c90();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "buildIdMappingForArch":
                    c90Var.i = b(jsonReader, new a32((byte) 28));
                    break;
                case "pid":
                    c90Var.a = jsonReader.nextInt();
                    c90Var.j = (byte) (c90Var.j | 1);
                    break;
                case "pss":
                    c90Var.e = jsonReader.nextLong();
                    c90Var.j = (byte) (c90Var.j | 8);
                    break;
                case "rss":
                    c90Var.f = jsonReader.nextLong();
                    c90Var.j = (byte) (c90Var.j | 16);
                    break;
                case "timestamp":
                    c90Var.g = jsonReader.nextLong();
                    c90Var.j = (byte) (c90Var.j | 32);
                    break;
                case "processName":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        gxc.d("Null processName");
                        return null;
                    }
                    c90Var.b = nextString;
                    break;
                case "reasonCode":
                    c90Var.c = jsonReader.nextInt();
                    c90Var.j = (byte) (c90Var.j | 2);
                    break;
                case "traceFile":
                    c90Var.h = jsonReader.nextString();
                    break;
                case "importance":
                    c90Var.d = jsonReader.nextInt();
                    c90Var.j = (byte) (c90Var.j | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c90Var.a();
    }

    public static List b(JsonReader jsonReader, v03 v03Var) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(v03Var.a(jsonReader));
        }
        jsonReader.endArray();
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static f90 c(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals("key")) {
                str = jsonReader.nextString();
                if (str == null) {
                    gxc.d("Null key");
                    return null;
                }
            } else if (nextName.equals("value")) {
                str2 = jsonReader.nextString();
                if (str2 == null) {
                    gxc.d("Null value");
                    return null;
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (str != null && str2 != null) {
            return new f90(str, str2);
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            sb.append(" key");
        }
        if (str2 == null) {
            sb.append(" value");
        }
        dq9.m(ts2.n("Missing required properties:", sb));
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0287, code lost:
    
        if (r5 != null) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0289, code lost:
    
        r0.append(" name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x028e, code lost:
    
        if (r6 != null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0290, code lost:
    
        r0.append(" code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0296, code lost:
    
        if ((r4 & 1) != 0) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0298, code lost:
    
        r0.append(" address");
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x029d, code lost:
    
        dq9.m(ts2.n("Missing required properties:", r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02cc, code lost:
    
        r0 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x02d1, code lost:
    
        if (r26 != null) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02d3, code lost:
    
        r0.append(" signal");
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02d8, code lost:
    
        if (r27 != 0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x02da, code lost:
    
        r0.append(" binaries");
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02df, code lost:
    
        dq9.m(ts2.n("Missing required properties:", r0));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v1, types: [r90] */
    /* JADX WARN: Type inference failed for: r23v1, types: [w90] */
    /* JADX WARN: Type inference failed for: r23v10 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r23v7 */
    /* JADX WARN: Type inference failed for: r23v8 */
    /* JADX WARN: Type inference failed for: r23v9 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [sz2] */
    /* JADX WARN: Type inference failed for: r24v2, types: [d90] */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r25v1, types: [xz2] */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r25v9 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r27v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static r90 d(JsonReader jsonReader) {
        char c;
        char c2;
        byte b;
        byte b2;
        byte b3;
        byte b4;
        byte b5;
        q90 q90Var = new q90();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            byte b6 = 2;
            byte b7 = 0;
            byte b8 = 1;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -259312414:
                    if (nextName.equals("rollouts")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3575610:
                    if (nextName.equals(TeXSymbolParser.TYPE_ATTR)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            Object obj = null;
            switch (c) {
                case 0:
                    ca0 ca0Var = new ca0();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        switch (nextName2.hashCode()) {
                            case -1708606089:
                                if (nextName2.equals("batteryLevel")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1455558134:
                                if (nextName2.equals("batteryVelocity")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1439500848:
                                if (nextName2.equals("orientation")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 279795450:
                                if (nextName2.equals("diskUsed")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 976541947:
                                if (nextName2.equals("ramUsed")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1516795582:
                                if (nextName2.equals("proximityOn")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                                ca0Var.a = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case 1:
                                ca0Var.b = jsonReader.nextInt();
                                ca0Var.g = (byte) (ca0Var.g | 1);
                                break;
                            case 2:
                                ca0Var.d = jsonReader.nextInt();
                                ca0Var.g = (byte) (ca0Var.g | 4);
                                break;
                            case 3:
                                ca0Var.f = jsonReader.nextLong();
                                ca0Var.g = (byte) (ca0Var.g | 16);
                                break;
                            case 4:
                                ca0Var.e = jsonReader.nextLong();
                                ca0Var.g = (byte) (ca0Var.g | 8);
                                break;
                            case 5:
                                ca0Var.c = jsonReader.nextBoolean();
                                ca0Var.g = (byte) (ca0Var.g | 2);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    q90Var.d = ca0Var.a();
                    break;
                case 1:
                    jsonReader.beginObject();
                    List list = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        if (nextName3.equals("assignments")) {
                            list = b(jsonReader, new u03(b7));
                            if (list == null) {
                                gxc.d("Null rolloutAssignments");
                                return null;
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (list == null) {
                        dq9.m("Missing required properties: rolloutAssignments");
                        return null;
                    }
                    q90Var.f = new ia0(list);
                    break;
                case 2:
                    jsonReader.beginObject();
                    u90 u90Var = null;
                    List list2 = null;
                    List list3 = null;
                    Boolean bool = null;
                    ba0 ba0Var = null;
                    List list4 = null;
                    boolean z = false;
                    int i = 0;
                    while (true) {
                        ?? r19 = obj;
                        if (!jsonReader.hasNext()) {
                            jsonReader.endObject();
                            if (z && u90Var != null) {
                                q90Var.c = new t90(u90Var, list2, list3, bool, ba0Var, list4, i);
                                break;
                            } else {
                                StringBuilder sb = new StringBuilder();
                                if (u90Var == null) {
                                    sb.append(" execution");
                                }
                                if (!z) {
                                    sb.append(" uiOrientation");
                                }
                                dq9.m(ts2.n("Missing required properties:", sb));
                                return r19;
                            }
                        } else {
                            String nextName4 = jsonReader.nextName();
                            nextName4.getClass();
                            switch (nextName4.hashCode()) {
                                case -1405314732:
                                    if (nextName4.equals("appProcessDetails")) {
                                        b = 0;
                                        break;
                                    }
                                    b = -1;
                                    break;
                                case -1332194002:
                                    if (nextName4.equals("background")) {
                                        b = 1;
                                        break;
                                    }
                                    b = -1;
                                    break;
                                case -1090974952:
                                    if (nextName4.equals("execution")) {
                                        b = b6;
                                        break;
                                    }
                                    b = -1;
                                    break;
                                case -80231855:
                                    if (nextName4.equals("internalKeys")) {
                                        b = 3;
                                        break;
                                    }
                                    b = -1;
                                    break;
                                case 555169704:
                                    if (nextName4.equals("customAttributes")) {
                                        b = 4;
                                        break;
                                    }
                                    b = -1;
                                    break;
                                case 928737948:
                                    if (nextName4.equals("uiOrientation")) {
                                        b = 5;
                                        break;
                                    }
                                    b = -1;
                                    break;
                                case 1847730860:
                                    if (nextName4.equals("currentProcessDetails")) {
                                        b = 6;
                                        break;
                                    }
                                    b = -1;
                                    break;
                                default:
                                    b = -1;
                                    break;
                            }
                            switch (b) {
                                case 0:
                                    b2 = b6;
                                    ArrayList arrayList = new ArrayList();
                                    jsonReader.beginArray();
                                    while (jsonReader.hasNext()) {
                                        arrayList.add(g(jsonReader));
                                    }
                                    jsonReader.endArray();
                                    list4 = DesugarCollections.unmodifiableList(arrayList);
                                    obj = r19;
                                    b6 = b2;
                                case 1:
                                    b2 = b6;
                                    bool = Boolean.valueOf(jsonReader.nextBoolean());
                                    obj = r19;
                                    b6 = b2;
                                case 2:
                                    jsonReader.beginObject();
                                    List list5 = r19;
                                    List list6 = list5;
                                    ?? r24 = list6;
                                    x90 x90Var = r24;
                                    x90 x90Var2 = x90Var;
                                    ?? r27 = x90Var2;
                                    ?? r23 = list6;
                                    ?? r25 = x90Var;
                                    while (jsonReader.hasNext()) {
                                        String nextName5 = jsonReader.nextName();
                                        nextName5.getClass();
                                        switch (nextName5.hashCode()) {
                                            case -1375141843:
                                                if (nextName5.equals("appExitInfo")) {
                                                    b3 = 0;
                                                    break;
                                                }
                                                b3 = -1;
                                                break;
                                            case -1337936983:
                                                if (nextName5.equals("threads")) {
                                                    b3 = 1;
                                                    break;
                                                }
                                                b3 = -1;
                                                break;
                                            case -902467928:
                                                if (nextName5.equals("signal")) {
                                                    b3 = b6;
                                                    break;
                                                }
                                                b3 = -1;
                                                break;
                                            case 937615455:
                                                if (nextName5.equals("binaries")) {
                                                    b3 = 3;
                                                    break;
                                                }
                                                b3 = -1;
                                                break;
                                            case 1467719157:
                                                if (nextName5.equals("profilingManagerInfo")) {
                                                    b3 = 4;
                                                    break;
                                                }
                                                b3 = -1;
                                                break;
                                            case 1481625679:
                                                if (nextName5.equals("exception")) {
                                                    b3 = 5;
                                                    break;
                                                }
                                                b3 = -1;
                                                break;
                                            default:
                                                b3 = -1;
                                                break;
                                        }
                                        switch (b3) {
                                            case 0:
                                                b4 = b6;
                                                r24 = a(jsonReader);
                                                b6 = b4;
                                                r23 = r23;
                                                r25 = r25;
                                                r27 = r27;
                                            case 1:
                                                b4 = b6;
                                                list5 = b(jsonReader, new u03(b8));
                                                b6 = b4;
                                                r23 = r23;
                                                r25 = r25;
                                                r27 = r27;
                                            case 2:
                                                jsonReader.beginObject();
                                                long j = 0;
                                                byte b9 = 0;
                                                String str = r19;
                                                String str2 = str;
                                                while (jsonReader.hasNext()) {
                                                    String nextName6 = jsonReader.nextName();
                                                    nextName6.getClass();
                                                    byte b10 = b6;
                                                    switch (nextName6.hashCode()) {
                                                        case -1147692044:
                                                            if (nextName6.equals("address")) {
                                                                b5 = 0;
                                                                break;
                                                            }
                                                            b5 = -1;
                                                            break;
                                                        case 3059181:
                                                            if (nextName6.equals("code")) {
                                                                b5 = 1;
                                                                break;
                                                            }
                                                            b5 = -1;
                                                            break;
                                                        case 3373707:
                                                            if (nextName6.equals("name")) {
                                                                b5 = b10;
                                                                break;
                                                            }
                                                            b5 = -1;
                                                            break;
                                                        default:
                                                            b5 = -1;
                                                            break;
                                                    }
                                                    switch (b5) {
                                                        case 0:
                                                            b9 = (byte) (b9 | 1);
                                                            j = jsonReader.nextLong();
                                                            break;
                                                        case 1:
                                                            str2 = jsonReader.nextString();
                                                            if (str2 != null) {
                                                                break;
                                                            } else {
                                                                gxc.d("Null code");
                                                                break;
                                                            }
                                                        case 2:
                                                            str = jsonReader.nextString();
                                                            if (str != null) {
                                                                break;
                                                            } else {
                                                                gxc.d("Null name");
                                                                break;
                                                            }
                                                        default:
                                                            jsonReader.skipValue();
                                                            break;
                                                    }
                                                    b6 = b10;
                                                }
                                                b4 = b6;
                                                jsonReader.endObject();
                                                if (b9 == 1 && str != null && str2 != null) {
                                                    x90Var2 = new x90(j, str, str2);
                                                    b6 = b4;
                                                    r23 = r23;
                                                    r25 = r25;
                                                    r27 = r27;
                                                }
                                                break;
                                            case 3:
                                                List b11 = b(jsonReader, new u03(b6));
                                                r23 = r23;
                                                r25 = r25;
                                                r27 = b11;
                                                if (b11 == null) {
                                                    gxc.d("Null binaries");
                                                    break;
                                                }
                                                b4 = b6;
                                                b6 = b4;
                                                r23 = r23;
                                                r25 = r25;
                                                r27 = r27;
                                            case 4:
                                                r23 = r23;
                                                r25 = h(jsonReader);
                                                r27 = r27;
                                                b4 = b6;
                                                b6 = b4;
                                                r23 = r23;
                                                r25 = r25;
                                                r27 = r27;
                                            case 5:
                                                r23 = e(jsonReader);
                                                r25 = r25;
                                                r27 = r27;
                                                b4 = b6;
                                                b6 = b4;
                                                r23 = r23;
                                                r25 = r25;
                                                r27 = r27;
                                            default:
                                                jsonReader.skipValue();
                                                r23 = r23;
                                                r25 = r25;
                                                r27 = r27;
                                                b4 = b6;
                                                b6 = b4;
                                                r23 = r23;
                                                r25 = r25;
                                                r27 = r27;
                                        }
                                    }
                                    b2 = b6;
                                    jsonReader.endObject();
                                    if (x90Var2 != null && r27 != 0) {
                                        u90Var = new u90(list5, r23, r24, r25, x90Var2, r27);
                                        obj = r19;
                                        b6 = b2;
                                    }
                                    break;
                                case 3:
                                    ArrayList arrayList2 = new ArrayList();
                                    jsonReader.beginArray();
                                    while (jsonReader.hasNext()) {
                                        arrayList2.add(c(jsonReader));
                                    }
                                    jsonReader.endArray();
                                    list3 = DesugarCollections.unmodifiableList(arrayList2);
                                    b2 = b6;
                                    obj = r19;
                                    b6 = b2;
                                case 4:
                                    ArrayList arrayList3 = new ArrayList();
                                    jsonReader.beginArray();
                                    while (jsonReader.hasNext()) {
                                        arrayList3.add(c(jsonReader));
                                    }
                                    jsonReader.endArray();
                                    list2 = DesugarCollections.unmodifiableList(arrayList3);
                                    b2 = b6;
                                    obj = r19;
                                    b6 = b2;
                                case 5:
                                    i = jsonReader.nextInt();
                                    b2 = b6;
                                    z = true;
                                    obj = r19;
                                    b6 = b2;
                                case 6:
                                    ba0Var = g(jsonReader);
                                    b2 = b6;
                                    obj = r19;
                                    b6 = b2;
                                default:
                                    jsonReader.skipValue();
                                    b2 = b6;
                                    obj = r19;
                                    b6 = b2;
                            }
                            return null;
                        }
                    }
                case 3:
                    jsonReader.beginObject();
                    String str3 = null;
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals("content")) {
                            str3 = jsonReader.nextString();
                            if (str3 == null) {
                                gxc.d("Null content");
                                return null;
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (str3 == null) {
                        dq9.m("Missing required properties: content");
                        return null;
                    }
                    q90Var.e = new ea0(str3);
                    break;
                case 4:
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        gxc.d("Null type");
                        return null;
                    }
                    q90Var.b = nextString;
                    break;
                case 5:
                    q90Var.a = jsonReader.nextLong();
                    q90Var.g = (byte) (q90Var.g | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return q90Var.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0047, code lost:
    
        if (r3.equals("reason") == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static w90 e(JsonReader jsonReader) {
        jsonReader.beginObject();
        byte b = 0;
        int i = 0;
        String str = null;
        String str2 = null;
        List list = null;
        w90 w90Var = null;
        while (true) {
            char c = 1;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (b == 1 && str != null && list != null) {
                    return new w90(str, str2, list, w90Var, i);
                }
                StringBuilder sb = new StringBuilder();
                if (str == null) {
                    sb.append(" type");
                }
                if (list == null) {
                    sb.append(" frames");
                }
                if ((b & 1) == 0) {
                    sb.append(" overflowCount");
                }
                dq9.m(ts2.n("Missing required properties:", sb));
                return null;
            }
            String nextName = jsonReader.nextName();
            nextName.getClass();
            byte b2 = 3;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -934964668:
                    break;
                case 3575610:
                    if (nextName.equals(TeXSymbolParser.TYPE_ATTR)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    list = b(jsonReader, new u03(b2));
                    if (list != null) {
                        break;
                    } else {
                        gxc.d("Null frames");
                        return null;
                    }
                case 1:
                    str2 = jsonReader.nextString();
                    break;
                case 2:
                    str = jsonReader.nextString();
                    if (str != null) {
                        break;
                    } else {
                        gxc.d("Null type");
                        return null;
                    }
                case 3:
                    w90Var = e(jsonReader);
                    break;
                case 4:
                    i = jsonReader.nextInt();
                    b = (byte) (b | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
    }

    public static aa0 f(JsonReader jsonReader) {
        z90 z90Var = new z90();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "offset":
                    z90Var.d = jsonReader.nextLong();
                    z90Var.f = (byte) (z90Var.f | 2);
                    break;
                case "symbol":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        gxc.d("Null symbol");
                        return null;
                    }
                    z90Var.b = nextString;
                    break;
                case "pc":
                    z90Var.a = jsonReader.nextLong();
                    z90Var.f = (byte) (z90Var.f | 1);
                    break;
                case "file":
                    z90Var.c = jsonReader.nextString();
                    break;
                case "importance":
                    z90Var.e = jsonReader.nextInt();
                    z90Var.f = (byte) (z90Var.f | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return z90Var.a();
    }

    public static ba0 g(JsonReader jsonReader) {
        xd5 xd5Var = new xd5();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "pid":
                    xd5Var.a = jsonReader.nextInt();
                    xd5Var.d = (byte) (xd5Var.d | 1);
                    break;
                case "processName":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        gxc.d("Null processName");
                        return null;
                    }
                    xd5Var.e = nextString;
                    break;
                case "defaultProcess":
                    xd5Var.c = jsonReader.nextBoolean();
                    xd5Var.d = (byte) (xd5Var.d | 4);
                    break;
                case "importance":
                    xd5Var.b = jsonReader.nextInt();
                    xd5Var.d = (byte) (xd5Var.d | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return xd5Var.a();
    }

    public static i90 h(JsonReader jsonReader) {
        jsonReader.beginObject();
        j90 j90Var = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals("profilingTrigger")) {
                jsonReader.beginObject();
                boolean z = false;
                int i = 0;
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.getClass();
                    if (nextName2.equals("trigger")) {
                        i = jsonReader.nextInt();
                        z = true;
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                if (!z) {
                    dq9.m("Missing required properties: trigger");
                    return null;
                }
                j90Var = new j90(i);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (j90Var != null) {
            return new i90(j90Var);
        }
        dq9.m("Missing required properties: profilingTrigger");
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static a90 i(JsonReader jsonReader) {
        char c;
        char c2;
        char c3;
        boolean z;
        boolean z2;
        Charset charset = s03.a;
        z80 z80Var = new z80();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1907185581:
                    if (nextName.equals("appQualitySessionId")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -401988390:
                    if (nextName.equals("firebaseAuthenticationToken")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1047652060:
                    if (nextName.equals("firebaseInstallationId")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    jsonReader.beginObject();
                    List list = null;
                    String str = null;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (nextName2.equals("files")) {
                            list = b(jsonReader, new a32((byte) 29));
                            if (list == null) {
                                gxc.d("Null files");
                                return null;
                            }
                        } else if (nextName2.equals("orgId")) {
                            str = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (list == null) {
                        dq9.m("Missing required properties: files");
                        return null;
                    }
                    z80Var.k = new g90(str, list);
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        gxc.d("Null sdkVersion");
                        return null;
                    }
                    z80Var.a = nextString;
                    break;
                case 2:
                    z80Var.g = jsonReader.nextString();
                    break;
                case 3:
                    z80Var.l = a(jsonReader);
                    break;
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 == null) {
                        gxc.d("Null buildVersion");
                        return null;
                    }
                    z80Var.h = nextString2;
                    break;
                case 5:
                    z80Var.f = jsonReader.nextString();
                    break;
                case 6:
                    String nextString3 = jsonReader.nextString();
                    if (nextString3 == null) {
                        gxc.d("Null gmpAppId");
                        return null;
                    }
                    z80Var.b = nextString3;
                    break;
                case 7:
                    String nextString4 = jsonReader.nextString();
                    if (nextString4 == null) {
                        gxc.d("Null installationUuid");
                        return null;
                    }
                    z80Var.d = nextString4;
                    break;
                case '\b':
                    z80Var.e = jsonReader.nextString();
                    break;
                case '\t':
                    z80Var.c = jsonReader.nextInt();
                    z80Var.m = (byte) (z80Var.m | 1);
                    break;
                case '\n':
                    String nextString5 = jsonReader.nextString();
                    if (nextString5 == null) {
                        gxc.d("Null displayVersion");
                        return null;
                    }
                    z80Var.i = nextString5;
                    break;
                case 11:
                    k90 k90Var = new k90();
                    k90Var.f = false;
                    k90Var.m = (byte) (k90Var.m | 2);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -2128794476:
                                if (nextName3.equals("startedAt")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1907185581:
                                if (nextName3.equals("appQualitySessionId")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1618432855:
                                if (nextName3.equals("identifier")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1606742899:
                                if (nextName3.equals("endedAt")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1335157162:
                                if (nextName3.equals("device")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1291329255:
                                if (nextName3.equals("events")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3556:
                                if (nextName3.equals("os")) {
                                    c2 = 6;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 96801:
                                if (nextName3.equals("app")) {
                                    c2 = 7;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3599307:
                                if (nextName3.equals("user")) {
                                    c2 = '\b';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 286956243:
                                if (nextName3.equals("generator")) {
                                    c2 = '\t';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1025385094:
                                if (nextName3.equals("crashed")) {
                                    c2 = '\n';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2047016109:
                                if (nextName3.equals("generatorType")) {
                                    c2 = 11;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                                k90Var.d = jsonReader.nextLong();
                                k90Var.m = (byte) (k90Var.m | 1);
                                break;
                            case 1:
                                k90Var.c = jsonReader.nextString();
                                break;
                            case 2:
                                k90Var.b = new String(Base64.decode(jsonReader.nextString(), 2), s03.a);
                                break;
                            case 3:
                                k90Var.e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 4:
                                o90 o90Var = new o90();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    nextName4.getClass();
                                    switch (nextName4.hashCode()) {
                                        case -1981332476:
                                            if (nextName4.equals("simulator")) {
                                                c3 = 0;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case -1969347631:
                                            if (nextName4.equals("manufacturer")) {
                                                c3 = 1;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 112670:
                                            if (nextName4.equals("ram")) {
                                                c3 = 2;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 3002454:
                                            if (nextName4.equals("arch")) {
                                                c3 = 3;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 81784169:
                                            if (nextName4.equals("diskSpace")) {
                                                c3 = 4;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 94848180:
                                            if (nextName4.equals("cores")) {
                                                c3 = 5;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 104069929:
                                            if (nextName4.equals("model")) {
                                                c3 = 6;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 109757585:
                                            if (nextName4.equals("state")) {
                                                c3 = 7;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 2078953423:
                                            if (nextName4.equals("modelClass")) {
                                                c3 = '\b';
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        default:
                                            c3 = 65535;
                                            break;
                                    }
                                    switch (c3) {
                                        case 0:
                                            o90Var.f = jsonReader.nextBoolean();
                                            o90Var.j = (byte) (o90Var.j | 16);
                                            break;
                                        case 1:
                                            String nextString6 = jsonReader.nextString();
                                            if (nextString6 == null) {
                                                gxc.d("Null manufacturer");
                                                return null;
                                            }
                                            o90Var.h = nextString6;
                                            break;
                                        case 2:
                                            o90Var.d = jsonReader.nextLong();
                                            o90Var.j = (byte) (o90Var.j | 4);
                                            break;
                                        case 3:
                                            o90Var.a = jsonReader.nextInt();
                                            o90Var.j = (byte) (o90Var.j | 1);
                                            break;
                                        case 4:
                                            o90Var.e = jsonReader.nextLong();
                                            o90Var.j = (byte) (o90Var.j | 8);
                                            break;
                                        case 5:
                                            o90Var.c = jsonReader.nextInt();
                                            o90Var.j = (byte) (o90Var.j | 2);
                                            break;
                                        case 6:
                                            String nextString7 = jsonReader.nextString();
                                            if (nextString7 == null) {
                                                gxc.d("Null model");
                                                return null;
                                            }
                                            o90Var.b = nextString7;
                                            break;
                                        case 7:
                                            o90Var.g = jsonReader.nextInt();
                                            o90Var.j = (byte) (o90Var.j | 32);
                                            break;
                                        case '\b':
                                            String nextString8 = jsonReader.nextString();
                                            if (nextString8 == null) {
                                                gxc.d("Null modelClass");
                                                return null;
                                            }
                                            o90Var.i = nextString8;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                k90Var.j = o90Var.a();
                                break;
                            case 5:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(d(jsonReader));
                                }
                                jsonReader.endArray();
                                k90Var.k = DesugarCollections.unmodifiableList(arrayList);
                                break;
                            case 6:
                                ja0 ja0Var = new ja0();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -911706486:
                                            if (nextName5.equals("buildVersion")) {
                                                z = false;
                                                break;
                                            }
                                            z = -1;
                                            break;
                                        case -293026577:
                                            if (nextName5.equals("jailbroken")) {
                                                z = true;
                                                break;
                                            }
                                            z = -1;
                                            break;
                                        case 351608024:
                                            if (nextName5.equals("version")) {
                                                z = 2;
                                                break;
                                            }
                                            z = -1;
                                            break;
                                        case 1874684019:
                                            if (nextName5.equals("platform")) {
                                                z = 3;
                                                break;
                                            }
                                            z = -1;
                                            break;
                                        default:
                                            z = -1;
                                            break;
                                    }
                                    switch (z) {
                                        case false:
                                            String nextString9 = jsonReader.nextString();
                                            if (nextString9 == null) {
                                                gxc.d("Null buildVersion");
                                                return null;
                                            }
                                            ja0Var.c = nextString9;
                                            break;
                                        case true:
                                            ja0Var.d = jsonReader.nextBoolean();
                                            ja0Var.e = (byte) (ja0Var.e | 2);
                                            break;
                                        case true:
                                            String nextString10 = jsonReader.nextString();
                                            if (nextString10 == null) {
                                                gxc.d("Null version");
                                                return null;
                                            }
                                            ja0Var.b = nextString10;
                                            break;
                                        case true:
                                            ja0Var.a = jsonReader.nextInt();
                                            ja0Var.e = (byte) (ja0Var.e | 1);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                k90Var.i = ja0Var.a();
                                break;
                            case 7:
                                jsonReader.beginObject();
                                String str2 = null;
                                String str3 = null;
                                String str4 = null;
                                String str5 = null;
                                String str6 = null;
                                String str7 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName6 = jsonReader.nextName();
                                    nextName6.getClass();
                                    switch (nextName6.hashCode()) {
                                        case -1618432855:
                                            if (nextName6.equals("identifier")) {
                                                z2 = false;
                                                break;
                                            }
                                            z2 = -1;
                                            break;
                                        case -519438642:
                                            if (nextName6.equals("developmentPlatform")) {
                                                z2 = true;
                                                break;
                                            }
                                            z2 = -1;
                                            break;
                                        case 213652010:
                                            if (nextName6.equals("developmentPlatformVersion")) {
                                                z2 = 2;
                                                break;
                                            }
                                            z2 = -1;
                                            break;
                                        case 351608024:
                                            if (nextName6.equals("version")) {
                                                z2 = 3;
                                                break;
                                            }
                                            z2 = -1;
                                            break;
                                        case 719853845:
                                            if (nextName6.equals("installationUuid")) {
                                                z2 = 4;
                                                break;
                                            }
                                            z2 = -1;
                                            break;
                                        case 1975623094:
                                            if (nextName6.equals("displayVersion")) {
                                                z2 = 5;
                                                break;
                                            }
                                            z2 = -1;
                                            break;
                                        default:
                                            z2 = -1;
                                            break;
                                    }
                                    switch (z2) {
                                        case false:
                                            str7 = jsonReader.nextString();
                                            if (str7 != null) {
                                                break;
                                            } else {
                                                gxc.d("Null identifier");
                                                return null;
                                            }
                                        case true:
                                            str5 = jsonReader.nextString();
                                            break;
                                        case true:
                                            str6 = jsonReader.nextString();
                                            break;
                                        case true:
                                            str2 = jsonReader.nextString();
                                            if (str2 != null) {
                                                break;
                                            } else {
                                                gxc.d("Null version");
                                                return null;
                                            }
                                        case true:
                                            str4 = jsonReader.nextString();
                                            break;
                                        case true:
                                            str3 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (str7 != null && str2 != null) {
                                    k90Var.g = new m90(str7, str2, str3, str4, str5, str6);
                                    break;
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    if (str7 == null) {
                                        sb.append(" identifier");
                                    }
                                    if (str2 == null) {
                                        sb.append(" version");
                                    }
                                    dq9.m(ts2.n("Missing required properties:", sb));
                                    return null;
                                }
                            case '\b':
                                jsonReader.beginObject();
                                String str8 = null;
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        str8 = jsonReader.nextString();
                                        if (str8 == null) {
                                            gxc.d("Null identifier");
                                            return null;
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (str8 == null) {
                                    dq9.m("Missing required properties: identifier");
                                    return null;
                                }
                                k90Var.h = new la0(str8);
                                break;
                            case '\t':
                                String nextString11 = jsonReader.nextString();
                                if (nextString11 == null) {
                                    gxc.d("Null generator");
                                    return null;
                                }
                                k90Var.a = nextString11;
                                break;
                            case '\n':
                                k90Var.f = jsonReader.nextBoolean();
                                k90Var.m = (byte) (k90Var.m | 2);
                                break;
                            case 11:
                                k90Var.l = jsonReader.nextInt();
                                k90Var.m = (byte) (k90Var.m | 4);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    z80Var.j = k90Var.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return z80Var.a();
    }

    public static a90 j(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                a90 i = i(jsonReader);
                jsonReader.close();
                return i;
            } finally {
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }
}
